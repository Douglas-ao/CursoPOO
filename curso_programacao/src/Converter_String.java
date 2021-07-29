
public class Converter_String {

	public static void main(String[] args) {
		String original = "abcde FGHI ABC abc DEFG    ";
		
		String s01 = original.toLowerCase(); // String minuscula
		String s02 = original.toUpperCase(); // String maiucula
		String s03 = original.trim(); // Eliminar os espa�os final de uma string
		String s04 = original.substring(2); // Come�ar a ler do caracteres 2
		String s05 = original.substring(2,9); // Come�ar a ler do caracteres 2 at� o 9
		String s06 = original.replace('a', 'x'); // Troca o 'a' por 'x'
		int i = original.indexOf("bc"); // Primeira posi��o do 'dc'
		int j = original.lastIndexOf("bc"); // Ultima posi��o do 'dc'
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2,9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		

	}

}
