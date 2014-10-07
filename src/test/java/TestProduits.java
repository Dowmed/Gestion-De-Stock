/**
 * Created by aroche on 07/10/14.
 */
import org.junit.Before;
import org.junit.Test;


import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class TestProduits {

    @Before
    public void setUp() throws Exception {
        LeProduit = new UnProduit("1","Super Produit Test");
    }

    @Test
    public void RécupèreLeNomDunProduit(){
        assertThat(LeProduit.RécupèreLeLibéllé()).isEqualTo("Super Produit Test");
    }

    private UnProduit LeProduit;
}
