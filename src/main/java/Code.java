
public class Code {
	char[] alphabet = new char[32];
	char[] alphabetUpper = new char[32];
	char[] codedAlphabet = new char[32];
	char[] codedAlphabetUpper = new char[32];



	Code(){
		for (int i = 0; i < alphabet.length; i++) {
			this.alphabet[i] = (char) ('а' + i);
			this.alphabetUpper[i] = (char) ('А' + i);
		}
	}

	void codingAlphabet(int arg) {
		int reminder = arg % 32;
		char[] doubledTmpAlphabet = new char[64];
		char[] doubledTmpAlphabetUpper = new char[64];

		for (int i = 0; i < doubledTmpAlphabet.length; i++) {
			if (i < (doubledTmpAlphabet.length) / 2) {
				doubledTmpAlphabet[i] = alphabet[i];
				doubledTmpAlphabetUpper[i] = alphabetUpper[i];

			} else if (i >= (doubledTmpAlphabetUpper.length) / 2) {
				doubledTmpAlphabet[i] = alphabet[i-32];
				doubledTmpAlphabetUpper[i] = alphabetUpper[i-32];
			}
		}

		for (int i = 0; i < codedAlphabet.length; i++) {
			codedAlphabet[i] = doubledTmpAlphabet[reminder + i];
			codedAlphabetUpper[i] = doubledTmpAlphabetUpper[reminder + i];
		}
	}

	void decodingText(String arg){
//		char tmpChar;
		StringBuilder sb = new StringBuilder();
//		int[] listTextIndex = new int[arg.length()];
		for (int i = 0; i < arg.length(); i++) {
			if (containsChar(codedAlphabet, arg.charAt(i))){
				sb.append(alphabet[indexOf(codedAlphabet,
					arg.charAt(i))]);
			} else if (containsChar(codedAlphabetUpper, arg.charAt(i))){
				sb.append(alphabetUpper[indexOf(codedAlphabetUpper,
					arg.charAt(i))]);
			} else {
				sb.append(arg.charAt(i));
			}
		}
		System.out.println(sb);
	}

	public static boolean containsChar(char[] array, char target) {
		for (char c : array) {
			if (c == target) {
				return true;
			}
		}
		return false;
	}

	public static int indexOf(char[] array, char target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1; // элемент не найден
	}

}
