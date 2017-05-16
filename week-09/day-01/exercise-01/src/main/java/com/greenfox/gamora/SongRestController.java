package com.greenfox.gamora;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/awesome")
public class SongRestController {
  private PlayList playList;

  public SongRestController(){
    this.playList = new PlayList();
  }

  @GetMapping("/")
  public PlayList listPlayList(){
    return playList;
  }

  @PostMapping("/add")
  public Song add(@RequestBody Song song) {
    playList.addSong(song);
    return song;
  }

  @DeleteMapping("/delete/{title}")
  public PlayList delete(@PathVariable("title") String title) {
    playList.deleteSong(title);
    return playList;
  }

  @PutMapping("/change/{title}")
  public PlayList updateRating(@PathVariable("title") String title, @RequestParam("rating") double rating) {
    playList.setRating(playList.findSong(title), rating);
    return playList;
  }
}
