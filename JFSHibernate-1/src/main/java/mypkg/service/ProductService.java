package mypkg.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypkg.entity.Product;
import mypkg.repository.ProductRepository;
@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	public List<Product> saveProducts(List<Product> products) {
		return productRepository.saveAll(products);
	
	}
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	public Product getProductByName(String name) {
		return productRepository.findByName(name);
	}
	public Product getProductById(int id) {
		return productRepository.findById(id);
	}
	public Product updateProduct(Product product) {
		Product availableProduct=productRepository.findById(product.getId());
		
		availableProduct.setQuantity(100);
		
		return productRepository.save(product);
	}
	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		  return "Product removed is:" +id;
	}
}
