package ud10;

public class PruebaAlumno {

	public static void main(String[] args) {
		//HAGO LA INSTANCIACION DE 3 OBJETOS DE TIPO ALUMNO, CON LOS 3 DIFERENTES CONSTRUCTORES
		Alumno alumno1 = new Alumno("Alvaro");
		Alumno alumno2 = new Alumno("Sergio","DAW");
		Alumno alumno3 = new Alumno("Juan","DAM",7);
		
		
		//UTILIZO DOS METODOS PARA EL PRIMER OBJETO
		alumno1.CambiarNombre("Roberto");
		System.out.println(alumno1.VerNombre());
		
		//UTILIZO DOS METODOS PARA EL SEGUNDO OBJETO
		alumno2.IntroduceNotas();
		alumno2.VerNotas();
		
		//UTILIZO TRES METODOS PARA EL PRIMER OBJETO
		alumno3.CambiarCurso("DAW");
		System.out.println(alumno3.VerCurso());
		
		

	}

}
