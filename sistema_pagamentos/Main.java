package sistema_pagamentos;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        

    Pagamento pagamentoPix = new PagamentoPix(new BigDecimal("100"));
    Pagamento pagamentoCartao = new PagamentoCartao(new BigDecimal("100"),3);

    double taxaPix = pagamentoPix.calcularTaxa().doubleValue() ;
    double totPix = pagamentoPix.calcularTotal().doubleValue();
    System.out.println("\nTaxa: " + taxaPix + " Total: " + totPix);
    pagamentoPix.processar();

    double taxaCartao = pagamentoCartao.calcularTaxa().doubleValue();
    double totCartao = pagamentoCartao.calcularTotal().doubleValue();
    System.out.println("\nTaxa: " + taxaCartao + " Total: " + totCartao);
    pagamentoCartao.processar();

    

}


}
