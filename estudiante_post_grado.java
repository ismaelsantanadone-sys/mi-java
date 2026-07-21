/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplicacion13;

/**
 *
 * @author Ismael
 */
public class estudiante_post_grado extends Estudiante {

    public estudiante_post_grado(int matricula, int id, String numero, String apellido, String centro, String nombre) {
        super(matricula, id, numero, apellido, centro, nombre);
    }

    /**
     *
     */
    @Override
    public void presentacion(){
    System.out.println("mi nombre es "+nombre+" mi apellido es "+Apellido+" mi numero de telefono es "+numero+" me gradue de la universidad "+centro+" con la matricula "+matricula+" saque un promedio de "+id+" por ciento");
    }
}


