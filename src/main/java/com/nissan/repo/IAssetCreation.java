package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface IAssetCreation extends JpaRepositoryImplementation<T, ID> {

}
