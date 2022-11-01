package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.nissan.model.AssetType;

public interface IAssetTypeRepository extends JpaRepositoryImplementation<AssetType, Integer> {

}
