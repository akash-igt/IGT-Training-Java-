class Emp2
{
		private int id;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Emp2 [id=" + id + ", name=" + name + "]";
		}
		
		
}
public class Demo12 {
	public static void main(String[] args) {
		Emp2 e = new Emp2();
		e.setId(100);
		e.setName("AKash");
		System.out.println(e);
	}

}
