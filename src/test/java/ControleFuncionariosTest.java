import org.iterator.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleFuncionariosTest {

    @Test
    void deveContarFuncionariosAtivosDepartamento() {
        Departamento departamento = new Departamento(
                new Funcionario("Marco", true),
                new Funcionario("Antonio", true),
                new Funcionario("Jose", false),
                new Funcionario("Maria", true)
        );
        assertEquals(3, ControleFuncionarios.contarFuncionariosAtivosDepartamento(departamento));
    }

    @Test
    void deveContarTotalFuncionariosDepartamento() {
        Departamento departamento = new Departamento(
                new Funcionario("Marco", true),
                new Funcionario("Antonio", true),
                new Funcionario("Jose", false),
                new Funcionario("Maria", true)
        );
        assertEquals(4, ControleFuncionarios.contarTotalFuncionariosDepartamento(departamento));
    }

}