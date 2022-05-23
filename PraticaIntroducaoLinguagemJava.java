/* 
Faculdade:  Descomplica
Disciplina: Criacao de aplicacoes e sistemas
Professora: Lucy Mari
Descricao:  Pratica de aplicacao JAVA
Autor:      Denis Correia de Souza
Data:       19/05/2022
*/

import javax.swing.*;

class PraticaIntroducaoLinguagemJava {

    public static void main (String entrada[]) 
        {
        int n1, n2, div;
        double pot;
        String msg = " ";
    
        //Entrada de Dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
    
        //Provessamento
        div = (int)n1 / (int)n2;
        pot = Math.pow(n1, n2);
            
        //Saida de Dados
        msg = "Os numeros digitados - n1 = " + n1 + " n2 = " + n2 + "\n";
        msg = msg + "quociente da divisao de n1 por n2 = " + div + "\n" ;
        msg = msg + "potencia de " + n1 + " por " + n2 + " = " + pot  + " \n";
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
        }
    
}
