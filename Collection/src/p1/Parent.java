package p1;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {

	void foo() throws IOException {
	}

}

class Child0 extends Parent {

}

class Child1 extends Parent {
	@Override
	void foo() throws IOException {
	}
}

class Child2 extends Parent {
	@Override
	void foo() throws FileNotFoundException {
	}
}

class Child3 extends Parent {
	@Override
	void foo() {
	}
}

//class Child4 extends Parent {
//	@Override
//	void foo() throws Exception {
//	}
//}