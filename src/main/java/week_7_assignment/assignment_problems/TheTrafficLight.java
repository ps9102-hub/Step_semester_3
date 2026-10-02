class TrafficLight {
    private final String id;
    private String color;

    public TrafficLight(String id) {
        this.id = id;
        this.color = "RED";
    }

    public void next() {
        switch (color) {
            case "RED":
                color = "GREEN";
                break;
            case "GREEN":
                color = "YELLOW";
                break;
            case "YELLOW":
                color = "RED";
                break;
        }
    }

    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }
}

public class TheTrafficLight {
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        System.out.println("Light ID: " + t.getId());
        System.out.println("Initial Color: " + t.getColor()); // RED

        t.next();
        System.out.println("After 1st next(): " + t.getColor()); // GREEN

        t.next();
        System.out.println("After 2nd next(): " + t.getColor()); // YELLOW

        t.next();
        System.out.println("After 3rd next(): " + t.getColor()); // RED
    }
}
