/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.PacDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import pojo.TbPaciente;

/**
 *
 * @author max
 */
@WebServlet(name = "Pesquisa", urlPatterns = {"/Pesquisa"})
public class Pesquisa extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Pesquisa</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Pesquisa at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String pesquisa=request.getParameter("modoPesquisa");
        String campo = request.getParameter("campoNome");
        
        switch(pesquisa){
            case "Pacientes":
        HttpSession session= request.getSession();
          
                PacDao dao = new PacDao();
        
            
            ArrayList<TbPaciente> listarPac = null;
              listarPac=(ArrayList<TbPaciente>) request.getAttribute("cadastroPaciente");
            
        if(listarPac==null){
            listarPac = new ArrayList<TbPaciente>();
        }
            
        
            try {
                dao.ListarPaciente(campo);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Pesquisa.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Pesquisa.class.getName()).log(Level.SEVERE, null, ex);
            }
       
      TbPaciente pac = new TbPaciente();
       
      pac.setPacNome((String) request.getAttribute("nome"));
      pac.setPacSexo((String) request.getAttribute("sexo"));   
      pac.setPacDataNasc((String) request.getAttribute("dataNasc")); 
      pac.setPacEstadoCivil((String) request.getAttribute("estCivil"));     
      pac.setPacEndereco((String) request.getAttribute("endereco"));
      pac.setPacBairro((String) request.getAttribute("bairro"));
      pac.setPacCidade((String) request.getAttribute("cidade"));
      pac.setPacTelefoneResidencial((String) request.getAttribute("telRes"));
      pac.setPacTelefoneCelular((String) request.getAttribute("celuar"));
      pac.setPacEmail((String) request.getAttribute("email"));
      pac.setPacMedicoResponsavel((String) request.getAttribute("medicoresp"));
      pac.setPacTriadoPor((String) request.getAttribute("triadoPor"));
      pac.setPacDataTriagem((String)request.getAttribute("dataTriagem"));

         
      int index=-1;
        
        for(int i=0;1<listarPac.size();i++){
                TbPaciente pacb = listarPac.get(i);
        
                if(pacb.getPacId() ==pac.getPacId()){
                 index = i; 
                 break;
                }
        }
                 
                 if(index==-1){
                     listarPac.add(pac);
                 }else{
                     listarPac.set(index, pac);
                 }
                 
        
        session.setAttribute("Pacientes",listarPac);
        RequestDispatcher dispatcher = request.getRequestDispatcher("pesquisaPac.jsp");
       
        dispatcher.forward(request, response);//encaminha os dados para a pagina carrihno
        processRequest(request, response);
                
           case "Dispositivo":    
        
            default:
                JOptionPane.showMessageDialog(null,"Parametro inválido! /n por favor tente novamente.");
        
        }
                
        
        
        //String modo = (String) request.getAttribute("modoPesquisa");
        
           
        
       
      
      
      
      
      
      
      
      
      
      
      
      
        }
     
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
