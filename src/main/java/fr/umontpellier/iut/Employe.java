package fr.umontpellier.iut;

public class Employe {
    private String nrINSEE;
    private String nom;
    private int echelon;
    private double base;
    private double nbHeures;
    private double salaireBrut;
    private double salaireNet;

    public Employe(String nrINSEE, String nom, int echelon, double base, double nbHeures) {
        this.nrINSEE = nrINSEE;
        this.nom = nom;
        this.echelon = echelon;
        this.base = base;
        this.nbHeures = nbHeures;
        this.salaireBrut = getSalaireBrut();
        this.salaireNet = getSalaireNet();
    }

    public static class EmployeBuilder {
        private String nrINSEE;
        private String nom;
        private int echelon;
        private double base;
        private double nbHeures;


        public EmployeBuilder setNrINSEE(String nrINSEE) {
            this.nrINSEE = nrINSEE;
            return this;
        }

        public EmployeBuilder setNom(String nom) {
            this.nom = nom;
            return this;
        }

        public EmployeBuilder setEchelon(int echelon) {
            this.echelon = echelon;
            return this;
        }

        public EmployeBuilder setBase(double base) {
            this.base = base;
            return this;
        }


        public EmployeBuilder setNbHeures(double nbHeures) {
            this.nbHeures = nbHeures;
            return this;
        }



        public Employe createEmploye() {
            return new Employe(nrINSEE, nom, echelon, base, nbHeures);
        }
    }

    public double getSalaireBrut() {
        salaireBrut = base * nbHeures;
        return salaireBrut;
    }

    public double getSalaireNet() {
        salaireNet = getSalaireBrut()*0.8;
        return salaireNet;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nrINSEE='" + nrINSEE + '\'' +
                ", nom='" + nom + '\'' +
                ", echelon=" + echelon +
                ", base=" + base +
                ", nbHeures=" + nbHeures +
                ", brutS=" + salaireBrut +
                ", netS=" + salaireNet +
                '}';
    }
}
