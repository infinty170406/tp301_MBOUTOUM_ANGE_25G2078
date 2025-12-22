package ISP.AVANT;

public interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    public void work() { System.out.println("Les humains travaillent"); }
    public void eat() { System.out.println("Les humains mangent"); }
}

class RobotWorker implements Worker {
    public void work() { System.out.println("Les Robots travaillent"); }
    public void eat() {
        throw new UnsupportedOperationException("Les Robots ne mangent pas");
    }
}
