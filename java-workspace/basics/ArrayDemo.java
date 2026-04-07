import java.util.Arrays;
class ArrayDemo{
	public static void main(String[] args) {
		Object[] arr = new Object[3];
		String name1 = "Saksam";
		String name2 = "Akash";
		String name3 = "Harsh";
		System.out.println("=======without array=======");
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);

		System.out.println("======creating array========");
		String[] students = new String[3];
		students[0] = "Saksam";//initializing the values
		students[1] = "Akash";
		students[2] = "Harash";

		System.out.println("=========iterate by using simple for loop=========");
		for (int i=0; i<students.length ;i++ ) {
			System.out.println(students[i]);
		}
		System.out.println("======iterating by using for-each loop========");
		for(String name: students){
			System.out.println(name);
		}

	}
}