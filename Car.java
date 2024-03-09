package com.gl.model;

public class Car {
			private int carID;
			private String modelName;
			private String mfgName;
			private double price;
			Engine myEngine;
			Gear myGear;
			public Car() {}
			public Car(int carID, String modelName, String mfgName, double price, Engine myEngine, Gear myGear) {
				this.carID = carID;
				this.modelName = modelName;
				this.mfgName = mfgName;
				this.price = price;
				this.myEngine = myEngine;
				this.myGear = myGear;
			}
			public int getCarID() {
				return carID;
			}
			public String getModelName() {
				return modelName;
			}
			public String getMfgName() {
				return mfgName;
			}
			public double getPrice() {
				return price;
			}
			public Engine getMyEngine() {
				return myEngine;
			}
			public Gear getMyGear() {
				return myGear;
			}
			@Override
			public String toString() {
				return "Car [carID=" + carID + ", modelName=" + modelName + ", mfgName=" + mfgName + ", price=" + price
						+ ", myEngine=" + myEngine + ", myGear=" + myGear + "]";
			}
			public void setCarID(int carID) {
				this.carID = carID;
			}
			public void setModelName(String modelName) {
				this.modelName = modelName;
			}
			public void setMfgName(String mfgName) {
				this.mfgName = mfgName;
			}
			public void setPrice(double price) {
				this.price = price;
			}
			public void setMyEngine(Engine myEngine) {
				this.myEngine = myEngine;
			}
			public void setMyGear(Gear myGear) {
				this.myGear = myGear;
			}
			
			
			
			
			
}
