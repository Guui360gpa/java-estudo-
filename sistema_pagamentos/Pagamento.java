package sistema_pagamentos;

import java.math.BigDecimal;

public class Pagamento {

    private BigDecimal valor;

    public Pagamento(BigDecimal valor){
        if (valor.compareTo(BigDecimal.ZERO) >= 0){
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("O valor do pagamento não pode ser negativo.");
        }
    }

    public BigDecimal getValor(){
        return this.valor;
    }

    public BigDecimal calcularTaxa(){
        return BigDecimal.ZERO;
    }

    public BigDecimal calcularTotal(){
        return this.valor.multiply(calcularTaxa()).add(valor);
    }

    public void processar(){
        System.out.println("Processando valor do pagamento de: R$" + this.valor);
    }
    

}
