package br.org.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.org.model.Banco;

/**
 * Servlet implementation class ListaAlunoServlet
 */
@WebServlet("/listaAluno")
public class ListaAlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Banco banco = new Banco();
		Map<Integer, String> alunos = banco.getAlunos();
		
		request.setAttribute("alunos", alunos);
		
		//alunos.forEach((key, valor) ->  System.out.println(key + " " + valor));

		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/listaAlunos.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
