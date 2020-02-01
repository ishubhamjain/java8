package stack;

public  enum Status {
    ACTIVATE(true), INACTIVE(false);
    public boolean value;
    Status(boolean value) {
        this.value = value;
    }
    boolean getValue() {
        return this.value;
    }
}
