public class Delivery {
    private String method;

    public Delivery(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "Delivery method: " + method;
    }
}
