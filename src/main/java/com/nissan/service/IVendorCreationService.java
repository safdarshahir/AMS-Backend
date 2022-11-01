package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetDefinition;
import com.nissan.repo.IVendorCreation;



public interface IVendorCreationService {
	
	//get all vendors
		List<IVendorCreation> getAllVendors();
		
		//add a vendor
		IVendorCreation addVendor(IVendorCreation ivendorcreation);
		
		//edit a vendor
		IVendorCreation updateVendor(IVendorCreation ivendorcreation);
		
		//delete a vendor
		IVendorCreation deleteVendor(IVendorCreation ivendorcreation);
		
		
		//search by phone
		IVendorCreation searchByPhone(int phoneNumber);
		
		//Show Asset
		List<AssetDefinition> getAllAssets();
		
		

}
