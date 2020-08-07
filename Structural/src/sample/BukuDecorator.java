package sample;

public abstract class BukuDecorator implements judulBuku {
    protected judulBuku decoratedJudul;

    public BukuDecorator(judulBuku decoratedJudul){
        this.decoratedJudul=decoratedJudul;
    }
    public  void buku(){
        decoratedJudul.buku();
    }
}
