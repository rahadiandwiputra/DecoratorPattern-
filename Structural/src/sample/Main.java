package sample;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        judulBuku judul =new Buku2();
        judulBuku genre1=new GenreBuku(new Buku2());
        judulBuku genre2=new GenreBuku(new Buku1());
        judulBuku genre3=new GenreBuku(new Buku3());
        System.out.println("Judul Buku Dan Genrenya");

        System.out.println("\nBuku dengan Genre Horor ");
        genre1.buku();
        genre2.buku();
        genre3.buku();
    }
}
