public class TurnOffCommand implements Command {
    private Light light;
    private FaceRecognition faceRecognition;
    private AC ac;
    

    
    public TurnOffCommand(Light light, FaceRecognition faceRecognition, AC ac) {
        this.light = light;
        this.faceRecognition = faceRecognition;
        this.ac = ac;
    }


    @Override
    public void execute() {
        light.turnOff();
        faceRecognition.checkin();
        ac.switchoff();
    }

}
