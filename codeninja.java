class Shape {
	int width;
	int height;
	int indent;
	
	Shape(int width) {
		this.width = width;
	}
	
	Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	Shape(int width, int height, int indent) {
		this.width = width;
		this.height = height;
		this.indent = indent;
	}
	
	public int countParams() {
		if(this.width != 0 && this.height == 0 && this.indent == 0){
			return 1;
		}else if(width != 0 && height != 0 && indent == 0){
			 return 2;
		}
		return 3;
	}
	public void draw() {
		int param_num = countParams();
		switch(param_num) {
			
			case 1:
				for(int i = 0; i<this.width; i++) {
					for(int j = this.width; j >0; j--) {
						System.out.print("*");
					}
					System.out.println("");
				}
			break;
			
			case 2:
				for(int i = 0; i<this.height; i++) {
					for(int j = this.width; j > 0; j--) {
						System.out.print("*");
					}
					System.out.println("");
				}
			break;
			
			case 3:
				for(int i = 0; i<this.height; i++){
					for(int k = this.indent; k > 0; k--) {
						System.out.print(" ");
					}
					this.indent += 1;
					for(int j = this.width; j > 0; j--) {
						System.out.print("*");
					}
					System.out.println("");
				}
			break;
		}
	}
}
class codeninja {
	public static void main(String[] args) {
		Shape shape;
		// one parameter passing
		System.out.println("One parameter passing");
		shape = new Shape(3);
		shape.draw();
		/**
			Output:
			***
			***
			***
		**/
		// two parameter passing 
		System.out.println("Two parameter passing");
		shape = new Shape(5,2);
		shape.draw();
		/**
			Output:
			*****
			*****
		**/
		// three parameter passing 
		System.out.println("Three parameter passing");
		shape = new Shape(5,3,2);
		shape.draw();
		/**
			Output:
			*****
			 *****
			  *****
		**/
	}
}
