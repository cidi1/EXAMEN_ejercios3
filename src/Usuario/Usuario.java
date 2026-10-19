package Usuario;

public class Usuario {
    private String username;
    private String correo;
    private int nivel;
    private boolean activo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username != null && !username.trim().isEmpty()) {
            this.username = username;
        } else {
            System.out.println("Error: el username no puede estar vacio.");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo != null && !correo.trim().isEmpty()) {
            this.correo = correo;
        } else {
            System.out.println("Error: el correo no puede estar vacio.");
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        } else {
            System.out.println("Error: el nivel debe ser mayor o igual a 0.");
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void activar() {
        activo = true;
        System.out.println("Usuario activado.");
    }

    public void desactivar() {
        activo = false;
        System.out.println("Usuario desactivado.");
    }
}
