// Main: Test expressions of overloaded operators, applied only to `int's.

class Main{

    int i = 2;
    int j = 4;

    int k = 5;

  // Relational Expressions 
    bool p = i > j;
    bool q = i < j;
    bool r = i >= j;
    bool s = i <= j;
    bool t = i == j;
    bool u = k != j;

    bool v = i > (k * j -3);
    bool w = 75/i >= j*k;
    bool x = (i < k) == (k < j);
    bool y = (i < k) != (k < j);
    bool z = p > q;


  void main(){
  }
}

class IntTest {
    int i = 2;
    int j = 4;

    int k = 5;

  // Relational Expressions 
    int a = 1;
    int b = 455;
    int c = 314159;

    bool p = a > b;
    bool q = a < b;
    bool s = a >= i;
    bool t = a <= b;
    bool u = a == k;
    bool v = c != b;

    bool w = a > (c * j - 3.2);
    bool x = 75/a >= b*c;
    bool y = (a < k) == (j < b);
    bool z = (j < c) != (i < b);

    bool h = ((a == k) != z);
    bool r = (p == ((b == i) != z));
    bool g = (q != r == i > j != (a <= b));
}

class FloatTest {
    int i;
    int j;
    int k;
    float a = 1.2;
    float b = 4.5E5;
    float c = .0314159e2;

  // Relational Expressions 
    bool p = a > b;
    bool q = a < b;
    bool s = a >= i;
    bool t = a <= b;
    bool u = a == k;
    bool v = c != b;

    bool w = a > (c * j - 3.2);
    bool x = 75/a >= b*c;
    bool y = (a < k) == (j < b);
    bool z = (j < c) != (i < b);

    bool h = ((a == k) != z);
    bool r = (p == ((b == i) != z));
    bool g = ((q != r) == (i > j) != (a <= b));
}
