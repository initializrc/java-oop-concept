public class Main {
    public static void main(String[] args) {

        // membuat object geberic class dengan tipe data String
        GenericClass<String> myStack1 = new GenericClass<String>();
        myStack1.push("Negara");
        myStack1.push("Kesatuan");
        myStack1.push("Republik");
        myStack1.push("Indonesia");

        System.out.println(myStack1.getSize());
        System.out.println(myStack1.pop());

        // membuat object generic class dengan tipe data Integer
        GenericClass<Integer> myStack2 = new GenericClass<Integer>();
        myStack2.push(10);
        myStack2.push(20);
        myStack2.push(30);
        System.out.println(myStack2.getSize());
        System.out.println(myStack2.pop());

        Integer[] numberArray = {2,4,6,8,10};
        String[] wordArray = {"Negara", "Republik", "Kesatuan", "Indonesia"};

        System.out.println("\n");

        // method dengan tipe data Integer
        GenericClass.print(numberArray);

        // method dengan tipe data String
        GenericClass.print(wordArray);
    }
}
