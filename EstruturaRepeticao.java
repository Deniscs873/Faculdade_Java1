/* 
Faculdade:  Descomplica
Disciplina: Criacao de aplicacoes e sistemas
Professora: Lucy Mari
Descricao:  Pratica de Estrutura de Controle no Java
Autor:      Denis Correia de Souza
Data:       20/05/2022
*/

import javax.swing.*;

class EstruturaRepeticao
{

    public static void main (String entrada[]) 
    {
        int num;
        char op = 0;
        String msg = " ", msgEntr = "Digite 1 para repetição for\nDigite 2 para while.\nDigite 3 para repetição do/while ";
    
        //Entrada de Dados
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inteiro"));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
    
        //Provessamento
        switch(op)
        {
         case '1'           :
            {
                msg = msg + " Tabuada do " + num + " pelo for: \n\n";
                for(int i=1; i<=10; i++)
                {
                    msg = msg + num + " x " + i + " = " + num*i + "\n";
                }
                break;
            }
         case '2':
            {
                msg = msg + " Tabuada do " + num + " pelo while: \n\n";
                int i = 1;
                while(i<=10)
                {
                    msg = msg + num + " x " + i + " = " + num*i + "\n";
                    i++;
                }
                break;
            }
         case '3':
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
            }
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
