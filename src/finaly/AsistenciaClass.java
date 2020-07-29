
package finaly;

import java.util.ArrayList;


public class AsistenciaClass {
    private String idAsistencia;
    private String fechaAsistencia;
    private String materiaAsistencia;
    private String docenteAsistencia;

    public static ArrayList<AsistenciaClass> arrayAsistencia = new ArrayList<AsistenciaClass>();
    
    public void IngresarAsistencia (){
        arrayAsistencia.add(new AsistenciaClass(getIdAsistencia(), getFechaAsistencia(),getMateriaAsistencia(), getDocenteAsistencia()));
        
    }
    
    public AsistenciaClass() {
    }

    public AsistenciaClass(String idAsistencia, String fechaAsistencia, String materiaAsistencia, String docenteAsistencia) {
        this.idAsistencia = idAsistencia;
        this.fechaAsistencia = fechaAsistencia;
        this.materiaAsistencia = materiaAsistencia;
        this.docenteAsistencia = docenteAsistencia;
    }
    
    public String getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(String idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public String getFechaAsistencia() {
        return fechaAsistencia;
    }

    public void setFechaAsistencia(String fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }

    public String getMateriaAsistencia() {
        return materiaAsistencia;
    }

    public void setMateriaAsistencia(String materiaAsistencia) {
        this.materiaAsistencia = materiaAsistencia;
    }

    public String getDocenteAsistencia() {
        return docenteAsistencia;
    }

    public void setDocenteAsistencia(String docenteAsistencia) {
        this.docenteAsistencia = docenteAsistencia;
    }

    
}
