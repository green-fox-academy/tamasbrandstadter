public class Aircraft {
  private int maxAmmo;
  private int baseDamage;
  private int currentAmmo;
  private String type;
  private String status;
  private int damage;

  public Aircraft(int maxAmmo, int baseDamage, String type) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.currentAmmo = 0;
    this.type = type;
    this.status = status;
    this.damage = damage;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public int fight() {
    damage = baseDamage * currentAmmo;
    setCurrentAmmo(0);
    return damage;
  }

  public int refill(int reFillAmmo) {
    setCurrentAmmo(maxAmmo);
    int remainingAmmo = reFillAmmo - currentAmmo;
    return remainingAmmo;
  }

  public String getType() {
    return type;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public String getStatus() {
    return "Type: " + getType() + " Ammo: " + getCurrentAmmo() + " Base damage: " + getBaseDamage() + " All damage: "
            + getDamage();
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public int getDamage() {
    return this.baseDamage * currentAmmo;
  }
}