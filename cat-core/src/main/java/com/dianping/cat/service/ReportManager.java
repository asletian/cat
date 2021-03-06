package com.dianping.cat.service;

import java.util.Map;
import java.util.Set;

import com.dianping.cat.service.DefaultReportManager.StoragePolicy;

public interface ReportManager<T> {
	public void cleanup(long startTime);

	public void initialize();
	
	public Set<String> getDomains(long startTime);

	public T getHourlyReport(long startTime, String domain, boolean createIfNotExist);

	public Map<String, T> getHourlyReports(long startTime);

	public Map<String, T> loadHourlyReports(long startTime, StoragePolicy policy);

	public void storeHourlyReports(long startTime, StoragePolicy policy);
	
}
