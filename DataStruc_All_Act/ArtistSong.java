import java.util.LinkedList;
import java.util.List;

public class ArtistSong {
    public static void main(String[] args) {

        List<String> songs = new LinkedList<>();
        List<String> artists = new LinkedList<>();
        List<String> albums = new LinkedList<>();

        songs.add("Ride");
        songs.add("Chemical");
        songs.add("The Outside");
        songs.add("No Chance");
        songs.add("Stressed Out");

        artists.add("Twenty One Pilot");
        artists.add("Twenty One Pilot");
        artists.add("Twenty One Pilot");
        artists.add("Twenty One Pilot");
        artists.add("Twenty One Pilot");

        for (int i = 0; i < songs.size(); i++) {
            String song = songs.get(i);
            String artist = artists.get(i);
            String albumEntry = song + " - " + artist;
            albums.add(albumEntry);
        }

        System.out.println("Songs:");
        for (String song : songs) {
            System.out.println(song);
        }

        System.out.println("\nArtists:");
        for (String artist : artists) {
            System.out.println(artist);
        }

        System.out.println("\nAlbums:");
        displayAlbums(albums, 0); 
    }

   
    private static void displayAlbums(List<String> albums, int index) {
        if (index < albums.size()) {
            System.out.println(albums.get(index));
            displayAlbums(albums, index + 1); 
        }
    }
}