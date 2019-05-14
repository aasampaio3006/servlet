package br.org.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Cadastrando nova empresa");
		//sempre retorna uma string e recebe como parâmetro o nome do parâmetro recebido na requisição
		String nomeEmpresa = request.getParameter("nome");
		PrintWriter out = response.getWriter();
		out.println("<html><body>Empresa cadastrada " + nomeEmpresa + " com sucesso!</body></html>");

	}

}
