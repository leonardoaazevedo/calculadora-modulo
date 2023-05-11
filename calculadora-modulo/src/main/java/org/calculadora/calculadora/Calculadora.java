package org.calculadora.calculadora;

public class Calculadora {

    private static final String OPERADOR_SOMA = "+";
    private static final String OPERADOR_SUBTRACAO = "-";
    private static final String OPERADOR_MULTIPLICACAO = "*";
    private static final String OPERADOR_DIVISAO = "/";

    public static Integer calcular(int variavel1, int variavel2, String operador) {

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

