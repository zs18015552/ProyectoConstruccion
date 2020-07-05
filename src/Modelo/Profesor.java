
package Modelo;

public class Profesor {
  protected String idProfesor;
  protected String nombre;
  protected String apellidoP;
  protected String apellidoM;

  public Profesor() {
  }

  public Profesor(String idProfesor, String nombre, String apellidoP, String apellidoM) {
    this.idProfesor = idProfesor;
    this.nombre = nombre;
    this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }   
}
