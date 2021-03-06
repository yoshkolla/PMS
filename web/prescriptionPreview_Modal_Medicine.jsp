<%-- 
    Document   : prescriptionPreview_Modal
    Created on : Jan 27, 2021, 12:11:02 PM
    Author     : AKILA
--%>

<%@page import="POJOS.PrescriptionItem"%>
<%@page import="java.util.Set"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="POJOS.Prescription"%>
<%@page import="DataHolders.USER_LOGIN_DATA"%>
<%@page import="Connection.FactoryManager"%>
<%@page import="org.hibernate.Session"%>

<%
    //login code and check access please past this code before header of all pages
    int USER_ID_subModal = 0;
    int BRANCH_ID_subModal = 0;
    try {
        if (request.getSession().getAttribute("LOGIN_DATA") != null) {
            USER_LOGIN_DATA LD_subModal = (USER_LOGIN_DATA) request.getSession().getAttribute("LOGIN_DATA");
            USER_ID_subModal = LD_subModal.getUser_id();
            BRANCH_ID_subModal = LD_subModal.getBranch_id();
            if (USER_ID_subModal > 0 && BRANCH_ID_subModal > 0) {
                if (request.getParameter("prescriptionNo") != null && !(request.getParameter("prescriptionNo").isEmpty())) {
                    //check access code

                    //check access code
                } else {
                    response.sendRedirect("index.jsp");
                    return;
                }
            } else {
                response.sendRedirect("login.jsp");
                return;
            }
        } else {
            response.sendRedirect("login.jsp");
            return;
        }
    } catch (Exception e) {
        response.sendRedirect("login.jsp");
        return;
    }
    //login code and check access plase past this code before header of all pages
%>

<%
    Session ssn_PrescPrvw = FactoryManager.getSessionFactory().openSession();
    Prescription prvwPRESC_OBJC = (Prescription) ssn_PrescPrvw.load(Prescription.class, Integer.valueOf(request.getParameter("prescriptionNo")));
%>

