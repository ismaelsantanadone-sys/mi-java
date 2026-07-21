package JavaApplicacion13;
        

public class Estudiante_grado extends Estudiante {

    public Estudiante_grado(int matricula, int id, String numero, String apellido, String centro, String nombre) {
        super(matricula, id, numero, apellido, centro, nombre);
    }

    /**
     *
     */
    @Override
    public void presentacion(){
    System.out.println("mi nombre es "+nombre+" mi apellido es "+Apellido+" mi numero de telefono es "+numero+" estudio en la universidad "+centro+" con la matricula "+matricula+" mi sontraseña es "+id);
    }
}
