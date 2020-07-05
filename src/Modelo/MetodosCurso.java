
package Modelo;

import static Modelo.ConectarBD.GetConnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MetodosCurso extends ConectarBD{
  PreparedStatement ps = null;
  Connection conexion = GetConnection();
  
  public List BuscarNRC(Curso curso, String cadenaBusqueda){
    ResultSet rs = null;
    List<Curso>datosCurso = new ArrayList<>();  
    String queryNRC = "SELECT nrc\n" +
        "   , exp_educativa\n" +
        "   , nombreprofesor\n" +
        "   , GROUP_CONCAT(LUNES) AS Lunes\n" +
        "   , GROUP_CONCAT(MARTES) AS Martes\n" +
        "   , GROUP_CONCAT(MIERCOLES) AS Miercoles\n" +
        "   , GROUP_CONCAT(JUEVES) AS Jueves\n" +
        "   , GROUP_CONCAT(VIERNES) AS Viernes\n" +
        "   FROM (SELECT curso.nrc\n" +
        "       , curso.exp_educativa\n" +
        "       , CONCAT_WS(' ',profesor.nombre, profesor.paterno, profesor.materno) AS 'nombreprofesor'\n" +
        "       , IF (reserva.dia_clases_clases = 'LUNES', reserva.horarios_clases, null) AS 'LUNES'\n" +
        "       , IF (reserva.dia_clases_clases = 'MARTES', reserva.horarios_clases, null) AS 'MARTES'\n" +
        "       , IF (reserva.dia_clases_clases = 'MIERCOLES', reserva.horarios_clases, null) AS 'MIERCOLES'\n" +
        "       , IF (reserva.dia_clases_clases = 'JUEVES', reserva.horarios_clases, null) AS 'JUEVES'\n" +
        "       , IF (reserva.dia_clases_clases = 'VIERNES', reserva.horarios_clases, null) AS 'VIERNES'\n" +
        "       FROM curso \n" +
"       INNER JOIN profesor ON profesor.id_profesor = curso.profesor\n" +
"       INNER JOIN reserva ON reserva.nrc_reserva = curso.nrc\n" +
"       WHERE  nrc = '"+cadenaBusqueda+"') AS TablaProfesores;";
    
    try {
      System.out.println("Hola mundo");
      ps = (com.mysql.jdbc.PreparedStatement) conexion.prepareStatement(queryNRC);
      rs = ps.executeQuery();
      
      while(rs.next()){
        Curso llenadoCurso = new Curso();
        Profesor llenadoProfesor = new Profesor();
        Reservacion llenadoLunes = new Reservacion();
        Reservacion llenadoMartes = new Reservacion();
        Reservacion llenadoMiercoles = new Reservacion();
        Reservacion llenadoJueves = new Reservacion();
        Reservacion llenadoViernes = new Reservacion();
        
        @SuppressWarnings("unchecked")
        List<Profesor> listaProfesor = new ArrayList();
        @SuppressWarnings("unchecked")
        List<Reservacion> listaReservacion = new ArrayList();
        
        llenadoCurso.setNrc(rs.getString(1));
        llenadoCurso.setExperienciaEducativa(rs.getString(2));
        llenadoProfesor.setNombre(rs.getString(3));
        listaProfesor.add(llenadoProfesor);
        llenadoCurso.setListaProfesor(listaProfesor);
        llenadoLunes.setHoraDia(rs.getString(4));
        listaReservacion.add(llenadoLunes);
        llenadoMartes.setHoraDia(rs.getString(5));
        listaReservacion.add(llenadoMartes);
        llenadoMiercoles.setHoraDia(rs.getString(6));
        listaReservacion.add(llenadoMiercoles);
        llenadoJueves.setHoraDia(rs.getString(7));
        listaReservacion.add(llenadoJueves);
        llenadoViernes.setHoraDia(rs.getString(8));
        listaReservacion.add(llenadoViernes);
        llenadoCurso.setListaReservacion(listaReservacion);
        
        datosCurso.add(llenadoCurso);
      }
    } catch (SQLException e) {
      System.err.println(e);
    } 
    System.out.println("Aqui se imprime alv");
    for (int i=0; i<datosCurso.size(); i++){
      System.out.println(datosCurso.get(i).getExperienciaEducativa());
    }
      
    return datosCurso;
  }

  public List BuscarCurso(Curso curso, String cadenaBusqueda){
    ResultSet rs = null;
    List<Curso>datosCurso = new ArrayList<>();  
    String queryCurso = "SELECT nrc\n" +
        "   , exp_educativa\n" +
        "   , nombreprofesor\n" +
        "   , GROUP_CONCAT(LUNES) AS Lunes\n" +
        "   , GROUP_CONCAT(MARTES) AS Martes\n" +
        "   , GROUP_CONCAT(MIERCOLES) AS Miercoles\n" +
        "   , GROUP_CONCAT(JUEVES) AS Jueves\n" +
        "   , GROUP_CONCAT(VIERNES) AS Viernes\n" +
        "   FROM (SELECT curso.nrc\n" +
        "       , curso.exp_educativa\n" +
        "       , CONCAT_WS(\" \",profesor.nombre, profesor.paterno, profesor.materno) AS 'nombreprofesor'\n" +
        "       , IF (reserva.dia_clases_clases = 'LUNES', reserva.horarios_clases, null) AS 'LUNES'\n" +
        "       , IF (reserva.dia_clases_clases = 'MARTES', reserva.horarios_clases, null) AS 'MARTES'\n" +
        "       , IF (reserva.dia_clases_clases = 'MIERCOLES', reserva.horarios_clases, null) AS 'MIERCOLES'\n" +
        "       , IF (reserva.dia_clases_clases = 'JUEVES', reserva.horarios_clases, null) AS 'JUEVES'\n" +
        "       , IF (reserva.dia_clases_clases = 'VIERNES', reserva.horarios_clases, null) AS 'VIERNES'\n" +
        "       FROM curso \n" +
"       INNER JOIN profesor ON profesor.id_profesor = curso.profesor\n" +
"       INNER JOIN reserva ON reserva.nrc_reserva = curso.nrc\n" +
"       WHERE  exp_educativa = '%"+cadenaBusqueda+"%') AS TablaProfesores;";
    
    try {
      ps = (PreparedStatement) conexion.prepareStatement(queryCurso);
      rs = ps.executeQuery();
      
      while(rs.next()){
        Curso llenadoCurso = new Curso();
        Profesor llenadoProfesor = new Profesor();
        Reservacion llenadoLunes = new Reservacion();
        Reservacion llenadoMartes = new Reservacion();
        Reservacion llenadoMiercoles = new Reservacion();
        Reservacion llenadoJueves = new Reservacion();
        Reservacion llenadoViernes = new Reservacion();
        
        @SuppressWarnings("unchecked")
        List<Profesor> listaProfesor = new ArrayList();
        @SuppressWarnings("unchecked")
        List<Reservacion> listaReservacion = new ArrayList();
        llenadoCurso.setNrc(rs.getString(1));
        llenadoCurso.setExperienciaEducativa(rs.getString(2));
        llenadoProfesor.setNombre(rs.getString(3));
        listaProfesor.add(llenadoProfesor);
        llenadoCurso.setListaProfesor(listaProfesor);
        llenadoLunes.setHoraDia(rs.getString(4));
        listaReservacion.add(llenadoLunes);
        llenadoMartes.setHoraDia(rs.getString(5));
        listaReservacion.add(llenadoMartes);
        llenadoMiercoles.setHoraDia(rs.getString(6));
        listaReservacion.add(llenadoMiercoles);
        llenadoJueves.setHoraDia(rs.getString(7));
        listaReservacion.add(llenadoJueves);
        llenadoViernes.setHoraDia(rs.getString(8));
        listaReservacion.add(llenadoViernes);
        llenadoCurso.setListaReservacion(listaReservacion);
        
        datosCurso.add(llenadoCurso);
      }
    } catch (SQLException e) {
      System.err.println(e);
    } 
      return datosCurso;
  }
  
  public List IniciarTabla(Curso curso){
    ResultSet rs = null;
    List<Curso>datosCurso = new ArrayList<>();  
    String queryInicio ="SELECT nrc\n" +
"   , exp_educativa\n" +
"   , nombreprofesor\n" +
"   , GROUP_CONCAT(LUNES) AS Lunes\n" +
"   , GROUP_CONCAT(MARTES) AS Martes\n" +
"   , GROUP_CONCAT(MIERCOLES) AS Miercoles\n" +
"   , GROUP_CONCAT(JUEVES) AS Jueves\n" +
"   , GROUP_CONCAT(VIERNES) AS Viernes\n" +
"   FROM (SELECT curso.nrc\n" +
"            , curso.exp_educativa\n" +
"            , CONCAT_WS(\" \", profesor.nombre, profesor.paterno, profesor.materno) AS 'nombreprofesor'\n" +
"            , IF (reserva.dia_clases_clases = 'LUNES', reserva.horarios_clases, null) AS 'LUNES'\n" +
"            , IF (reserva.dia_clases_clases = 'MARTES', reserva.horarios_clases, null) AS 'MARTES'\n" +
"            , IF (reserva.dia_clases_clases = 'MIERCOLES', reserva.horarios_clases, null) AS 'MIERCOLES'\n" +
"            , IF (reserva.dia_clases_clases = 'JUEVES', reserva.horarios_clases, null) AS 'JUEVES'\n" +
"            , IF (reserva.dia_clases_clases = 'VIERNES', reserva.horarios_clases, null) AS 'VIERNES'\n" +
"            FROM curso \n" +
"            INNER JOIN profesor ON profesor.id_profesor = curso.profesor\n" +
"            INNER JOIN reserva ON reserva.nrc_reserva = curso.nrc) AS TablaProfesores \n" +
"	GROUP BY nrc;";         
    try {
      ps = (PreparedStatement) conexion.prepareStatement(queryInicio);
      rs = ps.executeQuery();
      
      while(rs.next()){
        Curso llenadoCurso = new Curso();
        Profesor llenadoProfesor = new Profesor();
        Reservacion llenadoLunes = new Reservacion();
        Reservacion llenadoMartes = new Reservacion();
        Reservacion llenadoMiercoles = new Reservacion();
        Reservacion llenadoJueves = new Reservacion();
        Reservacion llenadoViernes = new Reservacion();
        
        @SuppressWarnings("unchecked")
        List<Profesor> listaProfesor = new ArrayList();
        @SuppressWarnings("unchecked")
        List<Reservacion> listaReservacion = new ArrayList();
        
        llenadoCurso.setNrc(rs.getString(1));
        llenadoCurso.setExperienciaEducativa(rs.getString(2));
        
        llenadoProfesor.setNombre(rs.getString(3));
        listaProfesor.add(llenadoProfesor);
        llenadoCurso.setListaProfesor(listaProfesor);
        
        llenadoLunes.setHoraDia(rs.getString(4));
        listaReservacion.add(llenadoLunes);
        llenadoMartes.setHoraDia(rs.getString(5));
        listaReservacion.add(llenadoMartes);
        llenadoMiercoles.setHoraDia(rs.getString(6));
        listaReservacion.add(llenadoMiercoles);
        llenadoJueves.setHoraDia(rs.getString(7));
        listaReservacion.add(llenadoJueves);
        llenadoViernes.setHoraDia(rs.getString(8));
        listaReservacion.add(llenadoViernes);
        llenadoCurso.setListaReservacion(listaReservacion);
        
        datosCurso.add(llenadoCurso);
      }
    } catch (SQLException e) {
      System.err.println(e);
    } 
      return datosCurso;
  }
}
  
