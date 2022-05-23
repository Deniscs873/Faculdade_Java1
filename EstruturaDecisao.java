/* 
Faculdade:  Descomplica
Disciplina: Criacao de aplicacoes e sistemas
Professora: Lucy Mari
Descricao:  Pratica de Estrutura de Controle no Java
Autor:      Denis Correia de Souza
Data:       20/05/2022
*/

import javax.swing.*;

class EstruturaDecisao
{

    public static void main (String entrada[]) 
    {
        int num;
        char op = 0;
        String msg = " ", msgEntr = "Digite 1 para par/impar\nDigite 2 para positivo/negativo";
    
        //Entrada de Dados
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inteiro"));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
    
        //Provessamento
        switch(op)
        {
         case '1'           :
            {
                if(num % 2 == 0)
                {
                     msg = msg + num + " é par.\n";
                }
                else
                {
                    msg = msg + num + " é impar.\n";
                }
            break;
            }
         case '2':
            {
                if(num > 0)
                {
                    msg = msg + num + " é positivo.\n";
                }
                else
                {
                   msg = msg + num + " é negaivo.\n";
                }
            }
            break;
            default: JOptionPane.showMessageDialog(null, "Opção invalida, calculos não realizados");
        }
        //saida de resultados
        if (op == '1' || op == '2')
        {
            JOptionPane.showMessageDialog(null, msg);
        } 
        System.exit(0); 
    }
    
}
