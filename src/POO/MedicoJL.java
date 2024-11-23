
package POO;

/**
 *
 * @author Fernando Lopez
 */
public class MedicoJL extends PersonaJL{
    private String especialidadJL;
    private String añosExperienciaJL;

    public MedicoJL(String especialidadJL, String añosExperienciaJL, String nombreJL, String edadJL, String direccionJL) {
        super(nombreJL, edadJL, direccionJL);
        this.especialidadJL = especialidadJL;
        this.añosExperienciaJL = añosExperienciaJL;
    }

    public String getEspecialidadJL() {
        return especialidadJL;
    }

    public void setEspecialidadJL(String especialidadJL) {
        this.especialidadJL = especialidadJL;
    }

    public String getAñosExperienciaJL() {
        return añosExperienciaJL;
    }

    public void setAñosExperienciaJL(String añosExperienciaJL) {
        this.añosExperienciaJL = añosExperienciaJL;
    }

   
    

}
