package mvc.controller;

import mvc.models.School;
import mvc.models.Stundent;
import mvc.views.LoginView;
import mvc.views.MeniuView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private LoginView loginView;
    private MeniuView meniuView;
    private School school;

    public Controller(LoginView loginView, MeniuView meniuView, School school) {
        this.loginView = loginView;
        this.meniuView = meniuView;
        this.school = school;
        this.loginView.getNextListener(new getMeniuView());
        this.meniuView.getBack(new signOut());
        this.meniuView.showGrades(new showGrades());
    }

    class showGrades implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int id = meniuView.getIdTextField();
           // for (Stundent stundet: school.getStundents()) {

        }
    }

    class signOut implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            loginView.setUsernameField("");
            loginView.setPwdPassword("");
            meniuView.setVisible(false);
            loginView.setVisible(true);
        }
    }

    class getMeniuView implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String username = loginView.getUsernameField();
            String password = loginView.getPwdPassword();

            if (username.equals("admin") && password.equals("admin123")) {
                JOptionPane.showMessageDialog(null, "Login Successful!");
                loginView.setVisible(false);
                meniuView.setVisible(true);
            }
            else {
                if (username.equals("") || username.equals("Username") || password.equals("") || password.equals("Password"))
                    JOptionPane.showMessageDialog(null, "Please input all requirements!");
                else{
                    JOptionPane.showMessageDialog(null, "Invalid username or password!");
                }
            }
        }
    }
}
