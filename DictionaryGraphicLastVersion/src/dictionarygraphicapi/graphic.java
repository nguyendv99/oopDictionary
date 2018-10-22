package dictionarygraphicapi;

//import com.sun.java.swing.plaf.windows.resources.windows;
//import javax.swing.DefaultListModel;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;


public class graphic extends javax.swing.JFrame {

    
    public graphic() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        setButton = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        wordList = new javax.swing.JList<>();
        showExplain = new javax.swing.JLabel();
        showAllWordButton = new javax.swing.JButton();
        translateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        setBackground(new java.awt.Color(102, 102, 255));
        setResizable(false);

        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        setButton.setText("Set");
        setButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setButtonActionPerformed(evt);
            }
        });

        searchText.setBackground(new java.awt.Color(204, 204, 255));
        searchText.setText("Search");
        searchText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTextMouseClicked(evt);
            }
        });
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        wordList.setBackground(new java.awt.Color(204, 204, 255));
        wordList.setAutoscrolls(false);
        wordList.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                wordListAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        wordList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wordListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(wordList);

        showExplain.setBackground(new java.awt.Color(204, 204, 255));
        showExplain.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        showExplain.setOpaque(true);

        showAllWordButton.setText("Show all");
        showAllWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllWordButtonActionPerformed(evt);
            }
        });

        translateButton.setText("Translate");
        translateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translateButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel1.setText("Copyright: 333 team");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showAllWordButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(insertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(translateButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchText, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showExplain, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(setButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(showAllWordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(translateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showExplain, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //bắt sự kiện click chuột vào search và xóa hết text trong đó
    private void searchTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTextMouseClicked
        searchText.setText("");
    }//GEN-LAST:event_searchTextMouseClicked

    private void wordListAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_wordListAncestorAdded
        
    }//GEN-LAST:event_wordListAncestorAdded

    //search từ và hiển thị danh sách từ
    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        String wordSearching = searchText.getText();
        showExplain.setText("");
        if( DictionaryManagment.DictionaryLookup(wordSearching) >= 0) {
            wordList.setModel(DictionaryManagment.searchWord(wordSearching));
            showExplain.setText( Dictionary.WordArr.get(DictionaryManagment.DictionaryLookup(wordSearching)).word_explain);
        }
        else {
            wordList.setModel(DictionaryManagment.searchWord(wordSearching));
        }
        
    }//GEN-LAST:event_searchTextActionPerformed
    
  
    //Hiển thị bảng thêm từ và thêm từ
    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        //dialogInsert insertWord = new dialogInsert(this, true);
        dialogInsertWord insertWord = new dialogInsertWord(this, true);
        insertWord.getContentPane().setBackground(new java.awt.Color(153, 153, 255));
        insertWord.setVisible(true);
        Word wordInsert = insertWord.getWord();
        int index = DictionaryManagment.DictionaryLookup(wordInsert.word_target);
        if( index >= 0) {
            JOptionPane.showMessageDialog(rootPane, "This word is already existed!");
        }
        else if( wordInsert.word_explain.equals("") == false && wordInsert.word_target.equals("") == false){
            DictionaryManagment.insertWord(wordInsert);
            JOptionPane.showMessageDialog(rootPane, "Action completed!");
            wordList.setModel(DictionaryManagment.showAllWord());
        }
    }//GEN-LAST:event_insertButtonActionPerformed
    
    //sửa từ
    private void setButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setButtonActionPerformed
        String choosen = "";
        String newExplain = "";
        try {
            choosen = wordList.getSelectedValue().toString();
            int indexOfWordSearching = DictionaryManagment.DictionaryLookup(choosen);
            newExplain = JOptionPane.showInputDialog(null, "Vietnamese", "Set word", JOptionPane.PLAIN_MESSAGE);
         
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "You must select a word!");
        }
        if(newExplain.equals("") == false) {
                DictionaryManagment.setWord(choosen, newExplain);
                JOptionPane.showMessageDialog(rootPane, "Action completed!");
        }
    }//GEN-LAST:event_setButtonActionPerformed

    //Hiển thị toàn bộ từ ra list
    private void showAllWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllWordButtonActionPerformed
        wordList.setModel(DictionaryManagment.showAllWord());
    }//GEN-LAST:event_showAllWordButtonActionPerformed

    //Xóa từ
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            String choosen = wordList.getSelectedValue().toString(); //lấy từ được chọn để xóa
            String[] select = {"YES", "NO"};
            int x = JOptionPane.showOptionDialog(null, "Are you sure that want to delete that word?", "Message",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, select, select[0]); //hiển thị lựa chon Yes, No
            if( x == 0) {
                DictionaryManagment.deleteWord(choosen); //xóa từ khỏi arr và file Dictionary
                JOptionPane.showMessageDialog(rootPane, "Action completed!"); //show message
            }
            String textSearching = searchText.getText(); //lấy text trong searchText
            if(textSearching.equals("")) {
                wordList.setModel(DictionaryManagment.showAllWord());
            }
            else if( !(textSearching.equals("Search"))) { //kiểm tra đk nếu text trong search khác search thì in ra list
                wordList.setModel(DictionaryManagment.searchWord(textSearching)); //in ra list từ ứng với text trong khung search
            }
            else if(textSearching.equals("Search") ) {
                wordList.setModel(DictionaryManagment.showAllWord());
            }
            
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "You must select a word!"); //show message
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    //bắt sự kiện click chuột chọn một từ và in ra nghĩa
    private void wordListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wordListMouseClicked
        String choosen = wordList.getSelectedValue().toString();
        int indexOfWordSearching = DictionaryManagment.DictionaryLookup(choosen);
        showExplain.setText("<html>" + choosen + "<br>" + "<html>" + 
                DictionaryManagment.printWord(Dictionary.WordArr.get(indexOfWordSearching).word_explain) );
    }//GEN-LAST:event_wordListMouseClicked

    //bắt sự kiện click vào nút translate và gọi api
    private void translateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translateButtonActionPerformed
        new translate(this, true).setVisible(true);
    }//GEN-LAST:event_translateButtonActionPerformed

    
    
    public static void main(String args[]) {
        //Đưa toàn bộ từ trong file vào ArrayList
        DictionaryManagment.insertFromFile();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                graphic graphic = new graphic();
                graphic.setLocationRelativeTo(null);
                graphic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                graphic.setVisible(true);
                graphic.getContentPane().setBackground(new java.awt.Color(153, 153, 255));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton setButton;
    private javax.swing.JButton showAllWordButton;
    private javax.swing.JLabel showExplain;
    private javax.swing.JButton translateButton;
    private javax.swing.JList<String> wordList;
    // End of variables declaration//GEN-END:variables
}
