package Controlador;

// Importación de librerias y clases
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

//Inicio de controladores para la interfaz de Profesor 
public class ControlProfesor implements ActionListener{
    
/*  
*Instanciación de los métodos profesor en las clases metodosProfesor,
*Curso, Profesor, Reservación y la vista frmProfesor 
*/  
MetodosProfesor metodosProfesor = new MetodosProfesor();
  Curso curso = new Curso();
  Profesor profesor = new Profesor();
  Reservacion reservacion = new Reservacion();
  FrmProfesor frmProfesor = new FrmProfesor();
  DefaultTableModel modeloProfesor = new DefaultTableModel();
  
  //Constructor de ControlProfesor para los elementos en frmProfesor
  public ControlProfesor( FrmProfesor buscarProfesor ) {
        this.frmProfesor = buscarProfesor;
        this.frmProfesor.btnLimpiar.addActionListener(this);
        this.frmProfesor.btnBuscarProfesor.addActionListener(this);
  }

  @Override
  
  //Controlador sobre acción de botones en frmProfesor
  public void actionPerformed(ActionEvent e) {
    //Acción para botón BuscarProfesor, relleno de datos con respecto a datos ingresados
    if (e.getSource() == frmProfesor.btnBuscarProfesor) {
      //Estructura de la tabla de resultados para datos a plasmar
      frmProfesor.tblProfesor.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {},
        new String [] {"NRC", "Experiencia Educativa", "Lunes", "Martes"
                , "Miercoles",     "Jueves", "Viernes"}
      ));
      //Localización de los datos con respecto a su columna y tamaño fijo
      if (frmProfesor.tblProfesor.getColumnModel().getColumnCount() > 0) {
      frmProfesor.tblProfesor.getColumnModel().getColumn(0).setPreferredWidth(10);
      frmProfesor.tblProfesor.getColumnModel().getColumn(1).setPreferredWidth(120);
      }
      MostrarDatosExpEdu(frmProfesor.tblProfesor);
    }
    //Acción para botón Limpiar, limpia tabla de resultados para otra operación
    if (e.getSource() == frmProfesor.btnLimpiar) {
      //Estructura de la tabla de resultados vacía
      frmProfesor.tblProfesor.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {},
        new String [] {"NRC", "Experiencia Educativa", "Lunes", "Martes"
                , "Miercoles",     "Jueves", "Viernes"}
      ));
      //Localización de los datos con respecto a su columna y tamaño fijo
      if (frmProfesor.tblProfesor.getColumnModel().getColumnCount() > 0) {
      frmProfesor.tblProfesor.getColumnModel().getColumn(0).setPreferredWidth(10);
      frmProfesor.tblProfesor.getColumnModel().getColumn(1).setPreferredWidth(120);
      }
      MostrarTablaIniciada(frmProfesor.tblProfesor);
    }
    
  }
  
  //Controlador para Muestra de Datos sobre Experiencias Educativas
  public void MostrarDatosExpEdu(JTable tblProfesor){
      //Carga de tabla temporal para datos a plasmar
      modeloProfesor = (DefaultTableModel)tblProfesor.getModel();
      @SuppressWarnings("unchecked")
      //Llamada del método a usar, asignando el dato usado para su funcionamiento
      List<Curso>listaProfesor=metodosProfesor.BusquedaProfesor(curso, frmProfesor.txtNombreProfesor.getText());
      @SuppressWarnings("unchecked")
      //Creación del ArrayList con datos de Reservación
      List<Reservacion> listaReservacion = new ArrayList();
      //Tamaño del objeto creado según los datos a manejar
      Object[]object = new Object [7];
      //Inicio del ciclo for para manejo de datos
      for (int i = 0; i < listaProfesor.size(); i++) {
        object[0] = listaProfesor.get(i).getNrc();
        object[1] = listaProfesor.get(i).getExperienciaEducativa();
        listaReservacion = listaProfesor.get(i).getListaReservacion();
        object[2] = listaReservacion.get(0).getHoraDia();
        object[3] = listaReservacion.get(1).getHoraDia();
        object[4] = listaReservacion.get(2).getHoraDia();
        object[5] = listaReservacion.get(3).getHoraDia();
        object[6] = listaReservacion.get(4).getHoraDia();
        //Datos añadidos a la tabla
        modeloProfesor.addRow(object);
      }
      //Tabla resultante mostrada
      frmProfesor.tblProfesor.setModel(modeloProfesor);
    }

  //Controlador para Muestra de Datos al inicio del módulo
  public void MostrarTablaIniciada(JTable tblProfesor){
      //Creación del ArrayList con datos de Reservación
      modeloProfesor = (DefaultTableModel)tblProfesor.getModel();
      @SuppressWarnings("unchecked")
      //Llamada del método a usar para carga de datos inicial
      List<Curso>listaProfesor=metodosProfesor.IniciarTabla(curso);
      @SuppressWarnings("unchecked")
      //Creación del ArrayList con datos de Reservación
      List<Reservacion> listaReservacion = new ArrayList();
      //Tamaño del objeto creado según los datos a manejar
      Object[]object = new Object [7];
      //Inicio del ciclo for para manejo de datos
      for (int i = 0; i < listaProfesor.size(); i++) {
        object[0] = listaProfesor.get(i).getNrc();
        object[1] = listaProfesor.get(i).getExperienciaEducativa();
        listaReservacion = listaProfesor.get(i).getListaReservacion();
        object[2] = listaReservacion.get(0).getHoraDia();
        object[3] = listaReservacion.get(1).getHoraDia();
        object[4] = listaReservacion.get(2).getHoraDia();
        object[5] = listaReservacion.get(3).getHoraDia();
        object[6] = listaReservacion.get(4).getHoraDia();
        //Datos añadidos a la tabla
        modeloProfesor.addRow(object);
      }
      //Tabla resultante mostrada
      frmProfesor.tblProfesor.setModel(modeloProfesor);
    }  
  
}
