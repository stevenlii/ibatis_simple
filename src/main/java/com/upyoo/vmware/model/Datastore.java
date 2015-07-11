package com.upyoo.vmware.model;

public class Datastore {
	String uuid;
	String name;
	String status;
	Double  store_used_cap;//存储使用
	long capacity;
	long freeSpace;
	long maxFileSize;
	String clusterId;
	String url;
	String type;
	String version;
	String vmfsUUID;
	Disk disk;
	String vm;
	String last_update_time;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getStore_used_cap() {
		return store_used_cap;
	}

	public void setStore_used_cap(Double store_used_cap) {
		this.store_used_cap = store_used_cap;
	}

	public long getCapacity() {
		return capacity;
	}
	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}
	public long getFreeSpace() {
		return freeSpace;
	}
	public void setFreeSpace(long freeSpace) {
		this.freeSpace = freeSpace;
	}
	public long getMaxFileSize() {
		return maxFileSize;
	}
	public void setMaxFileSize(long maxFileSize) {
		this.maxFileSize = maxFileSize;
	}
	public String getClusterId() {
		return clusterId;
	}
	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getVmfsUUID() {
		return vmfsUUID;
	}
	public void setVmfsUUID(String vmfsUUID) {
		this.vmfsUUID = vmfsUUID;
	}
	public Disk getDisk() {
		return disk;
	}
	public void setDisk(Disk disk) {
		this.disk = disk;
	}
	public String getVm() {
		return vm;
	}
	public void setVm(String vm) {
		this.vm = vm;
	}

	public String getLast_update_time() {
		return last_update_time;
	}

	public void setLast_update_time(String last_update_time) {
		this.last_update_time = last_update_time;
	}
	
}
