package classworks.lesson10;

public enum Seasons {
    WINTER(-20.2), SPRING(16.2),
    SUMMER(35.5) {
        public String getDescription() {
            return "Тёплое время года";
        }
    },

    AUTUMN(17.1);

    public double temprature;

    Seasons(double temprature) {
        this.temprature = temprature;
    }

    public double getTemprature() {
        return temprature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
