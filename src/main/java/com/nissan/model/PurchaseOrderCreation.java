package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblPurchase")
public class PurchaseOrderCreation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pdId;
	
	@Column(unique = true,nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String pdOrderNo;
	
	
	private int adId;
	@JoinColumn(name = "adId",insertable = false,updatable = false)
	@ManyToOne
	private AssetDefinition assetDefinition;
	
	
	private int atId;
	@OneToOne
	@JoinColumn(name = "atId",insertable = false,updatable = false)
	private AssetType assetType;
	
	private int pdQty;
	
	private int vdId;
	@ManyToOne
	@JoinColumn(name = "vdId",insertable=false,updatable = false)
	private VendorCreation vendorCreation;
	
	
	private LocalDate pdDate;
	private LocalDate pdDdate;
	
	private String pdStatus;
	
	private LocalDate pdCreatedDate;

	public PurchaseOrderCreation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PurchaseOrderCreation(int pdId, String pdOrderNo, int adId, AssetDefinition assetDefinition, int atId,
			AssetType assetType, int pdQty, int vdId, VendorCreation vendorCreation, LocalDate pdDate,
			LocalDate pdDdate, String pdStatus,LocalDate pdCreatedDate) {
		super();
		this.pdId = pdId;
		this.pdOrderNo = pdOrderNo;
		this.adId = adId;
		this.assetDefinition = assetDefinition;
		this.atId = atId;
		this.assetType = assetType;
		this.pdQty = pdQty;
		this.vdId = vdId;
		this.vendorCreation = vendorCreation;
		this.pdDate = pdDate;
		this.pdDdate = pdDdate;
		this.pdStatus = pdStatus;
		this.pdCreatedDate = pdCreatedDate;
	}


	public int getPdId() {
		return pdId;
	}

	public void setPdId(int pdId) {
		this.pdId = pdId;
	}

	public String getPdOrderNo() {
		return pdOrderNo;
	}

	public void setPdOrderNo(String pdOrderNo) {
		this.pdOrderNo = pdOrderNo;
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

	public int getAtId() {
		return atId;
	}

	public void setAtId(int atId) {
		this.atId = atId;
	}

	public int getPdQty() {
		return pdQty;
	}

	public void setPdQty(int pdQty) {
		this.pdQty = pdQty;
	}

	public int getVdId() {
		return vdId;
	}

	public void setVdId(int vdId) {
		this.vdId = vdId;
	}

	public LocalDate getPdDate() {
		return pdDate;
	}

	public void setPdDate(LocalDate pdDate) {
		this.pdDate = pdDate;
	}

	public LocalDate getPdDdate() {
		return pdDdate;
	}

	public void setPdDdate(LocalDate pdDdate) {
		this.pdDdate = pdDdate;
	}

	public String getPdStatus() {
		return pdStatus;
	}

	public void setPdStatus(String pdStatus) {
		this.pdStatus = pdStatus;
	}


	public AssetType getAssetType() {
		return assetType;
	}


	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}


	public VendorCreation getVendorCreation() {
		return vendorCreation;
	}


	public void setVendorCreation(VendorCreation vendorCreation) {
		this.vendorCreation = vendorCreation;
	}


	public LocalDate getPdCreatedDate() {
		return pdCreatedDate;
	}


	public void setPdCreatedDate(LocalDate pdCreatedDate) {
		this.pdCreatedDate = pdCreatedDate;
	}
	

}
