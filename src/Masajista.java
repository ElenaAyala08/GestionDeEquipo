public class Masajista extends Persona{
    public String titulacion;
    public Integer aniosExperiencia;

    public Masajista(){}

    public Masajista(String nombre, String apellido, Integer edad, String titulacion, Integer aniosExperiencia) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public static void main(String[] args) { new Main();

    }
}
