package com.nissan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.AssetCreation;
import com.nissan.service.IAssetCreationService;

@CrossOrigin   //helps to avoid cors error
@RestController
@RequestMapping("api/")
public class AssetCreationController {


	//field depenendency injection
	@Autowired
	IAssetCreationService assetCreationService;
	
	
	@GetMapping("assetCreations")
	//List all users
	public List<AssetCreation> findAllAssets(){
		return assetCreationService.findAllAssets();
	}
	

	//list by serial number	
	@GetMapping("assetCreations/{amId}")
	public Optional<AssetCreation> findByAssetId(@PathVariable int amId) {
		System.out.println("Inside controller");
		return assetCreationService.findByAssetId(amId);
	}
	

	
	@PostMapping("assetCreations")
	public ResponseEntity<AssetCreation> addAssets(@RequestBody AssetCreation assetCreation){
		System.out.println("Inserting Record");
		return new ResponseEntity<AssetCreation> (assetCreationService.addAsset(assetCreation),HttpStatus.OK);
		
	}
	
	@PutMapping("assetCreations")
	public AssetCreation updateAsset(@RequestBody AssetCreation assetCreation) {
		System.out.println("Updating a record");
		assetCreationService.updateAsset(assetCreation);
		return assetCreation;
	}
	
	@DeleteMapping("assetCreations/{amId}")
	public void deleteUser(@PathVariable int amId) {
		System.out.println("delete");
		assetCreationService.deleteUser(amId);
		
	}

	
	
}
