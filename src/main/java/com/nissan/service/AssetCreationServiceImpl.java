package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nissan.model.AssetCreation;
import com.nissan.repo.IAssetCreation;

public class AssetCreationServiceImpl implements IAssetCreationService{

	
	//field injection
		@Autowired
		IAssetCreation assetCreationRepo;
		
	@Override
	public List<AssetCreation> findAllAssets() {
		// TODO Auto-generated method stub
		return (List<AssetCreation>) assetCreationRepo.findAll();
	}

}
