package Servicio;

public class Main2 {
    public static void main(String[] args) {
        Servicio servicio = new Servicio();

        servicio.setNombre("Servidor web");
        servicio.setPuerto(8080);
        servicio.setCantidadPeticiones(0);

        System.out.println("Nombre: " + servicio.getNombre());
        System.out.println("Puerto: " + servicio.getPuerto());
        System.out.println("Activo: " + servicio.isActivo());
        System.out.println("Cantidad de peticiones: " + servicio.getCantidadPeticiones());

        servicio.registrarPeticion();

        servicio.iniciar();

        servicio.registrarPeticion();
        servicio.registrarPeticion();
        servicio.registrarPeticion();

        System.out.println("Peticiones registradas: " + servicio.getCantidadPeticiones());

        servicio.detener();

        servicio.registrarPeticion();

        servicio.setNombre("");
        servicio.setPuerto(-1);
        servicio.setCantidadPeticiones(-5);
    }
}
