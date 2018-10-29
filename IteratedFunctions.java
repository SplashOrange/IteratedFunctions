public class IteratedFunctions {

static int loopNum;
static int yvalue;
static int xvalue = 99;

    public int functionGraph(int xvalue) {

        if (xvalue <= 2) {
          yvalue = xvalue + 2;
          System.out.println("f(" + xvalue + ") = " + yvalue);
        }

        else if (2 < xvalue && xvalue < 4) {
          yvalue = -1 * xvalue + 6;
          System.out.println("f(" + xvalue + ") = " + yvalue);
        }

        else {
          yvalue = xvalue - 2;
          System.out.println("f(" + xvalue + ") = " + yvalue);
        }
        return yvalue;
   }


int loopNum() {
  return loopNum;
}

  public static void main(String[] args) {

    System.out.println("Input value: " + xvalue);

    IteratedFunctions input = new IteratedFunctions();

    input.functionGraph(xvalue);

    loopNum = 100;

    for (int loopNum = 1; loopNum < 100; input.functionGraph(yvalue), loopNum++){

  }

System.out.println("Number of loops: " + loopNum);

System.out.println("Output: " + yvalue);

}
}
