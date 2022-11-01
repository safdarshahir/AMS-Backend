package com.nissan.service;

import java.util.List;
import java.util.Optional;

import com.nissan.model.PurchaseOrderCreation;

public interface IPurchaseService {

	List<PurchaseOrderCreation> getAllPurchase();
	
	PurchaseOrderCreation addPurchase(PurchaseOrderCreation purchaseOrder);
	
	PurchaseOrderCreation editPurchase(PurchaseOrderCreation purchaseOrder);
	
	Optional<PurchaseOrderCreation> searchPurchaseById(int purchaseId);
	
	void deletePurchaseOrder(int purchaseId);
}
