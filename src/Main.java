
package question;

public class Main
{
	// Main method is for you to test your code
	// You will not get any points here
	public static void main(String[] args) {
		
		// Example:
		// Code that displays Fibonacci Series:
		String javaCode1 = 
				
				
//				"System.out.print + (\"Enter a number (((even or odd): \");"+
//
//"int num = reader.nextInt();"+
//
//"if (num % 2 == 0)"+
//
//"System.out.println(num+\" {is even\");"+
//
//"else"+
//"System.out.println(num + \" {is odd\");";
//				
//				
//				
//				"if(javaCode.charAt(i) == ')') {"+
//			"if(newStack.pop() == '(') {"+
//				"continue;"+
//			"}"+
//			"else {"+
//				"return false;"+
//			"}"+
//		"}{{{{{{(}}}}}}";
				
				
				"class Main {\r\n"
				+ "  public static void main(String[] args) {\r\n"
				+ "\r\n"
				+ "    int n = 10, firstTerm = 0, secondTerm = 1;\r\n"
				+ "    System.out.println(\"Fibonacci Series till \" + n + \" terms:\");\r\n"
				+ "\r\n"
				+ "    for (int i = 1; i <= n; ++i) {\r\n"
				+ "      System.out.print(firstTerm + \", \");\r\n"
				+ "\r\n"
				+ "      // compute the next term\r\n"
				+ "      int nextTerm = firstTerm + secondTerm;\r\n"
				+ "      firstTerm = secondTerm;\r\n"
				+ "      secondTerm = nextTerm;\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}";
				
//			"""
//			private static void waitForNextFrame() {
//		do {
//		{
//			deltaTime += System.currentTimeMillis() - previousTime;
//			previousTime = System.currentTimeMillis();
//			StdDraw.pause(1);
//		} while (deltaTime <= MS_PER_FRAME);
//
//		deltaTime -= MS_PER_FRAME;
//			}
//		
//					"""; 
				
//		"""
//		private static void addPointsAndWires() {
//	double step = 1.0 / numOfPointsPerAxis;
//	for (int i = 1; i <= numOfPointsPerAxis; i++) {
//		for (int j = 1; j <= numOfPointsPerAxis; j++) {
//			spacePoints.add(new SpacePoint(i * step, j * step));
//			System.out.println(" bill gates miyala hastal���ndan dolay� �lm�� :(  ")
//		}
//	}
//
//	sourceWires.add(new SourceWire(0.5, 0.5));
//}
//
//				"""; 
				
//				"System.outprint(\"Enter a number (((even or odd): \");\r\n"
//				+ "int num = reader.nextInt();\r\n"
//				+ "\r\n"
//				+ "if(num % 2 == 0)\r\n"
//				+ "    System.out.println(num + \" {is even\");\r\n"
//				+ "else\r\n"
//				+ "    System.out.println(num + \" {is odd\");\r\n";
		
//				""" 
//					{("())")}	
//					 """;	
		
		
		ParanthesisChecker checker = new ParanthesisChecker();
		System.out.println(checker.isCorrect(javaCode1));
		
	}

}

