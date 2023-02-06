package com.springboot.web.studentcrud.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "stu_table")
	public class Student {
		@Id
		@GeneratedValue(strategy =GenerationType.IDENTITY )
		private int stuid;
		private String stuRollNo;
		private String stuName;
		private String stuCity;
		public Student(int stuid, String stuRollNo, String stuName, String stuCity) {
			super();
			this.stuid = stuid;
			this.stuRollNo = stuRollNo;
			this.stuName = stuName;
			this.stuCity = stuCity;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getStuid() {
			return stuid;
		}
		public void setStuid(int stuid) {
			this.stuid = stuid;
		}
		public String getStuRollNo() {
			return stuRollNo;
		}
		public void setStuRollNo(String stuRollNo) {
			this.stuRollNo = stuRollNo;
		}
		public String getStuName() {
			return stuName;
		}
		public void setStuName(String stuName) {
			this.stuName = stuName;
		}
		public String getStuCity() {
			return stuCity;
		}
		public void setStuCity(String stuCity) {
			this.stuCity = stuCity;
		}
		@Override
		public String toString() {
			return "Student [stuid=" + stuid + ", stuRollNo=" + stuRollNo + ", stuName=" + stuName + ", stuCity=" + stuCity
					+ "]";
		}
		
		
	}


