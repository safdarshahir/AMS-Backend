package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tblAssetType")
public class AssetType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int atId;
	
	@Column(nullable=false,unique=true)
	private String atName;
	
	
	@JsonIgnore
	@OneToMany(mappedBy="assetType",cascade=CascadeType.ALL)
	private List<AssetDefinition> assets;


	public AssetType() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AssetType(int atId, String atName, List<AssetDefinition> assets) {
		super();
		this.atId = atId;
		this.atName = atName;
		this.assets = assets;
	}


	public int getAtId() {
		return atId;
	}


	public void setAtId(int atId) {
		this.atId = atId;
	}


	public String getAtName() {
		return atName;
	}


	public void setAtName(String atName) {
		this.atName = atName;
	}


	public List<AssetDefinition> getAssets() {
		return assets;
	}


	public void setAssets(List<AssetDefinition> assets) {
		this.assets = assets;
	}
	
	
}
