// Main: Test expressions of overloaded operators, applied primarily to `int's.

class Main{
    int i = 2;
    int j = 4;
    string s1 = "abc";
    string s2 = "def";
    string str = s1 + s2;

  // Mathematical Expressions 
   // Binary Operators 
    int k = i * j;
    int l = k / 5;
    int m = j + i;
    int n = 10 - j;

   // Unary Operators 
    int a = -5;
    int b = -j;

   // Mixed & Complicated 
    int c = k + 100 - 5*k / (j/2);
    int d = i * 4 / 6 + 3 * k - 1;
    int e = (i + -j * 3) / (k - +j);

  void main(){
  }
}
