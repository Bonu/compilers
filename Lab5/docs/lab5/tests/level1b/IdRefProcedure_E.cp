// Main: Test identifier references.

class Main{

  int m() {
      return 0;
  }

   // int variables
    int i2 = m;                // m is not a field
    int i3 = OtherClass.m;     // OtherClass.m is not a field

  void main(){
  }
}

class OtherClass {

  int m() {
      return 0;
  }
}
