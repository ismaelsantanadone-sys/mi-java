
package JavaApplicacion13;

public class Estudiante {
 int matricula;
 int id;
 String numero;
 String Apellido;
 String centro;
 String nombre;
 public Estudiante(int matricula,int id, String numero,
         String apellido,String centro,String nombre){
 this.matricula=matricula;
 this.Apellido=apellido;
 this.id=id;
 this.nombre=nombre;
 this.centro=centro;
 this.numero=numero;
 }
 public void presentacion(){
     System.out.println("me llamo "+nombre+" "+Apellido+" mi numero en la lista es "+id+" estudio en "+centro+" el telefono de mis padres es "+numero);
 }

    /**
     *
     * @param args
     */
    public static void main (String[] args){
   Estudiante alumno = new Estudiante(
                0,
                8,
                "809-222-3456",
                "Santana",
                "colegio rinconcito de luz",
                "Ismael"
        );
 estudiante_post_grado estudiante = new estudiante_post_grado(
        100873929,
        90,
        "829-234-1123",
        "santana",
        "uasd",
        "ismael"
);
Estudiante_grado estudiante2=new Estudiante_grado(
 100873929,
        12939887,
        "829-555-0822",
        "santana",
        "uasd",
        "ismael"

);
 alumno.presentacion();
  estudiante.presentacion();
  estudiante2.presentacion();
  } 
}
