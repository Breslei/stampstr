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
import pojo.TbDispositivo;

/**
 *
 * @author Max
 */
public class DispositivoDao {
    
     public DispositivoDao() {
    }

    private ResultSet rs;
    private PreparedStatement pst;
    private Connection con;
    private String sql;

  
     public List<TbDispositivo> ListarDispositivo(String p) throws ClassNotFoundException, SQLException{
      
        List<TbDispositivo> disp = new ArrayList<TbDispositivo>();
        
            con=ConexaoBD.conetarBD();
          
          pst=con.prepareStatement("SELECT * FROM Tb_Dispositivo");
          
          pst.setString(1,"%"+p+"%");
          
          rs=pst.executeQuery();
            
            while(rs.next()){
                TbDispositivo d = new TbDispositivo();
                
                d.setDispId(rs.getInt("dispId"));//t.metodo(rs.tipoVariavel("variavel_classe_pojo"))
                d.setDispIp(rs.getInt("dispIp"));
                d.setDispNome(rs.getString("dispNome"));
                d.setDispModelo(rs.getInt("dispModelo"));
                d.setDispMarca(rs.getString("dispMarca"));//mudar para STRING NO BD
                disp.add(d);
            }
            ConexaoBD.desconectaBD();
              return disp;
    }
     
     
    public boolean DeletarTrauma(TbDispositivo d){
       try {
            
            con=ConexaoBD.conetarBD();
            pst=con.prepareStatement("DELETE FROM Tb_Dispositivo WHERE disp_ID=?");//modificar
            pst.setInt(1, d.getDispId());
            pst.executeUpdate();
            ConexaoBD.desconectaBD();
            
            JOptionPane.showMessageDialog(null,"Deletado com sucesso!");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
     }
                
    public boolean InserirDispositivo(TbDispositivo d) throws ClassNotFoundException, SQLException{

        sql="INSERT INTO `tb_Dispositivo`(`disp_IP`,`disp_Nome`,`disp_Modelo`,`disp_Marca`)"
                + "VALUES(?,?,?,?)";

        con =ConexaoBD.conetarBD();
        pst =con.prepareStatement(sql);

            pst.setInt(1,d.getDispIp());
            pst.setString(2,d.getDispNome());
            pst.setInt(3,d.getDispModelo());
            pst.setString(4,d.getDispMarca());
                pst.executeUpdate();

         ConexaoBD.desconectaBD();

         return true;
        }      
                
                
    public boolean AtualizarDispositivo(TbDispositivo d) throws ClassNotFoundException, SQLException{
          
         
        con =ConexaoBD.conetarBD();
        pst =con.prepareStatement("UPDATE Tb_Dispositivo set disp_IP = ?,disp_Nome= ?,"
               + "disp_Modelo= ?,disp_Marca= ?  where disp_ID= ?");
        
        pst.setInt(1,d.getDispId());
        pst.setInt(2,d.getDispIp());
        pst.setString(3,d.getDispNome());
        pst.setInt(4,d.getDispModelo());
        pst.setString(5,d.getDispMarca());
            pst.executeUpdate();
        
        ConexaoBD.desconectaBD();

        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
        return true;
       }            
                
        public List<TbDispositivo> ListarDispositivoID(String p) throws ClassNotFoundException, SQLException{
      
            List<TbDispositivo> disp = new ArrayList<TbDispositivo>();
             //Pessoa u = null;
                con=ConexaoBD.conetarBD();

             pst=con.prepareStatement("SELECT * FROM Tb_Dispositivo WHERE dip_ID like ?");
              pst.setString(1,"%"+p+"%");
              rs=pst.executeQuery();

            while(rs.next()){
                TbDispositivo d = new TbDispositivo();         
                
                d.setDispId(rs.getInt("dispId"));//t.metodo(rs.tipoVariavel("variavel_classe_pojo"))
                d.setDispIp(rs.getInt("dispIp"));
                d.setDispNome(rs.getString("dispNome"));
                d.setDispModelo(rs.getInt("dispModelo"));
                d.setDispMarca(rs.getString("dispMarca"));
                  disp.add(d);
            }
            ConexaoBD.desconectaBD();
              return disp;
    } 
                 
}
