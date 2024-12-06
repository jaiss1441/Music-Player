package Main;

import listensong.Album;
import listensong.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Song> songList = new ArrayList<>();
        Song song = new Song("Mp3",3.23);
        songList.add(song);
        Song song1 = new Song("humsana",4.5);
        songList.add(song1);
        Song song3 = new Song("Phir Suna", 4.04);
        songList.add(song3);

        Album album = new Album("Old Song","Old Artest",songList );
        System.out.printf(String.valueOf(album));

        List <Song> songList2 = new ArrayList<>();
        Song song4 = new Song("pqr",4.5);
        songList2.add(song4);
        Song song5 = new Song("xyz", 3.22);
        songList2.add(song5);
        Album album2 = new Album("Modern Song","Modern Artist",songList2);
        System.out.println(album2);

        System.out.println("Search Song from album");

        Scanner sc = new Scanner(System.in);
        String SearchSong = sc.nextLine();
        boolean songPresent = album2.songIsPresent(SearchSong);
        if(songPresent){
            System.out.println(SearchSong+"this song is playing");
        }else {
            System.out.println(SearchSong+"Not Present in album");
        }

    }
//    public static void priviosSong(Album album,String SearchSong){
//        List<Song> songList = new ArrayList<>();
//        for(int i = 0; i < songList.size();i++){
//            if(songList.get(i).getTitle().equals(SearchSong)){
//                System.out.println("Previous song Playing is:",songList.get(i-1).getTitle());
//            }
//        }
    }
//}