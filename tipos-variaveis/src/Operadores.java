public class Operadores {

    public static void main(String[] args) throws Exception {
    int numeroPrimeiro = 5;
    int numeroSegundo = 7;

    System.out.print(numeroPrimeiro + numeroSegundo + "\n"); //soma
    System.out.print(numeroPrimeiro - numeroSegundo + "\n"); //subtração
    System.out.print(numeroPrimeiro * numeroSegundo + "\n"); //multiplicação
    System.out.print(numeroPrimeiro / numeroSegundo + "\n"); //divisão
    System.out.print(numeroPrimeiro % numeroSegundo + "\n"); //resto da divisão

    ////////////////////////////////////////
    int a = 5;
    int b = 6;
    String resultado = "";

    if (a==b)
        resultado = "verdadeiro";
    else
        resultado = "falso";

    System.out.println(resultado);
    // essa mesma sintaxe pode ser abreviada da seguinte forma:

    String resultadoTernario = a==b ?"verdadeiro" : "falso";

    System.out.println(resultadoTernario);
    /////////////////////////////////////////


    // para comparação também é possível utilizar a seguinte forma:

    String nomeUm = "Brown";
    String nomeDois = "Brown";

    System.out.println(nomeUm.equals(nomeDois));




    }
}
