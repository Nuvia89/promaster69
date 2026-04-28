package empresa.externo;
import empresa.seguridad.SistemaSeguridad;

public class AuditorExterno {
    public void probar() {
        SistemaSeguridad s = new SistemaSeguridad();
        s.accesoPublico();
        // s.accesoProtegido(); // ERROR: Está en otro paquete y no es hijo
        // s.accesoPaquete();   // ERROR: Está fuera del paquete 'seguridad'
        // s.accesoPrivado();   // ERROR: Totalmente bloqueado
    }
}