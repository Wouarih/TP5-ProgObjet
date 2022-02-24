package fr.umontpellier.iut;

public class GestionEmployes {

    public static void main(String[] args) {

    Employe e1 = new Employe.EmployeBuilder().createEmploye();

        e1 = new Employe.EmployeBuilder()
                .setNrINSEE("1")
                .setNom("Oiry")
                .setBase(15)
                .setNbHeures(35)
                .createEmploye();

        System.out.println(e1);

    }

}
