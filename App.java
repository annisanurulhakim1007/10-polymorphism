import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Polymorphism
        Member memberA = new MemberReguler();
        Member memberB = new MemberSilver();
        Member memberC = new MemberGold();
        Member memberD = new MemberPlatinum();

        // Member Reguler
        System.out.print("Masukkan total belanja Member Reguler : Rp ");
        int belanja1 = scanner.nextInt();
        int totalBayar1 = memberA.hitungTotalBayar(belanja1);
        System.out.println("Total Bayar Member Reguler : Rp " + totalBayar1);

        // Member Silver
        System.out.print("Masukkan total belanja Member Silver : Rp ");
        int belanja2 = scanner.nextInt();
        int totalBayar2 = memberB.hitungTotalBayar(belanja2); // Use memberB for Silver
        System.out.println("Total Bayar Member Silver : Rp " + totalBayar2);

        // Member Gold
        System.out.print("Masukkan total belanja Member Gold : Rp ");
        int belanja3 = scanner.nextInt();
        int totalBayar3 = memberC.hitungTotalBayar(belanja3); // Use memberC for Gold
        System.out.println("Total Bayar Member Gold : Rp " + totalBayar3);

        // Member Platinum
        System.out.print("Masukkan total belanja Member Platinum : Rp ");
        int belanja4 = scanner.nextInt();
        int totalBayar4 = memberD.hitungTotalBayar(belanja4); // Use memberD for Platinum
        System.out.println("Total Bayar Member Platinum : Rp " + totalBayar4);

        // Close the scanner when done
        scanner.close();
    }
}
