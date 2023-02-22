public class Flower {
    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name;
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        }else{
            this.flowerColor = "Белый";
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        }else{
            this.country = "Россия";
        }
        if (cost <= 0 ) {
            this.cost = 1;
        }else{
            this.cost = cost;
        }
        if (lifeSpan <= 0 ) {
            this.lifeSpan = 3;
        }else{
            this.lifeSpan = lifeSpan;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Integer getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return  "Название: " + name + ". " +
                " Цвет: " + flowerColor + ". " +
                " Страна происхождения: " + country + ". " +
                " Цена: " + cost + " руб. " +
                " Срок стояния: " + lifeSpan + " дней.";
    }
}
