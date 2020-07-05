
package Modelo;

public class Reservacion {
 
 protected String horaDia;
 protected String salon;
 protected String nrcReservacion;
 protected String diaSemana;

  public Reservacion() {
  }

  public Reservacion(String horaDia, String salon, String nrcReservacion, String diaSemana) {
    this.horaDia = horaDia;
    this.salon = salon;
    this.nrcReservacion = nrcReservacion;
    this.diaSemana = diaSemana;
  }
  

  public String getHoraDia() {
    return horaDia;
  }

  public void setHoraDia(String horaDia) {
    this.horaDia = horaDia;
  }

  public String getSalon() {
    return salon;
  }

  public void setSalon(String salon) {
    this.salon = salon;
  }

  public String getNrcReservacion() {
    return nrcReservacion;
  }

  public void setNrcReservacion(String nrcReservacion) {
    this.nrcReservacion = nrcReservacion;
  }

  public String getDiaSemana() {
    return diaSemana;
  }

  public void setDiaSemana(String diaSemana) {
    this.diaSemana = diaSemana;
  }  

}
