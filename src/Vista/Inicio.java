/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Luisx
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        OpcionDocen = new javax.swing.JMenuItem();
        OpcionEstudiantes = new javax.swing.JMenuItem();
        OpcionCursos = new javax.swing.JMenuItem();
        ListadoRegistro = new javax.swing.JMenuItem();
        SalirB = new javax.swing.JMenuItem();
        ListaDeCursos = new javax.swing.JMenu();
        ListaCursos = new javax.swing.JMenuItem();
        ListaDeDocentes = new javax.swing.JMenu();
        ListaD = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(51, 51, 51), null, null));
        jMenu1.setText("Registro");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        OpcionDocen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        OpcionDocen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/profesor.png"))); // NOI18N
        OpcionDocen.setText("Docentes");
        OpcionDocen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionDocenActionPerformed(evt);
            }
        });
        jMenu1.add(OpcionDocen);

        OpcionEstudiantes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        OpcionEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/graduado.png"))); // NOI18N
        OpcionEstudiantes.setText("Estudiantes");
        OpcionEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionEstudiantesActionPerformed(evt);
            }
        });
        jMenu1.add(OpcionEstudiantes);

        OpcionCursos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        OpcionCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/aprender-en-linea (1).png"))); // NOI18N
        OpcionCursos.setText("Cursos");
        OpcionCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionCursosActionPerformed(evt);
            }
        });
        jMenu1.add(OpcionCursos);

        ListadoRegistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ListadoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/evaluacion.png"))); // NOI18N
        ListadoRegistro.setText("Listado de Registro");
        ListadoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(ListadoRegistro);

        SalirB.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SalirB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/boton (2).png"))); // NOI18N
        SalirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBActionPerformed(evt);
            }
        });
        jMenu1.add(SalirB);

        jMenuBar1.add(jMenu1);

        ListaDeCursos.setText("Cursos");

        ListaCursos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ListaCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/evaluacion.png"))); // NOI18N
        ListaCursos.setText("Lista");
        ListaCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaCursosActionPerformed(evt);
            }
        });
        ListaDeCursos.add(ListaCursos);

        jMenuBar1.add(ListaDeCursos);

        ListaDeDocentes.setText("Docentes");

        ListaD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ListaD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/evaluacion.png"))); // NOI18N
        ListaD.setText("Lista");
        ListaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaDActionPerformed(evt);
            }
        });
        ListaDeDocentes.add(ListaD);

        jMenuBar1.add(ListaDeDocentes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void ListadoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoRegistroActionPerformed
        ListadoDeRegistro Verventana = new ListadoDeRegistro ();
        Escritorio.add(Verventana);
        Verventana.show();
    }//GEN-LAST:event_ListadoRegistroActionPerformed

    private void OpcionCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionCursosActionPerformed
        Cursos Verventana = new Cursos();
        Escritorio.add(Verventana);
        Verventana.show();
    }//GEN-LAST:event_OpcionCursosActionPerformed

    private void OpcionEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionEstudiantesActionPerformed
        Estudiantes Verventana = new Estudiantes();
        Escritorio.add(Verventana);
        Verventana.show();
    }//GEN-LAST:event_OpcionEstudiantesActionPerformed

    private void OpcionDocenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionDocenActionPerformed
        Docentes Verventana = new Docentes();
        Escritorio.add(Verventana);
        Verventana.show();

    }//GEN-LAST:event_OpcionDocenActionPerformed

    private void SalirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBActionPerformed
       System.exit(0);
    }//GEN-LAST:event_SalirBActionPerformed

    private void ListaCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaCursosActionPerformed
         ListaC Verventana = new ListaC();
        Escritorio.add(Verventana);
        Verventana.show();
    }//GEN-LAST:event_ListaCursosActionPerformed

    private void ListaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaDActionPerformed
         ListaD Verventana = new ListaD ();
        Escritorio.add(Verventana);
        Verventana.show();
    }//GEN-LAST:event_ListaDActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem ListaCursos;
    private javax.swing.JMenuItem ListaD;
    private javax.swing.JMenu ListaDeCursos;
    private javax.swing.JMenu ListaDeDocentes;
    private javax.swing.JMenuItem ListadoRegistro;
    private javax.swing.JMenuItem OpcionCursos;
    private javax.swing.JMenuItem OpcionDocen;
    private javax.swing.JMenuItem OpcionEstudiantes;
    private javax.swing.JMenuItem SalirB;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
