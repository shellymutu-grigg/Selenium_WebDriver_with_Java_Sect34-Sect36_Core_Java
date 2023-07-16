package section34Code;

import java.text.MessageFormat;

public class Lesson277InterfaceImplmentation implements Lesson277InterfaceTraffic, Lesson277InterfaceTraffic2 {

	public static void main(String[] args) {
		Lesson277InterfaceTraffic lesson277 = new Lesson277InterfaceImplmentation();
		lesson277.greenGo();
		lesson277.redStop();
		lesson277.yellowFlashing();

		Lesson277InterfaceImplmentation lession277_2 = new Lesson277InterfaceImplmentation();
		lession277_2.walkOnSymbol();

		Lesson277InterfaceTraffic2 lession277_3 = new Lesson277InterfaceImplmentation();
		lession277_3.trainSymbol();
	}

	@Override
	public void greenGo() {
		System.out.println(MessageFormat.format("Implementation of {0} ", "greenGo()"));
	}

	@Override
	public void redStop() {
		System.out.println(MessageFormat.format("Implementation of {0} ", "redStop()"));
	}

	@Override
	public void yellowFlashing() {
		System.out.println(MessageFormat.format("Implementation of {0} ", "yellowFlashing()"));
	}

	public void walkOnSymbol() {
		System.out.println(MessageFormat.format("Implementation of {0} ", "walkOnSymbol()"));

	}

	@Override
	public void trainSymbol() {
		System.out.println(MessageFormat.format("Implementation of {0} ", "trainSymbol()"));

	}

}
