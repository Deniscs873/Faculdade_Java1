import javax.swing.*;

class Programa03 {

    public static void main (String entrada[]) 
        {
        int n1, n2, mod;
        double raiz1, raiz2;
        String msg = " ";
    
        //Entrada de Dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
    
        //Provessamento
        mod = n1 % n2;
        raiz1 = Math.sqrt(n1);
        raiz2 = Math.sqrt(n2);
    
        //Saida de Dados
        msg = "n1 = " + n1 + " n2 = " + n2 + "\n";
        msg = msg + "resto da divisao de n1 por n2 = " + mod + "\n" ;
        msg = msg + "raiz quadrada de " + n1 + " = " + raiz1 + " \n";
        msg = msg + "raiz quadrada de " + n2 + " = " + raiz2 + " \n";
        System.out.println(msg);
        System.exit(0);
        }
    
}
