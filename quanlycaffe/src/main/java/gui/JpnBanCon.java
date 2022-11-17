/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author zombi
 */
public class JpnBanCon extends javax.swing.JPanel {

	private int soBanCon;

	/**
	 * Creates new form JpnBanCon
	 */
	public JpnBanCon(int soBan) {
		this.soBanCon = soBan;
		initComponents();
		btnBan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				System.out.println(soBan);
				
			}
		});
	}
	public int getSoBanCon() {
		return soBanCon;
	}
	public javax.swing.JButton getBtnBan() {
		return btnBan;
	}
	public void btnBanAddActionListener(ActionListener listener) {
    	btnBan.addActionListener(listener);
    }

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		btnBan = new javax.swing.JButton();

		btnBan.setBackground(new java.awt.Color(254, 254, 254));
		btnBan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
		btnBan.setText("Bàn "+soBanCon);
		btnBan.setToolTipText("");
		btnBan.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnBanActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(btnBan,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(btnBan, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
	}// </editor-fold>

	private void btnBanActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btnBan;
	// End of variables declaration
}