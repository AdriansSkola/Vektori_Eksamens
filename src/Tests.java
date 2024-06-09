import java.util.Vector;

public class Tests {
	
	private static Vector<String> jautajumi = new Vector<String>();
    private static Vector<Vector<String>> atbildes = new Vector<Vector<String>>();
    private static Vector<Vector<String>> pareizasAtb = new Vector<Vector<String>>();
	
    public void Jautajumi(){
		
		jautajumi.add("Atzīmē Latvijā visas eksistējošās pilsētas:");
	    Vector<String> atbildes1 = new Vector<String>();
	    atbildes1.add("Liepāja");
	    atbildes1.add("Oslo");
	    atbildes1.add("Rīga");
	    atbildes1.add("Warsaw");
	    atbildes.add(atbildes1);
	    Vector<String> pareizasAtb1 = new Vector<String>();
	    pareizasAtb1.add("Liepāja");
	    pareizasAtb1.add("Rīga");
	    pareizasAtb.add(pareizasAtb1);

	    
	    jautajumi.add("Atzīmē latviešu vārdus:");
	    Vector<String> atbildes2 = new Vector<String>();
	    atbildes2.add("John");
	    atbildes2.add("Alberts");
	    atbildes2.add("Muhammed");
	    atbildes2.add("Jānis");
	    atbildes.add(atbildes2);
	    Vector<String> pareizasAtb2 = new Vector<String>();
	    pareizasAtb2.add("Alberts");
	    pareizasAtb2.add("Jānis");
	    pareizasAtb.add(pareizasAtb2);
	    
	    
	    jautajumi.add("Atzīmē Sieviešu vārdus:");
	    Vector<String> atbildes3 = new Vector<String>();
	    atbildes3.add("Elza");
	    atbildes3.add("Laura");
	    atbildes3.add("Annete");
	    atbildes3.add("Jennifer");
	    atbildes.add(atbildes3);
	    Vector<String> pareizasAtb3 = new Vector<String>();
	    pareizasAtb3.add("Elza");
	    pareizasAtb3.add("Laura");
	    pareizasAtb3.add("Annete");
	    pareizasAtb.add(pareizasAtb3);
	}
	
	static Vector<String> getJautajumi(){
		
		return jautajumi;
	}
	
	static Vector<Vector<String>> getAtbildes(){
		
		return atbildes;
	}
	
	static Vector<Vector<String>> getPareizasAtb(){
		
		return pareizasAtb;
	}
}
