package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tblVendor")
public class VendorCreation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vdId;
	
	private String vdName;
	private String vdType;
	private  int atId ;
	private LocalDate vdFrom;
	private LocalDate vdTo;
	private String vdAddr;
	private int phoneNumber;
	
	
	
	@JoinColumn(name="atId" ,insertable= false,  updatable = false)
	@OneToMany

	private  AssetDefinition assetdefinition ;



	//default constructor
	public VendorCreation() {
		super();
		// TODO Auto-generated constructor stub
	}



	//Parameterized Constructor
	public VendorCreation(int vdId, String vdName, String vdType, int atId, LocalDate vdFrom, LocalDate vdTo,
			String vdAddr, int phoneNumber, AssetDefinition assetdefinition) {
		super();
		this.vdId = vdId;
		this.vdName = vdName;
		this.vdType = vdType;
		this.atId = atId;
		this.vdFrom = vdFrom;
		this.vdTo = vdTo;
		this.vdAddr = vdAddr;
		this.phoneNumber = phoneNumber;
		this.assetdefinition = assetdefinition;
	}



	//Getters and Setters
	public int getVdId() {
		return vdId;
	}



	public void setVdId(int vdId) {
		this.vdId = vdId;
	}



	public String getVdName() {
		return vdName;
	}



	public void setVdName(String vdName) {
		this.vdName = vdName;
	}



	public String getVdType() {
		return vdType;
	}



	public void setVdType(String vdType) {
		this.vdType = vdType;
	}




	public int getatId() {
		return atId;
	}



	public void setatId(int atId) {
		this.atId = atId;
	}



	public LocalDate getVdFrom() {
		return vdFrom;
	}



	public void setVdFrom(LocalDate vdFrom) {
		this.vdFrom = vdFrom;
	}



	public LocalDate getVdTo() {
		return vdTo;
	}



	public void setVdTo(LocalDate vdTo) {
		this.vdTo = vdTo;
	}



	public String getVdAddr() {
		return vdAddr;
	}



	public void setVdAddr(String vdAddr) {
		this.vdAddr = vdAddr;
	}



	public AssetDefinition getAssetdefinition() {
		return assetdefinition;
	}



	public void setAssetdefinition(AssetDefinition assetdefinition) {
		this.assetdefinition = assetdefinition;
	}



	public int getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	
	

}
