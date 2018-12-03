import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendaTest {

    private LogicaVenda logicaVenda;
    
    public VendaTest() {
        logicaVenda = new LogicaVenda();
        logicaVenda.addImposto(new IPI());        
        logicaVenda.addImposto(new ICMS());
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
        assertEquals(11700, logicaVenda.getValorTotal(venda1), 0.1);
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
        assertEquals(10000, logicaVenda.getValorTotal(venda1), 0.1);
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
        assertEquals(11000, logicaVenda.getValorTotal(venda1), 0.1);
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
        logicaVenda.finalizar(venda1);
        logicaVenda.finalizar(venda2);
        assertEquals(128.7, Venda.getFaturamentoGeral(), 0.1);
    }
}


