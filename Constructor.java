package mx.com.cuh;

public class Constructor {
	public class Jardinero extends Persona{
	    public Jardinero(String nombre, short altura, short edad, double sueldo) {
	        super(nombre, altura, edad, sueldo);
	        nombre="Francisco Perez";
	    }
	    boolean trabajando = false;


	    @Override
	    public String trabajar(){
	        trabajando = !trabajando;
	        String trabajo = "Comerciando";

	        return trabajo;
	    }
	    @Override
	    public void cobrar(){
	        System.out.println("Cobrar sueldo de jardinero");
	    }
	    @Override
	    public void alimentarse(){
	        System.out.println("Hora de comer para jardinero");

	    }
	    @Override
	    public void checar(){
	        if(!trabajando)
	            System.out.println("Ingreso registrado");
	        else
	            System.out.println("Salida registrada");
	    }
	}

	public void checar() {
		// TODO Auto-generated method stub
		
	}

	public void trabajar() {
		// TODO Auto-generated method stub
		
	}

	public void alimentarse() {
		// TODO Auto-generated method stub
		
	}

	public void cobrar() {
		// TODO Auto-generated method stub
		
	}
}
