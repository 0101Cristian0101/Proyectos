package palindromo;
import java.util.*;
public class Palindromo {
	//Alumno: Tarazona Silva Cristian

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
        System.out.print("Introdusca una frase: ");
        String cadena=sc.nextLine();
        cadena=cadena.replace(" ", "");
        cadena=cadena.replace(",", "");
        cadena=cadena.replace(".", "");
        
        int fin = cadena.length()-1;
        int ini=0; 
        boolean aux2=true;
        
        String aux=cadena.toLowerCase();
        
		while(ini < fin){
		    if(aux.charAt(ini)!=aux.charAt(fin)){
		        aux2=false;
		    }
		ini++;
		fin--;
		}
		if(aux2)
		    System.out.print("Es palindromo.");
		else
		    System.out.print("No es palindromo.");
		}
		}