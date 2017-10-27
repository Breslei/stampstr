/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DispositivoDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import pojo.TbDispositivo;

/**
 *
 * @author max
 */
@WebServlet(name = "CadastroDispositivoServlet", urlPatterns = {"/CadastroDispositivoServlet"})
public class CadastroDispositivoServlet extends HttpServlet {

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
        
        String ip = request.getParameter("ip");
        String nome = request.getParameter("nome");
        String modelo = request.getParameter("modelo");
        String marca = request.getParameter("marca");
        String action = request.getParameter("cadastrar");
        
        TbDispositivo dispositivo = new TbDispositivo();
        DispositivoDao dao = new DispositivoDao();
        
        if(action!= null){
         
        dispositivo.setDispIp(Integer.parseInt(ip));
        dispositivo.setDispNome(nome);
        dispositivo.setDispModelo(Integer.parseInt(modelo));
        dispositivo.setDispMarca(marca);
        
            try {
                dao.InserirDispositivo(dispositivo);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CadastroDispositivoServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroDispositivoServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         request.setAttribute("cadastroDispositivo", dispositivo);
       
        RequestDispatcher dispatcher = request.getRequestDispatcher("cadSucesso.jsp");//redireciona para outra pagina
        dispatcher.forward(request, response);//encaminha os dados para a pagina carrihno
        processRequest(request, response);//processa a requisição e a resposta
        
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
