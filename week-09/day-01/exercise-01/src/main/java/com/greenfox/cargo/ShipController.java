package com.greenfox.cargo;

import com.greenfox.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
  public Cargo fillCargo(@RequestParam("caliber") String caliber, @RequestParam("amount") double amount) {
    Cargo cargo = new Cargo(caliber, amount);
    ship.addAmmo(caliber, amount);
    cargo.setShipStatus(ship.getShipStatus());
    cargo.setReady(ship.isReady());
    return cargo;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage showError(MissingServletRequestParameterException ex) {
    return new ErrorMessage("Missing parameter.");
  }
}
