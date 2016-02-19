// Main: Test identifier references.

class Main{
    int i = 2;
    int j = 4;
    string s1 = "abc";
    char c1 = 'c';
    float f1 = 1.5;
    float f2 = 1.5E-2;

   // int variables
    int k = i;
    int l = k;
    int m = j;
    int n = c1;

   // Mixed & Complicated 
    string s2 = s1;
    char c2 = c1;
    float f3 = f1;
    float f4 = f2;
    float f5 = k;
    float f6 = c1;

  void main(){
  }
}
