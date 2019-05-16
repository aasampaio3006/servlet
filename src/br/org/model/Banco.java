package br.org.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.jsp.jstl.core.IteratedExpression;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Map<Integer, String> alunos = new HashMap<Integer, String>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		Empresa empresa3 = new Empresa();
		empresa3.setId(chaveSequencial++);
		empresa3.setNome("Google");

		lista.add(empresa);
		lista.add(empresa2);
		lista.add(empresa3);

		Aluno aluno = new Aluno();
		aluno.setLogin("asampaio");
		aluno.setSenha(1234);

		Aluno aluno1 = new Aluno();
		aluno1.setLogin("teste");
		aluno1.setSenha(5678);

		Aluno aluno2 = new Aluno();
		aluno2.setLogin("dev");
		aluno2.setSenha(4321);

		alunos.put(aluno.getSenha(), aluno.getLogin());
		alunos.put(aluno1.getSenha(), aluno1.getLogin());
		alunos.put(aluno2.getSenha(), aluno2.getLogin());

	}

	public void adciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);

	}

	public List<Empresa> getEmpresas() {
		// return Collections.unmodifiableList(lista);
		return lista;

	}

	public Map<Integer, String> getAlunos() {
		alunos.forEach((key, valor) -> System.out.println(key + " " + valor));
		return alunos;

	}

	public void addAluno(Aluno aluno) {
		alunos.put(aluno.getSenha(), aluno.getLogin());
	}

	public void removeEmpresa(Integer id) {

		Iterator<Empresa> iterator = lista.iterator();

		while (iterator.hasNext()) {
			Empresa empresa = iterator.next();
			if (empresa.getId() == id) {
				iterator.remove();
			}

		}

	}

	public Empresa buscaEmpresa(Integer id) {

		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}

		}
		return null;
	}

}
