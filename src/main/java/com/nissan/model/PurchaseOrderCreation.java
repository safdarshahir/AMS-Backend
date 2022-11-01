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
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String pdOrderNo;
	
	
	private long adId;
	@JoinColumn(name = "adId",insertable = false,updatable = false)
	@ManyToOne
	private AssetDefinition assetDefinition;
	
	@OneToOne
	@JoinColumn(name = "atId",insertable = false,updatable = false)
	private int atId;

	
	private int pdQty;
	
	@ManyToOne
	@JoinColumn(name = "vdId",insertable=false,updatable = false)
	private int vdId;
	
	private LocalDate pdDate;
	private LocalDate pdDdate;
	
	private String pdStatus;

	public PurchaseOrderCreation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PurchaseOrderCreation(int pdId, String pdOrderNo, long adId, AssetDefinition assetDefinition, int atId,
			int pdQty, int vdId, LocalDate pdDate, LocalDate pdDdate, String pdStatus) {
		super();
		this.pdId = pdId;
		this.pdOrderNo = pdOrderNo;
		this.adId = adId;
		this.assetDefinition = assetDefinition;
		this.atId = atId;
		this.pdQty = pdQty;
		this.vdId = vdId;
		this.pdDate = pdDate;
		this.pdDdate = pdDdate;
		this.pdStatus = pdStatus;
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

	public long getAdId() {
		return adId;
	}

	public void setAdId(long adId) {
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

}
