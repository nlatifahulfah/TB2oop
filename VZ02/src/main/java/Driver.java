import java.util.Scanner;

public class Driver {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
    
		VirtualZoo vz = new VirtualZoo("input.txt");
		int n;
		
		// System.out.println("1. Display Virtual Zoo All");
		// System.out.println("2. Display Virtual Zoo");
		// System.out.println("3. Tour Virtual Zoo");
		// System.out.println("4. Count Total Animal Feeds");
		// System.out.println("0. Exit");
		// n = scanner.nextInt();
		
		// if (n == 1) {
		// 	vz.printVirtualZoo();
		// } else if (n == 2) {
		// 	int kiri,atas,kanan,bawah;

		// 	System.out.println("Batas kiri: "); kiri = scanner.nextInt();
		// 	System.out.println("Batas atas: ");  atas = scanner.nextInt();
		// 	System.out.println("Batas kanan: ");  kanan = scanner.nextInt();
		// 	System.out.println("Batas bawah: ");  bawah = scanner.nextInt();
		// 	if (vz.isInRage(kiri,atas,kanan,bawah)) {
		// 		vz.printVirtualZoo(kiri,atas,kanan,bawah);
		// 	} else {
		// 		System.out.println("Out of rage ");
		// 	}

		// } else if (n == 3) {
		// 	vz.tour();
		// } else if (n == 4) {
		// 	System.out.println("Total makanan : " + vz.getTotalMakanan());
		// }
	}
	
}