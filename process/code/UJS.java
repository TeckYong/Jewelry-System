
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class UJS extends javax.swing.JFrame {

    protected static double goldPricePerGram = 175 + (200 - 175) * new Random().nextDouble();
    protected static double silverPricePerGram = 2.63 + (5 - 2.63) * new Random().nextDouble();
    protected static double diamondPricePerGram = 1800 + (2100 - 1800) * new Random().nextDouble();
    protected static double jadePricePerGram = 50 + (60 - 50) * new Random().nextDouble();
    protected static double platinumPricePerGram = 240 + (250 - 240) * new Random().nextDouble();
    public static ArrayList<Customer> customers = loadCustomer();

    public UJS() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grp1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        customerCard1 = new CustomerCard();
        storeCard1 = new StoreCard();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuGenerateReport = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UJS (Customer)");

        mainPanel.setLayout(new java.awt.CardLayout());
        mainPanel.add(customerCard1, "customerCard");
        mainPanel.add(storeCard1, "storeCard");

        jMenu1.setText("File");

        mnuGenerateReport.setText("Generate Report");
        mnuGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGenerateReportActionPerformed(evt);
            }
        });
        jMenu1.add(mnuGenerateReport);
        jMenu1.add(jSeparator1);

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pages");

        grp1.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Customer");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem1);

        grp1.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setText("Store");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "customerCard");
        this.setTitle("UJS (" + jRadioButtonMenuItem1.getText() + ")");
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "storeCard");
        this.setTitle("UJS (" + jRadioButtonMenuItem2.getText() + ")");
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void mnuGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGenerateReportActionPerformed
        new GenerateReporting().setVisible(true);
    }//GEN-LAST:event_mnuGenerateReportActionPerformed

    public static void main(String args[]) {
        setLookAndFeel();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UJS().setVisible(true);
            }
        });
    }

    public static void addCustomer(Customer c) {
        customers.add(c);
    }

    public static void updateCustomer(Customer c) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerID() == c.getCustomerID()) {
                customers.set(i, c);
                break;
            }
        }
    }

    public static void deleteCustomer(int id) {
        for (int j = customers.size() - 1; j >= 0; j--) {
            if (customers.get(j).getCustomerID() == id) {
                customers.remove(customers.get(j));
                break;
            }
        }
    }

    public static ArrayList<Customer> loadCustomer() {
        ArrayList<Customer> c = new ArrayList<>();
        c.add(new Customer("", "Chan Chun Weng", "999999-99-9999", "012-3456789", "TBR"));
        c.add(new Customer("", "Teh Teck Yong", "999999-99-9999", "012-3456789", "TBR"));
        c.add(new Customer("", "Yong Cheng Kiang", "999999-99-9999", "012-3456789", "TBR"));
        c.add(new Customer("", "Kezin Siew", "999999-99-9999", "012-3456789", "TBR"));
        c.add(new Customer("", "Lai Tau Leong", "999999-99-9999", "012-3456789", "TBR"));
        c.add(new Customer("", "Yap Ming Han", "999999-99-9999", "012-3456789", "TBR"));
        return c;
    }

    public static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomerCard customerCard1;
    private javax.swing.ButtonGroup grp1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem mnuGenerateReport;
    private StoreCard storeCard1;
    // End of variables declaration//GEN-END:variables
}
