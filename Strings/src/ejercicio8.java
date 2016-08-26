import java.util.regex.*;

						


public class ejercicio8 {

	public static void main(String[] args) {
		
		
		StringBuffer url =  new StringBuffer ("http://www.devbg.org/forum/index.php");
		
		
		
		separaUrl(url);
		

	}
	
	public static void separaUrl(StringBuffer url){
		
		String array[] = new String[3];
		
		String etiqueta1 = "//";
		String etiqueta2 = "/";
		
			
		int trozo = url.indexOf(etiqueta1);
		
		
		String sub = url.substring(0,trozo);
		
		array[0] = sub;
		
		url.delete(0, url.indexOf(etiqueta1)+2);
		
		String sub2 = url.substring(0,url.indexOf(etiqueta2));
		
		array[1] = sub2;
		
		url.delete(0,url.indexOf(etiqueta2)+1);
		
		
		String patron = ".*/.*";
		
		Pattern pattern = Pattern.compile(patron);

		Matcher matcher = pattern.matcher(url);
		
		if (matcher.matches()){
			
		String sub3 = url.substring(0, url.length());
			
			array[2] = sub3;
			
			
		}
		
		
	    
		
		
		System.out.println (array[0]);
		System.out.println (array[1]);
		System.out.println (array[2]);
		
		
		
	}
	
	

}
