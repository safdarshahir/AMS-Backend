package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetType;

public interface IAssetTypeService {

	List<AssetType> findAllAssetTypes();

	AssetType insertAssetType(AssetType assetType);

	AssetType updateAssetType(AssetType assetType);

	void deleteAssetType(int userId);

}
