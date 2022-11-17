/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import dao.NhanVienDAO;
import dao.TaiKhoanDAO;
import entity.NhanVien;
import entity.TaiKhoan;

/**
 *
 * @author hieud
 */
public class FrmDoiMatKhau extends javax.swing.JFrame {
	private NhanVien nv;
	private TaiKhoanDAO taiKhoanDao;
	private FrmDangNhap frmDangNhap;
    /**
     * Creates new form FrmDoiMK
     */
    public FrmDoiMatKhau(NhanVien nv) {
    	this.nv=nv;
    	frmDangNhap = new FrmDangNhap();
    	System.out.println(nv);
    	taiKhoanDao = new TaiKhoanDAO();
        initComponents();
       
        addControls();
    }
    

    private void addControls() {
    	btnHuy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
    	btnXacNhan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String mkCu = String.valueOf(tfMKCu.getPassword());
				String mkMoi = String.valueOf(tfMKMoi.getPassword());
				String mkXacNhan = String.valueOf(tfMKXacNhan.getPassword());
				if (!mkMoi.equals(mkXacNhan)) {
				
					JOptionPane.showMessageDialog(null, "Mật khẩu xác nhận không trùng!!!","Lỗi",JOptionPane.ERROR_MESSAGE);
				}else if(!mkCu.equals(nv.getTaiKhoan().getMatKhau())) {
					JOptionPane.showMessageDialog(null, "Mật khẩu cũ không chính xác!!","Lỗi", JOptionPane.ERROR_MESSAGE);
				}
				else {
					nv.getTaiKhoan().setMatKhau(mkMoi);
					try {
						JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công!!");
						TaiKhoan tk = taiKhoanDao.timTaiKhoan(nv.getTaiKhoan().getTenTaiKhoan());
						tk.setMatKhau(mkMoi);
						taiKhoanDao.doiMatKhau(tk);
						
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					setVisible(false);
					
				}
			}
		});
	}

	/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHuy = new javax.swing.JButton();
        btnXacNhan = new javax.swing.JButton();
        tfMKCu = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        tfMKMoi = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        tfMKXacNhan = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jlbTitle = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btnClose = new javax.swing.JButton();
        jlbMKCu = new javax.swing.JLabel();
        jlbMKMoi = new javax.swing.JLabel();
        jlbMKXacNhan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        btnHuy.setBackground(new java.awt.Color(254,254,254));
        btnHuy.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close_30px.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnXacNhan.setBackground(new java.awt.Color(254,254,254));
        btnXacNhan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnXacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/done_30px.png"))); // NOI18N
        btnXacNhan.setText("Xác Nhận");
        btnXacNhan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfMKCu.setBackground(new java.awt.Color(254,254,254));
        tfMKCu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tfMKCu.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        tfMKMoi.setBackground(new java.awt.Color(254,254,254));
        tfMKMoi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tfMKMoi.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        tfMKXacNhan.setBackground(new java.awt.Color(254,254,254));
        tfMKXacNhan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tfMKXacNhan.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jlbTitle.setFont(new java.awt.Font("Bahnschrift", 1, 35)); // NOI18N
        jlbTitle.setText("Đổi Mật Khẩu");

        jSeparator5.setBackground(new java.awt.Color(254, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        btnClose.setBackground(new java.awt.Color(254,254,254));
        btnClose.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        btnClose.setText("x");
        btnClose.setBorder(null);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        jlbMKCu.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jlbMKCu.setText("Mật khẩu cũ:");

        jlbMKMoi.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jlbMKMoi.setText("Mật khẩu mới:");

        jlbMKXacNhan.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jlbMKXacNhan.setText("Xác nhận mật khẩu:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbMKCu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbMKMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlbMKXacNhan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfMKXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbTitle)
                .addGap(249, 249, 249)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jlbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnClose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbMKCu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbMKMoi)
                    .addComponent(tfMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbMKXacNhan)
                        .addComponent(tfMKXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {                                      
         setVisible(false);
    }                                     

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel jlbMKCu;
    private javax.swing.JLabel jlbMKMoi;
    private javax.swing.JLabel jlbMKXacNhan;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JPasswordField tfMKCu;
    private javax.swing.JPasswordField tfMKMoi;
    private javax.swing.JPasswordField tfMKXacNhan;
    // End of variables declaration                   
}
