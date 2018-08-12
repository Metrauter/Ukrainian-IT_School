package homeworks.lesson10.task4;

public class Studio {
    public static void main(String[] args) {
        Pants pants = new Pants(Size.XXS, 21, "белого");
        Skirt skirt = new Skirt(Size.M, 54, "чёрного");
        Tie tie = new Tie(Size.XS, 9, "чёрного");
        TShirt tShirt = new TShirt(Size.L, 24, "белого");

        Cloth[] cloths = {pants, skirt, tie, tShirt};

        clothMan(cloths);
        clothWoman(cloths);
    }

    public static void clothMan(Cloth[] cloths) {
        for (Cloth cloth : cloths) {
            if (cloth instanceof ManCloth) {
                ((ManCloth) cloth).clotheMan();
            }
        }
    }

    public static void clothWoman(Cloth[] cloths) {
        for (Cloth cloth : cloths) {
            if (cloth instanceof WomanCloth) {
                ((WomanCloth) cloth).clotheWoman();
            }
        }
    }
}