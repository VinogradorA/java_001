package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("world");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной"+ s.l+ "=" + s.area());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Площадь прямоугольника со сторонами"+ r.a + "и" + r.b + "=" + r.area());

		Point p = new Point(5.1,8.3);
		System.out.println("Растояние между двумя точками" + p.p2 + "и" + p.p1 + "=" + p.distance());
	}

	public static void  hello(String somebody) {
		System.out.println("Hello," + somebody + "!");
	}
}