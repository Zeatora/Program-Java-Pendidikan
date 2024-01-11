package com.mycompany.uas_pbo_salman;

import static com.mycompany.uas_pbo_salman.Data_Extrakurikurer.ListExtrakurikurer;
import java.util.ArrayList;
import java.util.Scanner;

class Data_Siswa {
    static ArrayList<String> ListNama = new ArrayList<>();
    public void ShowMenuDataS() {
        Scanner NumberDataM = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~Menu Siswa~~~~~~~~~~~~~");
        System.out.println("[1] Input Data Siswa");
        System.out.println("[2] Lihat Data Siswa");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan pilihan Anda: ");
        System.out.println(" ");
        int pilihan = NumberDataM.nextInt();
        this.pilihMenuDM(pilihan);
    }
    
    public void pilihMenuDM(int pilihan) {
        switch(pilihan){
            case 1:
                InputData();
            break;
            
            case 2:
                ReadData();
            break;
        }
    }
    
    static void ReadData() {
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~Data Siswa~~~~~~~~~~~~~");

        // Print the names from the nameList
        for (String name : ListNama) {
            System.out.println(name);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
    }
    
    static void InputData() {
    
    Scanner InputNama = new Scanner(System.in);
    System.out.println("Masukkan jumlah nama yang ingin diinput: ");
    int totalNames = InputNama.nextInt();

    InputNama.nextLine();
    
    System.out.println("Masukkan nama-nama: ");
    for (int i = 0; i < totalNames; i++) {
        String name = InputNama.nextLine();
            ListNama.add(name);
        }
    }
}

class Data_Guru {
    static ArrayList<String> ListNama = new ArrayList<>();
    public void ShowMenuDataG() {
        Scanner NumberDataM = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~Menu Guru~~~~~~~~~~~~~");
        System.out.println("[1] Input Data Guru");
        System.out.println("[2] Lihat Data Guru");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan pilihan Anda: ");
        System.out.println(" ");
        int pilihan = NumberDataM.nextInt();
        this.pilihMenuDG(pilihan);
    }
    
    public void pilihMenuDG(int pilihan) {
        switch(pilihan){
            case 1:
                InputData();
            break;
            
            case 2:
                ReadData();
            break;
        }
    }
    
    static void ReadData() {
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~Data Guru~~~~~~~~~~~~~");

        // Print the names from the nameList
        for (String name : ListNama) {
            System.out.println(name);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
    }
    
    static void InputData() {
    
    Scanner InputNama = new Scanner(System.in);
    System.out.println("Jumlah nama yang akan di input: ");
    int totalNames = InputNama.nextInt();

    InputNama.nextLine();
    
    System.out.println("Masukkan nama-namanya: ");
    for (int i = 0; i < totalNames; i++) {
        String name = InputNama.nextLine();
            ListNama.add(name);
        }
    }
}

class Data_Extrakurikurer {
    static ArrayList<String> ListExtrakurikurer = new ArrayList<>();
    
    public void ShowMenuDataEK() {
        Scanner NumberDataM = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("~~~~~~~~Menu Extrakurikurer~~~~~~~~~");
        System.out.println("[1] Input Data Extrakurikurer");
        System.out.println("[2] Lihat Data Extrakurikurer");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan pilihan Anda: ");
        System.out.println(" ");
        int pilihan = NumberDataM.nextInt();
        this.pilihMenuDEK(pilihan);
    }
    
    public void pilihMenuDEK(int pilihan) {
        switch(pilihan){
            case 1:
                InputData();
            break;
            
            case 2:
                ReadData();
            break;
        }
    }
    
    static void ReadData() {
        System.out.println(" ");
        System.out.println("~~~~~~~~Data Extrakurikurer~~~~~~~~~");

        // Print the names from the nameList
        for (String name : ListExtrakurikurer) {
            System.out.println(name);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
    }
    
    static void InputData() {
    
    Scanner InputNama = new Scanner(System.in);
    System.out.println("Jumlah extrakurikurer yang akan di input: ");
    int totalNames = InputNama.nextInt();

    InputNama.nextLine();
    
    System.out.println("Masukkan nama-namanya: ");
    for (int i = 0; i < totalNames; i++) {
        String name = InputNama.nextLine();
            ListExtrakurikurer.add(name);
        }
    }
}

class Total_Kelas {
    static int TotalKelas;
    public static int KapasitasMaksimalKelas;
    int KMKO = 0;
    public void MenuTotalKelas() {
        Scanner NumberDataM = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("~~~~~~~~Menu Extrakurikurer~~~~~~~~~");
        System.out.println("[1] Input Data Total Kelas");
        System.out.println("[2] Input Data Kapasitas Maksimal Kelas");
        System.out.println("[3] Lihat Data Total Kelas");
        System.out.println("[4] Lihat Data Kapasitas Maksimal Kelas");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan pilihan Anda: ");
        System.out.println(" ");
        int pilihan = NumberDataM.nextInt();
        this.pilihMenuDKS(pilihan);
    }
    
