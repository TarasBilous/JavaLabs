package lab1Java;

public class Main {

	public static void main(String[] args) {
		Supermarket epicenter = new Supermarket();
		Supermarket glove = new Supermarket(200, 50, false, "Glove");
		Supermarket arsen = new Supermarket(250, 80, true, "Arsen", "Petro");

		System.out.println(epicenter.toString());
		System.out.println(glove.toString());
		System.out.println(arsen.toString());

		Supermarket.printStaticSum();
		epicenter.printSum();
		glove.printSum();
		arsen.printSum();

		epicenter.resetValues(100, 30, false, "Epicenter", "Ivan");
		glove.resetValues(300, 120, true, "Gloves", "Mykola");
		arsen.resetValues(70, 190, true, "Ashan", "Semen");

		System.out.println(epicenter.toString());
		System.out.println(glove.toString());
		System.out.println(arsen.toString());
		Supermarket.printStaticSum();

	}

}
