package fr.umontpellier.iut;

public class Commercial extends Employe{

    private double chiffreAffaires;
    private double tauxCommission;


    public Commercial(String nrINSEE, String nom, int echelon, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(nrINSEE, nom, echelon, base, nbHeures);
        this.chiffreAffaires = chiffreAffaires;
        this.tauxCommission = tauxCommission;
    }

    public void negocierTransaction(double sommeGagnée){
        chiffreAffaires+=sommeGagnée;
        System.out.println("Transaction négocié");
    }



}
