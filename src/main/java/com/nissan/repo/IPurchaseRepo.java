package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.PurchaseOrderCreation;


@Repository
public interface IPurchaseRepo extends JpaRepositoryImplementation<PurchaseOrderCreation, Integer> {

}
