import java.util.ArrayList;

public class Playlist {

    //arraylist is a type of array that is dynamic and can grow
    ArrayList<Song> songList = new ArrayList<>();

    public String name;


    Playlist(String aName)
    {
        this.name = aName;
    }

    //returns a boolean
    boolean isEmpty()
    {
        //returns true if the songList ArrayList is empty.  note we are using the isEmpty
        return songList.isEmpty();
    }

    void addSong(Song aSong)
    {
        songList.add(aSong);
    }

    //returns an array called Song
    String[] songNames()
    {
        //to array returns an array but you need to tell it te type of array
        //return songList.toArray(new Song[] {});
        String [] songNames = new String[songList.size()];
        for (int i = 0; i < songList.size(); i++) {
            songNames[i] = songList.get(i).title;
        }
        return songNames;


//        return songList.stream().map(song -> song.title).
    }

    int totalDuration()
    {
        int total = 0;
        for (int i = 0; i < songList.size(); i++) {
            total += songList.get(i).durationInSeconds;
        }
        return total;
    }
    
    void swap(Song a, Song b)
    {
        int aIndex = songList.indexOf(a);
        songList.set( aIndex, b);
        int bIndex = songList.indexOf(b);
        songList.set( bIndex, a);
    }

    void removeSong(Song aSong)
    {
        songList.remove(aSong);
//        for (int i = 0; i < songList.size(); i++) {
//            if (aSong.title == songList.get(i).title)
//            {
//                songList.remove(i);
//            }
//        }

    }

}
