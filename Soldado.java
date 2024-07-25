package mx.com.cuh;

public class Soldado {

    public Soldado(String nombre, short altura, short edad, double sueldo) {
        super();
        nombre="Francisco Perez";
    }
    boolean trabajando = false;


    public String trabajar(){
        trabajando = !trabajando;
        String trabajo = "Comerciando";

        return trabajo;
    }
    public void cobrar(){
        System.out.println("Cobrar sueldo de jardinero");
    }
    public void alimentarse(){
        System.out.println("Hora de comer para jardinero");

    }
    public void checar(){
        if(!trabajando)
            System.out.println("Ingreso registrado");
        else
            System.out.println("Salida registrada");
}
}
