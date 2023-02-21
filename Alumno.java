package ud10;

import java.util.Scanner;

public class Alumno {

	//DECLARO LOS ATRIBUTOS
	private String nombre;
	private String curso;
	private int notas [];
	
	//CREO EL PRIMER CONSTRUCTOR CON 3 PARÁMETROS
	public Alumno(String nombre,String curso, int asignaturas) {
		this.nombre=nombre;
		this.curso=curso;
		notas = new int[asignaturas];
	}
	
	//CREO EL SEGUNDO CONSTRUCTOR CON 2 PARÁMETROS, LLAMANDO AL CONSTRUCTOR ANTERIOR
	//DEJANDO POR DEFECTO 5 ASIGNATURAS
	public Alumno(String nombre,String curso) {
		this(nombre,curso,5);	
	}
	
	//CREO EL TERCER CONSTRUCTOR CON 1 PARÁMETRO, LLAMANDO AL CONSTRUCTOR ANTERIOR
	//DEJANDO POR DEFECTO DAM COMO CURSO
	public Alumno(String nombre) {
		this(nombre,"DAM");	
		
	}
	
	//HAGO EL METODO PARA CAMBIAR CURSO
	public void CambiarCurso(String curso) {
		this.curso=curso;
	}
	
	//HAGO EL METODO PARA CAMBIAR EL NUMERO DE ASIGNATURAS
	public void CambiarAsignaturas(int asignaturas) {
		this.notas = new int [asignaturas];
	}
	
	//HAGO EL METODO PARA RELLENAR EL ARRAY DE ASIGNATURAS CON NOTAS
	public void IntroduceNotas() {
		Scanner entrada = new Scanner(System.in);
		for(int i=0; i<this.notas.length; i++) {
			System.out.println("Introduce la nota de la asignatura " + (i+1));
			double nota = entrada.nextDouble();
			this.notas[i] = (int) nota;
		}
	}
	
	//HAGO EL METODO PARA VER LAS NOTAS DE CADA ASIGNATURA DE UN ALUMNO
	public void VerNotas() {
		for(int i=0; i<this.notas.length; i++) {
			System.out.println("La nota de la asignatura " + (i+1) + " es un " +  this.notas[i]);
		}
	}
	
	//HAGO EL METODO PARA CAMBIAR EL NOMBRE DE UN ALUMNO
	public void CambiarNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//HAGO EL METODO PARA VER EL CURSO DE UN ALUMNO
	public String VerCurso() {
		return curso;
	}
	
	//HAGO EL METODO PARA VER EL NOMBRE DE UN ALUMNO
	public String VerNombre() {
		return nombre;
	}
}
