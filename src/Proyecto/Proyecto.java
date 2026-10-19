package Proyecto;

public class Proyecto {
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

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

    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            terminado = (progreso == 100);
        } else {
            System.out.println("Error: el progreso debe estar entre 0 y 100.");
        }
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        if (responsable != null && !responsable.trim().isEmpty()) {
            this.responsable = responsable;
        } else {
            System.out.println("Error: el responsable no puede estar vacio.");
        }
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public void avanzar(int porcentaje) {
        if (porcentaje > 0) {
            if (progreso + porcentaje <= 100) {
                progreso += porcentaje;
                terminado = (progreso == 100);
                System.out.println("Progreso actual: " + progreso + "%");
            } else {
                progreso = 100;
                terminado = true;
                System.out.println("El proyecto llego al 100%.");
            }
        } else {
            System.out.println("Error: el porcentaje debe ser positivo.");
        }
    }
}
