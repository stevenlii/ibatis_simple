package com.upyoo.vmware.model;

import java.util.List;

public class NetworkInfo {
	List<VirtualSwitch> vss;
	List<VirtualNic> vnics;
	public List<VirtualSwitch> getVss() {
		return vss;
	}
	public void setVss(List<VirtualSwitch> vss) {
		this.vss = vss;
	}
	public List<VirtualNic> getVnics() {
		return vnics;
	}
	public void setVnics(List<VirtualNic> vnics) {
		this.vnics = vnics;
	}

}
