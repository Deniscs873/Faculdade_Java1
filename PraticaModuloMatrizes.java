/* 
Faculdade:  Descomplica
Disciplina: Criacao de aplicacoes e sistemas
Professora: Lucy Mari
Descricao:  Pratica Modulo e Matrizes
Autor:      Denis Correia de Souza
Data:       23/05/2022
*/
import javax.swing.*;

class PraticaModuloMatrizes {
    public static void soma (int vetor[])
    {
        int s=0;
        for (int i=0; i<vetor.length; i++)
        {
            s = s + vetor[i];
        }
        JOptionPane.showMessageDialog(null, "A soma eh " + s);
    }
    public static int produtoria(int vetor[])
    {
        int p=1;
        for (int i=0; i<vetor.length; i++)
        {
            p = p * vetor[i];
        }
        return p;
    }
    public static void main(String entrada[])
    {
        int r, vetor[] = new int [5];
        String msg = "Vetor = ";
        for (int i=0; i<vetor.length; i++)
        {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro para posicao " + i));
            msg = msg + vetor[i] + " ";
        }
        msg = msg + "\n";
        soma(vetor);
        r = produtoria(vetor);
        JOptionPane.showMessageDialog(null, "A produtoria eh " + r);
        System.exit(0);
    }
}
