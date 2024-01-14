package main;

import domain.Album;
import domain.SimpleAlbum;

public class Main {
    public static void main(String[] args) {
        Album lonerism = new SimpleAlbum.AlbumBuilder("Lonerism", "Tame Impala").pays("Australie").annee(2012).genre("indie rock").build();
        Album orange = new SimpleAlbum.AlbumBuilder("channel ORANGE", "Frank Ocean").annee(2012).genre("R&B").build();
        Album visions = new SimpleAlbum.AlbumBuilder("Visions", "Grimes").annee(2012).label("4AD").genre("Electronic").build();
    }
}
