package oop_uts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author 20103115 I Kadek Edi Putrayasa
 */
public class OOP_UTS {
static ArrayList daftar = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    static void showDaftarPengunjungKebunBinatang() throws IOException{ 
        
       System.out.println ("Daftar Pengunjung Kebun Binatang");
       System.out.println ("1. Tampilkan pengunjung");
       System.out.println ("2. Isi Data Pengunjung");
       System.out.println ("3. Keluar");
       System.out.println ("#########################################");
       System.out.println ("Pilihan menu :");
        
        int selectedDaftarPengunjungKebunBinatang = Integer.valueOf(input.readLine());
        
        
        switch(selectedDaftarPengunjungKebunBinatang){
            case 1:
                tampilkanPengunjung();
                break;
            case 2:
                isiDataPengunjung();
                break;
            case 3:
                System.out.println();
                System.out.println("Sampai jumpa lagi");
                System.out.println();
                System.exit(0);
                break;
            default:
                System.out.println();
                System.out.println("Pilihan Yang anda pilih tidak terdafatar,silahkan pilih 1, 2 atau 3");
                System.out.println(); 
                System.out.println("Enter Untuk Melanjutkan...");
        }
        
        
    }

    static void tampilkanPengunjung (){
        if(daftar.isEmpty()){
           System.out.println();
           System.out.println("Belum ada data pengunjung\n"); 
           System.out.println();
           System.out.println("Enter Untuk Melanjutkan...");
           
        } else {
             System.out.println ("####Daftar pengunjung kebun binatang####");
             // tampilkan semua daftar
            for(int i = 0; i < daftar.size(); i++){
                System.out.println (i+1 + ". "+daftar.get(i));
            } {
                 System.out.println ("Total jumlah pengunjung = "+ daftar.size()+ " Pengunjung");
                 System.out.println (); 
                 System.out.println("Enter Untuk Melanjutkan...");
            } 
        }
    }
    
    static void isiDataPengunjung() throws IOException{
        System.out.println();
        System.out.println("Isi Nama Pengunjung Kebun Binatang");
        System.out.print("Nama pengunjung : ");
        String namaPengunjung = input.readLine();
        daftar.add(namaPengunjung);
        System.out.println();
        System.out.println("Enter Untuk Melanjutkan...");
    }
    public static void main(String[] args) throws IOException{
        do {
            showDaftarPengunjungKebunBinatang();
        } while (isRunning);
    }
}
    

