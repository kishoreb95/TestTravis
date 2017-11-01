
public interface Calculator {
   
   public float calculate(float x, float y);

}

class Addition implements Calculator{
   public float calculate(float x, float y)
   {
      return x + y;
   }
}

class Subtraction implements Calculator{
   public float calculate(float x, float y)
   {
      return x - y;
   }
}

class Multiplication implements Calculator{
   public float calculate(float x, float y)
   {
      return x * y;
   }
}

class Division implements Calculator{
   public float calculate(float x, float y)
   {
      return x / y;
   }
}