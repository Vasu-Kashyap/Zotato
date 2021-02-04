import java.util.ArrayList;

public class fooditem {
    static int no_of_objects = 0;
    {
        no_of_objects += 1;
    }
    private int id;
    private String name;
    private float price;
    private int quantity;
    private int discount;
    private String category;
    private String restroname;


    public fooditem(String name, float price, int quantity, int discount, String category )
    {
        this.name = name;
        this.id = no_of_objects;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        this.category = category;
        this.restroname = "";
    }

    public fooditem(String name, float price, int quantity, int discount, String category,String restroname )
    {
        this.name = name;
        this.id = no_of_objects;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        this.category = category;
        this.restroname = restroname;
    }
    public static int getNo_of_objects() {
        return no_of_objects;
    }

    public static void setNo_of_objects(int no_of_objects) {
        fooditem.no_of_objects = no_of_objects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity,String x) {
        if (x.equals("add"))
        {this.quantity += quantity;}
        else if (x.equals("deduct"))
        {this.quantity -= quantity;}

    }
    public void setQuantity(int quantity)
    {this.quantity = quantity;}

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRestroname() {
        return restroname;
    }

    public void setRestroname(String restroname) {
        this.restroname = restroname;
    }
}
