package sample;

public class GenreBuku extends BukuDecorator{
    public GenreBuku(judulBuku decoratedJudul){
        super(decoratedJudul);
    }
    @Override
    public void buku(){
        decoratedJudul.buku();
        setGenreJudul(decoratedJudul);
    }
    private  void setGenreJudul(judulBuku decoratedJudul){
        System.out.println("Genrenya: Horor");
    }
}
