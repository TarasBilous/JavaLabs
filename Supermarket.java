package lab1Java;

public class Supermarket {
	private static int totalNumberOfWorkers = 0;

	private int squareInMetres;
	private int numberOfWorkers;
	private boolean isOpen;
	private String supermarketName;
	private String managerName = "Not assigned";

	public Supermarket() {
		squareInMetres = 150;
		numberOfWorkers = 20;
		isOpen = false;
		supermarketName = "Unnamed";
		managerName = "Not assigned";

		totalNumberOfWorkers += numberOfWorkers;
	}

	public Supermarket(int squareInMetres, int numberOfWorkers, boolean isOpen, String supermarketName) {
		this.squareInMetres = squareInMetres;
		this.numberOfWorkers = numberOfWorkers;
		this.isOpen = isOpen;
		this.supermarketName = supermarketName;

		totalNumberOfWorkers += numberOfWorkers;
	}

	public Supermarket(int squareInMetres, int numberOfWorkers, boolean isOpen, String supermarketName,
			String managerName) {
		this.squareInMetres = squareInMetres;
		this.numberOfWorkers = numberOfWorkers;
		this.isOpen = isOpen;
		this.supermarketName = supermarketName;
		this.managerName = managerName;

		totalNumberOfWorkers += numberOfWorkers;
	}

	public String toString() {
		return "Supermarket: " + supermarketName + "\nsquareInMetres: " + squareInMetres + "\nWorkers: "
				+ numberOfWorkers + "\nOpen: " + isOpen + "\nManager name: " + managerName + "\n==============";
	}

	public static void printStaticSum() {
		System.out.println("Total number of all workers is " + totalNumberOfWorkers);
	}

	public void printSum() {
		System.out.println("Total number of all workers is " + totalNumberOfWorkers);
	}

	public void resetValues(int squareInMetres, int numberOfWorkers, boolean isOpen, String supermarketName,
			String managerName) {
		totalNumberOfWorkers -= this.numberOfWorkers;
		totalNumberOfWorkers += numberOfWorkers;

		this.squareInMetres = squareInMetres;
		this.numberOfWorkers = numberOfWorkers;
		this.isOpen = isOpen;
		this.supermarketName = supermarketName;
		this.managerName = managerName;
	}

	public int getSquareInMetres() {
		return squareInMetres;
	}

	public void setSquareInMetres(int squareInMetres) {
		this.squareInMetres = squareInMetres;
	}

	public int getNumberOfWorkers() {
		return numberOfWorkers;
	}

	public void setNumberOfWorkers(int numberOfWorkers) {
		totalNumberOfWorkers -= this.numberOfWorkers;
		totalNumberOfWorkers += numberOfWorkers;

		this.numberOfWorkers = numberOfWorkers;
	}

	public boolean getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public String getSupermarketName() {
		return supermarketName;
	}

	public void setSupermarketName(String supermarketName) {
		this.supermarketName = supermarketName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

}
