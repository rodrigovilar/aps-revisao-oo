

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VendaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VendaTest
{
    /**
     * Default constructor for test class VendaTest
     */
    public VendaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void venderUmSmartPhone() {
        Produto produto1 = new Produto();
        produto1.setCodigoBarras(123124);
        produto1.setNome("iPhone XS");
        produto1.setPrecoReferencia(10000);
        Venda venda1 = new Venda();
        venda1.setId(1);
        venda1.setData("26/11/2018");
        LinhaVenda linhaVen1 = new LinhaVenda();
        linhaVen1.setProduto(produto1);
        linhaVen1.setQuantidade(1);
        linhaVen1.setSequencia(1);
        venda1.addLinha(linhaVen1);
        assertEquals(11700, venda1.getValorTotal(), 0.1);
    }
    
    @Test
    public void venderUmSmartPhoneIsentoICMS() {
        Produto produto1 = new Produto();
        produto1.setCodigoBarras(123124);
        produto1.setNome("iPhone XS");
        produto1.setPrecoReferencia(10000);
        produto1.setIsentoICMS(true);
        Venda venda1 = new Venda();
        venda1.setId(1);
        venda1.setData("26/11/2018");
        LinhaVenda linhaVen1 = new LinhaVenda();
        linhaVen1.setProduto(produto1);
        linhaVen1.setQuantidade(1);
        linhaVen1.setSequencia(1);
        venda1.addLinha(linhaVen1);
        assertEquals(10000, venda1.getValorTotal(), 0.1);
    }
    
    @Test
    public void venderUmSmartPhoneIsentoICMSComIPI() {
        Produto produto1 = new Produto();
        produto1.setCodigoBarras(123124);
        produto1.setNome("iPhone XS");
        produto1.setPrecoReferencia(10000);
        produto1.setIsentoICMS(true);
        produto1.setTaxaIPI(0.10);
        Venda venda1 = new Venda();
        venda1.setId(1);
        venda1.setData("26/11/2018");
        LinhaVenda linhaVen1 = new LinhaVenda();
        linhaVen1.setProduto(produto1);
        linhaVen1.setQuantidade(1);
        linhaVen1.setSequencia(1);
        venda1.addLinha(linhaVen1);
        assertEquals(11000, venda1.getValorTotal(), 0.1);
    }

    @Test
    public void faturamentoGeral()
    {
        Produto produto1 = new Produto();
        produto1.setNome("Laranja");
        produto1.setPrecoReferencia(1);
        Venda venda1 = new Venda();
        LinhaVenda linhaVen1 = new LinhaVenda();
        linhaVen1.setProduto(produto1);
        linhaVen1.setQuantidade(100);
        Venda venda2 = new Venda();
        venda1.addLinha(linhaVen1);
        LinhaVenda linhaVen2 = new LinhaVenda();
        linhaVen2.setProduto(produto1);
        linhaVen2.setQuantidade(10);
        venda2.addLinha(linhaVen2);
        venda1.finalizar();
        venda2.finalizar();
        assertEquals(128.7, Venda.getFaturamentoGeral(), 0.1);
    }
}


