package vista;

import modelo.Usuario;
import modelo.Restaurante;
import controlador.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */
public class CristEatGUI extends javax.swing.JFrame {

	ControladorRestaurantes contRestaurantes;
	ControladorUsuarios contUsuarios;
	
	/**
	 * Creates new form CristEatGUI
	 */
	public CristEatGUI() {
		initComponents();
		contRestaurantes = null;
		contUsuarios = null;
	}
	
	public CristEatGUI(String ip, String puerto, String bdName, String user, String passw){
		initComponents();
		contRestaurantes = new ControladorRestaurantes(ip, puerto, bdName, user, passw, jTextArea_log);
		contUsuarios = new ControladorUsuarios(ip, puerto, bdName, user, passw, jTextArea_log);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTPane_Tablas = new javax.swing.JTabbedPane();
        jTabbedPane_consultas = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Usuarios = new javax.swing.JTable();
        jButton_refrescarUsuarios = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Restaurantes = new javax.swing.JTable();
        jButton_refrescarRestaurantes = new javax.swing.JButton();
        jTabbedPane_insertar = new javax.swing.JTabbedPane();
        jPanel_insAlumnos = new javax.swing.JPanel();
        jLabel_idUsuario = new javax.swing.JLabel();
        jLabel_login = new javax.swing.JLabel();
        jLabel_passw = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_login = new javax.swing.JTextField();
        jButton_insAlumno = new javax.swing.JButton();
        jPasswordField_passw = new javax.swing.JPasswordField();
        jPanel_insRestaurantes = new javax.swing.JPanel();
        jLabel_idRestaurante = new javax.swing.JLabel();
        jLabel_nombreRestaurante = new javax.swing.JLabel();
        jLabel_direccionRestaurante = new javax.swing.JLabel();
        jLabel_categRestaurante = new javax.swing.JLabel();
        jTextField_direccionRestaurante = new javax.swing.JTextField();
        jTextField_nombreRestaurante = new javax.swing.JTextField();
        jTextField_idRestaurante = new javax.swing.JTextField();
        jComboBox_categRestaurante = new javax.swing.JComboBox<>();
        jButton_insRestaurante = new javax.swing.JButton();
        jCheckBox_log = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_log = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CristEat");
        setMaximumSize(new java.awt.Dimension(441, 489));
        setMinimumSize(new java.awt.Dimension(441, 415));
        setResizable(false);
        setSize(new java.awt.Dimension(441, 415));

        jTable_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Login", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Usuarios);

        jButton_refrescarUsuarios.setText("Refrescar");
        jButton_refrescarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refrescarUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_refrescarUsuarios)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_refrescarUsuarios)
                .addContainerGap())
        );

        jTabbedPane_consultas.addTab("Usuarios", jPanel1);

        jTable_Restaurantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Dirección", "Categoría"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_Restaurantes);

        jButton_refrescarRestaurantes.setText("Refrescar");
        jButton_refrescarRestaurantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refrescarRestaurantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_refrescarRestaurantes)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_refrescarRestaurantes)
                .addContainerGap())
        );

        jTabbedPane_consultas.addTab("Restaurantes", jPanel2);

        jTPane_Tablas.addTab("Consultar", jTabbedPane_consultas);

        jLabel_idUsuario.setText("ID");

        jLabel_login.setText("Login");

        jLabel_passw.setText("Password");

        jButton_insAlumno.setText("Crear");
        jButton_insAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_insAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_insAlumnosLayout = new javax.swing.GroupLayout(jPanel_insAlumnos);
        jPanel_insAlumnos.setLayout(jPanel_insAlumnosLayout);
        jPanel_insAlumnosLayout.setHorizontalGroup(
            jPanel_insAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_insAlumnosLayout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addComponent(jButton_insAlumno)
                .addContainerGap())
            .addGroup(jPanel_insAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_insAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_insAlumnosLayout.createSequentialGroup()
                        .addComponent(jLabel_idUsuario)
                        .addGap(65, 65, 65)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_insAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel_insAlumnosLayout.createSequentialGroup()
                            .addComponent(jLabel_login)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel_insAlumnosLayout.createSequentialGroup()
                            .addComponent(jLabel_passw)
                            .addGap(18, 18, 18)
                            .addComponent(jPasswordField_passw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_insAlumnosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordField_passw, jTextField_id, jTextField_login});

        jPanel_insAlumnosLayout.setVerticalGroup(
            jPanel_insAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_insAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_insAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_idUsuario)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_insAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_login)
                    .addComponent(jTextField_login, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_insAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_passw)
                    .addComponent(jPasswordField_passw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jButton_insAlumno)
                .addContainerGap())
        );

        jPanel_insAlumnosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPasswordField_passw, jTextField_id, jTextField_login});

        jTabbedPane_insertar.addTab("Usuarios", jPanel_insAlumnos);

        jLabel_idRestaurante.setText("ID");

        jLabel_nombreRestaurante.setText("Nombre");

        jLabel_direccionRestaurante.setText("Dirección");

        jLabel_categRestaurante.setText("Categoría");

        jComboBox_categRestaurante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comida Americana", "Comida Española", "Comida Asiática", "Comida Italiana" }));

        jButton_insRestaurante.setText("Crear");
        jButton_insRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_insRestauranteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_insRestaurantesLayout = new javax.swing.GroupLayout(jPanel_insRestaurantes);
        jPanel_insRestaurantes.setLayout(jPanel_insRestaurantesLayout);
        jPanel_insRestaurantesLayout.setHorizontalGroup(
            jPanel_insRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_insRestaurantesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_insRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_insRestaurantesLayout.createSequentialGroup()
                        .addGroup(jPanel_insRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_nombreRestaurante)
                            .addComponent(jLabel_direccionRestaurante)
                            .addComponent(jLabel_idRestaurante))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_insRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_direccionRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_nombreRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_idRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_insRestaurantesLayout.createSequentialGroup()
                        .addComponent(jLabel_categRestaurante)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_categRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_insRestaurantesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_insRestaurante)
                .addContainerGap())
        );

        jPanel_insRestaurantesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField_direccionRestaurante, jTextField_idRestaurante, jTextField_nombreRestaurante});

        jPanel_insRestaurantesLayout.setVerticalGroup(
            jPanel_insRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_insRestaurantesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_insRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_idRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_idRestaurante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_insRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nombreRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nombreRestaurante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_insRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_direccionRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_direccionRestaurante))
                .addGap(18, 18, 18)
                .addGroup(jPanel_insRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_categRestaurante)
                    .addComponent(jComboBox_categRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jButton_insRestaurante)
                .addContainerGap())
        );

        jTabbedPane_insertar.addTab("Restaurantes", jPanel_insRestaurantes);

        jTPane_Tablas.addTab("Insertar", jTabbedPane_insertar);

        jCheckBox_log.setSelected(true);
        jCheckBox_log.setText("Log");
        jCheckBox_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_logActionPerformed(evt);
            }
        });

        jTextArea_log.setEditable(false);
        jTextArea_log.setColumns(20);
        jTextArea_log.setRows(5);
        jScrollPane3.setViewportView(jTextArea_log);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPane_Tablas)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox_log)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTPane_Tablas, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_log)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_refrescarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refrescarUsuariosActionPerformed
		ArrayList<Usuario> usuarios = contUsuarios.getUsuarios();
		Usuario aux = null;
		//Reiniciamos la tabla
		((DefaultTableModel)jTable_Usuarios.getModel()).setRowCount(0);
		
		//Rellenamos los usuarios
		for (int i = 0; i < usuarios.size(); i++){
			aux = usuarios.get(i);
			((DefaultTableModel)jTable_Usuarios.getModel()).addRow(new Object[]{aux.getId(), aux.getLogin(), aux.getPassw()});
		}
		
    }//GEN-LAST:event_jButton_refrescarUsuariosActionPerformed

    private void jButton_refrescarRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refrescarRestaurantesActionPerformed
        ArrayList<Restaurante> restaurantes = contRestaurantes.getRestaurantes();
		Restaurante aux = null;
		
		//Reiniciamos la tabla
		((DefaultTableModel)jTable_Restaurantes.getModel()).setRowCount(0);
		
		//Rellenamos los restaurantes
		for (int i = 0; i < restaurantes.size(); i++){
			aux = restaurantes.get(i);
			((DefaultTableModel)jTable_Restaurantes.getModel()).addRow(new Object[]{aux.getId(), aux.getNombre(), aux.getDireccion(), aux.getCategoria()});
		}
    }//GEN-LAST:event_jButton_refrescarRestaurantesActionPerformed

    private void jButton_insAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_insAlumnoActionPerformed
        contUsuarios.addUsuario(jTextField_id.getText(), jTextField_login.getText(), jPasswordField_passw.getText());
    }//GEN-LAST:event_jButton_insAlumnoActionPerformed

    private void jCheckBox_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_logActionPerformed
        if (jCheckBox_log.isSelected()){
			this.jPanel3.setVisible(true);
			this.setSize(441, 489);
		} else {
			this.jPanel3.setVisible(false);
			this.setSize(441, 415);
		}
    }//GEN-LAST:event_jCheckBox_logActionPerformed

    private void jButton_insRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_insRestauranteActionPerformed
        String id = jTextField_idRestaurante.getText();
		String nombre = jTextField_nombreRestaurante.getText();
		String direccion = jTextField_direccionRestaurante.getText();
		String categoria = jComboBox_categRestaurante.getSelectedItem().toString();
		contRestaurantes.addRestaurante(id, nombre, direccion, categoria);
    }//GEN-LAST:event_jButton_insRestauranteActionPerformed

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
			java.util.logging.Logger.getLogger(CristEatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CristEatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CristEatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CristEatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CristEatGUI().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_insAlumno;
    private javax.swing.JButton jButton_insRestaurante;
    private javax.swing.JButton jButton_refrescarRestaurantes;
    private javax.swing.JButton jButton_refrescarUsuarios;
    private javax.swing.JCheckBox jCheckBox_log;
    private javax.swing.JComboBox<String> jComboBox_categRestaurante;
    private javax.swing.JLabel jLabel_categRestaurante;
    private javax.swing.JLabel jLabel_direccionRestaurante;
    private javax.swing.JLabel jLabel_idRestaurante;
    private javax.swing.JLabel jLabel_idUsuario;
    private javax.swing.JLabel jLabel_login;
    private javax.swing.JLabel jLabel_nombreRestaurante;
    private javax.swing.JLabel jLabel_passw;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_insAlumnos;
    private javax.swing.JPanel jPanel_insRestaurantes;
    private javax.swing.JPasswordField jPasswordField_passw;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTPane_Tablas;
    private javax.swing.JTabbedPane jTabbedPane_consultas;
    private javax.swing.JTabbedPane jTabbedPane_insertar;
    private javax.swing.JTable jTable_Restaurantes;
    private javax.swing.JTable jTable_Usuarios;
    private javax.swing.JTextArea jTextArea_log;
    private javax.swing.JTextField jTextField_direccionRestaurante;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_idRestaurante;
    private javax.swing.JTextField jTextField_login;
    private javax.swing.JTextField jTextField_nombreRestaurante;
    // End of variables declaration//GEN-END:variables
}
