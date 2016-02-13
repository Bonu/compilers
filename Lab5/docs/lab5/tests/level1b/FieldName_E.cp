// Main: Test identifier references.

class Main{

   // int variables
    int i2 = main;                // f is not a field
    int i3 = OtherClass.f;     // OtherClass.f is not a field

  void main(){
  }
}

class OtherClass {

}
