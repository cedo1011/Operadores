public class Operadores {
    public static void main(String[] args) {
        int num = 11;

        String msg = ((num % 2) == 0) ? "Número Par" : "Número Impar"; 
        
        if((num % 2) == 0) {
            msg = "Número Par";
        } else {
            msg = "Número Impar";
        }

    // String msg = ((num > 10) && (num < 100)) ? 
    // "Número maior que 10 e menor que 100" : "Número menor ou igual à 10 ou maior que 100";

    // if((num > 10) && (num < 100)) {
    //   msg = "Número maior que 10 e menor que 100";
    // } else {
    //   msg = "Número menor ou igual à 10 ou maior que 100";
    // }

       System.out.println(msg);
     }
}