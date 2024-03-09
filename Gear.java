package com.gl.model;

public class Gear {
		private int gearID;
		private String gearMfgName;
		private String gearType;
		public Gear() {}
		
		public int getGearID() {
			return gearID;
		}
		public void setGearID(int gearID) {
			this.gearID = gearID;
		}
		public String getGearMfgName() {
			return gearMfgName;
		}
		public void setGearMfgName(String gearMfgName) {
			this.gearMfgName = gearMfgName;
		}
		public String getGearType() {
			return gearType;
		}
		public void setGearType(String gearType) {
			this.gearType = gearType;
		}
		@Override
		public String toString() {
			return "Gear [gearID=" + gearID + ", gearMfgName=" + gearMfgName + ", gearType=" + gearType + "]";
		}
		
		
		
}
