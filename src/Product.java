public class Product implements Rankable{
private String nameProduct;
private double price;
private int quality;

    public Product(String nameProduct, double price, int quality) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.quality = quality;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }
    @Override
    public float getRank() {
    return  (float) (quality/price);

    }
}


/*
nome
prezzo
        qualita

 */