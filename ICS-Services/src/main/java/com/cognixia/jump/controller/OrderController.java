package com.cognixia.jump.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.exception.ResourceAlreadyExistsException;
import com.cognixia.jump.model.OrderItem;
import com.cognixia.jump.repository.OrderRepository;

@RestController
@RequestMapping("api/orders")
public class OrderController {

	
	
	
	@Autowired
	OrderRepository repo;
	
	
	
	
	
	
	
	//Get all orders
	@GetMapping()
	List<OrderItem> getAllOrders() {
		return repo.findAll();
	}
	
	
	
	
	//Get order by id
	@GetMapping("/id")
	public ResponseEntity<?> getOrderById(@RequestParam(name = "order_id") Long order_id) throws ResourceAlreadyExistsException {
		
		Optional<OrderItem> found = repo.findById(order_id);
		
		if(found.isPresent())
		{
			return ResponseEntity.status(200).body(found);
		}
		
		throw new ResourceAlreadyExistsException("Order", order_id);
	}
	
	
	
	
	//Create an order
	@PostMapping()
	public ResponseEntity<?> createOrder() {
		
	return null;
		
	}
	
	
	//Update an order
//	@PutMapping()
	
<<<<<<< HEAD
=======
		Optional<OrderItem> found = repo.findById(order_id);
		
		return null;	// finish
		
		
	}
	
	
	
	
	//Delete an Order
//	@DeleteMapping("/delete")
//	public ResponseEntity<?> deleteOrderById(@RequestParam Long order_id) throws ResourceNotFoundException {
//		
//		Optional<OrderItem> opt = repo.findById(order_id);
//		
//		if(opt.isPresent())
//		{
//			OrderItem deleted = opt.get();
//			
//			repo.deleteById(order_id);
//			
//			return ResponseEntity.status(200).body(deleted);
//		}
//		
//		throw new ResourceNotFoundException("Order", order_id);
//	}
>>>>>>> 7136012 (	modified:   ICS-Services/src/main/java/com/cognixia/jump/controller/OrderController.java)
	
	
	
	
}






























