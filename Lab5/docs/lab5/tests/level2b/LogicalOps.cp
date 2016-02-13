
// Main: Test bool expressions and operators.

class Main{

    bool p = true;
    bool q = false;

  /* Simple Logical Expressions */

    bool r = p && q;
    bool s = p || q;
    bool t = !p;

  /* Complicated Logical Expressions */

    bool u = !p && q || p;
    bool v = !(p || q && (!p || !q));
    bool w = p || (!q || p) && (q && !p) || !q;

  void main(){

  }
}

