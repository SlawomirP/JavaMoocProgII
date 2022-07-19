import ex810.IOU;

public class MainTesting {
    public static void main(String[] args) {

        RegisterSightingCounter test = new RegisterSightingCounter();


        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Arthur", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    }
}
