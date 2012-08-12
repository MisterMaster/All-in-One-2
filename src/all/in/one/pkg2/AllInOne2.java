/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package all.in.one.pkg2;

import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author TPRGIUB
 */
public class AllInOne2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        //        /*
//         * Set the Nimbus look and feel
//         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                
                new MainFrame().setVisible(true);
                
            }
        });
    }
}
