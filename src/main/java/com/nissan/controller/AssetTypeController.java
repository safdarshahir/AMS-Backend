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

import com.nissan.model.AssetType;
import com.nissan.service.IAssetTypeService;



@CrossOrigin		//helps to avoid cors error
@RestController
@RequestMapping("api/")
public class AssetTypeController {

	//field DI injection
		@Autowired
		IAssetTypeService assetTypeService;
		
		@GetMapping("assetTypes")
		public List<AssetType> findAll(){
			return assetTypeService.findAllAssetTypes();
		}
		
		
		
		//Add Asset Type.
		@PostMapping("assetTypes")
		public ResponseEntity<AssetType> insertUser(@RequestBody AssetType assetType)
		{
			System.out.println("Inserting a record");
			return new ResponseEntity<AssetType> (assetTypeService.insertAssetType(assetType),HttpStatus.OK);
		}
		
		@PutMapping("assetTypes")
		public AssetType updateUser(@RequestBody AssetType assetType) {
			
			System.out.println("Updating a record");
			assetTypeService.updateAssetType(assetType);
			return assetType;
			
		}
		
		@DeleteMapping("assetTypes/{atId}")
		public void deleteUser(@PathVariable int atId) {
			
			System.out.println("Delete a record");
			assetTypeService.deleteAssetType(atId);
			
			
		}
		
		
}
