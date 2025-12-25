package ISP.apres;

public interface Workable {
    void work();
}

interface Eatable extends Workable {
    void eat();
}

class HumanWorker implements Eatable {
    public void work() { System.out.println("Travaille"); }
    public void eat() { System.out.println("Mange"); }
}

class RobotWorker implements Workable {
    public void work() { System.out.println("Travaille"); }
}
