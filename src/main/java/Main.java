public class Main {
	public static void main(String[] args) {
//		Code alphabets = new Code();
//		System.out.println(alphabets.alphabet);
//		alphabets.codingAlphabet(0);
//		alphabets.decodingText("Ю опзчдк й сдад");
//		System.out.println(alphabets.codedAlphabetUpper);

//		int[] array = {23,45,2,65,768,344,5646,768,4654,5};
		int[] arrayZeroToOne = {0,1,0,0,0,1,0,1,1,1,1,0};
//		Array arrClass = new Array();
//		int[] returnedArray = arrClass.moveArray(array, 7);
//		arrClass.printArray(returnedArray);
		ChangedArray0_1 zeroToOne = new ChangedArray0_1();
		zeroToOne.changeArray(arrayZeroToOne);
	}
}
