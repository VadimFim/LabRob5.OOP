public final class PhoneStorage extends Iphone {
    private int quantityOnStock;
    private int quantitySold;

    protected PhoneStorage(String name, double weight, String color, double diagonal, double worktime) {
        super(name, weight, color, diagonal, worktime);
    }
    public final int calculateSoldPhones() {
        int iphoneSold = (int) super.executeRecursiveMethod(4);
        int samsungSold = (int) super.executeRecursiveMethod(5);
        int xiaomiSold = (int) super.executeRecursiveMethod(8);
        quantitySold = iphoneSold + samsungSold + xiaomiSold;
        return quantitySold;
    }

    //Метод для визначення проданих смартфонів.
    public void sellPhones() {
        int soldPhones = calculateSoldPhones();
        if (quantityOnStock >= soldPhones) {
            quantityOnStock -= soldPhones;
            System.out.println("Продано " + soldPhones + " смартфонів. Залишок на складі: " + quantityOnStock);
        } else {
            System.out.println("На складі недостатньо смартфонів для продажу.");
        }
    }

    // Кількість проданих смартфонів.
    public int getQuantitySold() {
        return quantitySold;
    }
    //Кількість смартфонів на складі.
    public int getQuantityOnStock() {
        return quantityOnStock;
    }
}
