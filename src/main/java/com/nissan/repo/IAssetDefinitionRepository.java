package com.nissan.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.nissan.model.AssetDefinition;

public interface IAssetDefinitionRepository extends JpaRepositoryImplementation<AssetDefinition, Integer> {

	@Query("from AssetDefinition where adId=?1")
	AssetDefinition findAssetById(int adId);
	

}
