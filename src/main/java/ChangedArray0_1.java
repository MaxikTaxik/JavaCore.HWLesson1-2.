public class ChangedArray0_1 {
	void changeArray(int[] arg){
		int tmp = 0;
		for (int i = 0; i < arg.length; i++) {
			switch (arg[i]){
				case 0:
					arg[i] = 1;
					break;
				case 1:
					arg[i] = 0;
					break;
			}
		}
		for (int i = 0; i < arg.length; i++) {
			System.out.print(arg[i] + " ");
		}
	}
}
