package com.cg.frs.dto;

public class FlatRegistrationDTO {

	private int ownerId, flatType, flatArea;
	private double rentAmout, depositAmount;
	private long flatRegId;
	public long getFlatRegId() {
		return flatRegId;
	}
	public void setFlatRegId(long flatRegId) {
		this.flatRegId = flatRegId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public int getFlatType() {
		return flatType;
	}
	public void setFlatType(int flatType) {
		this.flatType = flatType;
	}
	public int getFlatArea() {
		return flatArea;
	}
	public void setFlatArea(int flatArea) {
		this.flatArea = flatArea;
	}
	public double getRentAmout() {
		return rentAmout;
	}
	public void setRentAmout(double rentAmout) {
		this.rentAmout = rentAmout;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
}
