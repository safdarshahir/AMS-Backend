package com.nissan.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TblAssetMaster")
public class AssetCreation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int amId;
	
	
	private int atId;
	
	@JoinColumn(name="atId",insertable=false,updatable=false)
	@ManyToOne
	private AssetType assetType; 
	
	private int vdId;
	
	@JoinColumn(name="vdId",insertable=false,updatable=false)
	@ManyToOne
	private VendorCreation vendorCreation; 
	
	private int adId;
	
	@JoinColumn(name="adId",insertable=false,updatable=false)
	@ManyToOne
	private AssetDefinition assetDefinition; 
	
	private String amModel;
	
	@Column(unique=true)
	private String amSnumber;
	
	private String amMyyear;
	
	private Date amPdate;
	
	private String amWarranty;
	
	private Date amFrom;
	
	private Date amTo;
	
	private boolean isActive;

	public  AssetCreation() {
		// TODO Auto-generated constructor stub
	}

	public AssetCreation(int amId, int atId, AssetType assetType, int vdId, VendorCreation vendorCreation, int adId,
			AssetDefinition assetDefinition, String amModel, String amSnumber, String amMyyear, Date amPdate,
			String amWarranty, Date amFrom, Date amTo,boolean isActive) {
		super();
		this.amId = amId;
		this.atId = atId;
		this.assetType = assetType;
		this.vdId = vdId;
		this.vendorCreation = vendorCreation;
		this.adId = adId;
		this.assetDefinition = assetDefinition;
		this.amModel = amModel;
		this.amSnumber = amSnumber;
		this.amMyyear = amMyyear;
		this.amPdate = amPdate;
		this.amWarranty = amWarranty;
		this.amFrom = amFrom;
		this.amTo = amTo;
		this.isActive=isActive;
	}

	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getAmId() {
		return amId;
	}

	public void setAmId(int amId) {
		this.amId = amId;
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

	public int getVdId() {
		return vdId;
	}

	public void setVdId(int vdId) {
		this.vdId = vdId;
	}

	public VendorCreation getVendorCreation() {
		return vendorCreation;
	}

	public void setVendorCreation(VendorCreation vendorCreation) {
		this.vendorCreation = vendorCreation;
	}

	public int getAdId() {
		return adId;
	}

	public void setAdId(int adId) {
		this.adId = adId;
	}

	public AssetDefinition getAssetDefinition() {
		return assetDefinition;
	}

	public void setAssetDefinition(AssetDefinition assetDefinition) {
		this.assetDefinition = assetDefinition;
	}

	public String getAmModel() {
		return amModel;
	}

	public void setAmModel(String amModel) {
		this.amModel = amModel;
	}

	public String getAmSnumber() {
		return amSnumber;
	}

	public void setAmSnumber(String amSnumber) {
		this.amSnumber = amSnumber;
	}

	public String getAmMyyear() {
		return amMyyear;
	}

	public void setAmMyyear(String amMyyear) {
		this.amMyyear = amMyyear;
	}

	public Date getAmPdate() {
		return amPdate;
	}

	public void setAmPdate(Date amPdate) {
		this.amPdate = amPdate;
	}

	public String getAmWarranty() {
		return amWarranty;
	}

	public void setAmWarranty(String amWarranty) {
		this.amWarranty = amWarranty;
	}

	public Date getAmFrom() {
		return amFrom;
	}

	public void setAmFrom(Date amFrom) {
		this.amFrom = amFrom;
	}

	public Date getAmTo() {
		return amTo;
	}

	public void setAmTo(Date amTo) {
		this.amTo = amTo;
	}

	@Override
	public String toString() {
		return "AssetMaster [amId=" + amId + ", atId=" + atId + ", vdId=" + vdId + ", adId=" + adId + ", amModel="
				+ amModel + ", amSnumber=" + amSnumber + ", amMyyear=" + amMyyear + ", amPdate=" + amPdate
				+ ", amWarranty=" + amWarranty + ", amFrom=" + amFrom + ", amTo=" + amTo + "]";
	}
	
	
	
	
	

}
