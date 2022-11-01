package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.VendorCreation;

@Repository
public interface IVendorCreation extends JpaRepositoryImplementation<VendorCreation, Integer> {

}
