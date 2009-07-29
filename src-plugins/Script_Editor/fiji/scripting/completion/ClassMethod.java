package fiji.scripting;

import java.lang.Comparable;

public class ClassMethod implements Comparable{
	String onlyName;
	String returnType;
	boolean isStatic=false;
	boolean isPublic;

	public ClassMethod(String name) {
		String[] bracketSeparated = name.split("\\(");
		int lastDotBeforeBracket = bracketSeparated[0].lastIndexOf(".");
		onlyName=name.substring(lastDotBeforeBracket+1);
		String[] spaceSeparated = name.split(" ");
		returnType=spaceSeparated[spaceSeparated.length-2];
		if(spaceSeparated[0].equals("public")) {
			isPublic = true;
		}
		if(spaceSeparated[1].equals("static")||spaceSeparated[2].equals("static")) {
			isStatic = true;
		}
	}

	public ClassMethod(String onlyName,boolean isOnlyName) {
		this.onlyName=onlyName;
	}

	public String getOnlyName() {
		return this.onlyName;
	}

	public int compareTo(Object o) {
		ClassMethod c = (ClassMethod)o;
		return(this.onlyName.compareTo(c.onlyName));
	}

}

