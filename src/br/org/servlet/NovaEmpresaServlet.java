package br.org.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.org.model.Banco;
import br.org.model.Empresa;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response) Requisições Get e Post
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// System.out.println("Cadastrando nova empresa");
		// sempre retorna uma string e recebe como parâmetro o nome do parâmetro
		// recebido na requisição
		String nomeEmpresa = request.getParameter("nome");
		String dataEmpresa = request.getParameter("data");
		Date dataAbertura = null;

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(dataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);

		Banco banco = new Banco();
		banco.adciona(empresa);

//		PrintWriter out = response.getWriter();
//		out.println("<html><body>Empresa cadastrada " + nomeEmpresa + " com sucesso!</body></html>");

		// chamar uma pagina jsp
		// para despachar a requisição para o JSP
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
///		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/listaEmpresa");
		//Redirecionamento Client Side isto é, "do lado do cliente"
		response.sendRedirect("listaEmpresa");

		// O string name funciona como apelido, que será empresa e em seguida o objeto
		// empresa
		request.setAttribute("empresa", empresa.getNome());
		// Resta adicionarmos um item que ativa o percurso dessa requisição, o método
		// forward()
		// que receberá os parâmetros de request e response
		//requestDispatcher.forward(request, response);

	}

}
