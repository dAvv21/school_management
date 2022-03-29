package mvc.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.*;
import javax.swing.JButton;

public class LoginView extends JFrame {
    private Image img_logo = (new ImageIcon("C:\\Users\\Giussepe\\Documents\\POO_Labs\\finalProjecy\\src\\res\\school-building-icon-on-a-white-background-vector-16671188.jpg")).getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH);
    private Image img_lock = (new ImageIcon("C:\\Users\\Giussepe\\Documents\\POO_Labs\\finalProjecy\\src\\res\\1200x600wa.png")).getImage().getScaledInstance(120,90,Image.SCALE_SMOOTH);
    private Image img_student = (new ImageIcon("C:\\Users\\Giussepe\\Documents\\POO_Labs\\finalProjecy\\src\\res\\34-343936_transparent-student-logo-png-png-download.png")).getImage().getScaledInstance(60,64,Image.SCALE_SMOOTH);
    private Image img_key = (new ImageIcon("C:\\Users\\Giussepe\\Documents\\POO_Labs\\finalProjecy\\src\\res\\key-free-flat-vector-icon-800x566.jpg")).getImage().getScaledInstance(90,90,Image.SCALE_SMOOTH);


    private JPanel contentPanel;
    private JTextField usernameField;
    private JPasswordField pwdPassword;
    private JLabel loginMessage = new JLabel("");
    private JButton loginButton;


    public LoginView() {
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 920, 570);
        contentPanel = new JPanel();
        contentPanel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPanel.setBackground(new Color(0, 139, 139));
        contentPanel.setBorder(new LineBorder(new Color(0, 0, 128), 2));
        setContentPane(contentPanel);
        contentPanel.setLayout(null);

        JPanel usernamePanel = new JPanel();
        usernamePanel.setBounds(274, 233, 412, 64);
        usernamePanel.setBackground(new Color(240, 240, 240));
        contentPanel.add(usernamePanel);
        usernamePanel.setLayout(null);

        usernameField = new JTextField();
        usernameField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(usernameField.getText().equals("Username")) {
                    usernameField.setText("");
                }
                else
                    usernameField.selectAll();
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(usernameField.getText().equals(""))
                    usernameField.setText("Username");
            }
        });
        usernameField.setBorder(null);
        usernameField.setFont(new Font("Arial", Font.PLAIN, 20));
        usernameField.setText("Username");
        usernameField.setBounds(10, 10, 287, 44);
        usernamePanel.add(usernameField);
        usernameField.setColumns(10);

        JLabel lblUserName = new JLabel("");
        lblUserName.setBounds(339, 0, 73, 64);
        usernamePanel.add(lblUserName);
        lblUserName.setIcon(new ImageIcon(img_student));

        JPanel passPanel = new JPanel();
        passPanel.setBounds(274, 323, 412, 64);
        passPanel.setBackground(SystemColor.menu);
        contentPanel.add(passPanel);
        passPanel.setLayout(null);

        pwdPassword = new JPasswordField();
        pwdPassword.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(pwdPassword.getText().equals("Password")) {
                    pwdPassword.setEchoChar('●');
                    pwdPassword.setText("");
                }
                else
                    pwdPassword.selectAll();

            }
            @Override
            public void focusLost(FocusEvent e) {
                if(pwdPassword.getText().equals("")) {
                    pwdPassword.setText("Password");
                    pwdPassword.setEchoChar((char)0);

                }
            }
        });
        pwdPassword.setBorder(null);
        pwdPassword.setEchoChar((char)0);
        pwdPassword.setFont(new Font("Arial", Font.PLAIN, 20));
        pwdPassword.setText("Password");
        pwdPassword.setBounds(10, 10, 287, 44);
        passPanel.add(pwdPassword);

        JLabel lblPassWord = new JLabel("");
        lblPassWord.setBounds(307, 0, 86, 64);
        lblPassWord.setIcon(new ImageIcon(img_lock));
        passPanel.add(lblPassWord);

        JLabel lblX = new JLabel("X");
        lblX.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?","Confirmation",JOptionPane.YES_NO_OPTION) == 0)
                    LoginView.this.dispose();
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                lblX.setForeground(Color.RED);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                lblX.setForeground(Color.WHITE);
            }
        });

        lblX.setForeground(new Color(255, 255, 255));
        lblX.setBounds(898, 0, 22, 38);
        lblX.setFont(new Font("Arial", Font.BOLD, 21));
        contentPanel.add(lblX);

        JLabel logoPic = new JLabel("");
        logoPic.setBounds(375, 33, 200, 179);
        contentPanel.add(logoPic);
        logoPic.setIcon(new ImageIcon(img_logo));

        loginMessage.setForeground(new Color(255, 0, 0));
        loginMessage.setFont(new Font("Arial", Font.PLAIN, 15));
        loginMessage.setBounds(274, 397, 412, 39);
        contentPanel.add(loginMessage);

        this.loginButton = new JButton("LOGIN");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 32));
        loginButton.setBounds(274, 433, 412, 56);
        contentPanel.add(loginButton);
        setLocationRelativeTo(null);

        this.setVisible(true);
    }

    public String getUsernameField() {
        return usernameField.getText();
    }

    public void setUsernameField(String usernameField) {
        this.usernameField.setText("");
    }

    public String getPwdPassword() {
        return pwdPassword.getText();
    }


    public void setPwdPassword(String pwdPassword) {
        this.pwdPassword.setText("");
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public void getNextListener(ActionListener action){
        loginButton.addActionListener(action);
    }

}
