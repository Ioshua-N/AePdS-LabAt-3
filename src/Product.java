public class Product
{
    // variables
    int code;
    String name;
    float price;

    // constructor
    public Product(int code, String name, float price)
    {
        if (code <= 0)
        {
            throw new IllegalArgumentException("Invalid code.");
        }
        else if (name == null || name == "")
        {
            throw new IllegalArgumentException("Invalid name.");
        }
        else if (price < 0)
        {
            throw new IllegalArgumentException("Invalid price.");
        }
        this.code = code;
        this.name = name;
        this.price = price;
    }

    // getters and setters
    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        if(code <= 0)
        {
            throw new IllegalArgumentException("Invalid code.");
        }
        this.code = code;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if(name == null || name == "")
        {
            throw new IllegalArgumentException("Invalid name.");
        }
        this.name = name;
    }

    public float getPrice()
    {
        return price;
    }

    public void setPrice (float price)
    {
        if (price < 0)
        {
            throw new IllegalArgumentException("Invalid price.");
        }
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Product{" + "code=" + code + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}