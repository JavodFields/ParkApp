package View;

import Controller.RestaurantController;
import Model.Restaurants;
import javax.swing.JLabel;
import javax.swing.JSpinner;

/**
 *
 * @author bpardee
 */
public class RestaurantMenuUI extends javax.swing.JFrame {
    private RestaurantController restCntrl;
    private Restaurants restuarant;
    /**
     * Creates new form RestaurantMenuUI
     */
    public RestaurantMenuUI(RestaurantController restCntrl, Restaurants restaurant) {
        this.restCntrl = restCntrl;
        this.restuarant = restaurant;
        initComponents();
    }
    
    public double getOrderTotal() {
        double total = Double.parseDouble(menuItemPrice1.getText()) * (Integer)menuItemAmt1.getValue()
                + Double.parseDouble(menuItemPrice2.getText()) * (Integer)menuItemAmt2.getValue()
                + Double.parseDouble(menuItemPrice3.getText()) * (Integer)menuItemAmt3.getValue()
                + Double.parseDouble(menuItemPrice4.getText()) * (Integer)menuItemAmt4.getValue()
                + Double.parseDouble(menuItemPrice5.getText()) * (Integer)menuItemAmt5.getValue()
                + Double.parseDouble(menuItemPrice6.getText()) * (Integer)menuItemAmt6.getValue()
                + Double.parseDouble(menuItemPrice7.getText()) * (Integer)menuItemAmt7.getValue();
        System.out.println((Integer)menuItemAmt1.getValue());
        return total;
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
        menuTitle = new javax.swing.JLabel();
        menuItem1 = new javax.swing.JLabel();
        menuItem2 = new javax.swing.JLabel();
        menuItem3 = new javax.swing.JLabel();
        menuItem4 = new javax.swing.JLabel();
        menuItem5 = new javax.swing.JLabel();
        menuItem6 = new javax.swing.JLabel();
        menuItem7 = new javax.swing.JLabel();
        menuItemAmt1 = new javax.swing.JSpinner();
        menuItemAmt2 = new javax.swing.JSpinner();
        menuItemAmt3 = new javax.swing.JSpinner();
        menuItemAmt4 = new javax.swing.JSpinner();
        menuItemAmt5 = new javax.swing.JSpinner();
        menuItemAmt6 = new javax.swing.JSpinner();
        menuItemAmt7 = new javax.swing.JSpinner();
        reviewOrderBtn = new javax.swing.JButton();
        menuItemPrice1 = new javax.swing.JLabel();
        menuItemPrice2 = new javax.swing.JLabel();
        menuItemPrice3 = new javax.swing.JLabel();
        menuItemPrice4 = new javax.swing.JLabel();
        menuItemPrice5 = new javax.swing.JLabel();
        menuItemPrice6 = new javax.swing.JLabel();
        menuItemPrice7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));

        menuTitle.setBackground(new java.awt.Color(255, 255, 255));
        menuTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        menuTitle.setText("Menu");

        menuItem1.setText("Hamburger");

        menuItem2.setText("Cheeseburger");

        menuItem3.setText("Chicken Fingers");

        menuItem4.setText("Mac and Cheese");

        menuItem5.setText("Fries");

        menuItem6.setText("Salad");

        menuItem7.setText("Soup");

        reviewOrderBtn.setText("Review Order");

        menuItemPrice1.setText("4.99");

        menuItemPrice2.setText("5.99");

        menuItemPrice3.setText("4.50");

        menuItemPrice4.setText("4.00");

        menuItemPrice5.setText("3.00");

        menuItemPrice6.setText("6.99");

        menuItemPrice7.setText("4.99");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuItem1)
                    .addComponent(menuItem2)
                    .addComponent(menuItem3)
                    .addComponent(menuItem4)
                    .addComponent(menuItem5)
                    .addComponent(menuItem6)
                    .addComponent(menuItem7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menuItemPrice6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuItemAmt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menuItemPrice7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuItemAmt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItemPrice1)
                            .addComponent(menuItemPrice2)
                            .addComponent(menuItemPrice3)
                            .addComponent(menuItemPrice4)
                            .addComponent(menuItemPrice5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItemAmt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItemAmt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItemAmt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItemAmt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItemAmt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(reviewOrderBtn)
                .addGap(62, 195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem1)
                    .addComponent(menuItemAmt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem2)
                    .addComponent(menuItemAmt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem3)
                    .addComponent(menuItemAmt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem4)
                    .addComponent(menuItemAmt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem5)
                    .addComponent(menuItemAmt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem6)
                    .addComponent(menuItemAmt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem7)
                    .addComponent(menuItemAmt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(reviewOrderBtn)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menuItem1;
    private javax.swing.JLabel menuItem2;
    private javax.swing.JLabel menuItem3;
    private javax.swing.JLabel menuItem4;
    private javax.swing.JLabel menuItem5;
    private javax.swing.JLabel menuItem6;
    private javax.swing.JLabel menuItem7;
    private javax.swing.JSpinner menuItemAmt1;
    private javax.swing.JSpinner menuItemAmt2;
    private javax.swing.JSpinner menuItemAmt3;
    private javax.swing.JSpinner menuItemAmt4;
    private javax.swing.JSpinner menuItemAmt5;
    private javax.swing.JSpinner menuItemAmt6;
    private javax.swing.JSpinner menuItemAmt7;
    private javax.swing.JLabel menuItemPrice1;
    private javax.swing.JLabel menuItemPrice2;
    private javax.swing.JLabel menuItemPrice3;
    private javax.swing.JLabel menuItemPrice4;
    private javax.swing.JLabel menuItemPrice5;
    private javax.swing.JLabel menuItemPrice6;
    private javax.swing.JLabel menuItemPrice7;
    private javax.swing.JLabel menuTitle;
    public javax.swing.JButton reviewOrderBtn;
    // End of variables declaration//GEN-END:variables
}
