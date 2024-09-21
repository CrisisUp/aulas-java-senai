package main;

public class GenericClass2 <T, S>{
	// Properties
		private T password;
		private S description;
		
		// Constructors
		public GenericClass2() {}
		public GenericClass2(T password, S description) {
			this.password = password;
			this.description = description;
			
		}
		
		// Behaviors
		public T getPassword() {return password;}
		public void setPassword(T password) {this.password = password;}
		
		public S getDescription() {return description;}
		public void setDescription(S description) {this.description = description;}
}
