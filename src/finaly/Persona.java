package finaly;


import java.util.ArrayList;


public abstract class Persona {
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private int Edad;
    private String Telefono;
    private String EstadoCivil;
    
    public Persona() {
    }

    public Persona(String Nombre, String Apellido, String Cedula, int Edad, String Telefono, String EstadoCivil) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Edad = Edad;
        this.Telefono = Telefono;
        this.EstadoCivil = EstadoCivil;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public abstract void IngresarPersona();
    
     public abstract void  MostrarPersona();

  

}

    
    
