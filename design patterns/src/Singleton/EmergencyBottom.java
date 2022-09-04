package Singleton;

/**
 * emergency bottom : In our company we have only one so when you push it
 * you cannot push it again.
  */
public class EmergencyBottom {
    //the instant must to be static.
    private static EmergencyBottom bottom;

    /**
     * the constructor must to be private.
     */
    private EmergencyBottom() {}

    /**
     * the method must be static, so we have access to the object.
     * and must return the object.
     * @return
     */
    public static EmergencyBottom activeBottom() {
        //dont forget to create a instanc and save it in the static member.
        if (bottom == null) {
            bottom = new EmergencyBottom();
            return bottom;
        }
        return bottom;

    }

    public int getBottom() {
        return 1;
    }
}


