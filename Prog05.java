/* 
Faculdade:  Descomplica
Disciplina: Criacao de aplicacoes e sistemas
Professora: Lucy Mari
Descricao:  Pratica de Estrutura de Controle no Java
Autor:      Denis Correia de Souza
Data:       20/05/2022
*/

import javax.swing.*;

class Prog05
{

    public static void main (String entrada[]) 
    {
        int n1, n2, soma=0;
        char op = 0;
        String msg = " ", msgEntr = "Digite 1 para adição\nDigite 2 para somatória\n";
    
        //Entrada de Dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inteiro"));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
    
        //Provessamento
        switch(op)
        {
         case '1'           :
            {
                if (n1 % 2 == 0 && n2 % 2 == 0)
                {
                    soma = n1 + n2;
                    msg = msg + "Soma de " + n1 + " por " + n2 + " = " + soma + "\n\n";
                }
                break;
            }
         case '2':
            {
                for(int i=1; i<=n2; i++)
                {
                    soma = soma + n1;
                }
                msg = msg + "Somatória de " + n1 + ", " + n2 + " vezes é: " + soma + "\n\n";
                break;
            }
         /*case '3':
            {
                msg = msg + " Tabuada do " + num + " pelo do/while: \n\n";
                int i = 1;
                do
                {
                    msg = msg + num + " x " + i + " = " + num*i + "\n";
                    i++;
                }
                while (i<=10);
                break;
            }*/
            default: JOptionPane.showMessageDialog(null, "Opção invalida, calculos não realizados");
        }
        //saida de resultados
        if (op >= '1' && op <= '3')
        {
            JOptionPane.showMessageDialog(null, msg);
        } 
        System.exit(0); 
    }
    
}
