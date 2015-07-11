package com.upyoo.agentvc.dao;
import java.util.List;

public interface EntityDao<T> {
	public void save(String id, T t);

	public List<T> query();
}
