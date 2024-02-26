package array;

public class Karan {
	
String name = "Ram";

		public static void main(String[] args) {

			try {
				Class<?> cls = Class.forName("array");

				@SuppressWarnings("deprecation")
				Karan obj = (Karan) cls.newInstance();

				System.out.println(obj.name);

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

		}
	}


