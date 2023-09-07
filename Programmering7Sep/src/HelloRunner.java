public class HelloRunner {
    public static void main(String[] args) {
        new HelloRunner().run();
    }

    public void run() {
        printText("Hello Runner");
    }

    public void printText(String Text) {
        System.out.println(Text);
    }
}