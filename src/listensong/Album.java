package listensong;

import java.nio.MappedByteBuffer;
import java.util.List;

public class Album {

   private String albumName;
   private String artistName;

   private List<Song> songList;

    public Album(String albumName, String artistName, List<Song> songList) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songList = songList;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumName='" + albumName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", songList=" + songList +
                '}';
    }

    public boolean songIsPresent(String title){
        for(Song song : getSongList()){
            if(song.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public String addNewSong(Song song){
        boolean songAlreadyPresent = songIsPresent(song.getTitle());
        if(songAlreadyPresent) {
            return "Song is already Present";
        }else {
            songList.add(song);
            return "New Song added Successfully";
        }
    }
}

