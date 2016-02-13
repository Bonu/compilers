// Main: Test identifier references.

class Main{

   // int variables
    int i2;

  void main(){
      i2();
      f();
      OtherClass.f();
      OtherClass.m();
  }
}

class OtherClass {
    int f;

  void m(){
      Main.i2();
      Main.f();
  }
}
