package com.bdqn.tcmp.util;

public class Page {
	private Integer pageIndex;// 当前第几页
	private Integer pageCount;// 总页数,不需要set方法
	private Integer pageSize;// 每页行数
	private Integer rowCount;// 总行数
	private Integer fromTo; // 位置偏移量，不需要set

	public Integer getFromTo() {
		return (pageIndex - 1) * this.pageSize;
	}

	public Integer getPageCount() {
		if (rowCount % pageSize == 0) {
			pageCount = rowCount / pageSize;
		} else {
			pageCount = rowCount / pageSize + 1;
		}
		return pageCount;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getRowCount() {
		return rowCount;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}
}
