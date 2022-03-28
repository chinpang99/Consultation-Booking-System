
package consultationbookingsystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class LguiCreateConsultation extends javax.swing.JFrame {

    protected LguiDashboard mainpage;
    private LguiCreateConsultationn create_venue;
    private Lecturer current;
    private Consultation consultation;
    
    public void setUser(Lecturer x){ //*IMPORTANT*
        current = x;
    }
        
    boolean window = false;
    
    public void setBoolean(Boolean y){
        window = y;
    }
        
    public void setLecCreateConsultation(LguiCreateConsultationn a){
        create_venue = a;
    }
    
    public LguiCreateConsultation() {
        initComponents();              
        JOptionPane.showMessageDialog(this, "You Cannot Open Like This","You Cannot Open Like This!", JOptionPane.ERROR_MESSAGE);
        window = false;
    }
    
    public LguiCreateConsultation(LguiDashboard a) {
        initComponents();
        
        mainpage = a;
        mainpage.setLecCreateConsultation(this);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
                
        if(window == false){
            this.dispose();
        }else{
            JPanel contentPane = new JPanel();
            JPanel firstBig = new JPanel();
            JPanel secondBig = new JPanel();
            JPanel thirdBig = new JPanel();
            JPanel fourthBig = new JPanel();
            JLabel myVenue = new JLabel();
            JLabel availableVenue = new JLabel();

            contentPane.setLayout(new GridLayout(2,0));
            contentPane.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

            firstBig.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
            //firstBig.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

            secondBig.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
            //secondBig.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

            thirdBig.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
            thirdBig.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));

            fourthBig.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
            fourthBig.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

            myVenue = new JLabel("My Consultation Venue"); 
            myVenue.setFont(new Font("Serif", Font.PLAIN, 50));
            //myVenue.setPreferredSize(new Dimension(10,10));
            firstBig.add(myVenue);

            availableVenue = new JLabel("Available Consultation Venue"); 
            availableVenue.setFont(new Font("Serif", Font.PLAIN, 50));
            //myVenue.setPreferredSize(new Dimension(10,10));
            secondBig.add(availableVenue);

            ArrayList<String> venue = new ArrayList();
            ArrayList<String> AvailableVenue = new ArrayList(); 
            List<String> namesList = Arrays.asList("Library","Cafeteria", "Block A Office", "Block B Office", "Block C Office", "Block D Office", "Block E Office", 
                    "Office Lounge", "B-04-01", "B-04-02", "B-04-03", "B-04-04", "B-04-05");
            ArrayList<String> otherList = new ArrayList<>();
            otherList.addAll(namesList);

            for(int i = 0; i<current.getCons().size(); i++)
            {
                consultation = current.getCons().get(i); 

                if(venue.contains(consultation.getVenue())){

                }else{             
                    venue.add(consultation.getVenue()); 
                }
            }

            for(int z = 0; z<otherList.size(); z++){
                String zz = otherList.get(z);

                if(venue.contains(zz)){

                }
                else
                {
                    AvailableVenue.add(zz);
                }

            }

            for(int x = 0; x<venue.size(); x++){
                String venuee = venue.get(x);


                    thirdBig.setPreferredSize(new Dimension(1850,(700*venue.size()/6)+550));
                    JPanel[] loopPanel = new JPanel[venue.size()];
                    JPanel[] buttonLeftPanel = new JPanel[venue.size()];
                    JLabel[] venueImage = new JLabel[venue.size()];
                    JLabel[] venueName = new JLabel[venue.size()];
                    JPanel[] labelPanel = new JPanel[venue.size()];
                    JButton[] selectButton = new JButton[venue.size()];

                    loopPanel[x] = new JPanel();                    
                    venueName[x] = new JLabel(venuee, JLabel.CENTER);                 
                    loopPanel[x].setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));                  
                    loopPanel[x].setLayout(new BoxLayout(loopPanel[x], BoxLayout.Y_AXIS));     
                    loopPanel[x].setPreferredSize(new Dimension(300, 350));
                    labelPanel[x] = new JPanel();                  
                    buttonLeftPanel[x] = new JPanel();                   
                    selectButton[x] = new JButton("Select");            
                    venueImage[x] = new JLabel();                  
                    venueImage[x].setIcon(new ImageIcon("Lecturer Image\\location-map-flat.png"));   

                    String aaa = venuee;

                    selectButton[x].addActionListener(new ActionListener()                  
                    {             
                        public void actionPerformed (ActionEvent e)                  
                        {                                  
                            create_venue.setUser(current);                  
                            create_venue.jLabel4.setText(aaa); 
                            create_venue.setBoolean(true);
                            create_venue.setVisible(true);                
                            setVisible(false);              
                        }               
                    });  

                    buttonLeftPanel[x].add(venueName[x]);                
                    labelPanel[x].add(venueImage[x]);                 
                    buttonLeftPanel[x].add(selectButton[x]);              
                    loopPanel[x].add(labelPanel[x]);                  
                    loopPanel[x].add(buttonLeftPanel[x]);  
                    thirdBig.add(loopPanel[x]);                
            }

            for(int x = 0; x<AvailableVenue.size(); x++){
                String venuee = AvailableVenue.get(x);


                    fourthBig.setPreferredSize(new Dimension(1850,(700*AvailableVenue.size()/6)+350));
                    JPanel[] loopPanel = new JPanel[AvailableVenue.size()];
                    JPanel[] buttonLeftPanel = new JPanel[AvailableVenue.size()];
                    JLabel[] venueImage = new JLabel[AvailableVenue.size()];
                    JLabel[] venueName = new JLabel[AvailableVenue.size()];
                    JPanel[] labelPanel = new JPanel[AvailableVenue.size()];
                    JButton[] selectButton = new JButton[AvailableVenue.size()];

                    loopPanel[x] = new JPanel();                    
                    venueName[x] = new JLabel(venuee, JLabel.CENTER);                 
                    loopPanel[x].setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));                  
                    loopPanel[x].setLayout(new BoxLayout(loopPanel[x], BoxLayout.Y_AXIS));  
                    loopPanel[x].setPreferredSize(new Dimension(300, 350));
                    labelPanel[x] = new JPanel();                  
                    buttonLeftPanel[x] = new JPanel();                   
                    selectButton[x] = new JButton("Select");            
                    venueImage[x] = new JLabel();                  
                    venueImage[x].setIcon(new ImageIcon("Lecturer Image\\location-map-flat.png"));   

                    String aaa = venuee;

                    selectButton[x].addActionListener(new ActionListener()                  
                    {             
                        public void actionPerformed (ActionEvent e)                  
                        {                                    
                            create_venue.setUser(current);
                            create_venue.setBoolean(true);
                            create_venue.jLabel4.setText(aaa);               
                            create_venue.setVisible(true);                
                            setVisible(false);              
                        }               
                    });  

                    buttonLeftPanel[x].add(venueName[x]);                
                    labelPanel[x].add(venueImage[x]);                 
                    buttonLeftPanel[x].add(selectButton[x]);              
                    loopPanel[x].add(labelPanel[x]);                  
                    loopPanel[x].add(buttonLeftPanel[x]);  
                    fourthBig.add(loopPanel[x]);                
            }

            firstBig.add(thirdBig);
            firstBig.add(thirdBig);
            secondBig.add(fourthBig);
            JScrollPane scrollPanee = new JScrollPane(thirdBig, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            JScrollPane scrollPane = new JScrollPane(fourthBig, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            scrollPane.validate();
            scrollPanee.validate();

            Dimension d = scrollPane.getPreferredSize();
            d.setSize(d.width, d.height / 2.5);
            scrollPane.setPreferredSize(d);

            Dimension dd = scrollPanee.getPreferredSize();
            dd.setSize(dd.width, dd.height / 2.5);
            scrollPanee.setPreferredSize(dd);

            firstBig.add(scrollPanee);
            secondBig.add(scrollPane);
            contentPane.add(firstBig);
            contentPane.add(secondBig);
            setContentPane(contentPane);
            pack();
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            //setSize(5500, 2500);
            //setMaximumSize(new Dimension(400, 200));
            //setMinimumSize(new Dimension(200, 100));
            setLocationRelativeTo(null);
            setVisible(true);
        }
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowIconified

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

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
            java.util.logging.Logger.getLogger(LguiCreateConsultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LguiCreateConsultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LguiCreateConsultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LguiCreateConsultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LguiCreateConsultation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
