package com.example.testfileupload.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class StorageProperties {

	private String location = "upload-location";

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
