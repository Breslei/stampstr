/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.TbDispositivo;
import pojos.TbPaciente;
import pojos.TbTrauma;
import util.HibernateUtil;

/**
 *
 * @author Max
 */
public class UserHelper {
    
     
    public UserHelper(){
        
    }
    
        public void saveDataPac(Integer pacId,String pacNome, String pacSexo, String pacDataNasc, 
      String pacEstadoCivil,String pacEndereco,String pacBairro, String pacCidade,String pacTelefoneResidencial,
      String pacTelefoneCelular,String pacEmail,String pacMedicoResponsavel, String pacEncaminhamentoMedico,
      String pacPlanoSaude, String pacTriadoPor,  Date pacDataTriagem){
        
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        
        TbPaciente pac = new TbPaciente();
        
        
        if(pacId!=0){
            
            pac.setPacId(pacId);
        }
        
        pac.setPacNome(pacNome);
        pac.setPacSexo(pacSexo);
        pac.setPacDataNasc(pacDataNasc);
        pac.setPacEstadoCivil(pacEstadoCivil);
        pac.setPacEndereco(pacEndereco);
        pac.setPacBairro(pacBairro);
        pac.setPacCidade(pacCidade);
        pac.setPacTelefoneResidencial(pacTelefoneResidencial);
        pac.setPacTelefoneCelular(pacTelefoneCelular); 
        pac.setPacEmail(pacEmail);
        pac.setPacMedicoResponsavel(pacMedicoResponsavel); 
        pac.setPacEncaminhamentoMedico(pacEncaminhamentoMedico);
        pac.setPacPlanoSaude(pacPlanoSaude);
        pac.setPacTriadoPor(pacTriadoPor);
        pac.setPacDataTriagem(pacDataTriagem);
        
        
        
            session.saveOrUpdate(pac);
            tx.commit();
            session.close();
       
    }
    
    
    
        
          public void saveDataTrauma(Integer traId, String traVeicMotor, String traForcDesac,
      String traForcDesacDesc,String traEjecaoVeic,String traNegacao,
      String traNegacaoDesc, String traFraturaPrimCost,
      String traFraturaPrimCostDesc, String traFraturaSegCost,  String traFraturaSegCostDesc,
      String traAspiracao, String traAspiracaoDesc,
      String traPerdaConsc,String traPerdaConscDesc,
      String traAcidMotocic, String traAcidMotocicDesc,
      String traContPulm, String traObitoLocal,
      String traAtropelamentoPed, String traFraturaCost,
      String traFraturaCostDesc){
              
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        
              TbTrauma tr = new TbTrauma();
              
              if(traId!=0){
                  tr.setTraId(traId);
              }
        
            tr.setTraVeicMotor(traVeicMotor);
            tr.setTraForcDesac(traForcDesac);
            tr.setTraForcDesacDesc(traForcDesacDesc);
            tr.setTraEjecaoVeic(traEjecaoVeic);
            tr.setTraNegacao(traNegacao);
            tr.setTraNegacaoDesc(traNegacaoDesc);
            tr.setTraFraturaPrimCost(traFraturaPrimCost);
            tr.setTraFraturaPrimCostDesc(traFraturaPrimCostDesc);
            tr.setTraFraturaSegCost(traFraturaSegCost);
            tr.setTraFraturaSegCostDesc(traFraturaSegCostDesc);
            tr.setTraAspiracao(traAspiracao);
            tr.setTraAspiracaoDesc(traAspiracaoDesc);
            tr.setTraPerdaConsc(traPerdaConsc);
            tr.setTraPerdaConscDesc(traPerdaConscDesc);
            tr.setTraAcidMotocic(traAcidMotocic);
            tr.setTraAcidMotocicDesc(traAcidMotocicDesc);
            tr.setTraContPulm(traContPulm);
            tr.setTraObitoLocal(traObitoLocal);
            tr.setTraAtropelamentoPed(traAtropelamentoPed);
            tr.setTraFraturaCost(traFraturaCost);
            tr.setTraFraturaCostDesc(traFraturaCostDesc);
            
            session.saveOrUpdate(tr);
             tx.commit();
               session.close();
    }  
        
        
       public void saveDataDispositivo(Integer dispId,Integer dispIp, String dispNome, 
        Integer dispModelo,Integer dispMarca){
           
           
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        
           TbDispositivo di = new TbDispositivo();
           
            if(dispId!=0){
                di.setDispId(dispId);
            }
        
                di.setDispId(dispId);
                di.setDispIp(dispIp);
                di.setDispNome(dispNome);
                di.setDispModelo(dispModelo);
                di.setDispMarca(dispMarca);
        
        
                session.saveOrUpdate(di);
                 tx.commit();
                  session.close();
    } 
    
    
    
    public List<TbPaciente> UserListPac(){
        
         Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
      
        List<TbPaciente> lp = null;
        
        
        Query q = session.createQuery("select* from TbPaciente");
         lp=q.list();
          tx.commit();
           session.close();
            return lp;
    }
    
    
    
    
        
    public List<TbTrauma> UserListTra(){
        
         Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
      
          List<TbTrauma> lt = null;
        
        
        Query q = session.createQuery("select* from TbTrauma");
         lt=q.list();
          tx.commit();
           session.close();
            return lt;
        
    }
    
        
    public List<TbDispositivo> UserListDis(){
        
         Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
      
            List<TbDispositivo> ld = null;
        
        
        Query q = session.createQuery("select* from TbDispositivo");
         ld=q.list();
          tx.commit();
           session.close();
            return ld;
    }
    
    
     public void updateDispositivo(Integer dispId,String dispNome){
           
           
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        
        
            Query q= session.createQuery("UPDATE from TbDispositivo set where dispId =?,dispIp=? ,dispNome=? ,dispModelo=?"
                    + " ,dispMarca=?");
        
        int i = q.executeUpdate();
         tx.commit();
          session.close();
    
      }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
