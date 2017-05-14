package com.greenfox.logentries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogRestContoller {

  @Autowired
  private LogRepository logRepository;

  @Autowired
  private LogList logList;

  @GetMapping("/log")
  public LogList list() {
    logList.setEntries(logRepository.findAll());
    logList.setSize(logList.getEntries());
    return logList;
  }
}
