package com.nissan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nissan.model.AssetCreation;

@Service
public interface IAssetCreationService {
	
	//Find all 
			List<AssetCreation> findAllAssets();

}
