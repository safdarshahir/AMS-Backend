package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.AssetCreation;

@Repository
public interface IAssetCreation extends JpaRepositoryImplementation<AssetCreation,Integer> {

}
