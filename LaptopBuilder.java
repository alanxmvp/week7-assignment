import java.util.Scanner;

public class LaptopBuilder {

  int subtotalPrice = 0;

  static int selectScreen(String item) {
    if (item.equals("1920x1080 Anti-Glare IPS - RM400")) {
      return 400;
    }
    if (item.equals("3840x2160 Anti-Glare IPS - RM750")) {
      return 750;
    }
    if (item.equals("3840x2160 Anti-Glare IPS (Touchscreen) - RM1000")) {
      return 1000;
    }
    return 0;
  }

  static int selectRam(String item) {
    if (item.equals("8GB - RM150")) {
      return 150;
    }
    if (item.equals("16GB - RM320")) {
      return 320;
    }
    if (item.equals("32GB - RM700")) {
      return 700;
    }
    return 0;
  }

  static int selectHdd(String item) {
    if (item.equals("1TB HDD - RM250")) {
      return 250;
    }
    if (item.equals("128GB SSD - RM300")) {
      return 300;
    }
    if (item.equals("256GB SSD - RM400")) {
      return 400;
    }
    if (item.equals("512 GB SSD - RM650")) {
      return 650;
    }
    return 0;
  }

  static int selectCpu(String item) {
    if (item.equals("i3 - RM750")) {
      return 750;
    }
    if (item.equals("i5 - RM1200")) {
      return 1200;
    }
    if (item.equals("i7 - RM1800")) {
      return 1800;
    }
    return 0;
  }

  public static void main(String[] args) {
    String[] screen = { "1920x1080 Anti-Glare IPS - RM400", "3840x2160 Anti-Glare IPS - RM750",
        "3840x2160 Anti-Glare IPS (Touchscreen) - RM1000" };
    String[] ram = { "8GB - RM150", "16GB - RM320", "32GB - RM700" };
    String[] hdd = { "1TB HDD - RM250", "128GB SSD - RM300", "256GB SSD - RM400", "512 GB SSD - RM650" };
    String[] cpu = { "i3 - RM750", "i5 - RM1200", "i7 - RM1800" };

    Scanner userInput = new Scanner(System.in);
    int totalPrice = 0;

    System.out.println("Welcome to Laptop Builder System");
    System.out.println("--------------------------------");
    System.out.println("Please choose your spec below to build a laptop:");
    System.out.println("Screen:");
    for (int i = 0; i < screen.length; i++) {
      System.out.println(i + " . " + screen[i]);
    }

    Integer itemIndex1 = Integer.parseInt(userInput.nextLine());
    totalPrice = totalPrice + selectScreen(screen[itemIndex1]);

    System.out.println("RAM:");
    for (int i = 0; i < ram.length; i++) {
      System.out.println(i + " . " + ram[i]);
    }

    Integer itemIndex2 = Integer.parseInt(userInput.nextLine());
    totalPrice = totalPrice + selectRam(ram[itemIndex2]);

    System.out.println("HDD:");
    for (int i = 0; i < hdd.length; i++) {
      System.out.println(i + " . " + hdd[i]);
    }

    Integer itemIndex3 = Integer.parseInt(userInput.nextLine());
    totalPrice = totalPrice + selectHdd(hdd[itemIndex3]);

    System.out.println("Processor:");
    for (int i = 0; i < cpu.length; i++) {
      System.out.println(i + " . " + cpu[i]);
    }

    Integer itemIndex4 = Integer.parseInt(userInput.nextLine());
    totalPrice = totalPrice + selectCpu(cpu[itemIndex4]);

    userInput.close();
    System.out.println("Total laptop price is: RM " + totalPrice);
  }
}