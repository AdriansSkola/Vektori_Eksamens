import java.util.Vector;

public class Tests {
	
	private static Vector<String> jautajumi = new Vector<String>();
    private static Vector<Vector<String>> atbildes = new Vector<Vector<String>>();
    private static Vector<Vector<String>> pareizasAtb = new Vector<Vector<String>>();
	
    public void Jautajumi(){
		
    	// 1. Jautājums
		jautajumi.add("Atzīmē veidus kā implementēt vektoru:");
	    Vector<String> atbildes1 = new Vector<String>();
	    atbildes1.add("import java.util.Vector;");
	    atbildes1.add("import java.util.ArrayList;");
	    atbildes1.add("import java.util.*;");
	    atbildes1.add("import java.util.Scanner;");
	    atbildes.add(atbildes1);
	    Vector<String> pareizasAtb1 = new Vector<String>();
	    pareizasAtb1.add("import java.util.Vector;");
	    pareizasAtb1.add("import java.util.*;");
	    pareizasAtb.add(pareizasAtb1);

	    // 2. Jautājums
	    jautajumi.add("Kādos dzīves gadījumos izmanto vektorus?");
	    Vector<String> atbildes2 = new Vector<String>();
	    atbildes2.add("Banku sistēmās");
	    atbildes2.add("E-Komercijas platformās");
	    atbildes2.add("Uzņēmējdarbības lietotnēs");
	    atbildes2.add("Map implementācijās");
	    atbildes.add(atbildes2);
	    Vector<String> pareizasAtb2 = new Vector<String>();
	    pareizasAtb2.add("Banku sistēmās");
	    pareizasAtb2.add("E-Komercijas platformās");
	    pareizasAtb2.add("Uzņēmējdarbības lietotnēs");
	    pareizasAtb.add(pareizasAtb2);
	    
	    // 3. Jautājums
	    jautajumi.add("Atzīmē komandas, kuras eksistē vektoros:");
	    Vector<String> atbildes3 = new Vector<String>();
	    atbildes3.add("clear()");
	    atbildes3.add("shuffle()");
	    atbildes3.add("add()");
	    atbildes3.add("get()");
	    atbildes.add(atbildes3);
	    Vector<String> pareizasAtb3 = new Vector<String>();
	    pareizasAtb3.add("clear()");
	    pareizasAtb3.add("add()");
	    pareizasAtb3.add("get()");
	    pareizasAtb.add(pareizasAtb3);
	    
	    // 4. Jautājums
	    jautajumi.add("Kas tiks izprintēts konsolē?");
	    Vector<String> atbildes4 = new Vector<String>();
	    atbildes4.add("[A, B]");
	    atbildes4.add("1");
	    atbildes4.add("[A; B]");
	    atbildes4.add("2");
	    atbildes.add(atbildes4);
	    Vector<String> pareizasAtb4 = new Vector<String>();
	    pareizasAtb4.add("[A, B]");
	    pareizasAtb4.add("2");
	    pareizasAtb.add(pareizasAtb4);
	    
	    // 5. Jautājums
	    jautajumi.add("Kas tiks izprintēts konsolē?");
	    Vector<String> atbildes5 = new Vector<String>();
	    atbildes5.add("Vektors: A");
	    atbildes5.add("Vektors: B");
	    atbildes5.add("Vektors: C");
	    atbildes5.add("Vektors: D");
	    atbildes.add(atbildes5);
	    Vector<String> pareizasAtb5 = new Vector<String>();
	    pareizasAtb5.add("Vektors: A");
	    pareizasAtb5.add("Vektors: B");
	    pareizasAtb.add(pareizasAtb5);
	    
	    // 6. Jautājums
	    jautajumi.add("Kuras no šīm vektora komandām eksistē?");
	    Vector<String> atbildes6 = new Vector<String>();
	    atbildes6.add("add(elements)");
	    atbildes6.add("clearHalf(vektors)");
	    atbildes6.add("add(indekss,elements)");
	    atbildes6.add("addAll(vektors)");
	    atbildes.add(atbildes6);
	    Vector<String> pareizasAtb6 = new Vector<String>();
	    pareizasAtb6.add("add(elements)");
	    pareizasAtb6.add("add(indekss,elements)");
	    pareizasAtb6.add("addAll(vektors)");
	    pareizasAtb.add(pareizasAtb6);
	    
	    // 7. Jautājums
	    jautajumi.add("Kas tiks izprintēts konsolē?");
	    Vector<String> atbildes7 = new Vector<String>();
	    atbildes7.add("Butri: A");
	    atbildes7.add("Butri: B");
	    atbildes7.add("Butri: C");
	    atbildes7.add("Butri: D");
	    atbildes.add(atbildes7);
	    Vector<String> pareizasAtb7 = new Vector<String>();
	    pareizasAtb7.add("Butri: B");
	    pareizasAtb7.add("Butri: D");
	    pareizasAtb.add(pareizasAtb7);
	    
	    // 8. Jautājums
	    jautajumi.add("Kādas noņemt komandas eksistē?");
	    Vector<String> atbildes8 = new Vector<String>();
	    atbildes8.add("remove(indekss)");
	    atbildes8.add("removeAll()");
	    atbildes8.add("clear()");
	    atbildes8.add("clearAll()");
	    atbildes.add(atbildes8);
	    Vector<String> pareizasAtb8 = new Vector<String>();
	    pareizasAtb8.add("remove(indekss)");
	    pareizasAtb8.add("removeAll()");
	    pareizasAtb8.add("clear()");
	    pareizasAtb.add(pareizasAtb8);
	    
	    // 9. Jautājums
	    jautajumi.add("Kā izveidot vektoru Javā?");
	    Vector<String> atbildes9 = new Vector<String>();
	    atbildes9.add("Vector<String> a = new Vector<String>();");
	    atbildes9.add("Vector<String a = Vector String>();");
	    atbildes9.add("Vector<Integer a = Vector Integer>();");
	    atbildes9.add("Vector<Integer> a = new Vector<Integer>();");
	    atbildes.add(atbildes9);
	    Vector<String> pareizasAtb9 = new Vector<String>();
	    pareizasAtb9.add("Vector<String> a = new Vector<String>();");
	    pareizasAtb9.add("Vector<Integer> a = new Vector<Integer>();");
	    pareizasAtb.add(pareizasAtb9);
	    
	    // 10. Jautājums
	    jautajumi.add("Kā iegūt vektora garumu Javā? Vai ir citi veidi?");
	    Vector<String> atbildes10 = new Vector<String>();
	    atbildes10.add("a.size();");
	    atbildes10.add("Nav savādāku veidi.");
	    atbildes10.add("c.length();");
	    atbildes10.add("Ir vairāku veidi.");
	    atbildes.add(atbildes10);
	    Vector<String> pareizasAtb10 = new Vector<String>();
	    pareizasAtb10.add("a.size();");
	    pareizasAtb10.add("Nav savādāku veidu.");
	    pareizasAtb.add(pareizasAtb10);
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
