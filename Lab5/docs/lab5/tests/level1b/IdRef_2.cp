// Main: Test identifier references.

class Main{

   // int variables
    int l = OtherClass.k;
    int m = OtherClass.j;
    int n = OtherClass.c1;

   // Mixed & Complicated 
    string s2 = OtherClass.s1;
    char c2 = OtherClass.c1;
    float f3 = OtherClass.f1;
    float f4 = OtherClass.f2;
    float f5 = OtherClass.k;
    float f6 = OtherClass.c1;

  void main(){
  }
}

class OtherClass {
    int i = 2;
    int j = 4;
    int k = OtherClass.i;
    string s1 = "abc";
    char c1 = 'c';
    float f1 = 1.5;
    float f2 = 1.5E-2;
}
