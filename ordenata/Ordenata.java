package ordenata;

import java.util.Scanner;


public class Ordenata {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mouse-Type: ");
        String mouse = sc.next();
        System.out.print("Window-Brands: ");
        String brands = sc.next();
        System.out.print("Window-Brinch: ");
        float brinch = sc.nextFloat();
        System.out.print("CPU-Speed: ");
        int speed = sc.nextInt();
        System.out.print("CPU-Memory: ");
        int memory = sc.nextInt();
        Mouse rat = new Mouse(mouse);
        Window pan = new Window(brands, brinch);
        memory proc = new memory(speed, memory);
        computer Or = new computer(rat, pan, proc);
        //Amosar 1
        System.out.println("*****Valid Data1****");
        Or.amosar();
        //Amosar 2
        System.out.println("*****Valid Data2*****");
        System.out.print("Mouse-Type: " + Or.getMouse().getMouse() + "\nWindow-Brands: " + Or.getWindow().setbrands() + "\nWindow-Brinch: " + Or.getWindow().getbrinch());
        System.out.println("\nCPU-Speed: " + Or.getCPU().setspeed() + "\nCPU-Memory: " + Or.getCPU().getmemory());
    }

}
