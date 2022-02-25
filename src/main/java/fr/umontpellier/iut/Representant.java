package fr.umontpellier.iut;

public class Representant extends Commercial{

    private int representation;

    public Representant(String nrINSEE, String nom, int echelon, double base, double nbHeures, double chiffreAffaires, double tauxCommission, int representation) {
        super(nrINSEE, nom, echelon, base, nbHeures, chiffreAffaires, tauxCommission);
        this.representation = representation;
    }

    public void representerEntreprise(int rpz){
        this.representation+=rpz;
        System.out.println("Représente l'entreprise");
    }

    public static class RepresentantBuilder {
        private String nrINSEE;
        private String nom;
        private int echelon;
        private double base;
        private double nbHeures;
        private double chiffreAffaires;
        private double tauxCommission;
        private int representation;

        public RepresentantBuilder setNrINSEE(String nrINSEE) {
            this.nrINSEE = nrINSEE;
            return this;
        }

        public RepresentantBuilder setNom(String nom) {
            this.nom = nom;
            return this;
        }

        public RepresentantBuilder setEchelon(int echelon) {
            this.echelon = echelon;
            return this;
        }

        public RepresentantBuilder setBase(double base) {
            this.base = base;
            return this;
        }

        public RepresentantBuilder setNbHeures(double nbHeures) {
            this.nbHeures = nbHeures;
            return this;
        }

        public RepresentantBuilder setChiffreAffaires(double chiffreAffaires) {
            this.chiffreAffaires = chiffreAffaires;
            return this;
        }

        public RepresentantBuilder setTauxCommission(double tauxCommission) {
            this.tauxCommission = tauxCommission;
            return this;
        }

        public RepresentantBuilder setRepresentation(int representation) {
            this.representation = representation;
            return this;
        }

        public Representant createRepresentant() {
            return new Representant(nrINSEE, nom, echelon, base, nbHeures, chiffreAffaires, tauxCommission, representation);
        }
    }



    @Override
    public double getSalaireBrut() {
        Technicien technicien = new Technicien.TechnicienBuilder()
                .setEchelon(this.getEchelon())
                .setBase(this.getBase())
                .setNbHeures(this.getNbHeures())
                .createTechnicien();

        return technicien.getSalaireBrut()+representation*123;
    }
}
