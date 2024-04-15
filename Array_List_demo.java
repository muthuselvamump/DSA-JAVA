import java.util.*;

public class Array_List_demo {
    public static void main(String[] args) {
        System.out.println("Raw genric type");
        List colours=new ArrayList();
        colours.add("purple");
        colours.add("green");
        colours.add(1);
        colours.add(new Object());
        for (Object object : colours) {
            System.out.println(object);
        }
        System.out.println(colours);
        System.out.println("specified type");
        List<String> colours1=new ArrayList<String>();
        colours1.add("blue");
        colours1.add("yellow");
        colours1.add("white");
        System.out.println("Array list size: "+colours1.size());
        System.out.println("contains element: "+colours1.contains("blue"));
        System.out.println("contains element: "+colours1.contains("violet"));
        System.out.println("another loop method");
        colours1.forEach(System.out::println);
        System.out.println("tradional for loop iteration method");
        for (int i = 0; i < colours1.size(); i++) {
            System.out.println(colours1.get(i));
            
        }

    }
    
}
