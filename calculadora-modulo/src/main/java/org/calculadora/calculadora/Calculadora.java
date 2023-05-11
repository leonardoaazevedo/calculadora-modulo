package org.calculadora.calculadora;

import static org.calculadora.constantes.ConstantesCalculadora.*;

public class Calculadora {

    public Integer calcular(int variavel1, int variavel2, String operador) {

        if(OPERADOR_SOMA.equals(operador)) {
            return variavel1 + variavel2;
        }

        if(OPERADOR_SUBTRACAO.equals(operador)) {
            return variavel1 - variavel2;
        }

        if(OPERADOR_MULTIPLICACAO.equals(operador)) {
            return variavel1 * variavel2;
        }

        if(OPERADOR_DIVISAO.equals(operador)) {
            return variavel1/variavel2;
        }

        return null;
    }

}

