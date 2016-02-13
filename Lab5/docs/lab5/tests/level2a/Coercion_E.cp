// Main: Test expressions of overloaded operators with mixed types.

class Main {


  // Assignments 
    int i = 2.0;
    float a = p;
    bool q = 1;
    int j = a;
    float b = p;
    bool p = 0;

  // Mathematical Expressions 
   // Binary Operators 

    int k = a * j;
    int l = j + a;		// int and float 
    int m = j - 5.0;

    int n = j * p;
    int o = p / j;		// int and bool 

    bool r = i;		// bool and int 
    bool s = b;		// bool and float 

    float c = p;

   // Unary Operators 
    bool t = -p;


  void main(){
  }
}
