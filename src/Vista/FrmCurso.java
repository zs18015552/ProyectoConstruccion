package Vista;

//import com.mxrck.autocompleter.TextAutoCompleter;
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
//import Modelo.ConectarBD;
//import java.sql.*;
//import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableColumn;

public class FrmCurso extends javax.swing.JInternalFrame {
    
    
//    protected Statement conexionConBaseDeDatos = null;
//    protected ResultSet oracionDeConsulta = null;
//    
//   String encabezadosDeTabla[] = {"NRC","Experiencia Educativa","Profesor"};
//   String filaParaResultados[] = new String [3]; //Número de columnas equivalentes en ambas tablas (base de datos y el modulo de consulta)
//   DefaultTableModel tablaDeResultados;

   public FrmCurso() {
        initComponents();
        
        //Quitar la barra de titulo
        //BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        //bi.setNorthPane(null);
        
        
        
////INICIA CARGA DE MODULO
//        TextAutoCompleter prediccionCampoExpEdu = new TextAutoCompleter(txtExpEdu);
//        TextAutoCompleter prediccionCampoNRC = new TextAutoCompleter(txtNRC);
//
//        //CONEXIÓN CON LA BASE DE DATOS
//        Connection cargaDeDatosIniciales = ConectarBD.GetConnection();
//        //INICIA LA CONSULTA
//            try{
//                conexionConBaseDeDatos = (Statement)cargaDeDatosIniciales.createStatement();
//                oracionDeConsulta = conexionConBaseDeDatos.executeQuery("SELECT nrc, exp_educativa, CONCAT_WS(\" \",profesor.nombre, profesor.paterno, profesor.materno) AS nombre_completo FROM curso INNER JOIN profesor ON curso.profesor = profesor.id_profesor;");
//                tablaDeResultados = new DefaultTableModel(null,encabezadosDeTabla){
//                    //Bloqueo de la funcion editar que trae JTable por default
//                    public boolean isCellEditable(int row, int column){
//                        return false;
//                    }
//                };
//                
//                //ASIGNACION DE DATOS
//                    while (oracionDeConsulta.next()){
//                //CONSULTA DE AUTOCOMPLEMENTACIÓN
//                    prediccionCampoNRC.addItem(oracionDeConsulta.getString("nrc")); 
//                    prediccionCampoExpEdu.addItem(oracionDeConsulta.getString("exp_educativa"));
//                //CONSULTA DE DATOS EN TABLA
//                    filaParaResultados[0] = oracionDeConsulta.getString("nrc");
//                    filaParaResultados[1] = oracionDeConsulta.getString("exp_educativa");
//                    filaParaResultados[2] = oracionDeConsulta.getString("nombre_completo");
//                    tablaDeResultados.addRow(filaParaResultados);
//                    }
//                //LLENADO DE TABLA
//                tblExpEdu.setModel(tablaDeResultados);
//                TableColumn columnaNRC = tblExpEdu.getColumn("NRC");
//                columnaNRC.setMaxWidth(75);
//                TableColumn columnaExpEdu = tblExpEdu.getColumn("Experiencia Educativa");
//                TableColumn columnaProfesor = tblExpEdu.getColumn("Profesor");
//
//                //CIERRE DE VARIABLES
//                oracionDeConsulta.close();
//                conexionConBaseDeDatos.close();
//                
//            }catch(SQLException de){
//                    JOptionPane.showMessageDialog(this, de.getMessage());
//            }
////FINALIZA CARGA DE MODULO

   }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    FondoModuloConsulta = new javax.swing.JPanel();
    ResultadoModuloConsulta = new javax.swing.JScrollPane();
    tblCurso = new javax.swing.JTable();
    lblConsultaExpEdu = new javax.swing.JLabel();
    lblNRC = new javax.swing.JLabel();
    btnConsultaNRC = new javax.swing.JButton();
    txtExpEdu = new javax.swing.JTextField();
    lblExpEdu = new javax.swing.JLabel();
    txtNRC = new javax.swing.JTextField();
    btnCurso = new javax.swing.JButton();

    setBackground(new java.awt.Color(255, 255, 255));
    setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    setForeground(java.awt.Color.black);

    FondoModuloConsulta.setBackground(new java.awt.Color(255, 255, 255));
    FondoModuloConsulta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

    tblCurso.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "NRC", "Experiencia Educativa", "Profesor", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    ResultadoModuloConsulta.setViewportView(tblCurso);
    if (tblCurso.getColumnModel().getColumnCount() > 0) {
      tblCurso.getColumnModel().getColumn(0).setPreferredWidth(10);
      tblCurso.getColumnModel().getColumn(1).setPreferredWidth(120);
    }

    lblConsultaExpEdu.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
    lblConsultaExpEdu.setText("Consultar Curso");

    lblNRC.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
    lblNRC.setText("NRC:");

    btnConsultaNRC.setBackground(new java.awt.Color(255, 255, 255));
    btnConsultaNRC.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
    btnConsultaNRC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/magnifying-glass (1).png"))); // NOI18N
    btnConsultaNRC.setText("Consultar NRC");
    btnConsultaNRC.setActionCommand("  Agregar Experiencia Educativa");
    btnConsultaNRC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

    lblExpEdu.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
    lblExpEdu.setText("Experiencia Educativa:");

    btnCurso.setBackground(new java.awt.Color(255, 255, 255));
    btnCurso.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
    btnCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/magnifying-glass (1).png"))); // NOI18N
    btnCurso.setText("Buscar Curso");
    btnCurso.setActionCommand("  Agregar Experiencia Educativa");
    btnCurso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

    javax.swing.GroupLayout FondoModuloConsultaLayout = new javax.swing.GroupLayout(FondoModuloConsulta);
    FondoModuloConsulta.setLayout(FondoModuloConsultaLayout);
    FondoModuloConsultaLayout.setHorizontalGroup(
      FondoModuloConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(FondoModuloConsultaLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(FondoModuloConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(FondoModuloConsultaLayout.createSequentialGroup()
            .addComponent(ResultadoModuloConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(FondoModuloConsultaLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(btnConsultaNRC, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(150, 150, 150)
            .addComponent(btnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(152, 152, 152))))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoModuloConsultaLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(FondoModuloConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lblConsultaExpEdu)
          .addGroup(FondoModuloConsultaLayout.createSequentialGroup()
            .addGroup(FondoModuloConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(lblNRC)
              .addComponent(lblExpEdu))
            .addGap(18, 18, 18)
            .addGroup(FondoModuloConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(txtExpEdu, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
              .addComponent(txtNRC))))
        .addGap(551, 551, 551))
    );
    FondoModuloConsultaLayout.setVerticalGroup(
      FondoModuloConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(FondoModuloConsultaLayout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(lblConsultaExpEdu)
        .addGap(18, 18, 18)
        .addGroup(FondoModuloConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtNRC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblNRC))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(FondoModuloConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtExpEdu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblExpEdu))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
        .addGroup(FondoModuloConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnConsultaNRC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(27, 27, 27)
        .addComponent(ResultadoModuloConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(FondoModuloConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(FondoModuloConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel FondoModuloConsulta;
  private javax.swing.JScrollPane ResultadoModuloConsulta;
  public javax.swing.JButton btnConsultaNRC;
  public javax.swing.JButton btnCurso;
  public javax.swing.JLabel lblConsultaExpEdu;
  public javax.swing.JLabel lblExpEdu;
  public javax.swing.JLabel lblNRC;
  public javax.swing.JTable tblCurso;
  public javax.swing.JTextField txtExpEdu;
  public javax.swing.JTextField txtNRC;
  // End of variables declaration//GEN-END:variables
}
