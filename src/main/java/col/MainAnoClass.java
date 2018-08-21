package col;

public class MainAnoClass {

public static void main(String[] args) {

//-----------------------------------------Anonymous Class With Abstrct Class---------------------------------------------	

	AbstClass ab= new AbstClass() {//-------------Anonymous Inner class
			
			@Override
			public void run() {
				System.out.println("Annonymous Inner Class-- I want to run");
				
			}
		};
		ab.run();
		ab.eat();
		
	//--------Lamda Expresion are not for Abstarct Classes
		//AbstClass ablamda= () -> System.out.println("Annonymous Inner Class-- I want to run");

//-----------------------------------------Anonymous Class With Interface---------------------------------------------	
		InterfaceAno interf= new InterfaceAno() {
			
			@Override
			public void sleep() {
				System.out.println("Annonymous Inner Class-- I want to Sleep");
				
			}
		};
		
		interf.sleep();
		
	//--------Lamda Expresion	are meant for Functional Inetrfaces only
		InterfaceAno interlamda= () -> System.out.println("Annonymous Inner Class-- I want to Sleep");
			
		
		interlamda.sleep();
	}

}
