package pojos;
// Generated 20/09/2017 13:38:33 by Hibernate Tools 4.3.1



/**
 * TbDispositivo generated by hbm2java
 */
public class TbDispositivo  implements java.io.Serializable {


     private Integer dispId;
     private Integer dispIp;
     private String dispNome;
     private Integer dispModelo;
     private Integer dispMarca;

    public TbDispositivo() {
    }

    public TbDispositivo(Integer dispIp, String dispNome, Integer dispModelo, Integer dispMarca) {
       this.dispIp = dispIp;
       this.dispNome = dispNome;
       this.dispModelo = dispModelo;
       this.dispMarca = dispMarca;
    }
   
    public Integer getDispId() {
        return this.dispId;
    }
    
    public void setDispId(Integer dispId) {
        this.dispId = dispId;
    }
    public Integer getDispIp() {
        return this.dispIp;
    }
    
    public void setDispIp(Integer dispIp) {
        this.dispIp = dispIp;
    }
    public String getDispNome() {
        return this.dispNome;
    }
    
    public void setDispNome(String dispNome) {
        this.dispNome = dispNome;
    }
    public Integer getDispModelo() {
        return this.dispModelo;
    }
    
    public void setDispModelo(Integer dispModelo) {
        this.dispModelo = dispModelo;
    }
    public Integer getDispMarca() {
        return this.dispMarca;
    }
    
    public void setDispMarca(Integer dispMarca) {
        this.dispMarca = dispMarca;
    }




}

