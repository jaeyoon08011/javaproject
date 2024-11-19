/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package deu.hms.checkin;

/**
 *
 * @author Jimin
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class checkinFrame extends javax.swing.JDialog {
    
    private javax.swing.JTextField requestTextField;
    
    public JDialog getcardRegist() {
        return cardRegist;
    }
    
    
    /**
     * Creates new form checkinFramee
     * @param parent
     * @param modal
     */
    public checkinFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initRadioButtons();
        initializePlaceholders(); // Placeholder 초기화
        configurePaymentButtonState(); // 라디오 버튼 상태 설정
        paymentTypeRegistButton.setEnabled(false); // 초기 상태 비활성화
        setTitle("체크인");
        setLocationRelativeTo(null); // 화면 중앙에 배치
        
    }
 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardRegist = new javax.swing.JDialog();
        cardNumLabel = new javax.swing.JLabel();
        cardNumTextField1 = new javax.swing.JTextField();
        cardNumTextField2 = new javax.swing.JTextField();
        cardNumTextField3 = new javax.swing.JTextField();
        cardNumTextField4 = new javax.swing.JTextField();
        expirationDateLabel = new javax.swing.JLabel();
        monthTextField = new javax.swing.JTextField();
        cvcLabel = new javax.swing.JLabel();
        cvcTextField = new javax.swing.JTextField();
        pwLabel = new javax.swing.JLabel();
        pwTextField = new javax.swing.JTextField();
        registButton = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        cancleButton = new javax.swing.JButton();
        slashLabel = new javax.swing.JLabel();
        yearTextField = new javax.swing.JTextField();
        paymentButtonGroup = new javax.swing.ButtonGroup();
        cardRegistButton = new javax.swing.JRadioButton();
        reqestLabel = new javax.swing.JLabel();
        paymentTypeRegistButton = new javax.swing.JButton();
        checkInTextField = new javax.swing.JTextField();
        serchTextField = new javax.swing.JTextField();
        requestRegistButton = new javax.swing.JButton();
        nameComboBox = new javax.swing.JComboBox<>();
        checkinButton = new javax.swing.JButton();
        checkInLabel = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        reservationListTable = new javax.swing.JTable();
        reqestTextField = new javax.swing.JTextField();
        reservationlistLabel = new javax.swing.JLabel();
        paymentTypeLabel = new javax.swing.JLabel();
        onSitePaymentButton = new javax.swing.JRadioButton();
        roomAmountLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        serchButton = new javax.swing.JButton();

        cardNumLabel.setText("카드번호");

        cardNumTextField1.setToolTipText("");
        cardNumTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumTextField1ActionPerformed(evt);
            }
        });

        cardNumTextField2.setToolTipText("");

        expirationDateLabel.setText("유효기간");

        monthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthTextFieldActionPerformed(evt);
            }
        });

        cvcLabel.setText("CVC");

        pwLabel.setText("비밀번호");

        registButton.setText("등록");
        registButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registButtonActionPerformed(evt);
            }
        });

        Label1.setText("-");

        Label2.setText("-");

        Label3.setText("-");

        cancleButton.setText("취소");
        cancleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleButtonActionPerformed(evt);
            }
        });

        slashLabel.setText("/");

        yearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardRegistLayout = new javax.swing.GroupLayout(cardRegist.getContentPane());
        cardRegist.getContentPane().setLayout(cardRegistLayout);
        cardRegistLayout.setHorizontalGroup(
            cardRegistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardRegistLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardRegistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardRegistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(cardRegistLayout.createSequentialGroup()
                            .addComponent(cancleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cardRegistLayout.createSequentialGroup()
                            .addGroup(cardRegistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cardNumLabel)
                                .addComponent(expirationDateLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(cardRegistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(cardNumTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(cardRegistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(cardRegistLayout.createSequentialGroup()
                                    .addComponent(Label1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cardNumTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(cardRegistLayout.createSequentialGroup()
                                    .addComponent(slashLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(cardRegistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardRegistLayout.createSequentialGroup()
                                    .addComponent(cvcLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cvcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(cardRegistLayout.createSequentialGroup()
                                    .addComponent(Label2)
                                    .addGap(7, 7, 7)
                                    .addComponent(cardNumTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Label3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cardNumTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(cardRegistLayout.createSequentialGroup()
                        .addComponent(pwLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pwTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardRegistLayout.setVerticalGroup(
            cardRegistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardRegistLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardRegistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNumTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNumTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNumTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNumTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1)
                    .addComponent(Label2)
                    .addComponent(Label3)
                    .addComponent(cardNumLabel))
                .addGap(18, 18, 18)
                .addGroup(cardRegistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expirationDateLabel)
                    .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slashLabel)
                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvcLabel)
                    .addComponent(cvcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cardRegistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwLabel)
                    .addComponent(pwTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(cardRegistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancleButton)
                    .addComponent(registButton))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cardRegistButton.setText("카드 등록");
        cardRegistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardRegistButtonActionPerformed(evt);
            }
        });

        reqestLabel.setText("요청 사항");

        paymentTypeRegistButton.setText("등록");
        paymentTypeRegistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentTypeRegistButtonActionPerformed(evt);
            }
        });

        serchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serchTextFieldActionPerformed(evt);
            }
        });

        requestRegistButton.setText("등록");
        requestRegistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestRegistButtonActionPerformed(evt);
            }
        });

        nameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "성이름", "고유 번호" }));
        nameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameComboBoxActionPerformed(evt);
            }
        });

        checkinButton.setText("체크인");

        checkInLabel.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        checkInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkInLabel.setText("체크인");

        reservationListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "고유 번호", "이름", "전화 번호", "방 번호", "객실 금액", "결제 수단", "상태"
            }
        ));
        ScrollPane.setViewportView(reservationListTable);

        reqestTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqestTextFieldActionPerformed(evt);
            }
        });

        reservationlistLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reservationlistLabel.setText("예약자 명단");

        paymentTypeLabel.setText("결제 유형");

        onSitePaymentButton.setText("현장 결제");
        onSitePaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSitePaymentButtonActionPerformed(evt);
            }
        });

        roomAmountLabel.setText("객실 금액");

        editButton.setText("수정");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        serchButton.setLabel("검색");
        serchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkInLabel)
                .addGap(234, 234, 234))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reqestLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reqestTextField)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(reservationlistLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(serchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(serchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestRegistButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paymentTypeLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(onSitePaymentButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cardRegistButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(paymentTypeRegistButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roomAmountLabel)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(checkInTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(checkInLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serchButton))
                .addGap(18, 18, 18)
                .addComponent(reservationlistLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton)
                .addGap(12, 12, 12)
                .addComponent(reqestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reqestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requestRegistButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentTypeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roomAmountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardRegistButton)
                    .addComponent(paymentTypeRegistButton)
                    .addComponent(onSitePaymentButton)
                    .addComponent(checkInTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkinButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // 다른 컴포넌트 초기화 후에 호출되는 메서드에 작성
    private void initRadioButtons() {
        // paymentButtonGroup은 이미 생성되어 있다고 가정
        // JDialog에 있는 onSitePaymentButton과 cardRegistButton을 ButtonGroup에 추가
        paymentButtonGroup.add(onSitePaymentButton);
        paymentButtonGroup.add(cardRegistButton);
    }
    
    private void configurePaymentButtonState() {
        // cardRegistButton을 선택했을 때 paymentTypeRegistButton 활성화
        cardRegistButton.addActionListener(e -> paymentTypeRegistButton.setEnabled(true));

        // onSitePaymentButton을 선택했을 때 paymentTypeRegistButton 비활성화
        onSitePaymentButton.addActionListener(e -> paymentTypeRegistButton.setEnabled(false));
    }
    
    private void initializePlaceholders() {
        setTextFieldPlaceholder(cardNumTextField1, "****");
        setTextFieldPlaceholder(cardNumTextField2, "****");
        setTextFieldPlaceholder(cardNumTextField3, "****");
        setTextFieldPlaceholder(cardNumTextField4, "****");
        setTextFieldPlaceholder(monthTextField, "MM");
        setTextFieldPlaceholder(yearTextField, "YY");
        setTextFieldPlaceholder(pwTextField, "비밀번호 앞 2자리");
        setTextFieldPlaceholder(cvcTextField, "***");
        setTextFieldPlaceholder(reqestTextField, "요청 사항 없을 시  '없음'  입력");
    }
    
    private void setTextFieldPlaceholder(javax.swing.JTextField textField, String placeholder) {
        textField.setText(placeholder);
        textField.setForeground(java.awt.Color.GRAY);

        textField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText(""); // 기본 텍스트 제거
                    textField.setForeground(java.awt.Color.BLACK); // 글자색 검정
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (textField.getText().trim().isEmpty()) {
                    textField.setText(placeholder); // 기본 텍스트 복원
                    textField.setForeground(java.awt.Color.GRAY); // 글자색 회색
                }
            }
        });
    }
    
    private void paymentTypeRegistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentTypeRegistButtonActionPerformed
            cardRegist.setSize(295, 220);  // 다이얼로그 크기 설정
            cardRegist.setLocationRelativeTo(this);  // 부모 컴포넌트를 기준으로 중앙에 배치  
            cardRegist.setTitle("카드 등록");  // 다이얼로그 제목 설정 
            cardRegist.setModal(true);
            cardRegist.setVisible(true);  // 다이얼로그 표시
            cardRegist.toFront();
    }//GEN-LAST:event_paymentTypeRegistButtonActionPerformed

    private void requestRegistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestRegistButtonActionPerformed
        /* int selectedRow = ReservationListTable.getSelectedRow();

        if (selectedRow == -1) {
            // 고객이 선택되지 않은 경우
            JOptionPane.showMessageDialog(null, "고객을 선택해주세요.", "에러", JOptionPane.ERROR_MESSAGE);
        } else {
            // 고객의 요청 사항 입력하기
            String request = SpecialRequests.getText().trim();

            */
        
            // 요청 사항이 비어있는지 확인
            /*if (requestTextField == null) {
                JOptionPane.showMessageDialog(null, "요청 사항을 입력해주세요.", "경고", JOptionPane.WARNING_MESSAGE);
                return;
            } 
            */
  
            // 요청 사항을 파일에 저장 (BufferedWriter 사용)
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("requests_data.txt", true))) {
                writer.write("고객 요청 사항: " + reqestTextField);  // 요청 사항을 파일에 기록
                writer.newLine();       // 줄바꿈 추가
                JOptionPane.showMessageDialog(null, "요청 사항이 저장되었습니다.");

                // 요청 사항 입력 필드 초기화
                reqestTextField.setText("");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "저장 중 오류가 발생했습니다!", "오류", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }//GEN-LAST:event_requestRegistButtonActionPerformed

    private void nameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameComboBoxActionPerformed

    private void reqestTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqestTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reqestTextFieldActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void serchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serchButtonActionPerformed

    private void cardRegistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardRegistButtonActionPerformed
        
    }//GEN-LAST:event_cardRegistButtonActionPerformed

    private void cardNumTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumTextField1ActionPerformed

    private void registButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registButtonActionPerformed
        // 입력 필드에서 값 가져오기
        String cardNum1 = cardNumTextField1.getText().trim(); // 카드 번호 첫 4자리
        String cardNum2 = cardNumTextField2.getText().trim(); // 카드 번호 두 번째 4자리
        String cardNum3 = cardNumTextField3.getText().trim(); // 카드 번호 세 번째 4자리
        String cardNum4 = cardNumTextField4.getText().trim(); // 카드 번호 네 번째 4자리
        String month = monthTextField.getText().trim(); // 유효기간 월
        String year = yearTextField.getText().trim(); // 유효기간 연도
        String pw = pwTextField.getText().trim(); // 카드 비밀번호 (앞 2자리만 입력받음)
        String cvc = cvcTextField.getText().trim(); // CVC 번호

        // 입력값 검증
        if (cardNum1.isEmpty() || cardNum2.isEmpty() || cardNum3.isEmpty() || cardNum4.isEmpty()
            || month.isEmpty() || year.isEmpty() || pw.isEmpty() || cvc.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(cardRegist, "모든 필드를 입력하세요!", "오류", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!cardNum1.matches("\\d{4}") || !cardNum2.matches("\\d{4}")
            || !cardNum3.matches("\\d{4}") || !cardNum4.matches("\\d{4}")) {
            javax.swing.JOptionPane.showMessageDialog(cardRegist, "카드 번호는 각 4자리 숫자로 입력하세요!", "오류", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!month.matches("\\d{2}") || !year.matches("\\d{2}") || Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12) {
            javax.swing.JOptionPane.showMessageDialog(cardRegist, "유효기간을 올바르게 입력하세요! (MM/YY)", "오류", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!pw.matches("\\d{2}")) { // 비밀번호는 2자리 숫자로 제한
            javax.swing.JOptionPane.showMessageDialog(cardRegist, "비밀번호는 앞 2자리 숫자로 입력하세요!", "오류", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!cvc.matches("\\d{3}")) {
            javax.swing.JOptionPane.showMessageDialog(cardRegist, "CVC 번호는 3자리 숫자로 입력하세요!", "오류", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 카드 정보 합치기
        String fullCardNumber = cardNum1 + "-" + cardNum2 + "-" + cardNum3 + "-" + cardNum4; // 카드 번호를 하나로 합침
        String expirationDate = month + "/" + year; // 유효기간을 MM/YY 형식으로 저장

        // 카드 정보를 저장 (BufferedWriter 사용)
        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter("card_data.txt", true))) { // 기존 데이터에 추가
            writer.write("카드 번호: " + fullCardNumber + ", 유효기간: " + expirationDate
                    + ", 비밀번호: " + pw + ", CVC: " + cvc);
            writer.newLine();  // 줄바꿈 추가

            javax.swing.JOptionPane.showMessageDialog(cardRegist, "카드 정보가 성공적으로 저장되었습니다!", "성공", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            // 입력 필드 초기화 및 다이얼로그 닫기
            cardNumTextField1.setText("");
            cardNumTextField2.setText("");
            cardNumTextField3.setText("");
            cardNumTextField4.setText("");
            monthTextField.setText("");
            yearTextField.setText("");
            pwTextField.setText("");
            cvcTextField.setText("");
            cardRegist.setVisible(false);
        } catch (java.io.IOException ex) {
            javax.swing.JOptionPane.showMessageDialog(cardRegist, "저장 중 오류가 발생했습니다!", "오류", javax.swing.JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_registButtonActionPerformed

    private void cancleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleButtonActionPerformed
        cardRegist.setVisible(false);
    }//GEN-LAST:event_cancleButtonActionPerformed

    private void monthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthTextFieldActionPerformed

    private void yearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTextFieldActionPerformed

    private void onSitePaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSitePaymentButtonActionPerformed
        
    }//GEN-LAST:event_onSitePaymentButtonActionPerformed

    private void serchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serchTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(checkinFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkinFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkinFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkinFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                checkinFrame dialog = new checkinFrame(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
            
                dialog.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton cancleButton;
    private javax.swing.JLabel cardNumLabel;
    private javax.swing.JTextField cardNumTextField1;
    private javax.swing.JTextField cardNumTextField2;
    private javax.swing.JTextField cardNumTextField3;
    private javax.swing.JTextField cardNumTextField4;
    private javax.swing.JDialog cardRegist;
    private javax.swing.JRadioButton cardRegistButton;
    private javax.swing.JLabel checkInLabel;
    private javax.swing.JTextField checkInTextField;
    private javax.swing.JButton checkinButton;
    private javax.swing.JLabel cvcLabel;
    private javax.swing.JTextField cvcTextField;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel expirationDateLabel;
    private javax.swing.JTextField monthTextField;
    private javax.swing.JComboBox<String> nameComboBox;
    private javax.swing.JRadioButton onSitePaymentButton;
    private javax.swing.ButtonGroup paymentButtonGroup;
    private javax.swing.JLabel paymentTypeLabel;
    private javax.swing.JButton paymentTypeRegistButton;
    private javax.swing.JLabel pwLabel;
    private javax.swing.JTextField pwTextField;
    private javax.swing.JButton registButton;
    private javax.swing.JLabel reqestLabel;
    private javax.swing.JTextField reqestTextField;
    private javax.swing.JButton requestRegistButton;
    private javax.swing.JTable reservationListTable;
    private javax.swing.JLabel reservationlistLabel;
    private javax.swing.JLabel roomAmountLabel;
    private javax.swing.JButton serchButton;
    private javax.swing.JTextField serchTextField;
    private javax.swing.JLabel slashLabel;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
