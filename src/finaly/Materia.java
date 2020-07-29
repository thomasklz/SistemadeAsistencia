package finaly;


import java.util.ArrayList;


public class Materia {
    private String idMateria;
    private String Nombre_Materia;
    private String idNivel;
    
    public static ArrayList<Materia> arrayMateria = new ArrayList<Materia>();
    
    public Materia() {
    }

    public Materia(String idMateria, String Nombre_Materia, String idNivel) {
        this.idMateria = idMateria;
        this.Nombre_Materia = Nombre_Materia;
        this.idNivel = idNivel;
    }

//    public ArrayList<Materia> getArrayMateria() {
//        return arrayMateria;
//    }
//
//    public void setArrayMateria(ArrayList<Materia> arrayMateria) {
//        this.arrayMateria = arrayMateria;
//    }

    
    
    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre_Materia() {
        return Nombre_Materia;
    }

    public void setNombre_Materia(String Nombre_Materia) {
        this.Nombre_Materia = Nombre_Materia;
    }

    public String getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(String idNivel) {
        this.idNivel = idNivel;
    }
    
    
    public void IngresarMateria (){
        arrayMateria.add(new Materia(getIdMateria(), getNombre_Materia(),getIdNivel()));
        
    }
    public void mostrarMateria(){
        for (int i = 0; i < arrayMateria.size(); i++) {
            System.out.println("Id materia:"+arrayMateria.get(i).getIdMateria());
            System.out.println("Nombre de materia:"+arrayMateria.get(i).getNombre_Materia());
            System.out.println("Id semestre:"+arrayMateria.get(i).getIdNivel());
            
        }
        
    }
  
}
