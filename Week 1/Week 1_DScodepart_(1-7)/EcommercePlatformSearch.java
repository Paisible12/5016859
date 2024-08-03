import java.util.Arrays;
import java.util.Comparator;


class Product {
    private String productId;
    private String productName;
    private String category;

    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

 @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

public class EcommercePlatformSearch {


    public static Product linearSearch(Product[] products, String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

  
    public static Product binarySearch(Product[] products, String productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductId().compareTo(productId);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("001", "Product1", "Category1"),
            new Product("002", "Product2", "Category2"),
            new Product("003", "Product3", "Category1"),
            new Product("004", "Product4", "Category3")
        };

   
        System.out.println("Linear Search:");
        System.out.println(linearSearch(products, "003"));

    
        Arrays.sort(products, Comparator.comparing(Product::getProductId));

     
        System.out.println("Binary Search:");
        System.out.println(binarySearch(products, "003"));
    }
}
