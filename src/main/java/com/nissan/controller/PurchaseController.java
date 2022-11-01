package com.nissan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.PurchaseOrderCreation;
import com.nissan.service.IPurchaseService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class PurchaseController {
	
	@Autowired
	IPurchaseService purchaseService;
	
	@GetMapping("list")
	List<PurchaseOrderCreation> getAllPurchases(){
		return purchaseService.getAllPurchase();
	}
	
	@PostMapping("add")
	PurchaseOrderCreation addPurchase(@RequestBody PurchaseOrderCreation purchaseOrder) {
		return purchaseService.addPurchase(purchaseOrder);
	}
	
	
	@PutMapping("edit")
	PurchaseOrderCreation editPurchase(@RequestBody PurchaseOrderCreation purchaseOrder) {
		return purchaseService.editPurchase(purchaseOrder);
	}
	
	@GetMapping("search/{id}")
	Optional<PurchaseOrderCreation> searchById(@PathVariable int id){
		return purchaseService.searchPurchaseById(id);
	}
	
	@PostMapping("delete/{id}")
	void deletePurchase(@PathVariable int id) {
		purchaseService.deletePurchaseOrder(id);
	}
	

}
