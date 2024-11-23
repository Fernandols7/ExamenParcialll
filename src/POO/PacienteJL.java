
package POO;

/**
 *
 * @author Fernando Lopez
 */
public class PacienteJL extends PersonaJL{
    private String nroHistorialJL;
    private String enfermedadJL;

    public PacienteJL(String nroHistorialJL, String enfermedadJL, String nombreJL, String edadJL, String direccionJL) {
        super(nombreJL, edadJL, direccionJL);
        this.nroHistorialJL = nroHistorialJL;
        this.enfermedadJL = enfermedadJL;
    }

    public String getNroHistorialJL() {
        return nroHistorialJL;
    }

    public void setNroHistorialJL(String nroHistorialJL) {
        this.nroHistorialJL = nroHistorialJL;
    }

    public String getEnfermedadJL() {
        return enfermedadJL;
    }

    public void setEnfermedadJL(String enfermedadJL) {
        this.enfermedadJL = enfermedadJL;
    }

    public String getEdadJL() {
        return edadJL;
    }

    public void setEdadJL(String edadJL) {
        this.edadJL = edadJL;
    }

    public String getDireccionJL() {
        return direccionJL;
    }

    public void setDireccionJL(String direccionJL) {
        this.direccionJL = direccionJL;
    }


    
        public void resultados() {
        System.out.println("Nombre: " + getNombreJL());
        System.out.println("Edad: " + getEdadJL());
        System.out.println("Direccion: " + getDireccionJL());
        System.out.println("Nro Historial: " + getNroHistorialJL());
        System.out.println("Enfermedad: " + getEnfermedadJL());
    }

}