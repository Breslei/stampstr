/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pojo.TbTrauma;

/**
 *
 * @author Max
 */
public class TraumasDao {
    
    public TraumasDao() {
    }

    private ResultSet rs;
    private PreparedStatement pst;
    private Connection con;
    private String sql;

  
     public List<TbTrauma> ListarTrauma(String p) throws ClassNotFoundException, SQLException{
      
        List<TbTrauma> tra = new ArrayList<TbTrauma>();
        
            con=ConexaoBD.conetarBD();
          
          pst=con.prepareStatement("SELECT * FROM tb_Trauma");
          
          pst.setString(1,"%"+p+"%");
          
          rs=pst.executeQuery();
            
            while(rs.next()){
                TbTrauma t = new TbTrauma();
                
                t.setTraId(rs.getInt("traId"));//t.metodo(rs.tipoVariavel("variavel_classe_pojo"))
                t.setTraVeicMotor(rs.getString("traVeicMotor"));
                t.setTraForcDesac(rs.getString("traForcDesac"));
                t.setTraForcDesacDesc(rs.getString("traForcDesacDesc"));
                t.setTraEjecaoVeic(rs.getString("traEjecaoVeic"));
                t.setTraNegacao(rs.getString("traNegacao"));
                t.setTraNegacaoDesc(rs.getString("traNegacaoDesc"));
                t.setTraFraturaPrimCost(rs.getString(("traFraturaPrimCost")));
                t.setTraFraturaPrimCostDesc(rs.getString("traFraturaPrimCostDesc"));
                t.setTraFraturaSegCost(rs.getString("traFraturaSegCost"));
                t.setTraFraturaSegCostDesc(rs.getString("traFraturaSegCostDesc"));
                t.setTraAspiracao(rs.getString("traAspiracao"));
                t.setTraAspiracaoDesc(rs.getString("traAspiracaoDesc"));
                t.setTraPerdaConsc(rs.getString("traPerdaConsc"));
                t.setTraPerdaConscDesc(rs.getString("traPerdaConscDesc"));
                t.setTraAcidMotocic(rs.getString("traAcidMotocic"));
                t.setTraAcidMotocicDesc(rs.getString("traAcidMotocicDesc"));
                t.setTraContPulm(rs.getString("traContPulm"));
                t.setTraObitoLocal(rs.getString("traObitoLocal"));
                t.setTraAtropelamentoPed(rs.getString("traAtropelamentoPed"));
                t.setTraFraturaCost(rs.getString("traFraturaCost"));
                t.setTraFraturaCostDesc(rs.getString("traFraturaCostDesc"));
                
                    tra.add(t);
            }
            ConexaoBD.desconectaBD();
              return tra;
    }
        
    
     public boolean DeletarTrauma(TbTrauma t){
     try {
            
            con=ConexaoBD.conetarBD();
            pst=con.prepareStatement("DELETE FROM tb_Trauma WHERE Tra_id=?");//modificar
            pst.setInt(1, t.getTraId());
            pst.executeUpdate();
            ConexaoBD.desconectaBD();
            
            JOptionPane.showMessageDialog(null,"Deletado com sucesso!");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
     }
    
    
    public boolean InserirTrauma(TbTrauma tra) throws ClassNotFoundException, SQLException{

    sql="INSERT INTO tb_Trauma(Tra_VeicMotor,Tra_ForcDesac,Tra_ForcDesacDesc,Tra_EjecaoVeic,Tra_Negacao,Tra_NegacaoDesc,"
            + "Tra_FraturaPrimCost,Tra_FraturaPrimCostDesc,Tra_FraturaSegCost,Tra_FraturaSegCostDesc,Tra_Aspiracao,Tra_AspiracaoDesc,"
            + "Tra_PerdaConsc,Tra_PerdaConscDesc,Tra_AcidMotocic,Tra_AcidMotocicDesc,Tra_ContPulm,Tra_ObitoLocal,Tra_AtropelamentoPed,"
            + "Tra_FraturaCost,Tra_FraturaCostDesc)"
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  
    con =ConexaoBD.conetarBD();
    pst =con.prepareStatement(sql);
        
        pst.setString(1,tra.getTraVeicMotor());
        pst.setString(2, tra.getTraForcDesac());
        pst.setString(3,tra.getTraForcDesacDesc());
        pst.setString(4,tra.getTraEjecaoVeic());
        pst.setString(5,tra.getTraNegacao());
        pst.setString(6,tra.getTraNegacaoDesc());
        pst.setString(7,tra.getTraFraturaPrimCost());
        pst.setString(8,tra.getTraFraturaPrimCostDesc()); 
        pst.setString(9,tra.getTraFraturaSegCost());
        pst.setString(10,tra.getTraFraturaSegCostDesc());
        pst.setString(11,tra.getTraAspiracao());
        pst.setString(12,tra.getTraAspiracaoDesc());
        pst.setString(13,tra.getTraPerdaConsc());        
        pst.setString(14,tra.getTraPerdaConscDesc());
        pst.setString(15,tra.getTraAcidMotocic());
        pst.setString(16,tra.getTraAcidMotocicDesc());
        pst.setString(17,tra.getTraContPulm());
        pst.setString(18,tra.getTraObitoLocal());
        pst.setString(19,tra.getTraAtropelamentoPed());
        pst.setString(20,tra.getTraFraturaCost());
        pst.setString(21,tra.getTraFraturaCostDesc());
            pst.executeUpdate();
        
     ConexaoBD.desconectaBD();
      
     return true;
    }
    
    
    public boolean AtualizarTrauma(TbTrauma tra) throws ClassNotFoundException, SQLException{
          
         
    con =ConexaoBD.conetarBD();
   pst =con.prepareStatement("UPDATE tb_Trauma set Tra_VeicMotor= ?,Tra_ForcDesac= ?,Tra_ForcDesacDesc= ?,"
           + "Tra_EjecaoVeic= ?,Tra_Negacao= ?,Tra_NegacaoDesc= ?,Tra_FraturaPrimCost= ?,Tra_FraturaPrimCostDesc= ?,"
           + "Tra_FraturaSegCost= ?,Tra_FraturaSegCostDesc= ?,Tra_Aspiracao= ?,Tra_AspiracaoDesc= ?,Tra_PerdaConsc= ?,"
           + "Tra_PerdaConscDesc= ?,Tra_AcidMotocic= ?,Tra_AcidMotocicDesc= ?,Tra_ContPulm= ?,Tra_ObitoLocal= ?,"
           + "Tra_AtropelamentoPed= ?,Tra_FraturaCost= ?,Tra_FraturaCostDesc= ? where Tra_id= ?" );
            
   
        pst.setString(1,tra.getTraVeicMotor());
        pst.setString(2, tra.getTraForcDesac());
        pst.setString(3,tra.getTraForcDesacDesc());
        pst.setString(4,tra.getTraEjecaoVeic());
        pst.setString(5,tra.getTraNegacao());
        pst.setString(6,tra.getTraNegacaoDesc());
        pst.setString(7,tra.getTraFraturaPrimCost());
        pst.setString(8,tra.getTraFraturaPrimCostDesc()); 
        pst.setString(9,tra.getTraFraturaSegCost());
        pst.setString(10,tra.getTraFraturaSegCostDesc());
        pst.setString(11,tra.getTraAspiracao());
        pst.setString(12,tra.getTraAspiracaoDesc());
        pst.setString(13,tra.getTraPerdaConsc());        
        pst.setString(14,tra.getTraPerdaConscDesc());
        pst.setString(15,tra.getTraAcidMotocic());
        pst.setString(16,tra.getTraAcidMotocicDesc());
        pst.setString(17,tra.getTraContPulm());
        pst.setString(18,tra.getTraObitoLocal());
        pst.setString(19,tra.getTraAtropelamentoPed());
        pst.setString(20,tra.getTraFraturaCost());
        pst.setString(21,tra.getTraFraturaCostDesc());
            pst.executeUpdate();
        
         ConexaoBD.desconectaBD();
    
       JOptionPane.showMessageDialog(null,"Atualizado com sucesso!");
     return true;
    }
    
    
     public List<TbTrauma> ListarTraumaID(String p) throws ClassNotFoundException, SQLException{
      
        List<TbTrauma> tra = new ArrayList<TbTrauma>();
         //Pessoa u = null;
            con=ConexaoBD.conetarBD();
          
         pst=con.prepareStatement("SELECT * FROM tb_Trauma WHERE Tra_id like ?");
          pst.setString(1,"%"+p+"%");
          rs=pst.executeQuery();
            
            while(rs.next()){
                TbTrauma t = new TbTrauma();
                
                t.setTraId(rs.getInt("traId"));//t.metodo(rs.tipoVariavel("variavel_classe_pojo"))
                t.setTraVeicMotor(rs.getString("traVeicMotor"));
                t.setTraForcDesac(rs.getString("traForcDesac"));
                t.setTraForcDesacDesc(rs.getString("traForcDesacDesc"));
                t.setTraEjecaoVeic(rs.getString("traEjecaoVeic"));
                t.setTraNegacao(rs.getString("traNegacao"));
                t.setTraNegacaoDesc(rs.getString("traNegacaoDesc"));
                t.setTraFraturaPrimCost(rs.getString(("traFraturaPrimCost")));
                t.setTraFraturaPrimCostDesc(rs.getString("traFraturaPrimCostDesc"));
                t.setTraFraturaSegCost(rs.getString("traFraturaSegCost"));
                t.setTraFraturaSegCostDesc(rs.getString("traFraturaSegCostDesc"));
                t.setTraAspiracao(rs.getString("traAspiracao"));
                t.setTraAspiracaoDesc(rs.getString("traAspiracaoDesc"));
                t.setTraPerdaConsc(rs.getString("traPerdaConsc"));
                t.setTraPerdaConscDesc(rs.getString("traPerdaConscDesc"));
                t.setTraAcidMotocic(rs.getString("traAcidMotocic"));
                t.setTraAcidMotocicDesc(rs.getString("traAcidMotocicDesc"));
                t.setTraContPulm(rs.getString("traContPulm"));
                t.setTraObitoLocal(rs.getString("traObitoLocal"));
                t.setTraAtropelamentoPed(rs.getString("traAtropelamentoPed"));
                t.setTraFraturaCost(rs.getString("traFraturaCost"));
                t.setTraFraturaCostDesc(rs.getString("traFraturaCostDesc"));
                
                    tra.add(t);
            }
            ConexaoBD.desconectaBD();
              return tra;
    }
}
