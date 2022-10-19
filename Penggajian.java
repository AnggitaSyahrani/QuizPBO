import java.util.Scanner;
import javax.swing.*;
import java.text.DecimalFormat;

class Penggajian  {
    public static void main (String [] args)  {
        Scanner coba = new Scanner (System.in);
        apl a = new apl();
        System.out.print("Masukkan Nama    : \t"); 
        a.nama = coba.nextLine();
        System.out.print("Masukkan Alamat  : \t");
        a.almt = coba.nextLine();
        System.out.print("Masukkan No.telp : \t");
        a. telp = coba.nextLine();
        System.out.print("Masukkan Umur    : \t");
        a.usia =  coba.nextLine();
        System.out.println();
        System.out.println("====================================================");
        System.out.println("====================================================");
        gaji karyawan = new gaji("Pemasaran","Manajer Pemasaran","Sampai 2027");
        gaji karyawan2 = new gaji(2000000,350000,250000);
        karyawan.output();
        System.out.println();
        karyawan2.output2();
        System.out.println("====================================================");
    }
}

class apl{
    String nama, almt, telp, usia;
    
    void datadiri () {
        System.out.println("Nama Karyawan    : \t \t\t"+nama);
        System.out.println("Alamat           : \t \t\t"+almt);
        System.out.println("Nomor Telepon    : \t \t\t"+telp);
        System.out.println("Umur             : \t \t\t"+usia);
    }
}

class gaji{
    String dvsi, jabatan, kontrak;
    int gajipokok, lembur, uangmkn, datagaji;
    gaji (String dvsi, String jabatan, String kontrak) {
        this.dvsi=dvsi;
        this.jabatan=jabatan;
        this.kontrak=kontrak;
    }

    gaji(int gajipokok, int lembur, int uangmkn) {
        this.gajipokok=gajipokok;
        this.lembur=lembur;
        this.uangmkn=uangmkn;
    }
    
    int datagaji() {
        return gajipokok+lembur+uangmkn;
    }
    
    void output() {
        System.out.println("Divisi                  : "+this.dvsi);
        System.out.println("Jabatan                 : "+this.jabatan);
        System.out.println("Kontrak                 : "+this.kontrak);
    }
    
    void output2() {
            DecimalFormat df = new DecimalFormat("##0,000");
        
        System.out.println("Gaji Pokok              : Rp. "+this.gajipokok);
        System.out.println("Lemburan                : Rp. "+this.lembur);
        System.out.println("Uang Makan              : Rp. "+this.uangmkn);
        System.out.println("Total Gaji              : Rp. "+df.format(datagaji()));
    }
}