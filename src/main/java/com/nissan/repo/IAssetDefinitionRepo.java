package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.nissan.model.AssetDefinition;
import com.nissan.model.AssetType;

public interface IAssetDefinitionRepo extends JpaRepositoryImplementation<AssetType, Integer> {

}