    public void pilihMenuDKS(int pilihan) {
        switch(pilihan){
            case 1:
                InputDataTK();
            break;
            
            case 2:
                InputDataKMK();
            break;
            
            case 3:
                ReadDataTK();
            break;
               
            case 4:
                ReadDataKMK();
            break;
            
            default: System.out.println("Nomor yang anda masukan invalid.");
        }
    }
    
    static void ReadDataTK() {
        System.out.println(" ");
        System.out.println("~~~~~~~~~Data Total Kelas~~~~~~~~~~~");
        System.out.println(TotalKelas);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
    }
    
    static void InputDataTK() {
    
        Scanner InputTK = new Scanner(System.in);
        System.out.println("Masukkan total kelas : ");
        TotalKelas = InputTK.nextInt();
        Total_Kelas TKI = new Total_Kelas();
        TKI.KMKO = TotalKelas;
        System.out.println(TKI.KMKO);
    }
    
    static void ReadDataKMK() {
        System.out.println(" ");
        System.out.println("~~~~~~~Data Kapasitas Kelas~~~~~~~~~");
        System.out.println(KapasitasMaksimalKelas);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
    }
    
    static void InputDataKMK() {
    
        Scanner InputKMK = new Scanner(System.in);
        System.out.println("Kapasitas Kelas : ");
        KapasitasMaksimalKelas = InputKMK.nextInt();
    }
}

class Total_Siswa {

    static ArrayList<Integer> ListTS = new ArrayList<>();
    public static ArrayList<Integer> ListBP = new ArrayList<>();

    public void ShowMenuTS() {
        Scanner NumberDataTS = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("~~~~~~~~Menu Extrakurikurer~~~~~~~~~");
        System.out.println("[1] Input Data Total Siswa / Kelas");
        System.out.println("[2] Lihat Data Total Keseluruan Siswa");
        System.out.println("[3] Lihat Data Total Siswa / Kelas");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan pilihan Anda: ");
        System.out.println(" ");
        int pilihan = NumberDataTS.nextInt();
        this.pilihMenuTSK(pilihan);
    }

    public void pilihMenuTSK(int pilihan) {
        switch (pilihan) {
            case 1:
                InputDataTS();
            break;
            
            case 2:
                ReadDataTKS();
            break;
            
            case 3:
                ReadDataTSK();
            break;
        }
    }

    static void InputDataTS() {
        if (Total_Kelas.TotalKelas >= 1 && Total_Kelas.KapasitasMaksimalKelas >= 1) {
            int KapasitasKelas = Total_Kelas.KapasitasMaksimalKelas;
            Scanner InputTotalSiswa = new Scanner(System.in);
            System.out.println("Ada " + Total_Kelas.TotalKelas + " Yang harus di input siswanya!");
            
            System.out.println("Masukkan total siswa dari setiap kelas: ");
            for (int i = 1; i <= Total_Kelas.TotalKelas ; i++) {
                System.out.print("Masukan berapa total siswa untuk kelas " + i + " : ");
                int Number = InputTotalSiswa.nextInt();
                ListTS.add(Number);
                if (Number < KapasitasKelas) {
                    ListBP.add(i);
                }
            }
            
        }
        else if (Total_Kelas.TotalKelas  < 1 && Total_Kelas.KapasitasMaksimalKelas >= 1) {
            System.out.println("~~~~~~~~Total Siswa / Kelas~~~~~~~~~");
             System.out.println("Jumlah kelas tidak boleh kosong!");
        }
        
        else if (Total_Kelas.KapasitasMaksimalKelas  < 1 && Total_Kelas.TotalKelas  >= 1) {
            System.out.println("~~~~~~~~Total Siswa / Kelas~~~~~~~~~");
             System.out.println("Kapasitas kelas tidak boleh kosong!");
        }
        
        else if (Total_Kelas.KapasitasMaksimalKelas < 1  && Total_Kelas.TotalKelas  < 1) {
            System.out.println("~~~~~~~~Total Siswa / Kelas~~~~~~~~~");
             System.out.println("Kapasitas kelas dan total kelas tidak boleh kosong!");
        }
    }
    
    static void ReadDataTKS() {
        int sum = 0;
        for (int num : ListTS) {
            sum += num;
        }
        System.out.println("~~~~~~~~Total Keseluruhan Siswa~~~~~~~~~");
        System.out.println(sum);
    }
    
