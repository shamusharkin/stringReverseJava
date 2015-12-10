import org.junit.Test;

import static org.junit.Assert.*;

public class SongTest {
    @Test
    public void createSong_isInitializedWithArtistAlbumAndDuration() {
        Song time = new Song("Pink Floyd", "Time", 408);

        assertEquals("Pink Floyd", time.artist);
        assertEquals("Time", time.title);
        assertEquals(408, time.durationInSeconds);

        Song rightPlace = new Song("Radiohead", "Everything In Its Right Place", 240);

        assertEquals("Radiohead", rightPlace.artist);
        assertEquals("Everything In Its Right Place", rightPlace.title);
        assertEquals(240, rightPlace.durationInSeconds);
    }
}