
public class ExplorString {

	public static void main(String[] args) {
		
//		String a = "Alura";
//		System.out.println(a);
//		System.out.println(a.length());
//		System.out.println(a.indexOf("ra"));
//		
//		System.out.println(a.contains("ura"));
//		
//		String sub = a.substring(2, 5);
//		System.out.println(sub);
//		
//		
//        String j = "Mario";
//        String i = j.replace('o', 'a');
//        System.out.println(i);
//        
//        String nome = "ALURA";
//        CharSequence cs = new StringBuilder("al");
//
//        nome = nome.replace("AL", cs);
//
//        System.out.println(nome);
//		
//		
//		String b = a.replace("l", "L");
//		System.out.println(b);
//		
//		char c = 'R';
//		char d = 'r';
//		
//		String e = b.replace(d, c);
//		System.out.println(e);
//		
//		String f = "    Alura    ";
//		System.out.println(f);
//		String g = f.trim();
//		System.out.println(g);
//		
//		System.out.println(g.charAt(3));
//		System.out.println(g.contains("ur"));
//		System.out.println(g.isEmpty());
//		
//		String h = "  ";
//		System.out.println(h.isBlank());
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
	}

}
