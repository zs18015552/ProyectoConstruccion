
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Horario {
  protected String folioHorario;
  protected String grupo;
  protected String programaEducativo;
  protected List<Curso> listaCurso;

  public String getFolioHorario() {
    return folioHorario;
  }

  public void setFolioHorario(String folioHorario) {
    this.folioHorario = folioHorario;
  }

  public String getGrupo() {
    return grupo;
  }

  public void setGrupo(String grupo) {
    this.grupo = grupo;
  }

  public String getProgramaEducativo() {
    return programaEducativo;
  }

  public void setProgramaEducativo(String programaEducativo) {
    this.programaEducativo = programaEducativo;
  }

  public List<Curso> getListaCurso() {
    return listaCurso;
  }

  public void setListaCurso(List<Curso> listaCurso) {
    this.listaCurso = listaCurso;
  }
  
  
}
