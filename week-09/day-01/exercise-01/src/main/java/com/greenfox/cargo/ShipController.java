package com.greenfox.cargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipController {

  @Autowired
  private Ship ship;

  @GetMapping("/rocket")
  public Ship listCargo() {
    return ship;
  }

  @GetMapping("/rocket/fill")
  public Cargo fillCargo(@RequestParam("caliber") String caliber, @RequestParam("amount") int amount) {
    int maxShipCargo = 12500;
    Cargo cargo = new Cargo(caliber, amount);
    cargo.setShipStatus(amount/maxShipCargo);
    ship.setShipStatus("40%");
    if (caliber.equals(".50")) {
      ship.setCaliber50(amount + ship.getCaliber50());
      cargo.setShipStatus(amount / maxShipCargo);
    }
    if (caliber.equals(".25")) {
      ship.setCaliber25(amount + ship.getCaliber25());
    }
    if (caliber.equals(".30")) {
      ship.setCaliber30(amount + ship.getCaliber30());
    }
    if (ship.getCaliber25() + ship.getCaliber30() + ship.getCaliber50() == maxShipCargo) {
      ship.setReady(true);
      ship.setShipStatus("100%");
      cargo.setShipStatus(100);
      cargo.setReady(true);
    }
    return cargo;
  }
}
