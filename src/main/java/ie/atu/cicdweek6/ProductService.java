package ie.atu.cicdweek6;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct(Product product)
    {
        //imagine we have a connection to a database
        myList.add(product);
        return myList;
    }
    public List<Product> getProducts()
    {
        return myList;
    }

    public List<Product> editProducts(int id, Product product)
    {

        for(int i = 0; i<myList.size(); i++)
        {

            if(myList.get(i).getId() == id)
            {
                myList.set(i, product);
            }

        }

        return myList;
    }

    public List<Product> deleteProducts(int id)
    {

        for(int i = 0; i<myList.size(); i++)
        {

            if(myList.get(i).getId() == id)
            {
                myList.remove(i);
            }

        }

        return myList;
    }
}
