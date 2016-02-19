// Main: Test multiple method definitions with varying modifiers.
//	 Checks that return type matches method decl-type.

class Main{

  void dummy1() {}

  int i1() {
    return (1);
  }

  float g1() {
    return (1.1);
  }

  string s1() {
    return ("1.1");
  }

  bool t1() {
    return true; 
  }


  void dummy2() {}

  int i2() {
    return (2);
  }

  float g2() {
    return (2.2);
  }

  string s2() {
    return ("2.2");
  }

  bool t2() {
    return true; 
  }


  void dummy3() {}

  int i3() {
    return (3);
  }

  float g3() {
    return (3.3);
  }

  bool s3() {
    return (true);
  }

  bool t3() {
    return false; 
  }

  int k1(int z) {
    return (la[z]);
  }
  int i;
  int j;
  int la[50];
  char ca[50];

  int k2(int z) {
    return (i+j+la[z]);
  }

  float k3(int z) {
    return (i+j+la[z]);
  }

  int k4(int z) {
    return (ca[z]);
  }

  float k5(int z) {
    return (ca[z]);
  }

  int k6(int z) {
    return (i+j+ca[z]);
  }


  void main() {
  }

}
