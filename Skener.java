
import java.util.Scanner;


public class Skener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int R = scanner.nextInt();
		int C = scanner.nextInt();
		int ZR = scanner.nextInt();
		int ZC = scanner.nextInt();
		char nextCharacter;
		int j;
		int k;
		int l;
		char output [][] = new char[R*ZR][C*ZC];
		String input="";
		int character= 0;
		
		while(scanner.hasNextLine()){

			input+=(String)scanner.nextLine();
		}
		scanner.close();
	
		System.out.println("input KLAR="+input);
		System.out.println("Second");
		for (int stop=0;stop<(R*C);stop++) {
			//System.out.println("while håller på");
			for(int i=0;i<R*ZR;i+=ZR){
					for(j=0;j<C*ZC;j+=ZC){
						System.out.println("First");
						character++;
						nextCharacter= input.charAt(character);
						System.out.println("Second"+nextCharacter);
						for(k=0;k<ZR;k++){
							for(l=0;l<ZC;l++){
								output[i+k][j+l]= nextCharacter;
								//System.out.println("while håller på 2, j="+j);
								//System.out.println("while håller på 3, l="+l);
								//System.out.println("while håller på 4, k="+k);
							}
						}
					}

				}

			}
		System.out.println("output="+output);
		}
	}
