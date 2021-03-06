package pojos;
// Generated 20/09/2017 13:38:33 by Hibernate Tools 4.3.1



/**
 * PacientePossuiDispositivoId generated by hbm2java
 */
public class PacientePossuiDispositivoId  implements java.io.Serializable {


     private int pacId;
     private int dispId;

    public PacientePossuiDispositivoId() {
    }

    public PacientePossuiDispositivoId(int pacId, int dispId) {
       this.pacId = pacId;
       this.dispId = dispId;
    }
   
    public int getPacId() {
        return this.pacId;
    }
    
    public void setPacId(int pacId) {
        this.pacId = pacId;
    }
    public int getDispId() {
        return this.dispId;
    }
    
    public void setDispId(int dispId) {
        this.dispId = dispId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PacientePossuiDispositivoId) ) return false;
		 PacientePossuiDispositivoId castOther = ( PacientePossuiDispositivoId ) other; 
         
		 return (this.getPacId()==castOther.getPacId())
 && (this.getDispId()==castOther.getDispId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getPacId();
         result = 37 * result + this.getDispId();
         return result;
   }   


}


