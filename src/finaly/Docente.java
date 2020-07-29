package finaly;


import java.util.ArrayList;

public class Docente  extends Persona  {
    
    private String idDocente;
    private String idMateria;
    
public static ArrayList<Docente>arrayProfesor=new ArrayList();

    
    public Docente() {
    }

//    public ArrayList<Docente> getArrayProfesor() {
//        return arrayProfesor;
//    }
//
//    public void setArrayProfesor(ArrayList<Docente> arrayProfesor) {
//        this.arrayProfesor = arrayProfesor;
//    }
   

    public Docente(String idDocente, String idMateria, String Nombre, String Apellido, String Cedula, int Edad, String Telefono, String EstadoCivil) {
        super(Nombre, Apellido, Cedula, Edad, Telefono, EstadoCivil);
        this.idDocente = idDocente;
        this.idMateria = idMateria;
    }

    public String getIdDocente( ) {
  
        return idDocente;
    }

    public void setIdDocente(String idDocente) {
        this.idDocente = idDocente;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    @Override
    public void IngresarPersona( ) {
       arrayProfesor.add(new Docente( getIdDocente(), getIdMateria(), getNombre(), getApellido(),getCedula(), getEdad(),getTelefono(),getEstadoCivil()));
    }

    @Override
    public void MostrarPersona() {
        for(int i = 0; i < arrayProfesor.size(); i++) {
            System.out.println(" Nombre: "+arrayProfesor.get(i).getNombre());
            System.out.println(" Apellido: "+arrayProfesor.get(i).getApellido());
            System.out.println(" Cedula: "+arrayProfesor.get(i).getCedula());
            System.out.println(" Edad: "+arrayProfesor.get(i).getEdad());
            System.out.println(" Telefono: "+arrayProfesor.get(i).getTelefono());
            System.out.println(" Estado_Civil: "+arrayProfesor.get(i).getEstadoCivil());
            
    }
    
    }
    
    public void Asistencia(){

        System.out.println("");
}


}
