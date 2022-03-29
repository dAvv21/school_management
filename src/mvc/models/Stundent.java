package mvc.models;

import java.text.DecimalFormat;

/**
 * Taxe pentru fiecare student la taxa este de 25000 RON
 */

public class Stundent {
    public static final double MEDIE_MINIMA = 8.5;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private int id;
    private String name;
    private double finalGrade;
    private int feedsPaid;
    private int feedsTotal;
    private boolean paysFees;
    private double notaOOP;
    private double notaAF;
    private double notaMES;
    private double notaBD;
    private double notaCAN;
    private double notaMSI;
    private double notaENG;

    public Stundent(int id, String name, double notaOOP, double notaAF, double notaMES, double notaBD, double notaCAN, double notaMSI, double notaENG) {
        this.id = id;
        this.name = name;
        this.notaOOP = notaOOP;
        this.notaAF = notaAF;
        this.notaMES = notaMES;
        this.notaBD = notaBD;
        this.notaCAN = notaCAN;
        this.notaMSI = notaMSI;
        this.notaENG = notaENG;
        finalGrade = ((notaAF + notaBD + notaCAN + notaENG + notaMSI + notaOOP+ notaMES) / 7);
    }

    public void getBursa(Stundent stundent){
        finalGrade = ((notaAF + notaBD + notaCAN + notaENG + notaMSI + notaOOP+ notaMES) / 7);
        if(finalGrade < MEDIE_MINIMA){
            this.feedsTotal = 25000;
            paysFees = true;
        }
    }

    /**
     *Adaugam fees la feesPaid
     * Scoala va primi aceste taxe
     */
    public void updateFeesPaid(int fees){
        feedsPaid += fees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return finalGrade;
    }

    public void setGrade(float grade) {
        this.finalGrade = grade;
    }

    public int getFeedsPaid() {
        return feedsPaid;
    }

    public void setFeedsPaid(int feedsPaid) {
        this.feedsPaid = feedsPaid;
    }

    public int getFeedsTotal() {
        return feedsTotal;
    }

    public void setFeedsTotal(int feedsTotal) {
        this.feedsTotal = feedsTotal;
    }

    public boolean isPaysFees() {
        return paysFees;
    }

    public void setPaysFees(boolean paysFees) {
        this.paysFees = paysFees;
    }

    @Override
    public String toString() {
        return "Stundent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", finalGrade=" + df.format(finalGrade) +
                ", notaOOP=" + notaOOP +
                ", notaAF=" + notaAF +
                ", notaMES=" + notaMES +
                ", notaBD=" + notaBD +
                ", notaCAN=" + notaCAN +
                ", notaMSI=" + notaMSI +
                ", notaENG=" + notaENG +
                '}';
    }
}
