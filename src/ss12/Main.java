package ss12;

import demo_mvc_c0225g1.entity.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Product, Integer> cart = new TreeMap<>();
        cart.put(new Product(1,"ss"),10);
        cart.put(new Product(2,"nokia"),20);
        cart.put(new Product(3,"iphone"),30);
        cart.put(new Product(1,"ss"),100);
        // duyet map
        Set<Product> keySet = cart.keySet();
        for (Product p: keySet) {
            System.out.println(p.getName() +":"+cart.get(p));
        }

//        List<Product> products = new ArrayList<>();
//        products.add(new Product(7,"Bsamsung"));
//        products.add(new Product(2,"samsung"));
//        products.add(new Product(7,"Asamsung"));
//        System.out.println(products);
//        // sap xep theo id va name
//        Collections.sort(products);
//        System.out.println(products);
//        // chi muon sx theo ten
//        Collections.sort(products,new CompaByName());
//        System.out.println(products);



    }
}
