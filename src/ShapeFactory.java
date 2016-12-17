
public class ShapeFactory{
	Shapee createShape(String type){
		if(type.toUpperCase().equals("CIRCLE")){
			return new Circlee();
		}
		else if(type.toUpperCase().equals("RECTANGLE")){
			return new Rectanglee();
		}
		else
			return null;
	}
}
