package AbstractFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        //one is for apple
        ManagerFactory mangerApple = new ManagerFactory(1);
        //two is for windows
        ManagerFactory mangerWindows = new ManagerFactory(2);
        //is for dell, the second constructor.
        ManagerFactory mangerDell = new ManagerFactory(new DellFactory());

        //the customer wants a computer of apple.
        Computer appleComputer= mangerApple.getcomputer();

        //the customer wants a computer of windows.
        Computer windowsComputer= mangerWindows.getcomputer();

        //the customer wants a computer of dell.
        Computer dellComputer= mangerDell.getcomputer();

        System.out.println("here is your apple computer ready: " + appleComputer.toString());

        System.out.println("here is your dell computer ready: " + dellComputer.toString());

        System.out.println("here is your windows computer ready: " + windowsComputer.toString());



    }
}
