package Alpinism;

public class Mountain {
    private String name;
    private String country;
    private int height;

    public Mountain(String name, String country, int height){
        this.name = name;
        this.country = country;
        this.height = height;
    }

    public String getName() {
        return name;
    }
    public int getHeight() {
        return height;
    }
    public String getCountry() {
        return country;
    }
}
