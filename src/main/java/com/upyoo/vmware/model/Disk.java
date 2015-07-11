package com.upyoo.vmware.model;

public class Disk {
	String uuid;
	String path;
	String diskName;
	String[] addresses;
	String iScsiName;

	public String getUuid() {
		
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDiskName() {
		return diskName;
	}

	public void setDiskName(String diskName) {
		this.diskName = diskName;
	}

	public String[] getAddresses() {
		return addresses;
	}

	public void setAddresses(String[] addresses) {
		this.addresses = addresses;
	}

	public String getiScsiName() {
		return iScsiName;
	}

	public void setiScsiName(String iScsiName) {
		this.iScsiName = iScsiName;
	}

}
