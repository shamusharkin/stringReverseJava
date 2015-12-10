import org.junit.Test;

import static org.junit.Assert.*;

public class PlaylistTest {

    @Test
    public void createPlaylist_isInitializedWithAName() {
        Playlist playlist = new Playlist("Favorite Playlist");
        assertEquals("Favorite Playlist", playlist.name);

        Playlist playlist2 = new Playlist("Worst Playlist");
        assertEquals("Worst Playlist", playlist2.name);
    }

//    @Test
//    public void createPlaylist_isEmptyByDefault() {
//        Playlist playlist = new Playlist("Empty Playlist");
//        assertTrue(playlist.isEmpty());
//    }
//
//    @Test
//    public void addSong_addsASongToPlaylist() {
//        Playlist playlist = new Playlist("Non-empty Playlist");
//        Song mySong = new Song("Radiohead", "Everything In Its Right Place", 200);
//        playlist.addSong(mySong);
//        assertFalse(playlist.isEmpty());
//
//        Playlist emptyPlaylist = new Playlist("Empty Playlist");
//        assertTrue(emptyPlaylist.isEmpty());
//    }
//
//    @Test
//    public void songNames_allowsYouToSeeSongNamesInOrderAdded() {
//        Playlist playlist = new Playlist("Non-empty Playlist");
//
//        assertArrayEquals(new Song[0], playlist.songNames());
//
//        Song everything = new Song("Radiohead", "Everything In Its Right Place", 200);
//        Song time = new Song("Pink Floyd", "Time", 408);
//        playlist.addSong(everything);
//        playlist.addSong(time);
//
//        String[] songArray = {"Everything In Its Right Place", "Time"};
//        assertArrayEquals(songArray, playlist.songNames());
//    }
//
//    @Test
//    public void totalDuration_showsTotalDurationOfAllSongsInPlaylist() {
//        Playlist playlist = new Playlist("Non-empty Playlist");
//
//        assertEquals(0, playlist.totalDuration());
//
//        playlist.addSong(new Song("Radiohead", "Everything In Its Right Place", 200));
//        playlist.addSong(new Song("Pink Floyd", "Time", 408));
//
//        assertEquals(200+408, playlist.totalDuration());
//    }
//
//    @Test
//    public void swapSongs_allowsSongsToBeSwappedInPlaylistOrder() {
//        Playlist playlist = new Playlist("Swap Playlist");
//        Song everything = new Song("Radiohead", "Everything In Its Right Place", 200);
//        Song time = new Song("Pink Floyd", "Time", 408);
//        Song itsIce = new Song("Phish", "It's Ice", 600);
//
//        playlist.addSong(everything);
//        playlist.addSong(time);
//        playlist.addSong(itsIce);
//
//        String[] originalSongOrder = {"Everything In Its Right Place", "Time", "It's Ice"};
//        assertArrayEquals(originalSongOrder, playlist.songNames());
//
//        playlist.swap(itsIce, everything);
//        String[] swappedSongOrder = {"It's Ice", "Time", "Everything In Its Right Place"};
//        assertArrayEquals(swappedSongOrder, playlist.songNames());
//    }
//
//    @Test
//    public void removeSong_allowsSongsToBeRemovedFromPlaylist() {
//        Playlist playlist = new Playlist("Swap Playlist");
//        Song everything = new Song("Radiohead", "Everything In Its Right Place", 200);
//        Song time = new Song("Pink Floyd", "Time", 408);
//        Song itsIce = new Song("Phish", "It's Ice", 600);
//
//        playlist.addSong(everything);
//        playlist.addSong(time);
//        playlist.addSong(itsIce);
//
//        String[] originalSongOrder = {"Everything In Its Right Place", "Time", "It's Ice"};
//        assertArrayEquals(originalSongOrder, playlist.songNames());
//
//        playlist.removeSong(time);
//        String[] withTimeRemoved = {"Everything In Its Right Place", "It's Ice"};
//        assertArrayEquals(withTimeRemoved, playlist.songNames());
//    }
}
