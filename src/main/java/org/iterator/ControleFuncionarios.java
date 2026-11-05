package org.iterator;
import java.util.Iterator;

public class ControleFuncionarios {

    public static Integer contarFuncionariosAtivosDepartamento(Departamento departamento) {
        int quantidade = 0;
        for (Funcionario funcionario : departamento) {
            if (funcionario.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalFuncionariosDepartamento(Departamento departamento) {
        int quantidade = 0;
        for (Iterator a = departamento.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}