public class Entrenador extends Persona {
    private String IdFederacion;

    public Entrenador() {
    }

    public Entrenador(String nombre, String apellido, Integer edad, String idFederacion) {
        super(nombre, apellido, edad);
        IdFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return IdFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        IdFederacion = idFederacion;
    }

    public static void main(String[] args) {
        new Main();
    }
}
