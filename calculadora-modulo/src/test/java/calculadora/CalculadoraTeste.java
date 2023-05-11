package calculadora;

import org.calculadora.calculadora.Calculadora;
import org.calculadora.constantes.ConstantesCalculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTeste {

    Calculadora calculadora = new Calculadora();

    @Test
    void somaTeste() {
        Integer resultadoSoma = calculadora.calcular(12, 3, ConstantesCalculadora.OPERADOR_SOMA);

        assertEquals(15, resultadoSoma);
    }

    @Test
    void subtracaoTeste() {
        Integer resultadoSoma = calculadora.calcular(12, 3, ConstantesCalculadora.OPERADOR_SUBTRACAO);

        assertEquals(9, resultadoSoma);
    }

    @Test
    void multiplicaoTeste() {
        Integer resultadoSoma = calculadora.calcular(12, 3, ConstantesCalculadora.OPERADOR_MULTIPLICACAO);

        assertEquals(36, resultadoSoma);
    }

    @Test
    void divisaoTeste() {
        Integer resultadoSoma = calculadora.calcular(12, 3, ConstantesCalculadora.OPERADOR_DIVISAO);

        assertEquals(4, resultadoSoma);
    }
}
