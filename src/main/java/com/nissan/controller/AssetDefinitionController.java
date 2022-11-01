package com.nissan.controller;

import java.util.List;

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

import com.nissan.model.AssetDefinition;
import com.nissan.model.AssetType;
import com.nissan.model.User;
import com.nissan.service.IAssetDefinitionService;

@CrossOrigin // helps to avoid cors error
@RestController
@RequestMapping("api/")
public class AssetDefinitionController {

	// field DI injection
	@Autowired
	IAssetDefinitionService assetDefinitionService;

	@GetMapping("assetDefinitions")
	public List<AssetDefinition> findAll() {
		return assetDefinitionService.findAllAssetDefinitions();
	}
	
	@GetMapping("assetDefinitions/{adId}")
	public AssetDefinition findAssetById(@PathVariable int adId)
	{
		System.out.println("Inside controller");
		return assetDefinitionService.findAssetById(adId);
	}

	// Add Asset Type.
	@PostMapping("assetDefinitions")
	public ResponseEntity<AssetDefinition> insertUser(@RequestBody AssetDefinition assetDefinition) {
		System.out.println("Inserting a record");
		return new ResponseEntity<AssetDefinition>(assetDefinitionService.insertAssetDefinition(assetDefinition),
				HttpStatus.OK);
	}

	@PutMapping("assetDefinitions")
	public AssetDefinition updateUser(@RequestBody AssetDefinition assetDefinition) {

		System.out.println("Updating a record");
		assetDefinitionService.updateAssetDefinition(assetDefinition);
		return assetDefinition;

	}

	@DeleteMapping("assetDefinitions/{adId}")
	public void deleteUser(@PathVariable int adId) {

		System.out.println("Delete a record");
		assetDefinitionService.deleteAssetDefinition(adId);

	}
}
