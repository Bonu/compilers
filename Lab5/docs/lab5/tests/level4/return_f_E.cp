// Error03: Test for flagging of method decl-type and return-type mismatch.

class Error03{

  void void_void() {
    return;
  }

  void void_int() {
    return (2);
  }

  void void_float() {
    return (2.1);
  }

  void void_bool() {
    return (true);
  }

  void void_string() {
    return "Hi";
  }

  void void_null() {
    return (a);
  }



  int int_void() {
    return;
  }

  int int_int() {
    return (1);
  }

  int int_float() {
    return (1.1);
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



  float float_void() {
    return;
  }

  float float_int() {
    return (1);
  }

  float float_float() {
    return (1.1);
  }

  float float_bool() {
    return (true);
  }

  float float_string() {
    return ("Hi!");
  }

  float float_bool2() {
    return (false);
  }



  bool bool_void() {
    return;
  }

  bool bool_int() {
    return (1);
  }

  bool bool_float() {
    return (1.1);
  }

  bool bool_bool() {
    return (true);
  }

  bool bool_string() {
    return ("Hi!");
  }

  bool bool_bool2() {
    return (false);
  }

}

