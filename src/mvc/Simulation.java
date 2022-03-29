package mvc;

import mvc.controller.Controller;
import mvc.models.School;
import mvc.models.Stundent;
import mvc.models.Teacher;
import mvc.views.LoginView;
import mvc.views.MeniuView;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    public static void main(String[] args) {

        List<Teacher> teacherList = new ArrayList<>();
        List<Stundent> stundentList = new ArrayList<>();
        Teacher teacher1 = new Teacher(100,"Georgescu Mihai",50540);
        Teacher teacher2 = new Teacher(101,"Farago Antonia",49070);
        Teacher teacher3 = new Teacher(102,"Monacu Vasile",60000);
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        Stundent stundent1 = new Stundent(200,"Cindea Alexandru",9,8,10,8,6,10,10);
        Stundent stundent2 = new Stundent(201,"Runcan Alexandru",10,9,10,8,7,10,10);
        Stundent stundent3 = new Stundent(202,"Furtos Rares",10,10,10,10,10,10,10);
        stundentList.add(stundent1);
        stundentList.add(stundent2);
        stundentList.add(stundent3);

        School school = new School("Liceul Stefan cel Mare Suceava");
        school.setTeachers(teacherList);
        school.setStundents(stundentList);

        LoginView loginView = new LoginView();
        MeniuView meniuView = new MeniuView();

        Controller controller = new Controller(loginView,meniuView,school);


        for(Stundent s : stundentList){
            System.out.println(s.toString());
        }

    }
}
