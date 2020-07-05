
package Controlador;

import Modelo.Curso;
import Modelo.MetodosCurso;
import Modelo.Profesor;
import Modelo.Reservacion;
import Vista.FrmCurso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorCurso implements ActionListener{
  MetodosCurso metodosCurso = new MetodosCurso();
  Curso curso = new Curso();
  Profesor profesor = new Profesor();
  Reservacion reservacion = new Reservacion();
  FrmCurso frmCurso = new FrmCurso();
  DefaultTableModel modeloCurso = new DefaultTableModel();
  
  public ControladorCurso  (FrmCurso frmCurso){
    this.frmCurso = frmCurso;
    this.frmCurso.btnConsultaNRC.addActionListener(this);
    this.frmCurso.btnCurso.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == frmCurso.btnConsultaNRC) {
      frmCurso.tblCurso.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {},
        new String [] {"NRC", "Experiencia Educativa", "Profesor", "Lunes", "Martes"
                , "Miercoles",     "Jueves", "Viernes"}
      ));
      if (frmCurso.tblCurso.getColumnModel().getColumnCount() > 0) {
      frmCurso.tblCurso.getColumnModel().getColumn(0).setPreferredWidth(10);
      frmCurso.tblCurso.getColumnModel().getColumn(1).setPreferredWidth(120);
      }
      MostrarDatosNRC(frmCurso.tblCurso);
    }
    if (e.getSource() == frmCurso.btnCurso) {
      frmCurso.tblCurso.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {},
        new String [] {"NRC", "Experiencia Educativa", "Profesor", "Lunes", "Martes"
                , "Miercoles",     "Jueves", "Viernes"}
      ));
      if (frmCurso.tblCurso.getColumnModel().getColumnCount() > 0) {
      frmCurso.tblCurso.getColumnModel().getColumn(0).setPreferredWidth(10);
      frmCurso.tblCurso.getColumnModel().getColumn(1).setPreferredWidth(120);
      }
      MostrarDatosExpEdu(frmCurso.tblCurso);
    }
  }
  
  public void MostrarDatosExpEdu(JTable tblCurso){
      modeloCurso= (DefaultTableModel)tblCurso.getModel();
      @SuppressWarnings("unchecked")
      List<Curso>listaCurso=metodosCurso.BuscarCurso(curso, frmCurso.txtExpEdu.getText());
      @SuppressWarnings("unchecked")
      List<Reservacion> listaReservacion = new ArrayList();
      @SuppressWarnings("unchecked")
      List<Profesor> listaProfesor = new ArrayList();
      Object[]object = new Object [8];
      for (int i = 0; i < listaCurso.size(); i++) {
        object[0] = listaCurso.get(i).getNrc();
        object[1] = listaCurso.get(i).getExperienciaEducativa();
        listaProfesor = listaCurso.get(i).getListaProfesor();
        object[2] = listaProfesor.get(0).getNombre();
        listaReservacion = listaCurso.get(i).getListaReservacion();
        object[3] = listaReservacion.get(0).getHoraDia();
        object[4] = listaReservacion.get(1).getHoraDia();
        object[5] = listaReservacion.get(2).getHoraDia();
        object[6] = listaReservacion.get(3).getHoraDia();
        object[7] = listaReservacion.get(4).getHoraDia();
        
        modeloCurso.addRow(object);
      }
      frmCurso.tblCurso.setModel(modeloCurso);
    }
  
  public void MostrarDatosNRC(JTable tblCurso){
    modeloCurso= (DefaultTableModel)tblCurso.getModel();
    @SuppressWarnings("unchecked")
    List<Curso>listaCurso=metodosCurso.BuscarCurso(curso, frmCurso.txtNRC.getText());
    @SuppressWarnings("unchecked")
    List<Reservacion> listaReservacion = new ArrayList();
    @SuppressWarnings("unchecked")
    List<Profesor> listaProfesor = new ArrayList();
    Object[]object = new Object [8];
    for (int i = 0; i < listaCurso.size(); i++) {
      object[0] = listaCurso.get(i).getNrc();
      object[1] = listaCurso.get(i).getExperienciaEducativa();
      listaProfesor = listaCurso.get(i).getListaProfesor();
      object[2] = listaProfesor.get(0).getNombre();
      listaReservacion = listaCurso.get(i).getListaReservacion();
      object[3] = listaReservacion.get(0).getHoraDia();
      object[4] = listaReservacion.get(1).getHoraDia();
      object[5] = listaReservacion.get(2).getHoraDia();
      object[6] = listaReservacion.get(3).getHoraDia();
      object[7] = listaReservacion.get(4).getHoraDia();
      
      modeloCurso.addRow(object);
    }
    frmCurso.tblCurso.setModel(modeloCurso);
  }
    
  public void MostrarDatosTabla(JTable tblCurso){
    modeloCurso= (DefaultTableModel)tblCurso.getModel();
    @SuppressWarnings("unchecked")
    List<Curso>listaCurso=metodosCurso.IniciarTabla(curso);
    @SuppressWarnings("unchecked")
    List<Reservacion> listaReservacion = new ArrayList();
    @SuppressWarnings("unchecked")
    List<Profesor> listaProfesor = new ArrayList();
    Object[]object = new Object [8];
    for (int i = 0; i < listaCurso.size(); i++) {
      object[0] = listaCurso.get(i).getNrc();
      object[1] = listaCurso.get(i).getExperienciaEducativa();
      listaProfesor = listaCurso.get(i).getListaProfesor();
      object[2] = listaProfesor.get(0).getNombre();
      listaReservacion = listaCurso.get(i).getListaReservacion();
      object[3] = listaReservacion.get(0).getHoraDia();
      object[4] = listaReservacion.get(1).getHoraDia();
      object[5] = listaReservacion.get(2).getHoraDia();
      object[6] = listaReservacion.get(3).getHoraDia();
      object[7] = listaReservacion.get(4).getHoraDia();
       
      modeloCurso.addRow(object);
    }
    frmCurso.tblCurso.setModel(modeloCurso);
  }
}
