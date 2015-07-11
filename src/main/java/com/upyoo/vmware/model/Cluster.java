//package com.upyoo.vmware.model;
//
//import java.util.List;
//import java.util.Map;
//
//import com.vmware.vim25.mo.HostSystem;
//
//public class Cluster {
//	String name;
//	String datacenter;
//	String path;
//	int totalCpu;
//	Double cpu_used_scale;// cpu平均使用率
//	
//	int numHosts;
//	short numCpuCores;
//	
//	long totalMemory;
//	long totalDataStore;
//	String currentEVCModeKey;
//	Boolean haEnabled;
//	Boolean drsEnabled;
//	Double store_used_cap;//存储使用
//	String server;
//	
//	HostSystem[] HostSystems;
//	List<HostSystem> HostSystemsList;
//	List<ESXServer> esxServers;
//	List<VMachine> VMachineList;
//	Map<String, HostSystem> HostSystemsMap;
//	List<Datastore> datastores;
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDatacenter() {
//		return datacenter;
//	}
//
//	public void setDatacenter(String datacenter) {
//		this.datacenter = datacenter;
//	}
//
//	public String getPath() {
//		return path;
//	}
//
//	public void setPath(String path) {
//		this.path = path;
//	}
//
//	public int getTotalCpu() {
//		return totalCpu;
//	}
//
//	public void setTotalCpu(int totalCpu) {
//		this.totalCpu = totalCpu;
//	}
//
//	public Double getCpu_used_scale() {
//		return cpu_used_scale;
//	}
//
//	public void setCpu_used_scale(Double cpu_used_scale) {
//		this.cpu_used_scale = cpu_used_scale;
//	}
//
//	public Double getStore_used_cap() {
//		return store_used_cap;
//	}
//
//	public void setStore_used_cap(Double store_used_cap) {
//		this.store_used_cap = store_used_cap;
//	}
//
//	public int getNumHosts() {
//		return numHosts;
//	}
//
//	public void setNumHosts(int numHosts) {
//		this.numHosts = numHosts;
//	}
//
//	public short getNumCpuCores() {
//		return numCpuCores;
//	}
//
//	public void setNumCpuCores(short numCpuCores) {
//		this.numCpuCores = numCpuCores;
//	}
//
//	public long getTotalMemory() {
//		return totalMemory;
//	}
//
//	public long getTotalDataStore() {
//		return totalDataStore;
//	}
//
//	public void setTotalDataStore(long totalDataStore) {
//		this.totalDataStore = totalDataStore;
//	}
//
//	public void setTotalMemory(long totalMemory) {
//		this.totalMemory = totalMemory;
//	}
//
//	public String getCurrentEVCModeKey() {
//		return currentEVCModeKey;
//	}
//
//	public void setCurrentEVCModeKey(String currentEVCModeKey) {
//		this.currentEVCModeKey = currentEVCModeKey;
//	}
//
//	public Boolean getHaEnabled() {
//		return haEnabled;
//	}
//
//	public void setHaEnabled(Boolean haEnabled) {
//		this.haEnabled = haEnabled;
//	}
//
//	public Boolean getDrsEnabled() {
//		return drsEnabled;
//	}
//
//	public void setDrsEnabled(Boolean drsEnabled) {
//		this.drsEnabled = drsEnabled;
//	}
//
//	public String getServer() {
//		return server;
//	}
//
//	public void setServer(String server) {
//		this.server = server;
//	}
//
//	public HostSystem[] getHostSystems() {
//		return HostSystems;
//	}
//
//	public void setHostSystems(HostSystem[] hostSystems) {
//		HostSystems = hostSystems;
//	}
//
//	public List<HostSystem> getHostSystemsList() {
//		return HostSystemsList;
//	}
//
//	public void setHostSystemsList(List<HostSystem> hostSystemsList) {
//		HostSystemsList = hostSystemsList;
//	}
//
//	public Map<String, HostSystem> getHostSystemsMap() {
//		return HostSystemsMap;
//	}
//
//	public void setHostSystemsMap(Map<String, HostSystem> hostSystemsMap) {
//		HostSystemsMap = hostSystemsMap;
//	}
//
//	public List<ESXServer> getEsxServers() {
//		return esxServers;
//	}
//
//	public void setEsxServers(List<ESXServer> esxServers) {
//		this.esxServers = esxServers;
//	}
//
//	public List<VMachine> getVMachineList() {
//		return VMachineList;
//	}
//
//	public void setVMachineList(List<VMachine> vMachineList) {
//		VMachineList = vMachineList;
//	}
//
//	public List<Datastore> getDatastores() {
//		return datastores;
//	}
//
//	public void setDatastores(List<Datastore> datastores) {
//		this.datastores = datastores;
//	}
//
//
//}
