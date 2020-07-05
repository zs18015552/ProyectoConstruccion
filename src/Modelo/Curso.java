
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso{
  protected String nrc;
  protected String experienciaEducativa;
  protected List<Profesor> listaProfesor;
  protected List<Reservacion> listaReservacion;
  protected String folioHorario;

  public String getNrc() {
    return nrc;
  }

  public void setNrc(String nrc) {
    this.nrc = nrc;
  }

  public String getExperienciaEducativa() {
    return experienciaEducativa;
  }

  public void setExperienciaEducativa(String experienciaEducativa) {
    this.experienciaEducativa = experienciaEducativa;
  }

  public List<Profesor> getListaProfesor() {
    return listaProfesor;
  }

  public void setListaProfesor(List<Profesor> listaProfesor) {
    this.listaProfesor = listaProfesor;
  }

  public List<Reservacion> getListaReservacion() {
    return listaReservacion;
  }

  public void setListaReservacion(List<Reservacion> listaReservacion) {
    this.listaReservacion = listaReservacion;
  }

  public String getFolioHorario() {
    return folioHorario;
  }

  public void setFolioHorario(String folioHorario) {
    this.folioHorario = folioHorario;
  }
  
  public void setDiaLunes (List<Reservacion> listaReservacion) {
   
    
  }
}
