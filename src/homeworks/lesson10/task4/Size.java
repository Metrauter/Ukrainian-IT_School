package homeworks.lesson10.task4;

public enum Size {
    XXS(32) {
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);

    public String getDescription() {
        return "Взрослый размер";
    }

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    private int euroSize;

    public int getEuroSize() {
        return euroSize;
    }
}
