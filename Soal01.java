import java.util.Scanner;

public class Soal01 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		int angka1 = input.nextInt();
		int angka2 = input.nextInt();
		int angka3 = input.nextInt();
		int angka4 = input.nextInt();
		int angka5 = input.nextInt();
		
		String hasil = String.format("%s %s\n%s %s\n%s %s\n%s %s\n%s %s", angka1, ab(angka1), angka2, ab(angka2), angka3, ab(angka3), angka4, ab(angka4), angka5, ab(angka5));

		System.out.println(hasil);
	}

	private static String ab(int angkaBeda) {
		int ratusan = angkaBeda / 100;
		int puluhan = (angkaBeda / 10) % 10;
		int satuan = angkaBeda % 10;

		if (ratusan > puluhan) {
			return "tidak valid";
		} if (puluhan > satuan) {
			return "tidak valid";
		} if (ratusan == satuan && ratusan == puluhan && puluhan == satuan) {
			return "tidak valid";
		} if (satuan % 2 == 1) {
			return "tidak valid";
		} else {
			return "valid";
		}
	}
}