package empresa.seguridad;

public class SistemaSeguridad {
    public void accesoPublico() {
        System.out.println("Todos pueden acceder");
    }

    protected void accesoProtegido() {
        System.out.println("Solo empleados y subclases");
    }

    void accesoPaquete() { // Este es el modificador 'default'
        System.out.println("Solo dentro del mismo paquete");
    }

    private void accesoPrivado() {
        System.out.println("Solo dentro de la misma clase");
    }

    public void pruebaInterna() {
        accesoPublico();
        accesoProtegido();
        accesoPaquete();
        accesoPrivado();
    }
}