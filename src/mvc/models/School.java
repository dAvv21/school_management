package mvc.models;

import java.util.ArrayList;
import java.util.List;

public class School {
    public static final double VAL_BURSA = 900;
    public static final double MEDIE_MINIMA = 8.5;
    public static final double VAL_TAXA = 2500;
    private List<Teacher> teachers;
    private List<Stundent> stundents;
    private double totalMoneyEarned;
    private double totalMoneySpent;
    private String name;

    public School(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
        this.stundents = new ArrayList<>();
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }
    public void platesteBursa(Stundent stundent){
        if(stundent.getGrade() < MEDIE_MINIMA)
            return;
        else
            totalMoneySpent += VAL_BURSA;
    }

    public void incasareTaxe(Stundent stundent){
        if(stundent.isPaysFees() == false)
            return;
        else
            totalMoneyEarned += VAL_TAXA;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Stundent stundent) {
        stundents.add(stundent);
    }

    public double updateTotalMoneyEarned(double moneyEarned) {
        return totalMoneyEarned += moneyEarned;
    }

    public double updateTotalMoneySpent(double moneySpent) {
        return totalMoneySpent -= moneySpent;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Stundent> getStundents() {
        return stundents;
    }

    public void setStundents(List<Stundent> stundents) {
        this.stundents = stundents;
    }

    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(double totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(double totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}
