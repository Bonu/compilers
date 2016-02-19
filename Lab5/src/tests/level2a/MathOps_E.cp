// Main: Test expressions of overloaded operators with mixed types.

class Main {

    string a = "";
    bool p = 0;

  // Assignments 
    string b = p;
    int i = a;
    bool q = "";
    int j = q;

  // Mathematical Expressions 
   // Binary Operators 

    int k = a * j;
    int l = p / j;		// int and bool 
    int m = j + a;		// int and string 
    int n = j - "5.0";

    int o = j * p;

    bool r = i;		// bool and int 
    bool s = b;		// bool and string 

   // Unary Operators 
    bool t = -p;
    bool u = +p;

}
