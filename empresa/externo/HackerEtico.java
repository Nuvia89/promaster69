package empresa.externo;
import empresa.seguridad.SistemaSeguridad;

public class HackerEtico extends SistemaSeguridad {
    public void probar() {
        accesoPublico();
        accesoProtegido(); // FUNCIONA: Aunque está en otro paquete, es un hijo (subclase)
        // accesoPaquete();  // ERROR: El acceso default no cruza paquetes
        // accesoPrivado();  // ERROR
    }
}