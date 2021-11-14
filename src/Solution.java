
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;




// ENUNCIADO:

// Capicua_:

/*  Fes un programa que llegeixi un nombre enter N i escrigui si és capicua o no. Considerarem també capicues els nombres enters d'una xifra.

Si el nombre és capicua s'imprimeix TRUE, sinó s'imprimeix FALSE.

Input Format

N: nombre enter d'entrada.

Constraints

Suposem N enter positiu.

Output Format

{TRUE | FALSE}

Sample Input 0

12321
Sample Output 0

TRUE
Sample Input 1

123456
Sample Output 1

FALSE
Sample Input 2

45854
Sample Output 2

TRUE

 */










public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int rest;
        int div = N;
        int inv = 0;



        while (div != 0)
        {
            rest = div % 10;
            div = div / 10;
            inv = inv * 10 + rest;

        }

        if (inv == N)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

    }

}
