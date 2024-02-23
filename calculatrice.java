import java.util.Scanner;
public class calculatrice {
	
	
			public static double addition(double x,double y){
				return x+y;
			}
			public static double soustraction(double x,double y){
				return x-y;
			}	
			public static double multiple(double x,double y){
				return x*y;
			}
			public static double div(double x,double y){
				return x/y;
			}

			
		public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Entrez le premier nombre :");
		        double N1 = scanner.nextDouble();

		        System.out.println("Entrez le deuxième nombre :");
		        double N2 = scanner.nextDouble();

		        System.out.println("Choisissez une opération : Addition, Soustraction, Multiplication, Division");
		        char operation = scanner.next().charAt(0);

		        double resultat=0;

		        switch(operation) {
		            case '+':
		                resultat = addition(N1,N2);
		                break;
		            case '-':
		                resultat = soustraction(N1, N2);
		                break;
		            case '*':
		                resultat =multiple(N1,N2);
		                break;
		            case '/':
		                if (N2 != 0) {
		                	resultat= div(N1,N2);
		                	break;}
		                default:
		                	System.out.println("erreur " );
		                	return;
		                  }
		        System.out.println("resultat : " + resultat);
		        
		                }
				
		
		
}
