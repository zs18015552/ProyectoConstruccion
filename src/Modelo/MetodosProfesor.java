
package Modelo;

import static Modelo.ConectarBD.GetConnection;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.sql.ResultSet;

public class MetodosProfesor extends ConectarBD{
  PreparedStatement ps = null;
  Connection conexionBD = GetConnection();
  
  public List BusquedaProfesor(Curso curso, String cadenaBusqueda){
    ResultSet rs = null;   
    List<Curso>datosProfesor = new ArrayList<>();
    String queryProfesor = "SELECT nrc\n" +
        "   , exp_educativa\n" +
        "   , GROUP_CONCAT(LUNES) AS Lunes\n" +
        "   , GROUP_CONCAT(MARTES) AS Martes\n" +
        "   , GROUP_CONCAT(MIERCOLES) AS Miercoles\n" +
        "   , GROUP_CONCAT(JUEVES) AS Jueves\n" +
        "   , GROUP_CONCAT(VIERNES) AS Viernes\n" +
        "   FROM (SELECT curso.nrc\n" +
        "       , curso.exp_educativa\n" +
        "       , CONCAT_WS(' ',profesor.nombre, profesor.paterno, profesor.materno) AS 'Profesor'\n" +
        "       , IF (reserva.dia_clases_clases = 'LUNES', reserva.horarios_clases, null) AS 'LUNES'\n" +
        "       , IF (reserva.dia_clases_clases = 'MARTES', reserva.horarios_clases, null) AS 'MARTES'\n" +
        "       , IF (reserva.dia_clases_clases = 'MIERCOLES', reserva.horarios_clases, null) AS 'MIERCOLES'\n" +
        "       , IF (reserva.dia_clases_clases = 'JUEVES', reserva.horarios_clases, null) AS 'JUEVES'\n" +
        "       , IF (reserva.dia_clases_clases = 'VIERNES', reserva.horarios_clases, null) AS 'VIERNES'\n" +
        "       FROM curso \n" +
"       INNER JOIN profesor ON profesor.id_profesor = curso.profesor\n" +
"       INNER JOIN reserva ON reserva.nrc_reserva = curso.nrc\n" +
"       WHERE CONCAT_WS(' ',profesor.nombre, profesor.paterno, profesor.materno) LIKE '%"+cadenaBusqueda+"%') AS TablaProfesores\n" +
"	GROUP BY nrc;";
    try {
      ps = (com.mysql.jdbc.PreparedStatement) conexionBD.prepareStatement(queryProfesor);
      rs = ps.executeQuery();
      
      while(rs.next()){
        Curso llenadoCurso = new Curso();
        Reservacion llenadoLunes = new Reservacion();
        Reservacion llenadoMartes = new Reservacion();
        Reservacion llenadoMiercoles = new Reservacion();
        Reservacion llenadoJueves = new Reservacion();
        Reservacion llenadoViernes = new Reservacion();
        @SuppressWarnings("unchecked")
        List<Reservacion> llenadoReservacion = new ArrayList();
        llenadoCurso.setNrc(rs.getString(1));
        llenadoCurso.setExperienciaEducativa(rs.getString(2));   
        llenadoLunes.setHoraDia(rs.getString(3));
        llenadoReservacion.add(llenadoLunes);
        llenadoMartes.setHoraDia(rs.getString(4));
        llenadoReservacion.add(llenadoMartes);
        llenadoMiercoles.setHoraDia(rs.getString(5));
        llenadoReservacion.add(llenadoMiercoles);
        llenadoJueves.setHoraDia(rs.getString(6));
        llenadoReservacion.add(llenadoJueves);
        llenadoViernes.setHoraDia(rs.getString(7));
        llenadoReservacion.add(llenadoViernes);
        llenadoCurso.setListaReservacion(llenadoReservacion);

        datosProfesor.add(llenadoCurso);
      }
    } catch (SQLException e) {
      System.err.println(e);
    } 
      return datosProfesor;          
  }
  
  public List IniciarTabla(Curso curso){
    ResultSet rs = null; 
    List<Curso>datosProfesor = new ArrayList<>();
    String queryProfesor = "SELECT nrc\n" +
        "   , exp_educativa\n" +
        "   , GROUP_CONCAT(LUNES) AS Lunes\n" +
        "   , GROUP_CONCAT(MARTES) AS Martes\n" +
        "   , GROUP_CONCAT(MIERCOLES) AS Miercoles\n" +
        "   , GROUP_CONCAT(JUEVES) AS Jueves\n" +
        "   , GROUP_CONCAT(VIERNES) AS Viernes\n" +
        "   FROM (SELECT curso.nrc\n" +
        "       , curso.exp_educativa\n" +
        "       , CONCAT_WS(' ',profesor.nombre, profesor.paterno, profesor.materno) AS 'Profesor'\n" +
        "       , IF (reserva.dia_clases_clases = 'LUNES', reserva.horarios_clases, null) AS 'LUNES'\n" +
        "       , IF (reserva.dia_clases_clases = 'MARTES', reserva.horarios_clases, null) AS 'MARTES'\n" +
        "       , IF (reserva.dia_clases_clases = 'MIERCOLES', reserva.horarios_clases, null) AS 'MIERCOLES'\n" +
        "       , IF (reserva.dia_clases_clases = 'JUEVES', reserva.horarios_clases, null) AS 'JUEVES'\n" +
        "       , IF (reserva.dia_clases_clases = 'VIERNES', reserva.horarios_clases, null) AS 'VIERNES'\n" +
        "       FROM curso \n" +
"       INNER JOIN profesor ON profesor.id_profesor = curso.profesor\n" +
"       INNER JOIN reserva ON reserva.nrc_reserva = curso.nrc\n) AS TablaProfesores\n" +
"	GROUP BY nrc;";
    try {
      ps = (com.mysql.jdbc.PreparedStatement) conexionBD.prepareStatement(queryProfesor);
      rs = ps.executeQuery();
      
      while(rs.next()){
        Curso llenadoCurso = new Curso();
        Reservacion llenadoLunes = new Reservacion();
        Reservacion llenadoMartes = new Reservacion();
        Reservacion llenadoMiercoles = new Reservacion();
        Reservacion llenadoJueves = new Reservacion();
        Reservacion llenadoViernes = new Reservacion();
        @SuppressWarnings("unchecked")
        List<Reservacion> llenadoReservacion = new ArrayList();
        llenadoCurso.setNrc(rs.getString(1));
        llenadoCurso.setExperienciaEducativa(rs.getString(2));   
        llenadoLunes.setHoraDia(rs.getString(3));
        llenadoReservacion.add(llenadoLunes);
        llenadoMartes.setHoraDia(rs.getString(4));
        llenadoReservacion.add(llenadoMartes);
        llenadoMiercoles.setHoraDia(rs.getString(5));
        llenadoReservacion.add(llenadoMiercoles);
        llenadoJueves.setHoraDia(rs.getString(6));
        llenadoReservacion.add(llenadoJueves);
        llenadoViernes.setHoraDia(rs.getString(7));
        llenadoReservacion.add(llenadoViernes);
        llenadoCurso.setListaReservacion(llenadoReservacion);

        datosProfesor.add(llenadoCurso);
      }
    } catch (SQLException e) {
      System.err.println(e);
    } 
      return datosProfesor;          
  }
}
