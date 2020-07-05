
package Controlador;

import Modelo.Curso;
import Modelo.MetodosProfesor;
import Modelo.Profesor;
import Modelo.Reservacion;
import Vista.FrmProfesor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControlProfesor implements ActionListener{
  MetodosProfesor metodosProfesor = new MetodosProfesor();
  Curso curso = new Curso();
  Profesor profesor = new Profesor();
  Reservacion reservacion = new Reservacion();
  FrmProfesor frmProfesor = new FrmProfesor();
  DefaultTableModel modeloProfesor = new DefaultTableModel();
  
  public ControlProfesor( FrmProfesor buscarProfesor ) {
        this.frmProfesor = buscarProfesor;
        this.frmProfesor.btnLimpiar.addActionListener(this);
        this.frmProfesor.btnBuscarProfesor.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == frmProfesor.btnBuscarProfesor) {
      frmProfesor.tblProfesor.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {},
        new String [] {"NRC", "Experiencia Educativa", "Lunes", "Martes"
                , "Miercoles",     "Jueves", "Viernes"}
      ));
      if (frmProfesor.tblProfesor.getColumnModel().getColumnCount() > 0) {
      frmProfesor.tblProfesor.getColumnModel().getColumn(0).setPreferredWidth(10);
      frmProfesor.tblProfesor.getColumnModel().getColumn(1).setPreferredWidth(120);
      }
      MostrarDatosExpEdu(frmProfesor.tblProfesor);
    }
    if (e.getSource() == frmProfesor.btnLimpiar) {
      frmProfesor.tblProfesor.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {},
        new String [] {"NRC", "Experiencia Educativa", "Lunes", "Martes"
                , "Miercoles",     "Jueves", "Viernes"}
      ));
      if (frmProfesor.tblProfesor.getColumnModel().getColumnCount() > 0) {
      frmProfesor.tblProfesor.getColumnModel().getColumn(0).setPreferredWidth(10);
      frmProfesor.tblProfesor.getColumnModel().getColumn(1).setPreferredWidth(120);
      }
      MostrarTablaIniciada(frmProfesor.tblProfesor);
    }
    
  }
  
  public void MostrarDatosExpEdu(JTable tblProfesor){
      modeloProfesor = (DefaultTableModel)tblProfesor.getModel();
      @SuppressWarnings("unchecked")
      List<Curso>listaProfesor=metodosProfesor.BusquedaProfesor(curso, frmProfesor.txtNombreProfesor.getText());
      @SuppressWarnings("unchecked")
      List<Reservacion> listaReservacion = new ArrayList();
      Object[]object = new Object [7];
      for (int i = 0; i < listaProfesor.size(); i++) {
        object[0] = listaProfesor.get(i).getNrc();
        object[1] = listaProfesor.get(i).getExperienciaEducativa();
        listaReservacion = listaProfesor.get(i).getListaReservacion();
        object[2] = listaReservacion.get(0).getHoraDia();
        object[3] = listaReservacion.get(1).getHoraDia();
        object[4] = listaReservacion.get(2).getHoraDia();
        object[5] = listaReservacion.get(3).getHoraDia();
        object[6] = listaReservacion.get(4).getHoraDia();
        
        modeloProfesor.addRow(object);
      }
      frmProfesor.tblProfesor.setModel(modeloProfesor);
    }

  public void MostrarTablaIniciada(JTable tblProfesor){
      modeloProfesor = (DefaultTableModel)tblProfesor.getModel();
      @SuppressWarnings("unchecked")
      List<Curso>listaProfesor=metodosProfesor.IniciarTabla(curso);
      @SuppressWarnings("unchecked")
      List<Reservacion> listaReservacion = new ArrayList();
      Object[]object = new Object [7];
      for (int i = 0; i < listaProfesor.size(); i++) {
        object[0] = listaProfesor.get(i).getNrc();
        object[1] = listaProfesor.get(i).getExperienciaEducativa();
        listaReservacion = listaProfesor.get(i).getListaReservacion();
        object[2] = listaReservacion.get(0).getHoraDia();
        object[3] = listaReservacion.get(1).getHoraDia();
        object[4] = listaReservacion.get(2).getHoraDia();
        object[5] = listaReservacion.get(3).getHoraDia();
        object[6] = listaReservacion.get(4).getHoraDia();
        
        modeloProfesor.addRow(object);
      }
      frmProfesor.tblProfesor.setModel(modeloProfesor);
    }  
  
}
