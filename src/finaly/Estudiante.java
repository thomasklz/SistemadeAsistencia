package finaly;


import java.util.ArrayList;

/*thor BARREIRO
 */
public class Estudiante extends Persona {
    private int idEstudiante;
    private int idNivel;
    
public static ArrayList<Estudiante>arrayEstudiante=new ArrayList();


    
    public Estudiante() {
    }

    public Estudiante(int idEstudiante, int idNivel, String Nombre,String Apellido, String Cedula, int Edad, String Telefono, String EstadoCivil) {
        super(Nombre, Apellido, Cedula ,Edad, Telefono, EstadoCivil );
        this.idEstudiante = idEstudiante;
        this.idNivel = idNivel;
    }

//    public ArrayList<Estudiante> getArrayEstudiante() {
//        return arrayEstudiante;
//    }
//
//    public void setArrayEstudiante(ArrayList<Estudiante> arrayEstudiante) {
//        this.arrayEstudiante = arrayEstudiante;
//    }
    
    

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    @Override
    public void IngresarPersona() {
      arrayEstudiante.add(new Estudiante( getIdEstudiante(), getIdNivel(), getNombre(),getApellido(),getCedula(),getEdad(),getTelefono(),getEstadoCivil()));
    }

    @Override
    public void MostrarPersona() {
        for(int i = 0; i < arrayEstudiante.size(); i++) {
            System.out.println(" Nombre: "+arrayEstudiante.get(i).getNombre());
            System.out.println(" Apellido: "+arrayEstudiante.get(i).getApellido());
            System.out.println(" Cedula: "+arrayEstudiante.get(i).getCedula());
            System.out.println(" Edad: "+arrayEstudiante.get(i).getEdad());
            System.out.println(" Telefono: "+arrayEstudiante.get(i).getTelefono());
            System.out.println(" Estado_Civil: "+arrayEstudiante.get(i).getEstadoCivil());
            
        }  
            }
//        public void buscarEstudianteCedula (String CI){
//             for (int i = 0; i < Estu.size(); i++) {
//               if(CI.equals(Estu.get(i).getCedula())){
//                System.out.println(" Nombre: "+ Estu.get(i).getNombre());
//                System.out.println(" Apellido: "+ Estu.get(i).getApellido());
//                System.out.println(" Cedula: "+ Estu.get(i).getCedula());
//                System.out.println(" Edad: "+ Estu.get(i).getEdad());
//                System.out.println(" Telefono: "+ Estu.get(i).getTelefono());
//                System.out.println(" Estado_Civil: "+ Estu.get(i).getEstadoCivil());
//                System.out.println(" idNivel: "+ Estu.get(i).getIdNivel());
//                System.out.println(" idNivel: "+ Estu.get(i).getIdEstudiante());
//                
//            }else{
//                   System.out.println("Cedula no registrada");
//               }
//       
//    }
//    
//        
//    }
//    public void buscarEstudianteNivel( String Nivel){
//           for (int i = 0; i < Estu.size(); i++) {
//            if(Nivel.equals(Estu.get(i).getIdNivel())){
//                System.out.println("Nombre: "+ Estu.get(i).getNombre());
//                System.out.println("Apellido: "+ Estu.get(i).getApellido());
//                System.out.println("Cedula: "+ Estu.get(i).getCedula());
//                System.out.println("Edad: "+ Estu.get(i).getEdad());
//                System.out.println("Telefono: "+ Estu.get(i).getTelefono());
//                System.out.println("Estado_Civil: "+ Estu.get(i).getEstadoCivil());
//                System.out.println("idNivel: "+ Estu.get(i).getIdNivel());
//                System.out.println("idNivel: "+ Estu.get(i).getIdEstudiante());
//                
//    
//    
//        }}}
}
    

