public class Teste
{
    public static void main(String[] args)
    {
        // testing exceptions
        Product test = new Product(1, "a", 23);
        System.out.println(test.toString());
        System.out.println(1);
        test.setCode(2);
        System.out.println(2);
        test.setName("b");
        System.out.println(3);
        test.setPrice(1);;
        System.out.println(test.toString());
    }
}
