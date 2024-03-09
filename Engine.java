package com.gl.model;

public class Engine {
		
			private int engineID;
			private String engineMfgName;
			private int engineCapacity;
			private int engineCC;
			
			public Engine() {}
			public Engine(int engineID, String engineMfgName, int engineCapacity, int engineCC) {
				this.engineID = engineID;
				this.engineMfgName = engineMfgName;
				this.engineCapacity = engineCapacity;
				this.engineCC = engineCC;
			}
			public int getEngineID() {
				return engineID;
			}
			
			public String getEngineMfgName() {
				return engineMfgName;
			}
			
			public int getEngineCapacity() {
				return engineCapacity;
			}
			
			public int getEngineCC() {
				return engineCC;
			}
			
			@Override
			public String toString() {
				return "Engine [engineID=" + engineID + ", engineMfgName=" + engineMfgName + ", engineCapacity="
						+ engineCapacity + ", engineCC=" + engineCC + "]";
			}
			
			
			
}
