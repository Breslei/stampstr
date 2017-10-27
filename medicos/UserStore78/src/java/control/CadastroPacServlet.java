/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.PacDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pojo.TbPaciente;

/**
 *
 * @author Max
 */
@WebServlet(name = "CadastroPacServlet", urlPatterns = {"/CadastroPacServlet"})
public class CadastroPacServlet extends HttpServlet {

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
        
        
         response.setContentType("text/html;charset=UTF-8");
  
       HttpSession session = request.getSession();
        
        
        
        String nome = request.getParameter("nomePac");
        String sexo = request.getParameter("sexo");
        String dataNasc = request.getParameter("dataNasc");
        String estadoCivil = request.getParameter("EstadoCivil");
        String endereco = request.getParameter("endereco");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String telefone =request.getParameter("telefone");
        String celular = request.getParameter("celular");
        String email = request.getParameter("email");
        String medResp = request.getParameter("medicoResp");
        String triadoPor = request.getParameter("triadoPor");
        String dataTriagem = request.getParameter("dataTriagem");
        
        String cadastrar= request.getParameter("cadastrarPac");
       
         TbPaciente pac= new TbPaciente();
           PacDao daoPac = new PacDao();
        
        if(cadastrar!= null ){
            
            pac.setPacNome(nome);
            pac.setPacSexo(sexo);
            pac.setPacDataNasc(dataNasc);
            pac.setPacEstadoCivil(estadoCivil);
            pac.setPacEndereco(endereco);
            pac.setPacBairro(bairro);
            pac.setPacCidade(cidade);
            pac.setPacTelefoneResidencial(telefone);
            pac.setPacTelefoneCelular(telefone);
            pac.setPacEmail(email);
            pac.setPacMedicoResponsavel(medResp);
            pac.setPacTriadoPor(triadoPor);
            pac.setPacDataTriagem(dataTriagem);
      
            session.setAttribute("cadastroPaciente", pac); //Adiciona o objeto TbPaciente no escopo de sessão do cliente   
                        
       try {
           RequestDispatcher dispatcher = request.getRequestDispatcher("cadTraumas.jsp");//redireciona para outra pagina
            dispatcher.include(request, response);//encaminha os dados para a pagina Traumas
            processRequest(request, response);//processa a requisição e a resposta
       //request.getCookies();
            }catch(Exception e){
                e.printStackTrace();
            }
        
        //response.addCookie(cookiePac);
        
        // esses nomes foram definidos na pagina cadTraumas.jsp,e são as abreviações dos campos de lá..
       
        processRequest(request, response);
    }
    
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
