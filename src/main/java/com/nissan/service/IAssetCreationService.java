package com.nissan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nissan.model.AssetCreation;

@Service
public interface IAssetCreationService {
	
	//Find all 
	List<AssetCreation> findAllAssets();
	//search
	Optional<AssetCreation> findByAssetId(int amId);
	//insert
	AssetCreation addAsset(AssetCreation assetCreation);
	
	//update
	AssetCreation updateAsset(AssetCreation assetCreation);
	
	
	//delete
	void deleteUser(int userId);

}
