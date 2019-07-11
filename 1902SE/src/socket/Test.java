package socket;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] allOut = {23,214,53,34,124,65};
		int pw = 34;
		System.out.println(Arrays.toString(allOut));
		//将pw从allOut中删除
		for(int i=0;i<allOut.length;i++) {
			if(pw==allOut[i]) {
				allOut[i] = allOut[allOut.length-1];
				allOut = Arrays.copyOf(allOut, allOut.length-1);
				break;
			}
		}
		System.out.println(Arrays.toString(allOut));
		
/*		int[] newAllOut = new int[allOut.length];
		int index = 0;
		for(int i=0;i<allOut.length;i++) {
			if(allOut[i]!=pw) {
				newAllOut[index++] = allOut[i];
			}
		}
		allOut = Arrays.copyOf(newAllOut, index);
		System.out.println(Arrays.toString(allOut));*/
	}

}
