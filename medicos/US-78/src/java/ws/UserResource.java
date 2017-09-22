/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import Helper.UserHelper;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.TbDispositivo;
import pojos.TbPaciente;
import pojos.TbTrauma;

/**
 * REST Web Service
 *
 * @author Max
 */
@Path("user")
public class UserResource {

    private UserHelper helper;
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UserResource
     */
    public UserResource() {
        helper = new UserHelper();
    }

    /**
     * Retrieves representation of an instance of ws.UserResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of UserResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    
    
    
    @GET
    @Path ("getUserListPac")
    @Produces("application/json")
        
    public String getUserListPac(){
        Gson gson = new Gson();
         List<TbPaciente> lp = null;
            try{
                lp = new ArrayList(helper.UserListPac());
                
            }catch(Exception ex){
             ex.printStackTrace();
            }
            return "{\"Paciente\":"+gson.toJson(lp)+"}";
    }
    
     @GET
    @Path ("getUserListTra")
    @Produces("application/json")
        
    public String getUserListTra(){
        Gson gson = new Gson();
         List<TbTrauma> lt = null;
            try{
                lt = new ArrayList(helper.UserListTra());
                
            }catch(Exception ex){
             ex.printStackTrace();
            }
            return "{\"Trauma\":"+gson.toJson(lt)+"}";
    }
    
    
    
    @GET
    @Path ("getUserListDisp")
    @Produces("application/json")
        
    public String getUserListDisp(){
        Gson gson = new Gson();
         List<TbDispositivo> ld = null;
            try{
                ld = new ArrayList(helper.UserListTra());
                
            }catch(Exception ex){
             ex.printStackTrace();
            }
            return "{\"Dispositivo\":"+gson.toJson(ld)+"}";
    }
    
    
    
    
    @POST
    @Path("saveDataPac")
    @Consumes("application/json")
    
    public Response saveDataPac(String data){
        
        Gson gson=new Gson();
          TbPaciente sp=gson.fromJson(data, TbPaciente.class); //sp=save paciente
                  
        try{
            helper.saveDataPac(sp.getPacId(),sp.getPacNome(),sp.getPacSexo(),sp.getPacDataNasc(),
            sp.getPacEstadoCivil(),sp.getPacEndereco(),sp.getPacBairro(), sp.getPacCidade(),
            sp.getPacTelefoneResidencial(),sp.getPacTelefoneCelular(),sp.getPacEmail(),sp.getPacMedicoResponsavel(),
            sp.getPacEncaminhamentoMedico(),sp.getPacPlanoSaude(),sp.getPacTriadoPor(),sp.getPacDataTriagem());
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return Response.status(200).entity(sp).build();
    }
    
    
    
    
    
     
    @POST
    @Path("saveDataTrauma")
    @Consumes("application/json")
    
    public Response saveDataTrauma(String data){
        
        Gson gson=new Gson();
          TbTrauma st=gson.fromJson(data, TbTrauma.class); //sp=save paciente
                  
        try{
            helper.saveDataTrauma(st.getTraId(),st.getTraVeicMotor(),st.getTraForcDesac(),st.getTraForcDesacDesc(),
    st.getTraEjecaoVeic(),st.getTraNegacao(),st.getTraNegacaoDesc(),st.getTraFraturaPrimCost(),st.getTraFraturaPrimCostDesc(),
    st.getTraFraturaSegCost(),st.getTraFraturaSegCostDesc(),st.getTraAspiracao(),st.getTraAspiracaoDesc(),st.getTraPerdaConsc(),
    st.getTraPerdaConscDesc(),st.getTraAcidMotocic(),st.getTraAcidMotocicDesc(),st.getTraContPulm(),st.getTraObitoLocal(),
    st.getTraAtropelamentoPed(),st.getTraFraturaCost(),st.getTraFraturaCostDesc());
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return Response.status(200).entity(st).build();
    }
    
    
    
        
    @POST
    @Path("saveDataDispositivo")
    @Consumes("application/json")
    
    public Response saveDataDispositivo(String data){
        
        Gson gson=new Gson();
          TbDispositivo sdi=gson.fromJson(data, TbDispositivo.class); //sp=save paciente
                  
        try{
         helper.saveDataDispositivo(sdi.getDispId(),sdi.getDispIp(),sdi.getDispNome(),
                 sdi.getDispModelo(),sdi.getDispMarca());
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return Response.status(200).entity(sdi).build();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
