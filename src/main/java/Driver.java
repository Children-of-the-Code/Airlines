import Controller.AirController;

public class Driver {
    public static void main(String[] args) {
        AirController controller = new AirController();
        controller.startController();
    }
}
/*
--a;
a--;
++a;
a++;
the difference is when the increment/decrement actually happens - before the line executes vs after the line executes
a = 4;
System.out.println(--a) = 3
a = 4;
System.out.println(a++) = 4
i think this is an unfair question because at the end of the day, no one cares

 */

