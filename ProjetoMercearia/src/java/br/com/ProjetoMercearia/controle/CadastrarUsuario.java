/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoMercearia.controle;

import br.com.ProjetoMercearia.dao.GenericDAO;
import br.com.ProjetoMercearia.dao.UsuarioDAO;
import br.com.ProjetoMercearia.modelo.Usuario;
import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Neto
 */
@WebServlet(name = "CadastrarUsuario", urlPatterns = {"/CadastrarUsuario"})
public class CadastrarUsuario extends HttpServlet {

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
        
        try{
            String codigo = request.getParameter("codigo");
            String nome = request.getParameter("nome");
            String senha = request.getParameter("senha");
            String dataNascimento = request.getParameter("dataNascimento");
            LocalDate dataCadastro = LocalDate.now();
            
            Usuario usuario = new Usuario();
            usuario.setNome(nome);
            usuario.setSenha(senha);
            usuario.setDataNascimento(LocalDate.parse(dataNascimento));
            usuario.setDataCadastro(dataCadastro);
            
            String mensagem = "";
            GenericDAO dao = new UsuarioDAO();
            
            if(codigo.isEmpty()){
                if(dao.cadastrar(usuario)){
                    mensagem = "Usuário cadastrado com sucesso!";
                }else{
                    mensagem = "Erro ao cadastrar usuário!";
                }
            }else{
                usuario.setCodigo(Integer.parseInt(codigo));
                if(dao.alterar(usuario)){
                    mensagem = "Usuário alterado com sucesso!";
                }else{
                    mensagem = "Erro ao alterar usuário!";
                }
            }
            
            request.setAttribute("msg", mensagem);
            request.getRequestDispatcher("cadastrar-usuario.jsp").forward(request, response);
            
        }catch(Exception e){
            System.out.println("Erro ao cadastrar usuarioCTR " + e.getMessage());
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
        processRequest(request, response);
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
