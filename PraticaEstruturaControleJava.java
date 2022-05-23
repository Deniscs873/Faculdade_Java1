/* 
Faculdade:  Descomplica
Disciplina: Criacao de aplicacoes e sistemas
Professora: Lucy Mari
Descricao:  Pratica de Estrutura de Controle no Java
Autor:      Denis Correia de Souza
Data:       20/05/2022
*/

import javax.swing.*;

class PraticaEstruturaControleJava
{

    public static void main (String entrada[]) 
    {
        int n1, n2, mult=1;
        char op = 0;
        String msg = "", msgEntr = "Digite 1 para multiplicacao\nDigite 2 para produtoria\n";
    
        //Entrada de Dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inteiro para n1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro para n2"));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
    
        //Provessamento
        switch(op)
        {
         case '1':
            {
                if (n1>0 && n2>0)
                {
                    mult = n1 * n2;
                    msg = msg + "O Produto de " + n1 + " por " + n2 + " = " + mult + "\n\n";
                }
                break;
            }
         case '2':
            {
                for(int i=1; i<=n2; i++)
                {
                    mult = mult * n1;
                }
                msg = msg + "A produtoria de " + n1 + ", " + n2 + " vezes e: " + mult + "\n\n";
                break;
            }
          default: JOptionPane.showMessageDialog(null, "Opcao invalida, calculos nao realizados");
        }
        //saida de resultados
        if (op >= '1' && op <= '3')
        {
            JOptionPane.showMessageDialog(null, msg);
        } 
        System.exit(0); 
    }
    
}
