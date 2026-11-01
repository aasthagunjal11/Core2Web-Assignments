class Transport {
    String mode;
    int maxSpeed;

    Transport(String mode, int maxSpeed) {
        this.mode = mode;
        this.maxSpeed = maxSpeed;
    }
}

class Bus extends Transport {
    int routeNo;
    int seatCount;

    Bus(String mode, int maxSpeed, int routeNo, int seatCount) {
        super(mode, maxSpeed);
        this.routeNo = routeNo;
        this.seatCount = seatCount;
    }

    void showRouteDetails() {
        System.out.println("Transport mode: " + mode);
        System.out.println("Maximum speed: " + maxSpeed + " km/h");
        System.out.println("Route number: " + routeNo);
        System.out.println("Seat count: " + seatCount);
    }

    public static void main(String[] args) {
        Bus bus = new Bus("Road", 80, 12, 40);
        bus.showRouteDetails();
    }
}
