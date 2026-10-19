package Servicio;

public class Servicio {
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacio.");
        }
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        if (puerto > 0) {
            this.puerto = puerto;
        } else {
            System.out.println("Error: el puerto debe ser mayor que 0.");
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getCantidadPeticiones() {
        return cantidadPeticiones;
    }

    public void setCantidadPeticiones(int cantidadPeticiones) {
        if (cantidadPeticiones >= 0) {
            this.cantidadPeticiones = cantidadPeticiones;
        } else {
            System.out.println("Error: la cantidad de peticiones no puede ser negativa.");
        }
    }

    public void iniciar() {
        activo = true;
        System.out.println("Servicio iniciado.");
    }

    public void detener() {
        activo = false;
        System.out.println("Servicio detenido.");
    }

    public void registrarPeticion() {
        if (activo) {
            cantidadPeticiones++;
            System.out.println("Peticion registrada. Total: " + cantidadPeticiones);
        } else {
            System.out.println("Error: no se puede registrar una peticion porque el servicio esta inactivo.");
        }
    }
}
