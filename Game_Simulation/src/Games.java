public class Games {


    private String name;
    private String developer;
    private int price;

    public Games(String name, String developer, int price) {
        this.name = name;
        this.developer = developer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Games{" +
                "name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
