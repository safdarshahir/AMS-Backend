package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.AssetDefinition;

import com.nissan.model.AssetDefinition;
import com.nissan.repo.IAssetDefinitionRepository;
import com.nissan.repo.IAssetTypeRepository;

@Service
public class AssetDefinitionServiceImpl implements IAssetDefinitionService {

	@Autowired
	IAssetDefinitionRepository assetDefinitionRepo;

	@Override
	public List<AssetDefinition> findAllAssetDefinitions() {
		return (List<AssetDefinition>) assetDefinitionRepo.findAll();
	}

	
	@Override
	public void deleteAssetDefinition(int adId) {
		assetDefinitionRepo.deleteById(adId);
	}

	@Override
	public void updateAssetDefinition(AssetDefinition assetDefinition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AssetDefinition insertAssetDefinition(AssetDefinition assetDefinition) {
		return assetDefinitionRepo.save(assetDefinition);
	}


	@Override
	public AssetDefinition findAssetById(int adId) {
		
		AssetDefinition _assetDefintion = assetDefinitionRepo.findAssetById(adId);

			if (adId==_assetDefintion.getAdId())
				return _assetDefintion;
			else
				return null;
		}
	}
	


