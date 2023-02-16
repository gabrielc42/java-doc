package indentation;

public class indentation {
  // four spaces
  // avoid lines longer than 80
  // wrap:
  // break after comma
  // break before operator
  // prefer higher-level breaks to lower-level breaks
  // align new line w/ beginning of expression at same level on previous line
  // if above reads confusing code, just indent 8 spaces
}

class badIndentation {
  // someMethod(longExpression1, longExpression2, longExpression3,

  // longExpression4, longExpression5);

  // var = someMethod1(longExpression1,
  // someMethod2(longExpression2,
  // longExpression3));

  // longName1 = longName2 * (longName3 + longName4 - longName5)+ 4 * longname6;
  // // PREFER

  // longName1 = longName2 * (longName3 + longName4
  // - longName5) + 4 * longname6; // AVOID

  // //CONVENTIONAL INDENTATIONsomeMethod(int anArg, Object anotherArg, String
  // yetAnotherArg,
  // Object andStillAnother) {
  // ...
  // }

  // // INDENT 8 SPACES TO AVOID VERY DEEP INDENTS
  // private static synchronized horkingLongMethodName(int anArg,
  // Object anotherArg, String yetAnotherArg,
  // Object andStillAnother) {
  // ...
  // }

  // // do this indentation instead
  // if((condition1&&condition2)
  // ||(condition3&&condition4)
  // ||!(condition5&&condition6)) {
  // doSomethingAboutIt();
  // }

  // // or this
  // if((condition1&&condition2) || (condition3&&condition4)
  // ||!(condition5&&condition6)) {
  // doSomethingAboutIt();
  // }

  // 3 acceptable ways to format ternary:
  // alpha = (aLongBooleanExpression) ? beta : gamma; alpha =
  // (aLongBooleanExpression) ? beta
  // : gamma;
  // alpha = (aLongBooleanExpression)
  // ? beta
  // : gamma;
}
