
package Vista;

import Controlador.ControlProfesor;
import Controlador.ControladorCurso;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class MenuPrincipal extends javax.swing.JFrame {
  Color colorBotonSeleccion = new Color(24, 82, 190);
  Color colorBotonReposo = new Color (24, 82, 157);
  
  
  public MenuPrincipal() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    pblNavegacion = new javax.swing.JPanel();
    btnHorario = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    btnExpEdu = new javax.swing.JPanel();
    jLabel5 = new javax.swing.JLabel();
    btnSalon = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    btnProfesor = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    lblCerrar = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jDesktopPane1 = new javax.swing.JDesktopPane()
    ;

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);
    setResizable(false);
    setSize(new java.awt.Dimension(1010, 706));
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    pblNavegacion.setBackground(new java.awt.Color(24, 82, 157));
    pblNavegacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btnHorario.setBackground(new java.awt.Color(24, 82, 157));
    btnHorario.setPreferredSize(new java.awt.Dimension(26, 48));
    btnHorario.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnHorarioMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnHorarioMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnHorarioMousePressed(evt);
      }
    });

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendar (2).png"))); // NOI18N

    javax.swing.GroupLayout btnHorarioLayout = new javax.swing.GroupLayout(btnHorario);
    btnHorario.setLayout(btnHorarioLayout);
    btnHorarioLayout.setHorizontalGroup(
      btnHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(btnHorarioLayout.createSequentialGroup()
        .addGap(24, 24, 24)
        .addComponent(jLabel2)
        .addContainerGap(24, Short.MAX_VALUE))
    );
    btnHorarioLayout.setVerticalGroup(
      btnHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(btnHorarioLayout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addComponent(jLabel2)
        .addContainerGap(19, Short.MAX_VALUE))
    );

    pblNavegacion.add(btnHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

    btnExpEdu.setBackground(new java.awt.Color(24, 82, 157));
    btnExpEdu.setPreferredSize(new java.awt.Dimension(26, 48));
    btnExpEdu.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnExpEduMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnExpEduMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnExpEduMousePressed(evt);
      }
    });

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/books (1).png"))); // NOI18N

    javax.swing.GroupLayout btnExpEduLayout = new javax.swing.GroupLayout(btnExpEdu);
    btnExpEdu.setLayout(btnExpEduLayout);
    btnExpEduLayout.setHorizontalGroup(
      btnExpEduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(btnExpEduLayout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addComponent(jLabel5)
        .addContainerGap(25, Short.MAX_VALUE))
    );
    btnExpEduLayout.setVerticalGroup(
      btnExpEduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(btnExpEduLayout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addComponent(jLabel5)
        .addContainerGap(19, Short.MAX_VALUE))
    );

    pblNavegacion.add(btnExpEdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 80, 70));

    btnSalon.setBackground(new java.awt.Color(24, 82, 157));
    btnSalon.setPreferredSize(new java.awt.Dimension(26, 48));
    btnSalon.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnSalonMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnSalonMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnSalonMousePressed(evt);
      }
    });

    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/school (1).png"))); // NOI18N

    javax.swing.GroupLayout btnSalonLayout = new javax.swing.GroupLayout(btnSalon);
    btnSalon.setLayout(btnSalonLayout);
    btnSalonLayout.setHorizontalGroup(
      btnSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(btnSalonLayout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addComponent(jLabel6)
        .addContainerGap(25, Short.MAX_VALUE))
    );
    btnSalonLayout.setVerticalGroup(
      btnSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(btnSalonLayout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addComponent(jLabel6)
        .addContainerGap(19, Short.MAX_VALUE))
    );

    pblNavegacion.add(btnSalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 80, 70));

    btnProfesor.setBackground(new java.awt.Color(24, 82, 157));
    btnProfesor.setPreferredSize(new java.awt.Dimension(26, 48));
    btnProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnProfesorMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnProfesorMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        btnProfesorMousePressed(evt);
      }
    });

    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/teacher.png"))); // NOI18N

    javax.swing.GroupLayout btnProfesorLayout = new javax.swing.GroupLayout(btnProfesor);
    btnProfesor.setLayout(btnProfesorLayout);
    btnProfesorLayout.setHorizontalGroup(
      btnProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(btnProfesorLayout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addComponent(jLabel4)
        .addContainerGap(25, Short.MAX_VALUE))
    );
    btnProfesorLayout.setVerticalGroup(
      btnProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(btnProfesorLayout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addComponent(jLabel4)
        .addContainerGap(19, Short.MAX_VALUE))
    );

    pblNavegacion.add(btnProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 80, 70));

    getContentPane().add(pblNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 640));

    jPanel1.setBackground(new java.awt.Color(24, 82, 130));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
    lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lblCerrarMouseClicked(evt);
      }
    });
    jPanel2.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

    getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 930, 30));

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));
    jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
    jDesktopPane1.setLayout(jDesktopPane1Layout);
    jDesktopPane1Layout.setHorizontalGroup(
      jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 930, Short.MAX_VALUE)
    );
    jDesktopPane1Layout.setVerticalGroup(
      jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 640, Short.MAX_VALUE)
    );

    jPanel3.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 930, 640));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnHorarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHorarioMouseEntered
    btnHorario.setBackground(colorBotonSeleccion);
  }//GEN-LAST:event_btnHorarioMouseEntered

  private void btnHorarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHorarioMouseExited
    btnHorario.setBackground(colorBotonReposo);
  }//GEN-LAST:event_btnHorarioMouseExited

  private void btnHorarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHorarioMousePressed

  }//GEN-LAST:event_btnHorarioMousePressed

  private void btnProfesorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesorMouseEntered
    btnProfesor.setBackground(colorBotonSeleccion);
  }//GEN-LAST:event_btnProfesorMouseEntered

  private void btnProfesorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesorMouseExited
    btnProfesor.setBackground(colorBotonReposo);
  }//GEN-LAST:event_btnProfesorMouseExited

  private void btnProfesorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesorMousePressed
    FrmProfesor internalProfesor = new FrmProfesor();
    BasicInternalFrameUI bi = (BasicInternalFrameUI)internalProfesor.getUI();
    bi.setNorthPane(null);
    jDesktopPane1.add(internalProfesor);
    ControlProfesor internalCtrlProf = new ControlProfesor(internalProfesor);
    internalProfesor.show();
  }//GEN-LAST:event_btnProfesorMousePressed

  private void btnExpEduMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpEduMouseEntered
    btnExpEdu.setBackground(colorBotonSeleccion);
  }//GEN-LAST:event_btnExpEduMouseEntered

  private void btnExpEduMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpEduMouseExited
    btnExpEdu.setBackground(colorBotonReposo);
  }//GEN-LAST:event_btnExpEduMouseExited

  private void btnExpEduMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpEduMousePressed
    FrmCurso internalCurso = new FrmCurso();
    BasicInternalFrameUI bi = (BasicInternalFrameUI)internalCurso.getUI();
    bi.setNorthPane(null);
    jDesktopPane1.add(internalCurso);
    ControladorCurso internalCtrlCurso = new ControladorCurso(internalCurso);
    internalCurso.show();
    internalCurso.tblCurso.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {},
        new String [] {"NRC", "Experiencia Educativa", "Profesor", "Lunes", "Martes"
                , "Miercoles", "Jueves", "Viernes"}
      ));
      if (internalCurso.tblCurso.getColumnModel().getColumnCount() > 0) {
        internalCurso.tblCurso.getColumnModel().getColumn(0).setPreferredWidth(10);
        internalCurso.tblCurso.getColumnModel().getColumn(1).setPreferredWidth(120);
      }
    internalCtrlCurso.MostrarDatosTabla(internalCurso.tblCurso);
  }//GEN-LAST:event_btnExpEduMousePressed

  private void btnSalonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalonMouseEntered
    btnSalon.setBackground(colorBotonSeleccion);
  }//GEN-LAST:event_btnSalonMouseEntered

  private void btnSalonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalonMouseExited
    btnSalon.setBackground(colorBotonReposo);
  }//GEN-LAST:event_btnSalonMouseExited

  private void btnSalonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalonMousePressed

  }//GEN-LAST:event_btnSalonMousePressed

  private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
    System.exit(0);
  }//GEN-LAST:event_lblCerrarMouseClicked

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MenuPrincipal().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel btnExpEdu;
  private javax.swing.JPanel btnHorario;
  private javax.swing.JPanel btnProfesor;
  private javax.swing.JPanel btnSalon;
  private javax.swing.JDesktopPane jDesktopPane1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JLabel lblCerrar;
  private javax.swing.JPanel pblNavegacion;
  // End of variables declaration//GEN-END:variables
}
