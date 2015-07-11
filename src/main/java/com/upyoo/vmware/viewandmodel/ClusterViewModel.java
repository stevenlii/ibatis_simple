package com.upyoo.vmware.viewandmodel;


/**
 * Cluster logic message
 *
 */
public class ClusterViewModel {
	String uuid;
	String id ;//cluster id
	String description_name;
	String vcenter_id;

	Integer host_count;
	Integer vm_count;

	// CPU
	Integer cpu_core_count;// cpu总核心数
	Integer vcpu_core_count;// vcpu总核心数
	Double cpu_used_scale;// cpu平均使用率

	Double cpu_portion_scale;// * cpu core 分配比
								// ：由vcpu_core_count/cpu_core_count得出
	// Memory
	Double memory_cap;// 物理内存总容量
	Double vmemory_cap;// 虚拟内存总容量
	Double memory_used_cap;// 内存已使用容量
	Double memory_used_scale;// 内存使用率

	Double memory_portion_scale;// 内存容量分配比：由vmemory_cap/memory_cap登出
	// Store:
	Double store_cap;// 存储总容量
	Double vstore_cap;// v存储总容量
	Double store_used_cap;//存储使用
	// Store saa
	Double store_sas_cap;// sas存储容量

	Double store_sas_used_cap;// sas存储使用容量
	Double store_sas_used_scale;// sas存储使用率
	// Store sata
	Double store_sata_cap;// sata存储容量
	Double store_sata_used_cap;// sata存储使用容量
	Double store_sata_used_scale;// sata存储使用率
	Double store_portion_scale;// 存储分配比
	String last_update_time;
	@Override
	public String toString() {
		return "ClusterViewModel [id=" + id + ", description_name="
				+ description_name + ", vcenter_id=" + vcenter_id
				+ ", host_count=" + host_count + ", vm_count=" + vm_count
				+ ", cpu_core_count=" + cpu_core_count + ", vcpu_core_count="
				+ vcpu_core_count + ", cpu_usage=" + cpu_used_scale
				+ ", cpu_portion_scale=" + cpu_portion_scale + ", memory_cap="
				+ memory_cap + ", vmemory_cap=" + vmemory_cap
				+ ", memory_used_cap=" + memory_used_cap
				+ ", memory_used_scale=" + memory_used_scale
				+ ", memory_portion_scale=" + memory_portion_scale
				+ ", store_cap=" + store_cap + ", vstroe_cap=" + vstore_cap
				+ ", store_sas_cap=" + store_sas_cap + ", store_sas_used_cap="
				+ store_sas_used_cap + ", store_sas_used_scale="
				+ store_sas_used_scale + ", store_sata_cap=" + store_sata_cap
				+ ", store_sata_used_cap=" + store_sata_used_cap
				+ ", store_sata_used_scale=" + store_sata_used_scale
				+ ", vstore_cap=" + vstore_cap + ", store_portion_scale="
				+ store_portion_scale + "]";
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription_name() {
		return description_name;
	}

	public void setDescription_name(String description_name) {
		this.description_name = description_name;
	}

	public String getVcenter_id() {
		return vcenter_id;
	}

	public void setVcenter_id(String vcenter_id) {
		this.vcenter_id = vcenter_id;
	}

	public Integer getHost_count() {
		return host_count;
	}

	public void setHost_count(Integer host_count) {
		this.host_count = host_count;
	}

	public Integer getVm_count() {
		return vm_count;
	}

	public void setVm_count(Integer vm_count) {
		this.vm_count = vm_count;
	}

	public Integer getCpu_core_count() {
		return cpu_core_count;
	}

	public void setCpu_core_count(Integer cpu_core_count) {
		this.cpu_core_count = cpu_core_count;
	}

	public Integer getVcpu_core_count() {
		return vcpu_core_count;
	}

	public void setVcpu_core_count(Integer vcpu_core_count) {
		this.vcpu_core_count = vcpu_core_count;
	}

	public Double getCpu_used_scale() {
		return cpu_used_scale;
	}

	public void setCpu_used_scale(Double cpu_usage) {
		this.cpu_used_scale = cpu_usage;
	}


	public Double getCpu_portion_scale() {
		return cpu_portion_scale;
	}

	public void setCpu_portion_scale(Double cpu_portion_scale) {
		this.cpu_portion_scale = cpu_portion_scale;
	}

	public Double getMemory_cap() {
		return memory_cap;
	}

	public void setMemory_cap(Double memory_cap) {
		this.memory_cap = memory_cap;
	}

	public Double getVmemory_cap() {
		return vmemory_cap;
	}

	public void setVmemory_cap(Double vmemory_cap) {
		this.vmemory_cap = vmemory_cap;
	}

	public Double getMemory_used_cap() {
		return memory_used_cap;
	}

	public void setMemory_used_cap(Double memory_used_cap) {
		this.memory_used_cap = memory_used_cap;
	}

	public Double getMemory_used_scale() {
		return memory_used_scale;
	}

	public void setMemory_used_scale(Double memory_used_scale) {
		this.memory_used_scale = memory_used_scale;
	}

	public Double getMemory_portion_scale() {
		return memory_portion_scale;
	}

	public void setMemory_portion_scale(Double memory_portion_scale) {
		this.memory_portion_scale = memory_portion_scale;
	}

	public Double getStore_cap() {
		return store_cap;
	}

	public Double getVstore_cap() {
		return vstore_cap;
	}

	public void setVstore_cap(Double vstore_cap) {
		this.vstore_cap = vstore_cap;
	}

	public void setStore_cap(Double store_cap) {
		this.store_cap = store_cap;
	}


	public Double getStore_used_cap() {
		return store_used_cap;
	}

	public void setStore_used_cap(Double store_used_cap) {
		this.store_used_cap = store_used_cap;
	}

	public Double getStore_sas_cap() {
		return store_sas_cap;
	}

	public void setStore_sas_cap(Double store_sas_cap) {
		this.store_sas_cap = store_sas_cap;
	}

	public Double getStore_sas_used_cap() {
		return store_sas_used_cap;
	}

	public void setStore_sas_used_cap(Double store_sas_used_cap) {
		this.store_sas_used_cap = store_sas_used_cap;
	}

	public Double getStore_sas_used_scale() {
		return store_sas_used_scale;
	}

	public void setStore_sas_used_scale(Double store_sas_used_scale) {
		this.store_sas_used_scale = store_sas_used_scale;
	}

	public Double getStore_sata_cap() {
		return store_sata_cap;
	}

	public void setStore_sata_cap(Double store_sata_cap) {
		this.store_sata_cap = store_sata_cap;
	}

	public Double getStore_sata_used_cap() {
		return store_sata_used_cap;
	}

	public void setStore_sata_used_cap(Double store_sata_used_cap) {
		this.store_sata_used_cap = store_sata_used_cap;
	}

	public Double getStore_sata_used_scale() {
		return store_sata_used_scale;
	}

	public void setStore_sata_used_scale(Double store_sata_used_scale) {
		this.store_sata_used_scale = store_sata_used_scale;
	}

	public Double getStore_portion_scale() {
		return store_portion_scale;
	}

	public void setStore_portion_scale(Double store_portion_scale) {
		this.store_portion_scale = store_portion_scale;
	}

	public String getLast_update_time() {
		return last_update_time;
	}

	public void setLast_update_time(String last_update_time) {
		this.last_update_time = last_update_time;
	}

}
