package com.greenfox.gamora;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
  private List<Song> songList;

  public PlayList() {
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

  public void addSong(Song song) {
    songList.add(song);
  }

  public void deleteSong(String title) {
    for (Song song : songList) {
      if (song.getTitle().equals(title)) {
        songList.remove(song);
      }
    }
  }

  public void setRating(Song song, double rating) {
    song.setRating(rating);
  }

  public Song findSong(String title) {
    for (Song song : songList) {
      if (song.getTitle().equals(title)) {
        return song;
      }
    }
    return null;
  }
}
