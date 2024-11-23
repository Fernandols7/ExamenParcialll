
package POO;

/**
 *
 * @author Fernando Lopez
 */
public class MedicoJL extends PersonaJL{
    private String especialidadJL;
    private String aniosExperienciaJL;

    public MedicoJL(String especialidadJL, String aniosExperienciaJL, String nombreJL, String edadJL, String direccionJL) {
        super(nombreJL, edadJL, direccionJL);
        this.especialidadJL = especialidadJL;
        this.aniosExperienciaJL = aniosExperienciaJL;
    }

    public String getEspecialidadJL() {
        return especialidadJL;
    }

    public void setEspecialidadJL(String especialidadJL) {
        this.especialidadJL = especialidadJL;
    }

    public String getAniosExperienciaJL() {
        return aniosExperienciaJL;
    }

    public void setAniosExperienciaJL(String aniosExperienciaJL) {
        this.aniosExperienciaJL = aniosExperienciaJL;
    }
    
    public void resultados() {
        System.out.println("Nombre: " + getNombreJL());
        System.out.println("Edad: " + getEdadJL());
        System.out.println("Dirección: " + getDireccionJL());
        System.out.println("Especialidad: " + getEspecialidadJL());
        System.out.println("Años de Experiencia: " + getAniosExperienciaJL());
    }
    
}
