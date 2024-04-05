abstract class vegitable {
    String color;
    String vegitableName;

    vegitable(String color, String vegitableName) {

        this.color = color;
        this.vegitableName = vegitableName;

    }

    public String toString() {
        return (vegitableName + " " + "is" + " " + "of" + color + " "+ "color .");
    }

}

class Potato extends vegitable {

    Potato(String color) {
        super(color, "Potato");
    }
}

class Brinjal extends vegitable {

    Brinjal(String color) {
        super(color, "Brinjal");
    }
}

class Tomato extends vegitable {

    Tomato(String color) {
        super(color, "Tomato");
    }
}

public class Lab7_1 {

    public static void main(String[] args) {

        Potato p = new Potato("Yellow");
        Brinjal b = new Brinjal("Violet");
        Tomato t = new Tomato("Red");

        System.out.println(p.toString());
        System.out.println(b.toString());
        System.out.println(t.toString());

    }
}
