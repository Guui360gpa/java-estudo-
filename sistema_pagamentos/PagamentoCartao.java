package sistema_pagamentos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PagamentoCartao extends Pagamento{

    private int parcelas;

    public PagamentoCartao(BigDecimal valor) {
        super(valor);
    }

    public PagamentoCartao(BigDecimal valor, int parcelas) {
        super(valor);
        this.parcelas = parcelas;
    }



    @Override
    public BigDecimal calcularTaxa(){
        return new BigDecimal(0.03);
    }

    @Override
    public void processar(){
        System.out.println(
            "Processando valor do pagamento com Cartão de: R$ " + getValor() +
            "\nParcelado em " + parcelas + "x = R$ " +
            getValor().divide(new BigDecimal(parcelas), 2, RoundingMode.HALF_UP) +
            "/mês."
        );
    }

}
