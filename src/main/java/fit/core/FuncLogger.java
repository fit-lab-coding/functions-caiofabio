package fit.core;

import java.util.function.Function;

public class FuncLogger{
  public static Function<String, String> create(String prefix) {
    return inParameter -> {//return função não executada
      String outReturn = String.format("%s %s", prefix, inParameter);//stringg parametro entrada
      return outReturn;//observe que esse retorno só ocorre com apply
    };
  }
}