package com.upyoo.vmware.model;

/**
 * HostSystem 就是物理机
 *
 */
public class ESXServer {
	String uuid;
	String name;
	String cpufrequency;
	String clusterId;
	String unit;
	String last_update_time;
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
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

	public String getCpufrequency() {
		return cpufrequency;
	}

	public void setCpufrequency(String cpufrequency) {
		this.cpufrequency = cpufrequency;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getLast_update_time() {
		return last_update_time;
	}

	public void setLast_update_time(String last_update_time) {
		this.last_update_time = last_update_time;
	}

	@Override
	public String toString() {
		return "ESXServer [uuid=" + uuid + ", name=" + name + ", cpufrequency="
				+ cpufrequency + ", clusterId=" + clusterId + "]";
	}

}
