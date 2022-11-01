package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.AssetType;
import com.nissan.repo.IAssetTypeRepository;

@Service
public class AssetTypeServiceImpl implements IAssetTypeService {

	//private UserServiceImpl assetTypeRepo;

		@Autowired
		IAssetTypeRepository assetTypeRepo;
		
		
	@Override
	public List<AssetType> findAllAssetTypes() {
		return (List<AssetType>) assetTypeRepo.findAll();
	}

	@Override
	public AssetType insertAssetType(AssetType assetType) {
		return assetTypeRepo.save(assetType);
	}

	@Override
	@Transactional
	public AssetType updateAssetType(AssetType assetType) {
		return assetTypeRepo.save(assetType);
		
	}

	@Override
	public void deleteAssetType(int assetType) {
		assetTypeRepo.deleteById(assetType);
	}

}
