package declarations;

public class declarations {
  // one declaration per line is recommended
  // (for comments: one space separating, alternatively tabs)
  int level; // indentation level
  int size; // size of table

  // above is prefered over
  // int level, size;

  // do not put different types on same line
  int foo, fooArray[]; // wrong

  // only reason not to initialize a var where it is declared is if
  // initial value depends on some computation occurring first

  void myMethod() {
    int int1 = 0; // beginning of method block

    if (int1 > -1) {
      int int2 = 0; // beginning of "if" block
      // ...
    }
  }
  
  void myMethodThree() {
      // don't wait to declare var until their first use
      // except for loops
      int maxLoops = 10;
      for (int i = 1; i < maxLoops; i++) {
          System.out.println("just some java notes");
      }
  }



    int count;
  void myMethodTwo() {
      int a = 0, b = 2;
      if (a > b) {
          int count = 0;     // AVOID!
        // ...
      }
      //...
    }

    // class and interface declarations
    // no space between a method name and parenthesis "(" starting its parameter list
    // open brace "{" appears at ebd if sane kube as declaration statement
    // closing brace "}" start a line by itself to match corresponding statement
    // except when it is a null statement the "}" should appear immediately after the "{"

    class Sample extends Object {
      int iVar1;
      int iVar2;

      Sample (int i, int j) {
          iVar1 = i;
          iVar2 = j;
      }

      String emptyMethod() {
          return "empty";
      }
        // ...
    }
}
