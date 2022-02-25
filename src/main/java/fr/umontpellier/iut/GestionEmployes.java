package fr.umontpellier.iut;

public class GestionEmployes {

    public static void main(String[] args) {

    Employe e1 = new Employe.EmployeBuilder().createEmploye();
    Employe e2 = new Employe.EmployeBuilder().createEmploye();
    Employe e3 = new Employe.EmployeBuilder().createEmploye();
    Employe e4 = new Employe.EmployeBuilder().createEmploye();

        e1 = new Commercial.EmployeBuilder()
                .setNrINSEE("1")
                .setEchelon(1)
                .setNom("Oiry")
                .setBase(15)
                .setNbHeures(35)
                .createEmploye();

        e2 = new Employe.EmployeBuilder()
                .setNrINSEE("2")
                .setNom("Abat")
                .setBase(15)
                .setNbHeures(35)
                .createEmploye();

        e3 = new Employe.EmployeBuilder()
                .setNrINSEE("3")
                .setNom("Thomas")
                .setBase(20)
                .setNbHeures(35)
                .createEmploye();

        e4 = new Employe.EmployeBuilder()
                .setNrINSEE("4")
                .setNom("Haddouch")
                .setBase(25)
                .setNbHeures(30)
                .createEmploye();

        //System.out.println(e1);
        //System.out.println(e2);
        //System.out.println(e3);
        //System.out.println(e4);

        Technicien t1 = new Technicien("t1", "tech", 2, 12,35);
        //t1.effectuerTacheTechnique();


        Commercial c1 = new Commercial("c1", "commercial", 1, 20, 30, 30000, 20);
        //c1.negocierTransaction(5000);

        Fabricant f1 = new Fabricant("f1", "fabriquant", 3, 14, 35, 100, 10);
        //f1.fabriquerProduits(50);
        System.out.println(f1);

    }

}
