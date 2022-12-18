import java.text.DecimalFormat;

public class Flower {

    private final String flowerName;
    private final String country;
    private final double cost;
    private int lifeSpan;
    final static DecimalFormat df = new DecimalFormat("#.##");


    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName == null || flowerName.isBlank()) {
            this.flowerName = "Тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }
        if (country == null || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        setLifeSpan(lifeSpan);
    }

    @Override
    public String toString() {
        return "Название - " + flowerName + ", " +
                "страна происхождения - " + country + ", " +
                "цена - " + df.format(cost) + ", " +
                "срок стояния, в днях - " + lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if(lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }
}
