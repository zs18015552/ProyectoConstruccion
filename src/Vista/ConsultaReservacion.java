/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

//import com.mxrck.autocompleter.TextAutoCompleter;
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
//import Modelo.ConectarBD;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableColumn;

/**
 *
 * @author rober
 */
public class ConsultaReservacion extends javax.swing.JInternalFrame {
//    protected Statement conexionBD = null;
//    protected ResultSet consulta = null;
    
//   String titulos[] = {"Mátricula","Profesor","Lunes","Martes","Miercoles","Jueves","Viernes","Sábado"};
//   String fila[] = new String [8]; //Número de columnas equivalentes en ambas tablas (base de datos y el modulo de consulta)
//   DefaultTableModel modelo;
   
    public ConsultaReservacion() {
        initComponents();
        
        //Quitar la barra de titulo
      BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
      bi.setNorthPane(null);
        
//       this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        //CONEXIÓN CON LA BASE DE DATOS
//        Connection DatosDeModuloConsulta = ConectarBD.GetConnection();
        //INICIA LA CONSULTA
//           try{
//               conexionBD = (Statement)DatosDeModuloConsulta.createStatement();
//                consulta = conexionBD.executeQuery("SELECT idprofesor, nombreprofesor, GROUP_CONCAT(LUNES) AS Lunes, GROUP_CONCAT(MARTES) AS Martes, GROUP_CONCAT(MIERCOLES) AS Miercoles, GROUP_CONCAT(JUEVES) AS Jueves, GROUP_CONCAT(VIERNES) AS Viernes, GROUP_CONCAT(SABADO) AS Sábado FROM (SELECT profesor.id_profesor AS 'idprofesor', CONCAT_WS(' ',profesor.nombre, profesor.paterno, profesor.materno) AS 'nombreprofesor', IF (reserva.dia_clases_clases = 'LUNES', reserva.horarios_clases, null) AS 'LUNES', IF (reserva.dia_clases_clases = 'MARTES', reserva.horarios_clases, null) AS 'MARTES', IF (reserva.dia_clases_clases = 'MIERCOLES', reserva.horarios_clases, null) AS 'MIERCOLES', IF (reserva.dia_clases_clases = 'JUEVES', reserva.horarios_clases, null) AS 'JUEVES', IF (reserva.dia_clases_clases = 'VIERNES', reserva.horarios_clases, null) AS 'VIERNES', IF (reserva.dia_clases_clases = 'SABADO', reserva.horarios_clases, null) AS 'SABADO' FROM curso INNER JOIN profesor ON profesor.id_profesor = curso.profesor INNER JOIN reserva ON reserva.nrc_reserva = curso.nrc) AS TablaHorario GROUP BY idprofesor;");
//                modelo = new DefaultTableModel(null,titulos){
//                    //Bloqueo de la funcion editar que trae JTable por default
//                    public boolean isCellEditable(int row, int column){
//                        return false;
//                    }
//                };
                //ASIGNACION DE DATOS
//                while (consulta.next()){
             
                
                //CONSULTA DE DATOS EN TABLA
//                fila[0] = consulta.getString("idprofesor");
//                fila[1] = consulta.getString("nombreprofesor");
//                fila[2] = consulta.getString("Lunes");
//                fila[3] = consulta.getString("Martes");
//                fila[4] = consulta.getString("Miercoles");
//                fila[5] = consulta.getString("Jueves");
//                fila[6] = consulta.getString("Viernes");
//                fila[7] = consulta.getString("Sábado");
//                modelo.addRow(fila);      
//                }
                 //LLENADO DE TABLA
//            tblSalon.setModel(modelo);
//            TableColumn columna1 = tblSalon.getColumn("Mátricula");
//            columna1.setMaxWidth(75);
//            TableColumn columna2 = tblSalon.getColumn("Profesor");
//            TableColumn columna3 = tblSalon.getColumn("Lunes");
//            TableColumn columna4 = tblSalon.getColumn("Martes");
//            TableColumn columna5 = tblSalon.getColumn("Miercoles");
//            TableColumn columna6 = tblSalon.getColumn("Jueves");
//            TableColumn columna7 = tblSalon.getColumn("Viernes");
//            TableColumn columna8 = tblSalon.getColumn("Sábado");
            

            //CIERRE DE VARIABLES
//            consulta.close();
//            conexionBD.close();
                
//            }catch(SQLException de){
//                JOptionPane.showMessageDialog(this, de.getMessage());
//            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNRC = new javax.swing.JLabel();
        lblConsultaExpEdu = new javax.swing.JLabel();
        btnBuscarSalon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservacion = new javax.swing.JTable();
        cmbSalon = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(22, 27));
        setPreferredSize(new java.awt.Dimension(955, 649));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(953, 620));

        lblNRC.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblNRC.setText("Salón:");

        lblConsultaExpEdu.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        lblConsultaExpEdu.setText("Consultar Salones");

        btnBuscarSalon.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarSalon.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnBuscarSalon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/books (2).png"))); // NOI18N
        btnBuscarSalon.setText("Consultar Salón");
        btnBuscarSalon.setActionCommand("  ");
        btnBuscarSalon.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBuscarSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSalonActionPerformed(evt);
            }
        });

        tblReservacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mátricula", "Profesor", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado"
            }
        ));
        jScrollPane1.setViewportView(tblReservacion);

        cmbSalon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "001", "004", "010", "CAN", "LAB" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(333, Short.MAX_VALUE)
                .addComponent(btnBuscarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNRC)
                        .addGap(18, 18, 18)
                        .addComponent(cmbSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblConsultaExpEdu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblConsultaExpEdu)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNRC)
                    .addComponent(cmbSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSalonActionPerformed
       // CODIGO INICIO
//        String SalonIngresado = txtSalon.getSelectedItem().toString();        
//        Connection consultaSalon = ConectarBD.GetConnection();
//        try{
//                conexionBD = (Statement)consultaSalon.createStatement();
//                consulta = conexionBD.executeQuery("SELECT idprofesor, nombreprofesor, GROUP_CONCAT(LUNES) AS Lunes, GROUP_CONCAT(MARTES) AS Martes, GROUP_CONCAT(MIERCOLES) AS Miercoles, GROUP_CONCAT(JUEVES) AS Jueves, GROUP_CONCAT(VIERNES) AS Viernes, GROUP_CONCAT(SABADO) AS Sábado FROM (SELECT profesor.id_profesor AS 'idprofesor', CONCAT_WS(' ',profesor.nombre, profesor.paterno, profesor.materno) AS 'nombreprofesor', IF (reserva.dia_clases_clases = 'LUNES', reserva.horarios_clases, null) AS 'LUNES', IF (reserva.dia_clases_clases = 'MARTES', reserva.horarios_clases, null) AS 'MARTES', IF (reserva.dia_clases_clases = 'MIERCOLES', reserva.horarios_clases, null) AS 'MIERCOLES', IF (reserva.dia_clases_clases = 'JUEVES', reserva.horarios_clases, null) AS 'JUEVES', IF (reserva.dia_clases_clases = 'VIERNES', reserva.horarios_clases, null) AS 'VIERNES', IF (reserva.dia_clases_clases = 'SABADO', reserva.horarios_clases, null) AS 'SABADO' FROM curso INNER JOIN profesor ON profesor.id_profesor = curso.profesor INNER JOIN reserva ON reserva.nrc_reserva = curso.nrc WHERE reserva.salon = '"+SalonIngresado+"') AS TablaHorario GROUP BY idprofesor ;");
//                modelo = new DefaultTableModel(null,titulos);
                //ASIGNACION DE DATOS
//                while (consulta.next()){
             
                
                //CONSULTA DE DATOS EN TABLA
//                fila[0] = consulta.getString("idprofesor");
//                fila[1] = consulta.getString("nombreprofesor");
//                fila[2] = consulta.getString("Lunes");
//                fila[3] = consulta.getString("Martes");
//                fila[4] = consulta.getString("Miercoles");
//                fila[5] = consulta.getString("Jueves");
//                fila[6] = consulta.getString("Viernes");
//                fila[7] = consulta.getString("Sábado");
//                modelo.addRow(fila);      
//                }
                 //LLENADO DE TABLA
//            tblSalon.setModel(modelo);
//            TableColumn columna1 = tblSalon.getColumn("Mátricula");
//            columna1.setMaxWidth(75);
//            TableColumn columna2 = tblSalon.getColumn("Profesor");
//            TableColumn columna3 = tblSalon.getColumn("Lunes");
//            TableColumn columna4 = tblSalon.getColumn("Martes");
//            TableColumn columna5 = tblSalon.getColumn("Miercoles");
//            TableColumn columna6 = tblSalon.getColumn("Jueves");
//            TableColumn columna7 = tblSalon.getColumn("Viernes");
//            TableColumn columna8 = tblSalon.getColumn("Sábado");
            

//            //CIERRE DE VARIABLES
//            consulta.close();
//            conexionBD.close();
//                
//            }catch(SQLException de){
//                JOptionPane.showMessageDialog(this, de.getMessage());
 //           }

        
    }//GEN-LAST:event_btnBuscarSalonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarSalon;
    public javax.swing.JComboBox<String> cmbSalon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsultaExpEdu;
    private javax.swing.JLabel lblNRC;
    public javax.swing.JTable tblReservacion;
    // End of variables declaration//GEN-END:variables
}
