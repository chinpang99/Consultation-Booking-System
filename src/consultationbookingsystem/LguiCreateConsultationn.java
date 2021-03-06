
package consultationbookingsystem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class LguiCreateConsultationn extends javax.swing.JFrame {

    private Lecturer current;
    private Consultation consultation;
    private LguiCreateConsultation create_consultation;
    
    public void setUser(Lecturer x){ //*IMPORTANT*
        current = x;
    }
    
    boolean window = false;
    
    public void setBoolean(Boolean y){
        window = y;
    }
    
    public LguiCreateConsultationn() {
        initComponents();
                
        JOptionPane.showMessageDialog(this, "You Cannot Open Like This","You Cannot Open Like This!", JOptionPane.ERROR_MESSAGE);
        window = false;
    }
    
    public LguiCreateConsultationn(LguiCreateConsultation a) {
        initComponents();
        
        create_consultation = a;
        create_consultation.setLecCreateConsultation(this);
        window = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("Date: ");

        jLabel3.setText("Time");

        jLabel4.setText("Libraryy");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30" }));

        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Venue:");

        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSelect))
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(btnSelect))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(560, 322));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            DateFormat df = new SimpleDateFormat("d/M/yyyy");
            String a = df.format(jDateChooser1.getDate());
            String b = jLabel4.getText();
            String c = jComboBox2.getSelectedItem().toString();
            String d = current.getUserid();

            boolean abc = true;
            SimpleDateFormat dateFormatterrr = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
            dateFormatterrr = new SimpleDateFormat("d/M/y");

            Date bb = dateFormatterrr.parse(a);
            Date ab = new Date();

            if(bb.before(ab)){
                JOptionPane.showMessageDialog(this, "SELECT THE DATE BEFORE TODAY!","PLEASE SELECT THE DATE BEFORE TODAY!", JOptionPane.ERROR_MESSAGE);
            }else{
                Consultation e = new Consultation(current, b, a, c);
                for(int x = 0; x<current.getCons().size(); x++){
                    Consultation y = current.getCons().get(x);
                    if(a.equals(y.getDay()) && b.equals(y.getVenue()) && c.equals(y.getTime()) && d.equals(current.getUserid()))
                    {
                        JOptionPane.showMessageDialog(this, "The Consultation is Created!","The Consultation is Created!", JOptionPane.INFORMATION_MESSAGE);
                        abc = false;
                        break;
                    }else if(a.equals(y.getDay())&& c.equals(y.getTime()) && d.equals(current.getUserid()))
                    {
                        JOptionPane.showMessageDialog(this, "THIS TIME & DATE GOT CONSULTATION!","THIS TIME & DATE GOT CONSULTATION!", JOptionPane.INFORMATION_MESSAGE);
                        abc=false;
                        break;

                    }
                    else{
                        abc = true;
                    }

                }

                if(abc == true){
                    current.createConsultation(b, a, c);
                    create_consultation.mainpage.getCons().add(e);

                    for(int i = 0; i<current.getCons().size(); i++){
                        Consultation y = current.getCons().get(i);
                        String l_id = y.getL().getUserid();
                        String date = y.getDay();
                        String venue = y.getVenue();
                        String time = y.getTime();

                        if(d.equals(l_id)&&a.equals(date)&&b.equals(venue)&&c.equals(time)){
                            y.setStudent(null);
                            JOptionPane.showMessageDialog(this, "Create Consultation Successful!","Create Consultation Successful!", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    create_consultation.mainpage.setUser(current);
                    create_consultation.mainpage.setVisible(true);
                    this.setVisible(false);
                }
            }

        }catch(ParseException cd){
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "PLEASE CHOOSE DATE!","PLEASE CHOOSE DATE!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        create_consultation.setUser(current);
        create_consultation.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSelectActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        create_consultation.mainpage.setUser(current);
        create_consultation.mainpage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
                
        if(window == false){
            this.dispose();
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(LguiCreateConsultationn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LguiCreateConsultationn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LguiCreateConsultationn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LguiCreateConsultationn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LguiCreateConsultationn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
