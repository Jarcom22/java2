import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String nim;
    String nama;
    int nilai;
    String grade;
    String status;

    public Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        tentukanGrade();
    }

    private void tentukanGrade() {
        if (nilai >= 80 && nilai <= 100) {
            grade = "A";
            status = "Lulus";
        } else if (nilai >= 70) {
            grade = "B";
            status = "Lulus";
        } else if (nilai >= 60) {
            grade = "C";
            status = "Lulus";
        } else if (nilai >= 50) {
            grade = "D";
            status = "Tidak Lulus";
        } else if (nilai >= 0 && nilai < 50) {
            grade = "E";
            status = "Tidak Lulus";
        } else {
            grade = "Salah";
            status = "Input nilai anda salah";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        String lanjut;

        do {
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Nilai : ");
            int nilai = Integer.parseInt(input.nextLine());

            if (nilai < 0 || nilai > 100) {
                System.out.println("Input nilai anda salah");
            } else {
                listMahasiswa.add(new Mahasiswa(nim, nama, nilai));
            }

            System.out.print("Tambah data lagi? (y/n): ");
            lanjut = input.nextLine();
            System.out.println("---------------------------------------");
        } while (lanjut.equalsIgnoreCase("y"));

        double totalNilai = 0;
        int lulus = 0, tidakLulus = 0;
        StringBuilder namaLulus = new StringBuilder();
        StringBuilder namaTidakLulus = new StringBuilder();
        int countA = 0, countB = 0, countD = 0;
        StringBuilder namaA = new StringBuilder(), namaB = new StringBuilder(), namaD = new StringBuilder();

        for (Mahasiswa m : listMahasiswa) {
            System.out.println("NIM   : " + m.nim);
            System.out.println("Nama  : " + m.nama);
            System.out.println("Nilai : " + m.nilai);
            System.out.println("Grade : " + m.grade);
            System.out.println("---------------------------------------");

            totalNilai += m.nilai;
            if (m.status.equals("Lulus")) {
                lulus++;
                if (namaLulus.length() > 0) namaLulus.append(", ");
                namaLulus.append(m.nama);
            } else {
                tidakLulus++;
                if (namaTidakLulus.length() > 0) namaTidakLulus.append(", ");
                namaTidakLulus.append(m.nama);
            }

            if (m.grade.equals("A")) { countA++; if (namaA.length() > 0) namaA.append(", "); namaA.append(m.nama); }
            else if (m.grade.equals("B")) { countB++; if (namaB.length() > 0) namaB.append(", "); namaB.append(m.nama); }
            else if (m.grade.equals("D")) { countD++; if (namaD.length() > 0) namaD.append(", "); namaD.append(m.nama); }
        }

        int totalMhs = listMahasiswa.size();
        System.out.println("Jumlah Mahasiswa : " + totalMhs);
        System.out.println("Jumlah Mahasiswa yg Lulus : " + lulus + " yaitu " + namaLulus);
        System.out.println("Jumlah Mahasiswa yg Tidak Lulus : " + tidakLulus + " yaitu " + namaTidakLulus);
        System.out.println("Jumlah Mahasiswa dengan Nilai A = " + countA + " yaitu " + namaA);
        System.out.println("Jumlah Mahasiswa dengan Nilai B = " + countB + " yaitu " + namaB);
        System.out.println("Jumlah Mahasiswa dengan Nilai D = " + countD + " yaitu " + namaD);
        
        if (totalMhs > 0) {
            double rataRata = totalNilai / totalMhs;
            System.out.print("Rata-rata nilai mahasiswa adalah : ");
            for (int i = 0; i < totalMhs; i++) {
                System.out.print(listMahasiswa.get(i).nilai + (i == totalMhs - 1 ? "" : "+"));
            }
            System.out.println(" / " + totalMhs + " = " + rataRata);
        }
    }
}