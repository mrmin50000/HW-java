package prak2.vehicles;

public class Car {
	private String ownerName;
	private int insuranceNumber;

	public String GetOwnerName() {
		return ownerName;
	}

	public int GetInsuranceNumber() {
		return insuranceNumber;
	}

	public void SetOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void SetInsuranceNumber(int insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public Car() {
		ownerName = "Mike";
		insuranceNumber = 8888888;
	}
}
