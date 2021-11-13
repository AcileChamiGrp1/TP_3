
	public class MyList_TD5{
		private int prem,dern;

		public MyList(int prem, int dern) {
			if (prem > dern) {
				throw new IllegalArgumentException("le premier est plus grand que le dernier");
			}
			this.prem = premier;
			this.dern = dernier;
		}

		@Override
		public Integer get(int index) {
			int current;
			current = index + premier;
			if (current > dernier || index < 0) {
				throw new IndexOutOfBoundsException("");
			}
			return current;
		}

		@Override
		public int size() {
			return dernier - premier + 1;
		}
	}
	
}
