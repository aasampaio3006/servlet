package br.org.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.org.model.Banco;
import br.org.model.Empresa;

/**
 * Servlet implementation class MostraEmpresaServlet
 */
@WebServlet("/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramId =  request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
	    Empresa empresa = banco.buscaEmpresa(id);
	    System.out.println(empresa);
	    request.setAttribute("empresa", empresa);
	    
	    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/formAlteraEmpresa.jsp");	    
		requestDispatcher.forward(request, response);
	}

}
