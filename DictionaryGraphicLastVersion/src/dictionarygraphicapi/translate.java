
package dictionarygraphicapi;
import com.darkprograms.speech.translator.GoogleTranslate;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class translate extends javax.swing.JDialog {

    private int choosen = 0;
    public translate(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setModal(modal);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(153, 153, 255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        inputText = new javax.swing.JTextArea();
        translateButton = new javax.swing.JButton();
        english = new javax.swing.JLabel();
        vietnamese = new javax.swing.JLabel();
        EngViet = new javax.swing.JButton();
        VietEng = new javax.swing.JButton();
        translationText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Translation");
        setResizable(false);

        inputText.setBackground(new java.awt.Color(204, 204, 255));
        inputText.setColumns(20);
        inputText.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        inputText.setRows(5);
        jScrollPane1.setViewportView(inputText);

        translateButton.setText("Translate");
        translateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translateButtonActionPerformed(evt);
            }
        });

        english.setText("English:");

        vietnamese.setText("Vietnamese:");

        EngViet.setText("English-Vietnamese");
        EngViet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EngVietActionPerformed(evt);
            }
        });

        VietEng.setText("Vietnamese-English");
        VietEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VietEngActionPerformed(evt);
            }
        });

        translationText.setBackground(new java.awt.Color(204, 204, 255));
        translationText.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        translationText.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(english)
                        .addGap(0, 343, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vietnamese)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(EngViet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(VietEng)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(translationText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(translateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EngViet)
                    .addComponent(VietEng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(english)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vietnamese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(translationText, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(translateButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void translateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translateButtonActionPerformed
        try {
            if( choosen == 0) {
                translationText.setText((GoogleTranslate.translate("vi", inputText.getText())));
            }
            else if( choosen == 1) {
                translationText.setText((GoogleTranslate.translate("en", inputText.getText())));
            }
        } catch (IOException ex) {
            Logger.getLogger(translate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_translateButtonActionPerformed

    private void EngVietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EngVietActionPerformed
        choosen = 0;
        translationText.setText("");
        inputText.setText("");
        english.setText("English:");
        vietnamese.setText("Vietnamese:");
    }//GEN-LAST:event_EngVietActionPerformed

    private void VietEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VietEngActionPerformed
        choosen = 1;
        translationText.setText("");
        inputText.setText("");
        english.setText("Vietnamese:");
        vietnamese.setText("English:");
    }//GEN-LAST:event_VietEngActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EngViet;
    private javax.swing.JButton VietEng;
    private javax.swing.JLabel english;
    private javax.swing.JTextArea inputText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton translateButton;
    private javax.swing.JLabel translationText;
    private javax.swing.JLabel vietnamese;
    // End of variables declaration//GEN-END:variables
}
