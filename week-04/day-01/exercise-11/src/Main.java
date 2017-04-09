public class Main {
  public static void main(String[] args) {
    SharpieSet sharpieSet = new SharpieSet();
    Sharpie sharpie1 = new Sharpie("yellow", 10);
    Sharpie sharpie2 = new Sharpie("blue", 20);

    sharpieSet.list.add(sharpie1);
    sharpieSet.list.add(sharpie2);

    sharpie1.use(100);
    System.out.println(sharpie1.inkAmount);
    sharpieSet.removeTrash();

    System.out.println(sharpieSet.list);
  }
}

