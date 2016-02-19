// : Test for flagging of method decl-type and return-type mismatch.

class Main{

  void void_void() {
    return;
  }

  void void_char() {
    return ('2');
  }

  void void_int() {
    return (21);
  }

  void void_bool() {
    return (true);
  }

  void void_string() {
    return "Hi";
  }

  void void_bool2() {
    return (false);
  }

  void void_error() {
    return (a);   // two error messages--not allowed to return a value 
  }

  char char_void() {
    return;
  }

  char char_char() {
    return ('1');
  }

  char char_int() {
    return (11);
  }

  char char_bool() {
    return (true);
  }

  char char_string() {
    return ("Hi!");
  }

  char char_bool2() {
    return false;
  }

  char char_error() {
    return (a);   // one error message--assume the return value is correct
  }

  int int_void() {
    return;
  }

  int int_char() {
    return ('1');
  }

  int int_int() {
    return (11);
  }

  int int_bool() {
    return (true);
  }

  int int_string() {
    return ("Hi!");
  }

  int int_bool2() {
    return (false);
  }

  int int_error() {
    return (a);   // one error message--assume the return value is correct
  }

  bool bool_void() {
    return;
  }

  bool bool_char() {
    return ('1');
  }

  bool bool_int() {
    return (11);
  }

  bool bool_bool() {
    return (true);
  }

  bool bool_string() {
    return ("Hi!");
  }

  bool bool_error() {
    return (a);   // one error message--assume the return value is correct
  }

  bool bool_bool2() {
    return false;
  }

  int k1(int z) {
    return (la[z]);
  }
  int i;
  int j;
  float la[50];
  string sa[50];
  char ca[50];

  int k2(int z) {
    return (i+j+la[z]);
  }

  int k3(int z) {
    return (i+j+sa[z]);  // must not give invalid return type error message
  }

  int k4(int z) {
    return (sa[z]);
  }

  char k5(int z) {
    return (i+j+la[z]);
  }

  char k6(int z) {
    return (sa[z]);
  }

}

