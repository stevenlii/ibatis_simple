package com.upyoo.vmware.model;

public class VMachine {
	String uuid;
	String hostid;
	String clusterId;
	String name;//型号名
	String mac;
	String portgroup;
	String vmPath;
	String vmID;
	String model;
	String power;//开关
	String health;
	String version;
	String vmIP;
	String cpucount;
	Long storageCommitted ;
	Long storageUnCommitted ;
	double storageTotal ;
	Integer memorySizeMB ;

	public String getHostid() {
		return hostid;
	}

	public void setHostid(String hostid) {
		this.hostid = hostid;
	}

	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getPortgroup() {
		return portgroup;
	}

	public void setPortgroup(String portgroup) {
		this.portgroup = portgroup;
	}

	public String getVmPath() {
		return vmPath;
	}

	public void setVmPath(String vmPath) {
		this.vmPath = vmPath;
	}

	public String getVmID() {
		return vmID;
	}

	public void setVmID(String vmID) {
		this.vmID = vmID;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVmIP() {
		return vmIP;
	}

	public void setVmIP(String vmIP) {
		this.vmIP = vmIP;
	}

	public String getCpucount() {
		return cpucount;
	}

	public void setCpucount(String cpucount) {
		this.cpucount = cpucount;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Long getStorageCommitted() {
		return storageCommitted;
	}

	public void setStorageCommitted(Long storageCommitted) {
		this.storageCommitted = storageCommitted;
	}

	public Long getStorageUnCommitted() {
		return storageUnCommitted;
	}

	public void setStorageUnCommitted(Long storageUnCommitted) {
		this.storageUnCommitted = storageUnCommitted;
	}


	public double getStorageTotal() {
		return storageTotal;
	}

	public void setStorageTotal(double storageTotal) {
		this.storageTotal = storageTotal;
	}

	public Integer getMemorySizeMB() {
		return memorySizeMB;
	}

	public void setMemorySizeMB(Integer memorySizeMB) {
		this.memorySizeMB = memorySizeMB;
	}

}
