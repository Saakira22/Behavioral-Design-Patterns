import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Create receiver
        Light light = new Light();
        FaceRecognition faceRecognition = new FaceRecognition();
        AC ac = new AC();

        // Create Command buttons and associate it with receiver
        Command on = new TurnOnCommand(light, faceRecognition, ac);
        Command off = new TurnOffCommand(light, faceRecognition, ac);

        System.out.println("Smart works");
        System.out.println("1-Turn on");
        System.out.println("2-Turn off");

        int choice;
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                on.execute();
                break;

            case 2:
                off.execute();
                break;

            default:
                break;
        }

        sc.close();

    }
}