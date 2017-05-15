package com.greenfox.cargo;

import com.greenfox.ErrorMessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipController {
  private Ship ship = new Ship();

  @GetMapping("/rocket")
  public Ship listCargo() {
    return ship;
  }

  @GetMapping("/rocket/fill")
  public Cargo fillCargo(@RequestParam("caliber") String caliber, @RequestParam("amount") double amount) {
    int maxShipCargo = 12500;
    Cargo cargo = new Cargo(caliber, amount);
    if (amount == maxShipCargo) {
      ship.setReady(true);
      cargo.setReady(true);
    }
    if (ship.getCaliber25() + ship.getCaliber30() + ship.getCaliber50() == maxShipCargo) {
      ship.setShipStatus(1.0);
      ship.setReady(true);
      cargo.setStatus(1.0);
      cargo.setReady(true);
    }
    if (caliber.equals(".50")) {
      cargo.setStatus(amount);
      ship.setShipStatus(amount);
      ship.setCaliber50(amount + ship.getCaliber50());
    }
    if (caliber.equals(".25")) {
      cargo.setStatus(amount);
      ship.setShipStatus(amount);
      ship.setCaliber25(amount + ship.getCaliber25());
    }
    if (caliber.equals(".30")) {
      cargo.setStatus(amount);
      ship.setShipStatus(amount);
      ship.setCaliber30(amount + ship.getCaliber30());
    }
    return cargo;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage showError(MissingServletRequestParameterException ex) {
    return new ErrorMessage("Missing parameter.");
  }
}
