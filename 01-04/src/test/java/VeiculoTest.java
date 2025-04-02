import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {
    @Test
    public void testCalcularCusto() {
        Veiculo veiculo = new Veiculo("Gol", 100);
        assertEquals(600, veiculo.calcularCusto(veiculo.valorDiaria, 6, 0));
    }

    @Test
    public void testDesconto() {
        Veiculo veiculo = new Veiculo("Fiorino", 80);
        assertEquals(576, veiculo.calcularCusto(veiculo.valorDiaria, 8, 0));
    }

    @Test
    public void TestCalcularMultas() {
        Veiculo veiculo = new Veiculo("Camaro", 200);
        assertEquals(1600, veiculo.calcularCusto(veiculo.valorDiaria, 5, 3));
    }


}
