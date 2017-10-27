/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.PacDao;
import dao.TraumasDao;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Iterator;
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
import pojo.TbTrauma;

/**
 *
 * @author Max
 */
@WebServlet(name = "CadastroServlet", urlPatterns = {"/CadastroServlet"})
public class CadastroServlet extends HttpServlet {

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
      
                        //OBTER O HTTPSESSION
       HttpSession session = request.getSession();
        TbPaciente pacientePersistido = (TbPaciente)session.getAttribute("cadastroPaciente");


        String vm= request.getParameter("vm");
        String forca= request.getParameter("forca");
        String fddes= request.getParameter("fddes");
        String pd= request.getParameter("pd");
        String pddes= request.getParameter("pddes");
        String ej= request.getParameter("ej");
        String neg= request.getParameter("neg");
        String negdes= request.getParameter("negdes");
        String f1c= request.getParameter("f1c");
        String f1cdes= request.getParameter("f1cdes");
        String f2c= request.getParameter("f2c");
        String f2cdes= request.getParameter("f2cdes");
        String fc= request.getParameter("fc");
        String fcdes= request.getParameter("fcdes");
        String asp= request.getParameter("asp");
        String aspdes= request.getParameter("aspdes");
        String contpulm= request.getParameter("contpulm");
        String aol= request.getParameter("aol");
        String apc= request.getParameter("apc");
        String acm= request.getParameter("acm");
        String acmdes= request.getParameter("acmdes");
        
        
        TbTrauma trauma= new TbTrauma();
        TraumasDao dao = new TraumasDao();
        
        String action= request.getParameter("cadastrar");
        if(action!=null){
        
            trauma.setTraVeicMotor(vm);
            trauma.setTraForcDesac(forca);
            trauma.setTraForcDesacDesc(fddes);
            trauma.setTraPerdaConsc(pd);
            trauma.setTraPerdaConscDesc(pddes);
            trauma.setTraEjecaoVeic(ej);
            trauma.setTraNegacao(neg);
            trauma.setTraNegacaoDesc(negdes);
            trauma.setTraFraturaPrimCost(f1c);
            trauma.setTraFraturaPrimCostDesc(f1cdes);
            trauma.setTraFraturaSegCost(f2c);
            trauma.setTraFraturaSegCostDesc(f2cdes);
            trauma.setTraFraturaCost(fc);
            trauma.setTraFraturaCostDesc(fcdes);
            trauma.setTraAspiracao(asp);
            trauma.setTraAspiracaoDesc(aspdes);
            trauma.setTraContPulm(contpulm);
            trauma.setTraObitoLocal(aol);
            trauma.setTraAtropelamentoPed(apc);
            trauma.setTraAcidMotocic(acm);
            trauma.setTraAcidMotocicDesc(acmdes);
            
            try {
                
               PacDao daoPac = new PacDao();
                daoPac.InserirPaciente(pacientePersistido);
                 dao.InserirTrauma(trauma);
                

            RequestDispatcher dispatcher = request.getRequestDispatcher("cadSucesso.jsp");//redireciona para outra pagina
            dispatcher.forward(request, response);//encaminha os dados para a pagina carrihno
            processRequest(request, response);//processa a requisição e a resposta
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CadastroServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroServlet.class.getName()).log(Level.SEVERE, null, ex);
            
            }
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
