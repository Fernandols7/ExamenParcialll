
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
    
    

}
