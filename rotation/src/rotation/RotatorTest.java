package rotation;

public class RotatorTest {

	public static void main(String[] args) {
		String s1 = "Teststring";
		String s2 = "StrinwgTest";
		
		System.out.println("Is " +s1 + " a rotation of "+s2+"? " + Rotator.isRotation(s1, s2));
		System.out.println("Is " +s1 + " a rotation of "+s2+"? " + Rotator.isRotation2(s1, s2));

	}

}
