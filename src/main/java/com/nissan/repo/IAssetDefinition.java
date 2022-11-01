package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.nissan.model.AssetDefinition;

public interface IAssetDefinition extends JpaRepositoryImplementation<AssetDefinition, Integer> {

}
