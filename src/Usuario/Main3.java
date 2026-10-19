package Usuario;

public class Main3 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        usuario.setUsername("jp_rosas");
        usuario.setCorreo("jp@gmail.com");
        usuario.setNivel(1);
        usuario.setActivo(false);

        System.out.println("Username: " + usuario.getUsername());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Nivel: " + usuario.getNivel());
        System.out.println("Activo: " + usuario.isActivo());

        usuario.activar();
        System.out.println("Activo: " + usuario.isActivo());

        usuario.desactivar();
        System.out.println("Activo: " + usuario.isActivo());

        usuario.setUsername("");
        usuario.setCorreo("");
        usuario.setNivel(-1);
    }

}
