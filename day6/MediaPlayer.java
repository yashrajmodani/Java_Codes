package day6;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    public void playMYList(List<? extends Media> medialist)
    {
        // Whwn wild card is used the collection cannot be modified
        //medialist.add(newVideo()); doesn't compile
        for (Media m : medialist)
        {
            m.play();
        }

    }

    public static void main(String[] args) {
        MediaPlayer player  = new MediaPlayer();
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(3214,"rewtrt"));
        songs.add(new Song(5674,"dfghbjnk"));
        songs.add(new Song(345678,"wertyuio"));

        player.playMYList(songs);
    }
}
