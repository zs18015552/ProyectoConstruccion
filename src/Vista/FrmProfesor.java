
package Vista;

public class FrmProfesor extends javax.swing.JInternalFrame {


  public FrmProfesor() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    lblConsultarProfesores = new javax.swing.JLabel();
    lbNombreProfesor = new javax.swing.JLabel();
    txtNombreProfesor = new javax.swing.JTextField();
    btnLimpiar = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblProfesor = new javax.swing.JTable();
    btnBuscarProfesor = new javax.swing.JButton();

    setBackground(new java.awt.Color(255, 255, 255));
    setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    setPreferredSize(new java.awt.Dimension(941, 646));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lblConsultarProfesores.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
    lblConsultarProfesores.setText("Buscar profesor");
    jPanel1.add(lblConsultarProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

    lbNombreProfesor.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
    lbNombreProfesor.setText("Nombre del profesor:");
    jPanel1.add(lbNombreProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 125, -1, -1));
    jPanel1.add(txtNombreProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 160, -1));

    btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
    btnLimpiar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
    btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/magnifying-glass (1).png"))); // NOI18N
    btnLimpiar.setText("Buscar profesor");
    btnLimpiar.setActionCommand("  Agregar Experiencia Educativa");
    btnLimpiar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, 220, 40));

    tblProfesor.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "NRC", "Experiencia Educativa", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tblProfesor.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(tblProfesor);
    if (tblProfesor.getColumnModel().getColumnCount() > 0) {
      tblProfesor.getColumnModel().getColumn(0).setPreferredWidth(20);
      tblProfesor.getColumnModel().getColumn(1).setPreferredWidth(120);
    }

    jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 910, 410));

    btnBuscarProfesor.setBackground(new java.awt.Color(255, 255, 255));
    btnBuscarProfesor.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
    btnBuscarProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/magnifying-glass (1).png"))); // NOI18N
    btnBuscarProfesor.setText("Buscar profesor");
    btnBuscarProfesor.setActionCommand("  Agregar Experiencia Educativa");
    btnBuscarProfesor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jPanel1.add(btnBuscarProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 220, 40));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JButton btnBuscarProfesor;
  public javax.swing.JButton btnLimpiar;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbNombreProfesor;
  private javax.swing.JLabel lblConsultarProfesores;
  public javax.swing.JTable tblProfesor;
  public javax.swing.JTextField txtNombreProfesor;
  // End of variables declaration//GEN-END:variables
}
