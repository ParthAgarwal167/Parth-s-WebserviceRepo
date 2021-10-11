package com.java8.streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
 
class Product1
{
    int id;
    String name;
    float price;

    public Product1(int id, String name, float price) 
    {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
 
    public int getId() 
    {
        return id;
    }
 
    public void setId(int id) 
    {
        this.id = id;
    }
 
    public String getName() 
    {
        return name;
    }
 
    public void setName(String name) 
    {
        this.name = name;
    }
 
    public float getPrice() 
    {
        return price;
    }
 
    public void setPrice(float price) 
    {
        this.price = price;
    }
}
 
public class StreamProductOperation1 
{ 
    public static void main(String ar[]) 
    {
        List<Product> productlist = new ArrayList<Product>();
 
        productlist.add(new Product(1, "hp latop", 25000f));
        productlist.add(new Product(2, "dell", 40000f));
        productlist.add(new Product(3, "hp latop", 60000));
        productlist.add(new Product(4, "hp latop", 350000));
        productlist.add(new Product(5, "hp latop", 700000));
 
        productlist.stream() // apply streams
                   .filter(p -> p.price > 60000) // filting price
                   .map(pm -> pm.price) // fetching price
                   .forEach(System.out::println); // iterating prices
 
        Map<Object, Object> prodcutlist = productlist.stream().filter(pm -> pm.price > 60000)
                .collect(Collectors.toMap(pm -> pm.id, pm -> pm.price));
        System.out.println(prodcutlist);
    }
}