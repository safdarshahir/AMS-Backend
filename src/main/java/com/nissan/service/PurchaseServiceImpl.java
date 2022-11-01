package com.nissan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.PurchaseOrderCreation;
import com.nissan.repo.IPurchaseRepo;

@Service
public class PurchaseServiceImpl implements IPurchaseService {
	
	@Autowired
	IPurchaseRepo repoPurchase;

	@Override
	public PurchaseOrderCreation addPurchase(PurchaseOrderCreation purchaseOrder) {
		return repoPurchase.save(purchaseOrder);
	}

	@Override
	public PurchaseOrderCreation editPurchase(PurchaseOrderCreation purchaseOrder) {
		return repoPurchase.save(purchaseOrder);
	}

	@Override
	public Optional<PurchaseOrderCreation> searchPurchaseById(int purchaseId) {
		return repoPurchase.findById(purchaseId);
	}

	@Override
	public void deletePurchaseOrder(int purchaseId) {

		repoPurchase.deleteById(purchaseId);
	}

	@Override
	public List<PurchaseOrderCreation> getAllPurchase() {
		// TODO Auto-generated method stub
		return repoPurchase.findAll();
	}

}
