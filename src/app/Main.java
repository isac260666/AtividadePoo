
package app;

import entities.Funcionario;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        
        func1.setNome("Daniel");
        func1.setIdade(29);
        func1.setSalario(300000f);
        func1.setMatricula(123456);
        func1.setSexo('M');
        
        func2.setNome("Daniela");
        func2.setIdade(40);
        func2.setSalario(500000.00f);
        func2.setMatricula(654321);
        func2.setSexo('F');
        
        System.out.println(func1.toString());
        System.out.println("*************************************************");
        System.out.println(func2.toString());
    }
}
