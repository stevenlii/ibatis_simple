package com.upyoo.vmware.model;

public class VirtualSwitch {
	String name;
	String physicalMAC;
	String portgroup;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhysicalMAC() {
		return physicalMAC;
	}

	public void setPhysicalMAC(String physicalMAC) {
		this.physicalMAC = physicalMAC;
	}

	public String getPortgroup() {
		return portgroup;
	}

	public void setPortgroup(String portgroup) {
		this.portgroup = portgroup;
	}

}
