package fr.umontpellier.iut;

public class Fabricant extends Employe {

    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Fabricant(String nrINSEE, String nom, int echelon, double base, double nbHeures, int nbUnitesProduites, double tauxCommissionUnite) {
        super(nrINSEE, nom, echelon, base, nbHeures);
        this.nbUnitesProduites = nbUnitesProduites;
        this.tauxCommissionUnite = tauxCommissionUnite;
    }

    public void fabriquerProduits(int nbProduits){
        nbUnitesProduites+=nbProduits;
        System.out.println("Produit fabriqué");
    }

    @Override
    public double getSalaireBrut() {
        return super.getSalaireBrut()+nbUnitesProduites*tauxCommissionUnite;
    }
}
