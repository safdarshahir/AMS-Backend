package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.demo.model.Role;

@Entity
@Table(name="TblAssetMaster")
public class AssetMaster {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int amId;
	
	
	private String amAtypeId;
	
	@JoinColumn(name="atId",insertable=false,updatable=false)
	@ManyToOne
	private AssetType assetType; 
	
	private String amAdId;

}
