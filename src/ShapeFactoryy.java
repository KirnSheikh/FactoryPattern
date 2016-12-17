

public class ShapeFactoryy {
	Shapee createShape(String type){
		if(type.toUpperCase().equals("circle")){
			return new Circlee();
		}
		else if(type.toUpperCase().equals("rectangle")){
			return new Rectanglee();
		}
		else
			return null;
	}
}
