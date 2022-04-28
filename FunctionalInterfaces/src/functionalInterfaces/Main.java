package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

@FunctionalInterface
interface AddMethod {
//	public void msg(String msg)
	public int add(int a, int b);
}

public class Main {

	public static void main(String[] args) {
		// functional programming 1 slide 3 - 6

		// StringJoiner

//		StringJoiner joinNames = new StringJoiner(",","[","]");
//		
//		// The add method from StringJoiner
//		joinNames.add("Ethan");
//		joinNames.add("Bill");
//		joinNames.add("Janet");
//		joinNames.add("Byron");
//		
//		StringJoiner joinNames2 = new StringJoiner("-","(",")");
//		
//		joinNames2.add("Alicia");
//		joinNames2.add("Robert");
//		
//		StringJoiner m = joinNames2.merge(joinNames);
//		
//		System.out.println(m);

		StringBuffer sb = new StringBuffer("Core Java ");
//		sb.append("True");
//		sb.insert(4, "false");
//		sb.replace(0, 1, "jav");
//		sb.delete(0, 5);
		sb.reverse();
//		System.out.println(sb);

//		String say = "Hello";
//		AddMethod me = (msg)->{
//			System.out.println(msg + " lmao");
//		};
//		
//		me.msg(say);

		// with the method code block
//		AddMethod addBlock = (a,b)->{
//			System.out.println(a+b);
//			return a+b;
//		};
//		addBlock.add(25, 32);

		// make it one line
//		AddMethod addOne = (a,b)->(a+b);
//		System.out.println(addOne.add(10, 40));

		// lambda expression
		// (params) -> code block

//		List<String> listOne = new ArrayList<>();
//		listOne.add("Ethan");
//		listOne.add("Bill");
//		listOne.add("Janet");
//		listOne.add("Byron");
//		
//		listOne.forEach((n)->System.out.println(n));

//		RunnablemyDemo runOne = new RunnablemyDemo("Thread-1");
//
//		runOne.start();
//
//		RunnablemyDemo runTwo = new RunnablemyDemo("Thread-2");
//
//		runTwo.start();
		
		Sender send = new Sender();
		SendingThread sendOne = new SendingThread("I love coding!", send);
		
		sendOne.run();

	}

//	@Override
//	public void msg(String msg) {
//		System.out.println("Hello ");
//		
//	}

}
