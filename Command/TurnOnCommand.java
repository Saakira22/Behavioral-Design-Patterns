public class TurnOnCommand implements Command {
    //composition
    private Light light;
    private FaceRecognition faceRecognition;
    private AC ac;

    public TurnOnCommand(Light light, FaceRecognition faceRecognition, AC ac) {
        this.light = light;
        this.faceRecognition = faceRecognition;
        this.ac = ac;
    }

    @Override
    public void execute() {
        light.turnOn();
        faceRecognition.checkin();
        ac.switchon();

    }

}
