package sistema_pagamentos;
import java.math.BigDecimal;
public class PagamentoPix extends Pagamento{

    public PagamentoPix(BigDecimal valor){
        super(valor);
    }

    @Override
    public BigDecimal calcularTaxa(){
        return BigDecimal.ZERO;
    }

    @Override
    public void processar(){
        System.out.println("Processando pagamento via Pix de: R$" + getValor());
    }

}
