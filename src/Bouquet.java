import java.text.DecimalFormat;
import java.util.Arrays;

public class Bouquet {
    Flower[] bouquet;
    final static DecimalFormat df = new DecimalFormat("#.##");

    public Bouquet(Flower[] bouquet) {
        this.bouquet = bouquet;
    }

    private double countCost() {
        double bouquetCost = 0;
        for (Flower bouquet : bouquet) {
            bouquetCost += bouquet.getCost();
        }
        bouquetCost = bouquetCost * 1.1;
        return bouquetCost;
    }

    private int getBouquetLifeSpan() {
        int minLifeSpan = 31;
        for (Flower bouquet : bouquet) {
            if(minLifeSpan > bouquet.getLifeSpan())
            minLifeSpan = bouquet.getLifeSpan();
        }
        return minLifeSpan;
    }

    private String getContentBouquet() {
        StringBuilder contentBouquet = new StringBuilder();
        for (Flower flower : bouquet) {
            contentBouquet.append(flower.getFlowerName()).append("; ");
        }
        return contentBouquet.toString();
    }

    @Override
    public String toString() {
        return "Букет: " + getContentBouquet() + "\n" +
                "Цена: " + df.format(countCost()) + "; Срок стояния букета, в днях: " + getBouquetLifeSpan() +
                '}';
    }
}
