package codingTracker;

public class Main {

    @Author(name = "George")
    public static void main(String[] args) {
        Tracker.printMethodsByAuthor(Tracker.class);
        Tracker.printMethodsByAuthor(Main.class);
    }
}
