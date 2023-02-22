package s0106n1ejercicio1;

public class NoGenericMethod {

		private Object ob1;
		private Object ob2;
		private Object ob3;
		
		public NoGenericMethod(Object ob1, Object ob2, Object ob3) {
			
			this.ob1 = ob1;
			this.ob2 = ob2;
			this.ob3 = ob3;
		}

		public Object getOb1() {
			return ob1;
		}

		public void setOb1(Object ob1) {
			this.ob1 = ob1;
		}

		public Object getOb2() {
			return ob2;
		}

		public void setOb2(Object ob2) {
			this.ob2 = ob2;
		}

		public Object getOb3() {
			return ob3;
		}

		public void setOb3(Object ob3) {
			this.ob3 = ob3;
		}

		@Override
		public String toString() {
			return "NoGenericMethod [ob1=" + ob1 + ", ob2=" + ob2 + ", ob3=" + ob3 + "]";
		}
		
		
	

}
