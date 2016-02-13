// Main: Test identifier references.

class Main{

   // string variables
    string s2 = OtherClass.s1;
    string s3 = OtherClass.c1;
    string s4 = OtherClass.i1;
    string s5 = OtherClass.f1;
    string s6 = OtherClass.s;
    string s7 = OtherClass.b1;

   // char variables
    char c2 = OtherClass.s1;
    char c3 = OtherClass.c1;
    char c4 = OtherClass.i1;
    char c5 = OtherClass.f1;
    char c6 = OtherClass.c;
    char c7 = OtherClass.b1;

   // int variables
    int i2 = OtherClass.s1;
    int i3 = OtherClass.c1;
    int i4 = OtherClass.i1;
    int i5 = OtherClass.f1;
    int i6 = OtherClass.i;
    int i7 = OtherClass.b1;

   // float variables
    float f2 = OtherClass.s1;
    float f3 = OtherClass.c1;
    float f4 = OtherClass.i1;
    float f5 = OtherClass.f1;
    float f6 = OtherClass.f;
    float f7 = OtherClass.b1;

   // bool variables
    bool b2 = OtherClass.s1;
    bool b3 = OtherClass.c1;
    bool b4 = OtherClass.i1;
    bool b5 = OtherClass.f1;
    bool b6 = OtherClass.f;
    bool b7 = OtherClass.b1;

  void main(){
  }
}

class OtherClass {
    string s1 = "abc";
    char c1 = 'c';
    int i1 = 4;
    float f1 = 1.55E-2;
    bool b1 = true;
}
