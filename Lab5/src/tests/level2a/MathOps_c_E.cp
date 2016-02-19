// Main: Test expressions of overloaded operators, applied primarily to `int's.

class Main{
    char i = '2';
    char j = '4';
    int s1 = 5;
    int s2 = 8;
    int str = s1 + s2;

  // Mathematical Expressions 
   // Binary Operators 
    char k = i * j;
    char l = k / '5';
    char m = j + i;
    char n = '1' - j;

   // Unary Operators 
    char a = + '5';
    char b = - 'j';

   // Mixed & Complicated 
    char c = k + '1' + '0' - '5'*k / (j/'2');
    char d = i * '4' / '6' + '3' * k - '1';
    char e = (i + -j * '3') / (k - +j);

  void main(){
  }
}
