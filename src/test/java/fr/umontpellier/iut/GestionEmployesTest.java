package fr.umontpellier.iut;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestionEmployesTest {

    private Employe employe;

    @BeforeEach
    public void init(){
        employe = new Employe("1", "toto", 1, 10, 20);
    }

    @Test
    public void test_if_main_method_was_implemented() {
        assertDoesNotThrow(() -> GestionEmployes.main(new String[1]));
    }

    @Test
    public void test_salaire_brut_retourne_salaire_brut(){
        double brut = employe.getSalaireBrut();
        assertEquals(200, brut);
    }

    @Test
    public void test_salaire_net_retourne_80pour100_salaire_brut(){
        double net = employe.getSalaireNet();
        assertEquals(160, net);
    }


}