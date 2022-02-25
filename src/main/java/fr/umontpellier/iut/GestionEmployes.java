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

        Technicien t1 = new Technicien.TechnicienBuilder().setNrINSEE("t1").setNom("tech").setEchelon(1).setBase(12).setNbHeures(35).createTechnicien();
        //t1.effectuerTacheTechnique();
        //System.out.println(t1);


        Commercial c1 = new Vendeur.VendeurBuilder().setNrINSEE("c1").setNom("commercial").setEchelon(1).setBase(20).setNbHeures(30).setChiffreAffaires(3000).setTauxCommission(20).createVendeur();
        //c1.negocierTransaction(5000);
        //System.out.println(c1);


        Fabricant f1 = new Fabricant.FabricantBuilder().setNrINSEE("f1").setNom("fabriquant").setEchelon(3).setBase(14).setNbHeures(35).setNbUnitesProduites(100).setTauxCommissionUnite(10).createFabricant();
        f1.fabriquerProduits(50);
        //System.out.println(f1);

        Employe e5 = new Fabricant.FabricantBuilder().setNrINSEE("f2").setNom("fab").setEchelon(2).setBase(10).setNbHeures(35).setNbUnitesProduites(100).setTauxCommissionUnite(10).createFabricant();
        System.out.println(e5);
        //e5.fabriquerProduits(20); réponse question 5 exercice 2 dans le document texte





    }

}
