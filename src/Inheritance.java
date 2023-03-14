class Bike {
    int weels = 2;
}

class DirtBike extends Bike {
    int engine = 125;

    public void main() {
        DirtBike ktm = new DirtBike();
        System.out.println("weels:"+ktm.weels);
        System.out.println("engine:"+ktm.engine);
    }
}


public class Inheritance { }
