/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Max
 */
public class ConexaoBD {
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final  String url="jdbc:mysql://stampstrteam2.c6kcqgp34kas.us-east-1.rds.amazonaws.com:3306/Team_Medicos";//mudar para o endereço da banco
    private static final  String user="Team2";
    private static final  String password ="StampsTrTeam2";
    public  static Connection con;
    public  static PreparedStatement pst;
    public  static ResultSet rs;
            
            
  public  static Connection conetarBD(){
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con=(Connection) DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
  }
            
    public  static void executaSql(String Sql){// metoddo que sera usado para fazer o comando sql para a tabela
        try {
            //pst recebe a criacao da statement e
            //TYPE_SCROLL_INSENSITIVE =faz a pesquisas diferenciando os caracteres maiusculos e minusculos
            //CONCUR_READ_ONLY= percorre a pesquisa do inicio para o fim e do fim para o inicio
           con=(Connection) DriverManager.getConnection(url,user,password);
           pst = (PreparedStatement) con.prepareStatement(Sql);
//           rs.first();
            rs =pst.executeQuery(Sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  
  public  static void desconectaBD(){
      if(pst!= null){
          try {
              con.close();
          } catch (SQLException ex) {
              Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
  } 
}