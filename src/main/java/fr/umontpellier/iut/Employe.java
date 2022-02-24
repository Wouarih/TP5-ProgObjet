package fr.umontpellier.iut;

public class Employe {
    private String nrINSEE;
    private String nom;
    private int echelon;
    private double base;
    private double nbHeures;
    private double brutS;
    private double netS;

    public Employe(String nrINSEE, String nom, int echelon, double base, double nbHeures, double brutS, double netS) {
        this.nrINSEE = nrINSEE;
        this.nom = nom;
        this.echelon = echelon;
        this.base = base;
        this.nbHeures = nbHeures;
        this.brutS = brutS;
        this.netS = netS;
    }

    public static class EmployeBuilder {
        private String nrINSEE;
        private String nom;
        private int echelon;
        private double base;
        private double nbHeures;
        private double brutS;
        private double netS;

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


        public void setBrutS(double brutS) {
            this.brutS = brutS;
        }

        public void setNetS(double netS) {
            this.netS = netS;
        }

        public Employe createEmploye() {
            return new Employe(nrINSEE, nom, echelon, base, nbHeures, brutS, netS);
        }
    }

    public double getSalaireBrut() {
        brutS = base * nbHeures;
        return brutS;
    }

    public double getSalaireNet() {
        netS = getSalaireBrut()/0.8;
        return netS;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nrINSEE='" + nrINSEE + '\'' +
                ", nom='" + nom + '\'' +
                ", echelon=" + echelon +
                ", base=" + base +
                ", nbHeures=" + nbHeures +
                ", brutS=" + brutS +
                ", netS=" + netS +
                '}';
    }
}