    static void ReadDataTSK () {
        Scanner InputKelasMana= new Scanner(System.in);
        System.out.print("Kelas mana yang mau dilihat total siswanya dari " + Total_Kelas.TotalKelas + " total kelas? ");
        int pilihan = InputKelasMana.nextInt();
        System.out.println(ListTS);
        for (int i = 0; i < ListTS.size(); i++) {
             if (i == pilihan - 1) {
                System.out.println("Total siswa pada kelas " + pilihan + " adalah : " + ListTS.get(pilihan - 1));
            }
        }
    }
}

class Kelas_Belum_Penuh {
    ArrayList<Integer> ListBP = Total_Siswa.ListBP;
    public void ShowBelumPenuh() {
    System.out.println("Berikut adalah daftar kelas kosong :");    
        for (Integer ListBP1 : ListBP) {
            System.out.println("Kelas " + ListBP1);
        }
    }
}

class Tentang_Sekolah {
    public void ShowMenuTentangSekolah() {
        System.out.println("SMKN 1 Garut");
        System.out.println("SMKN 1 Garut adalah sekolah menengah kejuruan di Kabupaten Garut, Jawa Barat, Indonesia. Terkenal dengan fokus pada pendidikan kejuruan, menawarkan berbagai program studi seperti teknik mesin,");
        System.out.println("listrik, otomotif, dan bangunan. Dilengkapi sarana dan prasarana modern, sekolah ini membekali siswa dengan pengetahuan praktis dan keterampilan relevan. Dengan tenaga pengajar berkualifikasi,");
        System.out.println("SMKN 1 Garut menciptakan lingkungan inspiratif untuk mempersiapkan siswa menghadapi dunia kerja atau melanjutkan pendidikan tinggi.");
    }
}

class Info_PPDB {
    public void ShowInfoPPDB() {
        System.out.println("PPDB Akan dilaksanakan pada 05 - 06 - 2004");
    }
}

class Tentang_Saya {
    public void ShowBiodata() {
        System.out.println(" ");
        System.out.println("~~~~~~~~Biodata Programmer~~~~~~~~~");
        System.out.println("Nama : Salman Al Farizi");
        System.out.println("Umur : 17 Tahun");
        System.out.println("Lahir : Juni 05 2004");
        System.out.println("Hobi : Bermain piano, game dan juga coding saat ada waktu luang!");
        System.out.println("Cita-cita : Menjadi seorang game developer!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

class Menu {
    public void ShowMenu(){
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~Menu~~~~~~~~~~~~~~~~");
        System.out.println("[1] Data Siswa");
        System.out.println("[2] Data Guru");
        System.out.println("[3] Data Extrakurikurer");
        System.out.println("[4] Data Total Kelas & Kapasitas");
        System.out.println("[5] Data Total Siswa / Kelas & Keseluruhan");
        System.out.println("[6] Data Kelas Belum Penuh");
        System.out.println("[7] Tentang Sekolah");
        System.out.println("[8] Info PPDB");
        System.out.println("[9] Tentang Saya");
        System.out.println("[10] Exit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    public void pilihMenu(int pilihan) {
        switch(pilihan){
            case 1:
                Data_Siswa dataS = new Data_Siswa();
                dataS.ShowMenuDataS();
            break;
                
            case 2:
                Data_Guru dataG = new Data_Guru();
                dataG.ShowMenuDataG();
            break;
            
            case 3:
                Data_Extrakurikurer dataEK = new Data_Extrakurikurer();
                dataEK.ShowMenuDataEK();
            break;
            
            case 4:
                Total_Kelas TK = new Total_Kelas();
                TK.MenuTotalKelas();
            break;
                
            case 5:
                Total_Siswa TS = new Total_Siswa();
                TS.ShowMenuTS();
            break;
            
            case 6:
                Kelas_Belum_Penuh KBP = new Kelas_Belum_Penuh();
                KBP.ShowBelumPenuh();
            break;
            
            case 7:
                Tentang_Sekolah TTS = new Tentang_Sekolah();
                TTS.ShowMenuTentangSekolah();
            break;
            
            case 8:
                Info_PPDB IPP =  new Info_PPDB();
                IPP.ShowInfoPPDB();
            break;
            
            case 9:
                Tentang_Saya AboutMe = new Tentang_Saya();
                AboutMe.ShowBiodata();
            break;
            
            default:
                System.out.println("Terimakasih sudah menggunakan program ini!");
        }
    }
}
public class Salman_UAS_PBO {
    public static void main(String[] args) {
        Menu menu = new Menu();
         Scanner scanner = new Scanner(System.in);
         int pilihan;
          do {
            menu.ShowMenu();
            System.out.print("Masukkan pilihan Anda: ");
            System.out.println(" ");
            pilihan = scanner.nextInt();
            menu.pilihMenu(pilihan);
        } while (pilihan != 10);
    }
}
