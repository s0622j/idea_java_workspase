package ch10_11;

/**
 * @author shenjie
 * @version 1.0
 */
public class H06 {
}

interface Vehicles {
void work();
}


class Horse implements Vehicles{

    @Override
    public void work() {
        System.out.println("h");
    }
}

class Boat implements Vehicles{

    @Override
    public void work() {
        System.out.println("b");
    }
}

class Factory {
    Horse h = null;
    Boat b = null;

    public Factory(Horse h) {
        this.h = h;
    }

    public Factory(Boat b) {
        this.b = b;
    }

    public Horse getH() {
        return h;
    }

    public Boat getB() {
        return b;
    }
}

class Per {
    private String name;
    private Vehicles veh;

    public Per(String name, Vehicles veh) {
        this.name = name;
        this.veh = veh;
    }
}