class Programa01
{
    public static void main (String entrada[])
    {
        //variaveis
        int NumInt;
        double NumReal, soma;
        char Caracter;

        //Entradas de dados
        NumInt = Integer.parseInt(entrada[0]);
        NumReal = Double.parseDouble(entrada[1]);
        Caracter = (entrada[3]).charAt(0);

        //processamento
        soma = (double) NumInt + NumReal;

        //Saida de dados

        System.out.println((double) NumInt + " + " + NumReal + " = " + soma + " sinal " + Caracter);

        System.exit(0);
    }

}
