
package app;

import entities.Funcionario;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        
        func1.setNome("Francisco");
        func1.setIdade(60);
        func1.setSalario(400000f);
        func1.setMatricula(145654);
        func1.setSexo('M');
        
        func2.setNome("Calos");
        func2.setIdade(40);
        func2.setSalario(500000.00f);
        func2.setMatricula(843237);
        func2.setSexo('M');
        
        System.out.println(func1.toString());
        System.out.println("*************************************************");
        System.out.println(func2.toString());
    }
}
