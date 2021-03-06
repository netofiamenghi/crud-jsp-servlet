package br.com.ProjetoMercearia.controle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.ProjetoMercearia.dao.ClienteDAO;
import br.com.ProjetoMercearia.dao.FornecedorDAO;
import br.com.ProjetoMercearia.dao.GenericDAO;
import br.com.ProjetoMercearia.modelo.Fornecedor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet(urlPatterns = {"/CadastrarFornecedor"})
public class CadastrarFornecedor extends HttpServlet {

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
            throws ServletException, IOException, Exception {
        
        Fornecedor oFornecedor = new Fornecedor();
        
        oFornecedor.setEmail(request.getParameter("email"));
        oFornecedor.setRazaoSocial(request.getParameter("razaoSocial"));
        oFornecedor.setTelefone(request.getParameter("telefone"));
        
        GenericDAO dao = new FornecedorDAO();
        
        String mensagem = "";
        
        if(dao.cadastrar(oFornecedor) == true){
            mensagem = "Fornecedor cadastrado com sucesso!";
        }else{
            mensagem = "Erro ao cadastrar Fornecedor!";
        }
        
        request.setAttribute("fornecedor", oFornecedor);
        request.getRequestDispatcher("cadastrar-fornecedor.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(CadastrarFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(CadastrarFornecedor.class.getName()).log(Level.SEVERE, null, ex);
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
