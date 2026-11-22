public class ParserDemo {

	public static void main(String[] args) {

		private static String file1 = System.getProperty("user.dir") + "\\prog1.jay";

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());

	}

}