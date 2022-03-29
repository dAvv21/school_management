package mvc.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MeniuView extends JFrame {
    private Image img_logo = (new ImageIcon("C:\\Users\\Giussepe\\Documents\\POO_Labs\\finalProjecy\\src\\res\\school-building-icon-on-a-white-background-vector-16671188.jpg")).getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH);
    private Image img_student = (new ImageIcon("C:\\Users\\Giussepe\\Documents\\POO_Labs\\finalProjecy\\src\\res\\34-343936_transparent-student-logo-png-png-download.png")).getImage().getScaledInstance(60,64,Image.SCALE_SMOOTH);
    private Image img_profesor = (new ImageIcon("C:\\Users\\Giussepe\\Documents\\POO_Labs\\money_school_management\\src\\res\\profesor.jpg")).getImage().getScaledInstance(50,60,Image.SCALE_SMOOTH);
    private Image img_signOut = (new ImageIcon("C:\\Users\\Giussepe\\Documents\\POO_Labs\\money_school_management\\src\\res\\signOut.jpg")).getImage().getScaledInstance(50,60,Image.SCALE_SMOOTH);

    private JPanel contentPanel;
    private JTextArea displayArea;
    private JButton signOutButton;
    private JButton teacherButton;
    private JButton studentButton;
    private JTextField idTextField;


    public MeniuView() {
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 920, 570);
        contentPanel = new JPanel();
        contentPanel.setFont(new Font("Arial", Font.PLAIN, 30));
        contentPanel.setBackground(new Color(47, 79, 79));
        contentPanel.setBorder(new LineBorder(new Color(0, 0, 128), 2));
        setContentPane(contentPanel);

        JLabel lblX = new JLabel("X");
        lblX.setBounds(898, 0, 22, 38);
        lblX.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?","Confirmation",JOptionPane.YES_NO_OPTION) == 0)
                    MeniuView.this.dispose();
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
        contentPanel.setLayout(null);

        lblX.setForeground(new Color(255, 255, 255));
        lblX.setFont(new Font("Arial", Font.BOLD, 21));
        contentPanel.add(lblX);

        JPanel panelMenu = new JPanel();
        panelMenu.setBounds(0, 0, 336, 570);
        panelMenu.setBorder(null);
        panelMenu.setBackground(new Color(0, 128, 128));
        contentPanel.add(panelMenu);
        panelMenu.setLayout(null);

        JLabel picLabel = new JLabel("");
        picLabel.setBounds(66, 36, 200, 155);
        picLabel.setIcon(new ImageIcon(img_logo));
        panelMenu.add(picLabel);

        this.studentButton = new JButton("STUDENT");
        studentButton.setFont(new Font("Arial", Font.PLAIN, 25));
        studentButton.setBounds(76, 254, 250, 55);
        panelMenu.add(studentButton);

        JLabel picStundent = new JLabel("");
        picStundent.setBounds(16, 254, 50, 55);
        panelMenu.add(picStundent);
        picStundent.setIcon(new ImageIcon(img_student));

        JLabel picProfesor = new JLabel("");
        picProfesor.setBounds(16, 336, 50, 55);
        panelMenu.add(picProfesor);
        picProfesor.setIcon(new ImageIcon(img_profesor));

        this.teacherButton = new JButton("TEACHER");
        teacherButton.setFont(new Font("Arial", Font.PLAIN, 25));
        teacherButton.setBounds(76, 336, 250, 55);
        panelMenu.add(teacherButton);

        this.signOutButton = new JButton("SIGN OUT");
        signOutButton.setFont(new Font("Arial", Font.PLAIN, 25));
        signOutButton.setBounds(76, 416, 250, 55);
        panelMenu.add(signOutButton);

        JLabel picSignOut = new JLabel("");
        picSignOut.setBounds(16, 416, 50, 55);
        panelMenu.add(picSignOut);
        picSignOut.setIcon(new ImageIcon(img_signOut));


        this.displayArea = new JTextArea();
        displayArea.setBounds(397, 62, 456, 443);
        contentPanel.add(displayArea);
        setLocationRelativeTo(null);

        this.idTextField = new JTextField();
        idTextField.setBounds(617, 19, 210, 27);
        contentPanel.add(idTextField);
        idTextField.setColumns(10);

        JLabel idLabel = new JLabel("INTRODUCETI ID-UL :");
        idLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        idLabel.setBounds(414, 19, 217, 22);
        contentPanel.add(idLabel);
        setLocationRelativeTo(null);

        this.setVisible(false);
    }

    public String getDisplayArea() {
        return displayArea.getText();
    }

    public void setDisplayArea(String displayArea) {
        this.displayArea.setText(displayArea);
    }

    public JButton getSignOutButton() {
        return signOutButton;
    }

    public void setSignOutButton(JButton signOutButton) {
        this.signOutButton = signOutButton;
    }

    public JButton getTeacherButton() {
        return teacherButton;
    }

    public void setTeacherButton(JButton teacherButton) {
        this.teacherButton = teacherButton;
    }

    public JButton getStudentButton() {
        return studentButton;
    }

    public void setStudentButton(JButton studentButton) {
        this.studentButton = studentButton;
    }

    public void getBack(ActionListener action){
        signOutButton.addActionListener(action);
    }

    public void showGrades(ActionListener action){
        studentButton.addActionListener(action);

    }

    public int getIdTextField() {
        return Integer.parseInt(idTextField.getText());
    }

    public void setIdTextField(String idTextField) {
        this.idTextField.setText(idTextField);
    }
}
