package POJOS;
// Generated Feb 11, 2021 2:55:44 PM by Hibernate Tools 4.3.1



/**
 * TextList generated by hbm2java
 */
public class TextList  implements java.io.Serializable {


     private Integer idtextList;
     private String test;

    public TextList() {
    }

    public TextList(String test) {
       this.test = test;
    }
   
    public Integer getIdtextList() {
        return this.idtextList;
    }
    
    public void setIdtextList(Integer idtextList) {
        this.idtextList = idtextList;
    }
    public String getTest() {
        return this.test;
    }
    
    public void setTest(String test) {
        this.test = test;
    }




}


