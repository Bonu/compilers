// Main: Test complicated array expressions.
class Main {

  int la[50];
  int ia1[50];
  int ia2[50];
  string sa1[50];
  string sa2[50];

  int i = la[10];
  int j = la[i+j*45];
  string a = sa1[10];
  string b = sa2[3] + sa1[i%j];
  bool p = sa1[ia1[la[ia2[3]]]] != sa2[ia1[2]];
  bool q = ia1[ia1[la[ia2[3]]]] != ia2[ia1[2]];


  void main(){
  }
}
