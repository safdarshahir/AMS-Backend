package com.nissan.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.AssetCreation;
import com.nissan.repo.IAssetCreation;

@Service
public class AssetCreationServiceImpl implements IAssetCreationService{

	
	
	//field injection
		@Autowired
		IAssetCreation assetCreationRepo;
		
	@Override
	public List<AssetCreation> findAllAssets() {
		// TODO Auto-generated method stub
		return (List<AssetCreation>) assetCreationRepo.findAll();
	}

	@Override
	public Optional<AssetCreation> findByAssetId(int amId) {
		// TODO Auto-generated method stub
		
		return assetCreationRepo.findById(amId);
	}

	@Override
	@Transactional
	public AssetCreation addAsset(AssetCreation assetCreation) {
		// TODO Auto-generated method stub
		return assetCreationRepo.save(assetCreation);
	}

	@Override
	@Transactional
	public AssetCreation updateAsset(AssetCreation assetCreation) {
		// TODO Auto-generated method stub
		return assetCreationRepo.save(assetCreation);
	}

	

	@Override
	public void deleteUser(int amId) {
		// TODO Auto-generated method stub
		assetCreationRepo.deleteById(amId);
	}

	

}
