/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pojo.TbPaciente;

/**
 *
 * @author Max
 */
public class PacDao {
    
     public PacDao() {
    }

    private ResultSet rs;
    private PreparedStatement pst;
    private Connection con;
    private String sql;

  
     public List<TbPaciente> ListarPaciente(String p) throws ClassNotFoundException, SQLException{
      
        List<TbPaciente> pac = new ArrayList<TbPaciente>();
        
          con=ConexaoBD.conetarBD();
          pst=con.prepareStatement("SELECT * FROM tb_Paciente");
          pst.setString(1,"%"+p+"%");
          
          rs=pst.executeQuery();
            
            while(rs.next()){
                TbPaciente pc = new TbPaciente();
                
        pc.setPacId(rs.getInt("pacId"));
        pc.setPacNome(rs.getString("pacNome"));
        pc.setPacSexo(rs.getString("pacSexo"));
        pc.setPacDataNasc(rs.getString("pacDataNasc"));
        pc.setPacEstadoCivil(rs.getString("pacEstadoCivil"));
        pc.setPacEndereco(rs.getString("pacEndereco"));
        pc.setPacBairro(rs.getString("pacBairro"));
        pc.setPacCidade(rs.getString("pacCidade"));
        pc.setPacTelefoneResidencial(rs.getString("pacTelefoneResidencial"));
        pc.setPacTelefoneCelular(rs.getString("pacTelefoneCelular"));
        pc.setPacEmail(rs.getString("pacEmail"));
        pc.setPacMedicoResponsavel(rs.getString("pacMedicoResponsavel"));
        pc.setPacEncaminhamentoMedico(rs.getString("pacEncaminhamentoMedico"));
        pc.setPacPlanoSaude(rs.getString("pacPlanoSaude"));
        pc.setPacTriadoPor(rs.getString("pacTriadoPor"));
        pc.setPacDataTriagem(rs.getString("pacDataTriagem"));
            pac.add(pc);
            }
            ConexaoBD.desconectaBD();
              return pac;
    }
                
           
   public boolean DeletarPaciente(TbPaciente p){
     try {
            
            con=ConexaoBD.conetarBD();
            pst=con.prepareStatement("DELETE FROM Tb_Paciente WHERE pac_ID=?");//modificar
            pst.setInt(1,p.getPacId());
            pst.executeUpdate();
            ConexaoBD.desconectaBD();
            
            JOptionPane.showMessageDialog(null,"Deletado com sucesso!");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
     }

   public boolean InserirPaciente(TbPaciente p) throws ClassNotFoundException, SQLException{

        sql="INSERT INTO tb_Paciente(pac_nome,pac_sexo,pac_dataNasc,"
                + "pac_estadoCivil, pac_endereco,pac_bairro,pac_cidade,pac_telefoneResidencial,"
                + "pac_telefoneCelular, pac_email, pac_medicoResponsavel,"
                + "pac_encaminhamentoMedico,pac_planoSaude,pac_triadoPor,pac_dataTriagem)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        con =ConexaoBD.conetarBD();
        pst =con.prepareStatement(sql);

            pst.setString(1,p.getPacNome());
            pst.setString(2,p.getPacSexo());
            pst.setString(3,p.getPacDataNasc());
            pst.setString(4,p.getPacEstadoCivil());
            pst.setString(5,p.getPacEndereco());
            pst.setString(6,p.getPacBairro());
            pst.setString(7,p.getPacCidade());
            pst.setString(8,p.getPacTelefoneResidencial());
            pst.setString(9,p.getPacTelefoneCelular());
            pst.setString(10,p.getPacEmail());
            pst.setString(11,p.getPacMedicoResponsavel());
            pst.setString(12,p.getPacEncaminhamentoMedico());
            pst.setString(13,p.getPacPlanoSaude());
            pst.setString(14,p.getPacTriadoPor());
            pst.setString(15, p.getPacDataTriagem());
                pst.executeUpdate();

         ConexaoBD.desconectaBD();

         //JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
         return true;
        }      

    public boolean AtualizarPaciente(TbPaciente p) throws ClassNotFoundException, SQLException{
          
         
        con =ConexaoBD.conetarBD();
        pst =con.prepareStatement(sql="INSERT INTO tb_Paciente(pac_nome=?,pac_sexo=?,pac_dataNasc=?,"
                + "pac_estadoCivil=?, pac_endereco=?,pac_bairro=?,pac_cidade=?,pac_telefoneResidencial=?,"
                + "pac_telefoneCelular=?, pac_email=?, pac_medicoResponsavel=?"
                + "pac_encaminhamentoMedico=?,pac_planoSaude=?,pac_triadoPor=?,pac_dataTriagem=?)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        
            pst.setString(1,p.getPacNome());
            pst.setString(2,p.getPacSexo());
            pst.setString(3,p.getPacDataNasc());
            pst.setString(4,p.getPacEstadoCivil());
            pst.setString(5,p.getPacEndereco());
            pst.setString(6,p.getPacBairro());
            pst.setString(7,p.getPacCidade());
            pst.setString(8,p.getPacTelefoneResidencial());
            pst.setString(9,p.getPacTelefoneCelular());
            pst.setString(10,p.getPacEmail());
            pst.setString(11,p.getPacMedicoResponsavel());
            pst.setString(12,p.getPacEncaminhamentoMedico());
            pst.setString(13,p.getPacPlanoSaude());
            pst.setString(14,p.getPacTriadoPor());
            pst.setString(15, p.getPacDataTriagem());
                pst.executeUpdate();
        
            ConexaoBD.desconectaBD();

        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
        return true;
       }    

        public List<TbPaciente> ListarPacienteID(String p) throws ClassNotFoundException, SQLException{
      
            List<TbPaciente> pac = new ArrayList<TbPaciente>();
             //Pessoa u = null;
                con=ConexaoBD.conetarBD();

             pst=con.prepareStatement("SELECT * FROM tb_Paciente WHERE pac_ID like ?");
              pst.setString(1,"%"+p+"%");
              rs=pst.executeQuery();

            while(rs.next()){
                TbPaciente pc = new TbPaciente();         
                
                pc.setPacId(rs.getInt("pacId"));
                pc.setPacNome(rs.getString("pacNome"));
                pc.setPacSexo(rs.getString("pacSexo"));
                pc.setPacDataNasc(rs.getString("pacDataNasc"));
                pc.setPacEstadoCivil(rs.getString("pacEstadoCivil"));
                pc.setPacEndereco(rs.getString("pacEndereco"));
                pc.setPacBairro(rs.getString("pacBairro"));
                pc.setPacCidade(rs.getString("pacCidade"));
                pc.setPacTelefoneResidencial(rs.getString("pacTelefoneResidencial"));
                pc.setPacTelefoneCelular(rs.getString("pacTelefoneCelular"));
                pc.setPacEmail(rs.getString("pacEmail"));
                pc.setPacMedicoResponsavel(rs.getString("pacMedicoResponsavel"));
                pc.setPacEncaminhamentoMedico(rs.getString("pacEncaminhamentoMedico"));
                pc.setPacPlanoSaude(rs.getString("pacPlanoSaude"));
                pc.setPacTriadoPor(rs.getString("pacTriadoPor"));
                pc.setPacDataTriagem(rs.getString("pacDataTriagem"));
                  pac.add(pc);
            }
            ConexaoBD.desconectaBD();
              return pac;
    } 
                
}
