package com.greenfox.gamora;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
  List<Song> songList;

  public PlayList(){
    this.songList = new ArrayList<>();
    songList.add(new Song("DJ Bobo", "It's my life", 1977, 10.0));
    songList.add(new Song("DJ Lalala", "Blabla", 1990, 5.5));
  }

  public List<Song> getSongList() {
    return songList;
  }

  public void setSongList(List<Song> songList) {
    this.songList = songList;
  }
}
