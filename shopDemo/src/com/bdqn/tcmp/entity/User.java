package com.bdqn.tcmp.entity;

import java.io.Serializable;

public class User implements Serializable {
		private Integer userId;
		private String userName;
		private String userPwd;
		private String phone;
		private String address;
		private Integer levelId;
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserPwd() {
			return userPwd;
		}
		public void setUserPwd(String userPwd) {
			this.userPwd = userPwd;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Integer getLevelId() {
			return levelId;
		}
		public void setLevelId(Integer levelId) {
			this.levelId = levelId;
		}
		public User(Integer userId, String userName, String userPwd,
				String phone, String address, Integer levelId) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.userPwd = userPwd;
			this.phone = phone;
			this.address = address;
			this.levelId = levelId;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName
					+ ", userPwd=" + userPwd + ", phone=" + phone
					+ ", address=" + address + ", levelId=" + levelId + "]";
		}
		
}
