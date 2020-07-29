package finaly;


import java.util.ArrayList;


public class Semestre {
    private String idNivel;
    private String Nivel;
    private String Paralelo;
    
    public static ArrayList<Semestre> ArraySemestre =new ArrayList<Semestre>() ;
    
    

//    public ArrayList<Semestre> getArraySemestre() {
//        return ArraySemestre;
//    }
//
//    public void setArraySemestre(ArrayList<Semestre> ArraySemestre) {
//        this.ArraySemestre = ArraySemestre;
//    }
//    
    public Semestre() {
        
    }

    public Semestre(String idNivel, String Nivel, String Paralelo) {
        this.idNivel = idNivel;
        this.Nivel = Nivel;
        this.Paralelo = Paralelo;
    }

    public String getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(String idNivel) {
        this.idNivel = idNivel;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public String getParalelo() {
        return Paralelo;
    }

    public void setParalelo(String Paralelo) {
        this.Paralelo = Paralelo;
    }
    
    public void IngresarSemestre (){
    ArraySemestre.add(new Semestre(getIdNivel(),getNivel(),getParalelo()));
 }           

    
public void Mostrarsemestre(){
    for (int i = 0; i <ArraySemestre.size(); i++) {
        System.out.println("id nivel:"+ArraySemestre.get(i).getIdNivel());
        System.out.println("Nivel:"+ArraySemestre.get(i).getNivel());
        System.out.println("Paralelo:"+ArraySemestre.get(i).getParalelo());
       
    }
  

    }
}
