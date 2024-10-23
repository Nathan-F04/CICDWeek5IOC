package ie.atu.cicdweek6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class ProductController {

    private ProductService myProduct;

    public ProductController(ProductService myProduct) {
        this.myProduct = myProduct;
    }
    @PostMapping("/newProduct")
    public List<Product> newProduct(@RequestBody Product product)
    {
        //business logic to add this to a database
        //return list of all products from the database
        return myProduct.addProduct(product);
    }

    @GetMapping("/getProducts")
    public List<Product> allProducts()
    {
        return myProduct.getProducts();
    }

}
