package by.kazak.spring.publicTransportApp.beans;

public class Bus implements Transport {
    private final static String TIME = "40 minutes";

    private Bus () {
    }

    public static Bus getBus () {
        return new Bus();
    }

    public void init () {
        System.out.println(String.format("Initialisation of bean: %s", this.getClass().getSimpleName()));
    }

    public void destroy () {
        System.out.println(String.format("Destruction of bean: %s", this.getClass().getSimpleName()));
    }

    @Override
    public String getTravelTime () {
        return String.format("%s: %s", this.getClass().getSimpleName(), TIME);
    }
}
