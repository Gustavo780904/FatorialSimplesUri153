import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, fatorial = 1;

		N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			fatorial *= i;
		}

		System.out.println(fatorial);

		sc.close();

	}

}
