/**
 *
 * @author Simon
 */
package flowfour;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Graphics extends javax.swing.JFrame {

    private WordPairControlIF wpc;
    private final String REGEX_NUMERIC = "-?\\d+";
    private final String REGEX_SIGNS = "\\W+";

    public Graphics(WordPairControlIF wpc) {
        this.wpc = wpc;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        questionTextField = new javax.swing.JTextField();
        answerTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        guessButton = new javax.swing.JButton();
        lookUpButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        helpLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Question");

        jLabel2.setText("Answer");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel3.setText("Language Trainer");

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        guessButton.setText("Guess");
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonActionPerformed(evt);
            }
        });

        lookUpButton.setText("Look  Up");
        lookUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookUpButtonActionPerformed(evt);
            }
        });

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        helpLabel.setText("Hurray");
        helpLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(helpLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(17, 17, 17)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jLabel2))
                .add(31, 31, 31)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(questionTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 157, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(answerTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 157, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(33, 33, 33))
                    .add(layout.createSequentialGroup()
                        .add(newButton)
                        .add(21, 21, 21)
                        .add(deleteButton)
                        .add(18, 18, 18)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(nextButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(lookUpButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(guessButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel3)
                .add(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .add(17, 17, 17)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel1)
                    .add(questionTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nextButton))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(answerTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(guessButton))
                    .add(jLabel2))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lookUpButton)
                    .add(newButton)
                    .add(deleteButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(helpLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed
       if(wpc.checkGuess(answerTextField.getText(), questionTextField.getText())){
           helpLabel.setText("You guessed the word");
       }else{
           String tmp = wpc.lookup(questionTextField.getText());
           helpLabel.setText("Wrong answer. The first letter of the word is " + tmp.substring(0, 1));   
       }
    }//GEN-LAST:event_guessButtonActionPerformed
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
      questionTextField.setText(wpc.getRandomQuestion());
    }//GEN-LAST:event_nextButtonActionPerformed
    private void lookUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookUpButtonActionPerformed
        String tmp = questionTextField.getText();
        if(inputCheck(tmp)){
            wpc.lookup(tmp);
        }else{
            helpLabel.setText("Error");
        }
    }//GEN-LAST:event_lookUpButtonActionPerformed
    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        String a = answerTextField.getText();
        String q = questionTextField.getText();
        if(inputCheck(a) && inputCheck(q)){
            if(!q.equalsIgnoreCase(a)){
                helpLabel.setText("check worked");
                wpc.add(questionTextField.getText(), answerTextField.getText());
            }else{
            helpLabel.setText("words must differ");
            }
        }else{
            helpLabel.setText("no numbers or charecters accepted");
        } 
    }//GEN-LAST:event_newButtonActionPerformed
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String tmp = questionTextField.getText();
        if(inputCheck(tmp)){
            wpc.delete(tmp);
            helpLabel.setText("Word " + tmp+" deleted");
        }else{
            helpLabel.setText("Wordpair do not exist!");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private boolean inputCheck(String text){
        text = text.trim();
        Pattern num = Pattern.compile(this.REGEX_NUMERIC);
        Pattern sign = Pattern.compile(this.REGEX_SIGNS);
        Matcher mnum = num.matcher(text);
        Matcher msign = sign.matcher(text);
        while (mnum.find()) {
            if(mnum.group().length() != 0){
                return false;
            }
        }
        while (msign.find()) {
            if(msign.group().length() != 0){
                return false;
            }
        }
        if(text.length() <= 0){
            return false;
        }
    return true;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton guessButton;
    private javax.swing.JLabel helpLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton lookUpButton;
    private javax.swing.JButton newButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField questionTextField;
    // End of variables declaration//GEN-END:variables
}
