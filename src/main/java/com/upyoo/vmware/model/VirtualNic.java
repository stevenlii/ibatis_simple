package com.upyoo.vmware.model;

public class VirtualNic {
	String name;
	String portgroup;
	String mac;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPortgroup() {
		return portgroup;
	}

	public void setPortgroup(String portgroup) {
		this.portgroup = portgroup;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

}
