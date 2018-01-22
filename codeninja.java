class Shape {
	int width;
	int heigth;
	int indent;
	int param_num;
	Shape(int width, int heigth, int indent) {
		this.width = width;
		this.heigth = heigth;
		this.indent = indent;
	}
	public int checkParams() {
		if(this.width != 0 && this.heigth == 0 && this.indent == 0){
			return 1;
		}else if(width != 0 && heigth != 0 && indent == 0){
			 return 2;
		}
		return 3;
	}
	public void draw() {
		param_num = checkParams();
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
				for(int i = 0; i<this.heigth; i++) {
					for(int j = this.width; j > 0; j--) {
						System.out.print("*");
					}
					System.out.println("");
				}
			break;
			
			case 3:
				for(int i = 0; i<this.heigth; i++){
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
		Shape shape = new Shape(5,2,0);
		shape.draw();
	}
}