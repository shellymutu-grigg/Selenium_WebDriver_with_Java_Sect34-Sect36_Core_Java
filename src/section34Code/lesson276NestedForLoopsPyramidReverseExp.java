package section34Code;

import java.text.MessageFormat;

public class lesson276NestedForLoopsPyramidReverseExp {

	public static void main(String[] args) {

		// First implementation
		int count = 3;
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(MessageFormat.format("{0} ", count));
				count = count + 3;
			}
			System.out.println();
		}

	}
}
