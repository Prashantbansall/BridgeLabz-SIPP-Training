public class PrototypeObject implements Cloneable {
    private String name;
    private int value;

    public PrototypeObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // works because class implements Cloneable
    }

    @Override
    public String toString() {
        return "PrototypeObject{name='" + name + "', value=" + value + "}";
    }
}
