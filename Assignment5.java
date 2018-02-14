public class Assignment5 {
	public static void main(String [] args) {
		int count = 0;
		for (int i=100; i<=200; i++) {
			int number = i;
			if (number%5==0) {
				System.out.print(number + " ");
				count++;
				if (count==9) {
					System.out.println(number + " ");
					count = 0;
				}
			}
		}
	}
}
