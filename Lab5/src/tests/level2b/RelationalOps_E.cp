// Main: Test expressions of overloaded operators, applied only to `int's.

class Main{

    int i = 2;
    int j = 4;
    int k = 5;

    string s = "abc";

  // Valid Relational Expressions 
    bool p = i > j;
    bool q = i < j;
    bool r = i >= j;
    bool s1 = i <= j;
    bool t = i == j;
    bool u = k != j;

    bool v = i > (k * j -3);
    bool w = 75/i >= j*k;
    bool x = i < k == (k < j);
    bool y = (i < k) != k < j;
    bool z = p > q;

  // Invalid Relational Expressions
 	bool p1 = p < j;
	bool p2 = i > q;
	bool p3 = j >= q;
	bool p4 = (p <= k);
	bool p5 = (p == k);
	bool p6 = (p != k);

 	bool q1 = p < s;
	bool q2 = s > q;
	bool q3 = s >= q;
	bool q4 = (p <= s);
	bool q5 = (p == s);
	bool q6 = (s != p);

  void main(){

  }
}
