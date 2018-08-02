package homeworks.lesson10.task4;

public class Studio {
    public static void main(String[] args) {
        Pants pantsM = new Pants(3, 21, "белого");
        Pants pantsW = new Pants(2, 23, "красного");
        Skirt skirt = new Skirt(2, 54, "чёрного");
        Tie tie = new Tie(2, 9, "чёрного");
        TShirt tShirtM = new TShirt(2, 24, "белого");
        TShirt tShirtW = new TShirt(3, 22, "белого");

        Cloth[] cloths = {pantsM, pantsW, skirt, tie, tShirtM, tShirtW};

            pantsM.clotheMan();
            tie.clotheMan();
            tShirtM.clotheMan();

            pantsW.clotheWoman();
            skirt.clotheWoman();
            tShirtW.clotheWoman();

    }
}