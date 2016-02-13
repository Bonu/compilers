// Main: Test identifier references.

class Main{

   // Invalid reference to a class declaration
    string s1 = main;
    string s2 = OtherClass;

  void main(){
  }
}

class OtherClass {
    string s1 = "abc";
}
