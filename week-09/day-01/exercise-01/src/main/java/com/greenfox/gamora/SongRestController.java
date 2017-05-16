package com.greenfox.gamora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongRestController {
  private PlayList playList;

  public SongRestController(){
    this.playList = new PlayList();
  }

  @GetMapping("/awesome")
  public PlayList listPlayList(){
    return playList;
  }
}
