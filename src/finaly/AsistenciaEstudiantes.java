
package finaly;

import java.util.ArrayList;

public class AsistenciaEstudiantes {
    private String idAsistenciaE;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private String estadoAsistencia;
    private String cedulaEstudiante;
    private String fechaAsistencia;

    public static ArrayList<AsistenciaEstudiantes> arrayAsistenciaEst = new ArrayList<AsistenciaEstudiantes>();
    
    public void IngresarAsistenciaE (){
        arrayAsistenciaEst.add(new AsistenciaEstudiantes(getIdAsistenciaE(), getNombreEstudiante(),getApellidoEstudiante(), getEstadoAsistencia(), getCedulaEstudiante(), getFechaAsistencia()));
    }
    
    public AsistenciaEstudiantes() {
    }

    public AsistenciaEstudiantes(String idAsistenciaE, String nombreEstudiante, String apellidoEstudiante, String estadoAsistencia, String cedulaEstudiante, String fechaAsistencia) {
        this.idAsistenciaE = idAsistenciaE;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.estadoAsistencia = estadoAsistencia;
        this.cedulaEstudiante = cedulaEstudiante;
        this.fechaAsistencia = fechaAsistencia;
    } 

    public String getFechaAsistencia() {
        return fechaAsistencia;
    }

    public void setFechaAsistencia(String fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }

    
    
    public String getIdAsistenciaE() {
        return idAsistenciaE;
    }

    public void setIdAsistenciaE(String idAsistenciaE) {
        this.idAsistenciaE = idAsistenciaE;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public String getEstadoAsistencia() {
        return estadoAsistencia;
    }

    public void setEstadoAsistencia(String estadoAsistencia) {
        this.estadoAsistencia = estadoAsistencia;
    }

    public String getCedulaEstudiante() {
        return cedulaEstudiante;
    }

    public void setCedulaEstudiante(String cedulaEstudiante) {
        this.cedulaEstudiante = cedulaEstudiante;
    }
    
    
}
