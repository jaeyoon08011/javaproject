/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package deu.hms.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Jimin
 */
public class loginFrame extends javax.swing.JDialog {

    /**
     * Creates new form loginFrame
     */
     private UserAuthentication auth;
     
    public loginFrame(UserAuthentication auth) {
        super(new JFrame(), true);
        this.auth = auth;
        initComponents();
        initializeFieldBehaviors();
        
        this.setLocationRelativeTo(null);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        PasswordField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        IDField = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        IDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(IDField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LoginButton)))
                .addGap(0, 87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // ID와 비밀번호 가져오기
        String userId = IDField.getText();
        String password = new String(PasswordField.getPassword());

        // 로그인 인증 시도
        boolean authenticated = auth.authenticate(userId, password);

        // 로그인 성공 여부에 따라 분기
        if (authenticated) {
            // 인증된 사용자 이름 가져오기
            String userName = auth.getUserName(userId);

            // 로그인 성공 메시지 표시
            JOptionPane.showMessageDialog(this, "Welcome, " + userName, "Login Success", JOptionPane.INFORMATION_MESSAGE);

            // 사용자가 '확인' 버튼을 클릭하면 MainScreenManager 창 열기
            MainScreenManager managerScreen = new MainScreenManager(auth);
            managerScreen.setLocationRelativeTo(null);
            managerScreen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 창 닫을 때 정상적으로 종료되도록 설정
            managerScreen.setVisible(true);  // MainScreenManager 화면 띄우기
            
            System.out.println("Disposing loginFrame...");
            // 로그인 창 닫기
            this.dispose();
        } else {
            // 로그인 실패 메시지 표시
            JOptionPane.showMessageDialog(this, "Login Failed", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void IDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDFieldActionPerformed
        PasswordField.requestFocus();
    }//GEN-LAST:event_IDFieldActionPerformed
   
    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        LoginButton.doClick();
    }//GEN-LAST:event_PasswordFieldActionPerformed
   
    
    /**
     * 필드 동작 초기화 메서드
     */
    private void initializeFieldBehaviors() {
        addIDFieldBehavior();         // IDField의 기본 메시지와 입력 동작 설정
        addPasswordFieldBehavior();   // PasswordField의 클릭 시 초기화 및 입력 동작 설정
    }

    /**
     * IDField의 기본 메시지 설정 및 동작 관리
     */
    private void addIDFieldBehavior() {
        String placeholderText = "ID";
        Color placeholderColor = Color.GRAY;
        Color inputColor = Color.BLACK;

        IDField.setText(placeholderText);
        IDField.setForeground(placeholderColor);

        IDField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                if (IDField.getText().equals(placeholderText)) {
                    IDField.setText("");
                    IDField.setForeground(inputColor);
                }
            }

            @Override
            public void focusLost(FocusEvent evt) {
                if (IDField.getText().isEmpty()) {
                    IDField.setText(placeholderText);
                    IDField.setForeground(placeholderColor);
                }
            }
        });
    }

    /**
     * PasswordField의 기본 상태 설정 및 동작 관리
     */
    private void addPasswordFieldBehavior() {
        String placeholderText = "*******";
        Color placeholderColor = Color.GRAY;
        Color inputColor = Color.BLACK;

        PasswordField.setText(placeholderText);
        PasswordField.setForeground(placeholderColor);
        PasswordField.setEchoChar((char) 0);  // 기본 메시지를 보여주기 위해 echo char 비활성화

        PasswordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                if (new String(PasswordField.getPassword()).equals(placeholderText)) {
                    PasswordField.setText("");
                    PasswordField.setForeground(inputColor);
                    PasswordField.setEchoChar('*');  // 비밀번호 입력 시 echo char 활성화
                }
            }

            @Override
            public void focusLost(FocusEvent evt) {
                if (PasswordField.getPassword().length == 0) {
                    PasswordField.setText(placeholderText);
                    PasswordField.setForeground(placeholderColor);
                    PasswordField.setEchoChar((char) 0);  // 기본 메시지를 보여주기 위해 echo char 비활성화
                }
            }
        });
    }
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
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        UserAuthentication auth = new UserAuthentication(); 
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                // UserAuthentication 객체를 인자로 전달하여 loginFrame 생성
                loginFrame dialog = new loginFrame(auth);  // UserAuthentication 전달
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            }
        });
    }

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField IDField;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.Box.Filler filler1;
    // End of variables declaration//GEN-END:variables
}
