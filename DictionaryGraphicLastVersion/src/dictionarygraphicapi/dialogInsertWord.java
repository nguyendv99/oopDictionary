
package dictionarygraphicapi;

public class dialogInsertWord extends javax.swing.JDialog {

    private Word word = new Word("", "");
    public dialogInsertWord(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        englishLabel = new javax.swing.JLabel();
        vietnameseLabel = new javax.swing.JLabel();
        vietnameseText = new javax.swing.JTextField();
        englishText = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insert");
        setResizable(false);

        englishLabel.setText("English:");

        vietnameseLabel.setText("Vietnamese:");

        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(insertButton)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vietnameseLabel)
                            .addComponent(englishLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vietnameseText)
                            .addComponent(englishText))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(englishLabel)
                    .addComponent(englishText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vietnameseLabel)
                    .addComponent(vietnameseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(messageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(insertButton)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        if (englishText.getText().toLowerCase().trim().equals("")) {
            messageLabel.setText("You must input a English word!");
        } else if (vietnameseText.getText().toLowerCase().trim().equals("")) {
            messageLabel.setText("You must input a Vietnamese word!");
        } else {
            word.setWord_target(englishText.getText());
            word.setWord_explain(vietnameseText.getText());
            dispose();
        }
    }//GEN-LAST:event_insertButtonActionPerformed

    public Word getWord() {
        return word;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel englishLabel;
    private javax.swing.JTextField englishText;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel vietnameseLabel;
    private javax.swing.JTextField vietnameseText;
    // End of variables declaration//GEN-END:variables
}