<div>
    <div class="modal-header">
        <h6 class="modal-title">Prescription Preview</h6>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
    </div>
    <div class="modal-body">
        <div class="col-sm-12">
            <div class="form-group">

                <!-- PATIENT INFO --------------------------------------------------------------------------------------------------------------------------------------------------- -->
                <div class="card">
                    <div class="card-header" style="padding-bottom: 5px;">
                        <label class="f-16 f-w-700 color-info text-white p-l-10 p-r-10" style="margin-left: -20px;"><label class="m-b-0"><% out.print("Prescription No : # " + new DecimalFormat("0000").format(prvwPRESC_OBJC.getIdprescription()));%></label></label><br>
                    </div>
                    <div class="card-block">
                        <div class="row invoive-info m-t-10">
                            <div class="col-lg-12 col-md-12 col-sm-12" style="margin-bottom: -40px;">
                                <h6><span class="fa fa-user"></span>&nbsp;&nbsp;Patient Information</h6>
                                <table class="table table-responsive invoice-table invoice-order table-borderless">
                                    <tbody>
                                        <tr>
                                            <th>Token No<span style="margin-left: 27px"></span>:&nbsp;&nbsp;</th>
                                            <td><%="# " + prvwPRESC_OBJC.getPatientToken().getTokenNumber()%></td>
                                        </tr>
                                        <tr>
                                            <th>Name<span style="margin-left: 51px"></span>:&nbsp;&nbsp;</th>
                                            <td><%=prvwPRESC_OBJC.getPatient().getName()%></td>
                                        </tr>
                                        <tr>
                                            <th>Gender<span style="margin-left: 44px"></span>:&nbsp;&nbsp;</th>
                                            <td><%=prvwPRESC_OBJC.getPatient().getGender()%></td>
                                        </tr>
                                        <tr>
                                            <th>Age<span style="margin-left: 67px"></span>:&nbsp;&nbsp;</th>
                                            <td><%=prvwPRESC_OBJC.getPatientAge()%></td>
                                        </tr>
                                        <tr>
                                            <th>Blood Group<span style="margin-left: 7px"></span>:&nbsp;&nbsp;</th>
                                            <td><%=prvwPRESC_OBJC.getPatient().getBloodGroup()%></td>
                                        </tr>
                                        <tr>
                                            <th>Height<span style="margin-left: 48px"></span>:&nbsp;&nbsp;</th>
                                            <td><%=prvwPRESC_OBJC.getHeight() + " Ft./ Inc."%></td>
                                        </tr>
                                        <tr>
                                            <th>Weight<span style="margin-left: 45px"></span>:&nbsp;&nbsp;</th>
                                            <td><%=prvwPRESC_OBJC.getWeight() + " Kg"%></td>
                                        </tr>
                                        <tr>
                                            <th>Note<span style="margin-left: 60px"></span>:&nbsp;&nbsp;</th>
                                            <td style="width: 100%;">
                                                <textarea rows="5" cols="5" class="form-control" style="border: 1px solid #e9ecef;background: #ffffff; height: 85px;" readonly="true"><%=prvwPRESC_OBJC.getPatientNote()%></textarea>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="page-body">
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="card">
                                <!-- MEDICINE ITEMS TABLE ---------------------------------------------------------------------------------------------------------------------------------------------------------- -->
                                <div class="card-header">
                                    <div class="invoive-info m-b-0 m-t-0">
                                        <h6><span class="fa fa-medkit" style="display: inline;"></span>&nbsp;&nbsp;Medicine Items</h6>
                                    </div>
                                    <div class="card-header-right">
                                        <ul class="list-unstyled card-option">
                                            <li><i class="feather icon-maximize full-card"></i></li>
                                            <li><i class="feather icon-minus minimize-card"></i></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="card-block">
                                    <div class="table-responsive">
                                        <table class="table invoice-detail-table">
                                            <thead>
                                                <tr class="thead-default">
                                                    <th>Medicine/ Item</th>
                                                    <th>Dosage</th>
                                                    <th>Use-Cycle</th>
                                                    <th>Quantity</th>
                                                    <th>Use-Method</th>
                                                    <th>Meal-Type</th>
                                                    <th>Remark</th>
                                                    <th>Amount</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                    Set<PrescriptionItem> PrescItemsSET = prvwPRESC_OBJC.getPrescriptionItems();
                                                    for (PrescriptionItem PrescItems : PrescItemsSET) {
                                                %>
                                                <tr>
                                                    <td>
                                                        <h6>#&nbsp;<%=PrescItems.getStock().getItems().getName()%></h6>
                                                    </td>
                                                    <td><%=PrescItems.getDosage() + " " + PrescItems.getMedicineType().getName()%></td>
                                                    <td><%=PrescItems.getUseCycle().getName()%></td>
                                                    <td><%=Utils.DecimalFormats.dfDoubleValue().format(PrescItems.getQty())%></td>
                                                    <td><%=PrescItems.getUseMethod().getName()%></td>
                                                    <td><%=PrescItems.getMealType().getName()%></td>
                                                    <td><%=PrescItems.getRemark()%></td>
                                                    <td><%="Rs. " + Utils.DecimalFormats.dfDoubleValue().format(PrescItems.getTotalPrice())%></td>
                                                </tr>
                                                <% }%>
                                            </tbody>
                                        </table>
                                    </div>
                                </div><br>

                                <!--  PRESCRIPTION-NOTE --------------------------------------------------------------------------------------------------------------------------------------------------------------- -->
                                <div class="col-lg-12 col-md-12 col-sm-12">
                                    <table class="table table-responsive invoice-table invoice-order table-borderless">
                                        <tbody>
                                            <tr>
                                                <th>
                                                    <div class="invoive-info m-b-0 m-t-0">
                                                        <h6><span class="fa fa-edit" style="display: inline;"></span>&nbsp;&nbsp;Prescription Note</h6>
                                                    </div>
                                                </th>
                                                <td>&nbsp;</td>
                                            </tr>
                                            <tr>
                                                <th style="width: 100%;">
                                                    <textarea rows="5" cols="5" class="form-control" style="margin-top: -15px;" readonly="true"><%=prvwPRESC_OBJC.getNote()%></textarea>
                                                </th>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>    

                                <div class="card-footer">
                                    <!--  PRESCRIPTION-CHARGES ---------------------------------------------------------------------------------------------------------------------------------------------------- -->
                                    <div class="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12">
                                            <table style="display: none;" class="table table-responsive invoice-table invoice-total" style="padding-bottom: 0px; margin-bottom: -5px;">
                                                <tbody>
                                                    <tr>
                                                        <th>Medicine Cost :</th>
                                                        <td><input class="form-control text-right m-b-20" type="text" readonly="true" value="<%="Rs. " + Utils.DecimalFormats.dfPriceValue().format(prvwPRESC_OBJC.getMedicineCost())%>"></td>
                                                    </tr>
                                                    <tr>
                                                        <th>Doctor Charges :</th>
                                                        <td><input class="form-control text-right m-b-20" type="text" readonly="true" value="<%="Rs. " + Utils.DecimalFormats.dfPriceValue().format(prvwPRESC_OBJC.getDoctorCharge())%>"></td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                            <hr class="m-t-0" style="border-top: 2px dashed rgb(156 156 156); margin-top: 0px; margin-bottom: 0px;"> 
                                            <table class="table table-responsive invoice-table invoice-total" style="padding-top: 5px; margin-top: 0px;">
                                                <tbody>
                                                    <tr style="display: none;">
                                                        <th class="f-16">Total Amount :</th>
                                                        <td><input class="form-control text-right m-b-20 f-w-700 f-18" type="text" readonly="true" value="<%="Rs. " + Utils.DecimalFormats.dfPriceValue().format(prvwPRESC_OBJC.getTotalAmount())%>"></td>
                                                    </tr>
                                                    <tr>
                                                        <th>Receivable Amount :</th>
                                                        <td><input class="form-control text-right m-b-20" type="text" readonly="true" value="<%="Rs. " + Utils.DecimalFormats.dfPriceValue().format(prvwPRESC_OBJC.getReceivableAmount())%>"></td>
                                                    </tr>
                                                    <tr>
                                                        <th>Cash Amount :</th>
                                                        <td>
                                                            <input onchange="onChangeKey();" onblur="onChangeKey();" onkeydown="onChangeKey();" id="cash" class="form-control text-right m-b-20" type="number">

                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <th>Balance Amount :</th>
                                                        <td><input id="balance" class="form-control text-right m-b-20" type="text" readonly="true" value="Rs. 0.00"></td>
                                                    </tr>
                                                    <tr>
                                                        <th></th>
                                                        <td>
                                                            <div class="m-b-5">
                                                                <hr class="m-t-0" style="border-top: 2px dashed rgba(248,249,250);">
                                                                <button class="btn btn-warning btn-round m-r-5" onclick="save()" id="btn_comp">Complete Now</button>
                                                                <br><span style="color: red;" id="msg_box"></span>
                                                            </div>
                                                            <div class="m-b-5">
                                                                <hr class="m-t-0" style="border-top: 2px dashed rgba(248,249,250);">
                                                                <button class="btn btn-info btn-round m-r-5"  id="btn_comp">Not Paid</button>
                                                                <br><span style="color: red;" id="msg_box"></span>
                                                            </div>
                                                            
                                                        </td>
                                                    </tr>
                                                </tbody>
                                            </table>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>                                


            </div>
        </div>
    </div>
    <div class="modal-footer" style="border-top: 1px dashed #1abc9c;">
        <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">Close</button>
    </div>
</div>
<script>
    function onChangeKey() {
        $('#btn_comp').html('Complete Now');
        $('#balance').val('Rs. 0.00');
        $('#msg_box').html('');
    }
    function save() {
        var total = <%=prvwPRESC_OBJC.getReceivableAmount()%>;
        var id = <%=prvwPRESC_OBJC.getIdprescription()%>;
        var cash = $('#cash').val();
        var buttonTxt = $('#btn_comp').html();
        if (cash !== null && cash >= total) {
            $('#msg_box').html('');
            if (buttonTxt === 'Complete Now') {
                $('#btn_comp').html('Confirm And Continue');
                var balace = cash - total;
                $('#balance').val('Rs. ' + balace);
            } else if (buttonTxt === 'Confirm And Continue') {
                $.post("IssueMedicine_CompleatePrescriptionServlet", "cash=" + cash + "&id=" + id, function (outputData) {
                    setTimeout(function () {
                        if (outputData.split(":")[0] == '1') {
                            location.replace("dispensary.jsp");
                        } else {
                            $('#msg_box').html(outputData.split(":")[1]);
                        }
                    }, 300);
                });
            }
        } else {
            $('#msg_box').html('Pease enter correct cash value.');
        }





    }
</script>
