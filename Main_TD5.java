


	import java.util.Iterator;
	import java.util.List;
	
	public class Main_TD5 {
		public static void main(String[] args) {
			Iterator<Integer> it = Panel_TD5(1, 5);
			for (; it.hasNext();) {
				System.out.println(it.next());
			}

			for (int i : Panel_TD5(1, 5)) {
				System.out.println(i);
			}
			List<Integer> b = Panel_TD5(3, 6);
			for (int c : l) {
				System.out.println(c);
			}
			System.out.println(get(1));

		}
	}