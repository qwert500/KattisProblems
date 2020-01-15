import java.util.Scanner;

public class reversedBinaryNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String reverse = "";
		sc.close();
		
		String bin = Integer.toBinaryString(input);
		for(int i = bin.length() - 1; i > -1; i--)
        {
            reverse = reverse + bin.charAt(i);
        }
		int result = Integer.parseInt(reverse, 2);
		System.out.println(result);
	}

}
