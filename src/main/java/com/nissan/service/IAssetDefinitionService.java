package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetDefinition;
import com.nissan.model.AssetType;

public interface IAssetDefinitionService {

	List<AssetDefinition> findAllAssetDefinitions();


	void deleteAssetDefinition(int atId);

	void updateAssetDefinition(AssetDefinition assetDefinition);

	AssetDefinition insertAssetDefinition(AssetDefinition assetDefinition);


	AssetDefinition findAssetById(int adId);

}
