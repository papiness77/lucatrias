import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class testAlbum {
    @Test
    public void testArtistasParticiparonAlbum(){
       Artista artista1 = new Artista("Facu","Sabe","23");
       Artista artista2 = new Artista("Facu","Sabe","23");
       Cancion cancion1 = new Cancion("Baby");
       cancion1.addArtistas(artista1);
       cancion1.addArtistas(artista2);
       Album album1 = new Album("DONDA");
       album1.addCancion(cancion1);
       String valorEsperado = "Facu";
       assertEquals(valorEsperado,album1.artistasParticiparonAlbum());
    }
    @Test
    public void testArtistaMasInfluyente(){
        Artista artista1 = new Artista("Facu","Sabe","23");
        Artista artista2 = new Artista("Facu","Sabe","23");
        Cancion cancion1 = new Cancion("Baby");
        Cancion cancion2 = new Cancion("Industry");
        cancion1.addArtistas(artista1);
        cancion1.addArtistas(artista2);
        cancion2.addArtistas(artista1);
        Album album1 = new Album("DONDA");
        album1.addCancion(cancion1);
        album1.addCancion(cancion2);
        String valorEsperado = "Facu";
        album1.usarContadorArtistas();
        assertEquals(valorEsperado,album1.artistasMasInfluyente());
    }
    @Test
    public void testAutorNacionalidadIngresada(){
        Autor autor1 = new Autor("Facu","Sabelli","23","Argentino");
        Autor autor2 = new Autor("Facuuuuu","Sabelld3ddi","23","Boliviano");
        Cancion cancion1 = new Cancion("Baby");
        Cancion cancion2 = new Cancion("Jell");
        cancion1.addAutores(autor1);
        cancion2.addAutores(autor2);

        Album album1 = new Album("DONDA");
        album1.addCancion(cancion1);
        album1.addCancion(cancion2);
        String valorEsperado = "Baby";
        assertEquals(valorEsperado,album1.autorNacionalidadIngresadaAlbum("Argentino"));

    }
}
