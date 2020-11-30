class Main {

  // 2 primitive and 5 non primitive
  String food = "food";
  int nums    = 45;
  float dec = 1.099887f;
  double largedec = 1.0998877345d;
  boolean trueorfalse = false;
  char charvalue = '1';
  String[] color = {"blue","black","red","yellow"};
  

 

  public static void main(String[] args) {
    // Activity active = new Activity();
    System.out.println("hello world");
    System.out.println(Activity.iHaveEaten("food"));


  }

  
  
}

class Activity{

  public static boolean iHaveEaten(String params){
    if(params == null || params == ""){
      return false ;
    }else {
      return true ;
    }
  }
}