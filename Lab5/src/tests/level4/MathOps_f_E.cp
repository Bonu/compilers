// Main: Test expressions of overloaded operators with mixed types.

class Main {

  void main(){

    int i;        int j;
    string a;     string b;
    bool p;       bool q;

  // Assignments 
    i = 2.0;
    a = p;
    q = 1;
    i = a;
    a = p;
    p = 0;

  // Mathematical Expressions 
   // Binary Operators 

    i = a * j;
    i = j + a;		// int and float 
    i = j - 5.0;

    i = j * p;
    i = p / j;		// int and bool 

    p = i;		// bool and int 
    p = b;		// bool and float 

    a = p;

   // Unary Operators 
    p = -p;


  // Relational Expressions 
	p = p > a;
	p = i > q;
	p = p >= q;
	p = (p == a);
  }
}
