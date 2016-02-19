// Main: Test identifier references.

class Main{

    int i2;

    int m =  i2();
    int n =  f();
    int p = OtherClass.f();
    int q = OtherClass.m();
  void main(){
  }
}

class OtherClass {
    int f = Main.i2();;
    int g = Main.f();;

  int m(){
      
  }
}
