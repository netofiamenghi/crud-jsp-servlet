package br.com.ProjetoMercearia.controle;


import br.com.ProjetoMercearia.dao.GenericDAO;
import br.com.ProjetoMercearia.dao.ProdutoDAO;
import br.com.ProjetoMercearia.modelo.Produto;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/CadastrarProduto"})
public class CadastrarProduto extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        
        Produto produto = new Produto();
        produto.setNome(request.getParameter("nome"));
        produto.setValor(Double.parseDouble(request.getParameter("valor")));
        produto.setQtdEstoque(Integer.parseInt(request.getParameter("qtdEstoque")));
                
        GenericDAO dao = new ProdutoDAO();
        
        String mensagem = dao.cadastrar(produto) ? "Produto cadastrado com sucesso!" : "Erro ao cadastrar Produto!";
                      
        request.setAttribute("mensagem", mensagem);
        request.getRequestDispatcher("cadastrar-produto.jsp").forward(request, response);        
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
            Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
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
