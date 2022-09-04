package Singleton;

//the singleton pattern is when you want ot make instant only once and no more.
//this pattern help you prevent to make more instance of the class.
public class Singleton {
    public static void main(String[] args) {
        //as you can see you can not use the default constructor.
        //TODO:remove the //
        //Singleton.EmergencyBottom emergencyBottom = new Singleton.EmergencyBottom();

        //now we activate the emergency.
        EmergencyBottom emergencyBottom = EmergencyBottom.activeBottom();
        System.out.println(emergencyBottom);
        //try to create a new one.
        EmergencyBottom emergencyBottom1 = EmergencyBottom.activeBottom();
        System.out.println(emergencyBottom1);

        //they are the same.
    }
}
