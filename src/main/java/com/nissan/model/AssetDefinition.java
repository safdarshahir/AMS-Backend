package com.nissan.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblAssetDefinition")
public class AssetDefinition {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int adId;
	
	@Column(nullable=false,unique=true)
	private String adName;
	
	private int atId;
	
	@JoinColumn(name="atId",insertable=false,updatable=false)      //User.roleId=Role.roleId
	@ManyToOne  
	private AssetType assetType;
	
	@ManyToOne
	private VendorCreation vendor;
	
	private String adClass;


	public AssetDefinition() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AssetDefinition(int adId, String adName, int atId, AssetType assetType, String adClass) {
		super();
		this.adId = adId;
		this.adName = adName;
		this.atId = atId;
		this.assetType = assetType;
		this.adClass = adClass;
	}


	public int getAdId() {
		return adId;
	}


	public void setAdId(int adId) {
		this.adId = adId;
	}


	public String getAdName() {
		return adName;
	}


	public void setAdName(String adName) {
		this.adName = adName;
	}


	public int getAtId() {
		return atId;
	}


	public void setAtId(int atId) {
		this.atId = atId;
	}


	public AssetType getAssetType() {
		return assetType;
	}


	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}


	public String getAdClass() {
		return adClass;
	}


	public void setAdClass(String adClass) {
		this.adClass = adClass;
	}
	
	
}