import java.util.Scanner;

public class Soal04 {

	private static final int desainer = 600000;
	private static final int programmer = 1200000;
	private static final int writer = 400000;
	private static final int marketing = 500000;
	
	public static void main(final String[] args) {
		Scanner p = new Scanner(System.in);
		String  kode = p.nextLine();
		int jumlahJam = p.nextInt();
		int honor = 30000;
		
		switch (kode) {
			case "DES":
			int jumlah = jumlahJam * honor;
			int bonus = jumlah + (jumlah / 100 * 7);
			int akhir = bonus + marketing;
			break;
			case "PRG":
		}
}
}