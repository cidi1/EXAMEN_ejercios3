package Proyecto;

public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto();

        proyecto.setNombre("Sistema de ventas");
        proyecto.setProgreso(20);
        proyecto.setResponsable("Jean Pierre");

        System.out.println("Nombre: " + proyecto.getNombre());
        System.out.println("Progreso: " + proyecto.getProgreso() + "%");
        System.out.println("Responsable: " + proyecto.getResponsable());
        System.out.println("Terminado: " + proyecto.isTerminado());

        proyecto.avanzar(30);
        proyecto.avanzar(40);
        proyecto.avanzar(20);

        System.out.println("Progreso final: " + proyecto.getProgreso() + "%");
        System.out.println("Terminado: " + proyecto.isTerminado());

        proyecto.setProgreso(150);
        proyecto.avanzar(-10);
    }
}
