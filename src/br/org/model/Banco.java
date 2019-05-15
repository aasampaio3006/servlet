package br.org.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>(); 
	private static Map<Integer, String> alunos = new HashMap<Integer, String>();
	
	static {
        Empresa empresa = new Empresa();
        empresa.setNome("Alura");        
        Empresa empresa2 = new Empresa();
        empresa2.setNome("Caelum");
        Empresa empresa3 = new Empresa();
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

		lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas(){
		//return Collections.unmodifiableList(lista);
		return lista;
		
	}
	
	
	public Map<Integer, String> getAlunos(){
		alunos.forEach((key, valor) ->  System.out.println(key + " " + valor));
		return alunos;
		
	}
	
	public void addAluno(Aluno aluno) {

		alunos.put(aluno.getSenha(), aluno.getLogin());
		
	}

}
