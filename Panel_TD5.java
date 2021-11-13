
public class Panel_TD5 {
	import java.util.Iterator;
	import java.util.List;



		public static Iterator<Integer> (int first, int last) {
			Iterator<Integer> it = new Iterator<Integer>() {

				private int current = first;

				@Override
				public boolean hasNext() {
					return current >= first && current <= last;
				}

				@Override
				public Integer next() {
					return current++;
				}

				@Override
				public void remove() {
					throw new UnsupportedOperationException();
				}
			};
			return it;
		}

		

	