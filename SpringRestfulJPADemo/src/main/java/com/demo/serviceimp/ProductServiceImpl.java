package com.demo.serviceimp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.jparepositories.ProductRepository;
import com.demo.model.Product;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	ProductRepository productRepository;
	
	//For adding the products
	@Override
	public Product addProduct(Product product)
	{
		// TODO Auto-generated method stub
		Product productdetails=productRepository.save(product);
		return productdetails;
	}
	
	//For listing the products in the database
	@Override
	public ArrayList<Product> ListOfProducts()
	{
		// TODO Auto-generated method stub
		ArrayList<Product> list=(ArrayList<Product>) productRepository.findAll();
		return list;
	}
	
	//for deleting the product by id
	@Override
	public void deleteProductById(long id)
	{
		// TODO Auto-generated method stub
	    productRepository.deleteById(id);
	}
	
	//for viewing the product by id
	@Override
	public Product viewProductById(long id)
	{
		// TODO Auto-generated method stub
		Product productbyid=productRepository.findAllById(id);
		return productbyid;
	}

	//for updating a specific product by id
	@Override
	public Product updateOfProductById(long id, Product productDetails)
	{
		// TODO Auto-generated method stub
		Product productidcheck=productRepository.findAllById(id);
		if(productDetails.getId()==productidcheck.getId())
			updateProduct(productDetails);
		return productidcheck;
	}
	
	//for updating the existing product
	@Override
	public Product updateProduct(Product product)
	{
		// TODO Auto-generated method stub
		Product product2=productRepository.save(product);
		return product2;
	}
}
