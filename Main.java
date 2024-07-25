package mx.com.cuh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String nombre = "";
	        //Se instancia un objeto de la clase persona con nomre persona1 y sus atributos iniciales
	        Persona persona1 = new Persona("Julio", (short)182,(short) 23, 0);
	        Persona comerciante = new Comerciante("Luis Fernandez", (short) 170, (short) 20, 190);
	        Constructor constructor = new Constructor();
	        Persona jardinero = new Jardinero("Marco Perez", (short) 184, (short) 25, 250);
Soldado soldado = new Soldado("Juan Hernandez", (short) 174, (short) 24, 230);
Panadero panadero = new Panadero("Erick Hernandez", (short) 178, (short) 28, 260);
	        //Llamar el metodo checar para cada trabajador
	        persona1.checar();
	        comerciante.checar();
	        constructor.checar();
	        jardinero.checar();
            soldado.checar();
            panadero.checar();

	        //Implementacion especifica del metodo trabajar de la clase Padre en las clases Hijas
	        persona1.trabajar();
	        comerciante.trabajar();
	        constructor.trabajar();
	        jardinero.trabajar();
	        soldado.trabajar();
            panadero.trabajar();

	        //Implementacion especifica del metodo trabajar de la clase Padre en las clases Hijas
	        persona1.alimentarse();
	        comerciante.alimentarse();
	        constructor.alimentarse();
	        jardinero.alimentarse();
	        soldado.alimentarse();
            panadero.alimentarse();


	        //Implementacion especifica del metodo trabajar de la clase Padre en las clases Hijas
	        persona1.cobrar();
	        comerciante.cobrar();
	        constructor.cobrar();
	        jardinero.cobrar();
	        soldado.cobrar();
            panadero.cobrar();

	        //Llamar el metodo checar para cada trabajador
	        persona1.checar();
	        comerciante.checar();
	        constructor.checar();
	        jardinero.checar();
	        soldado.checar();
            panadero.checar();
	}

}
