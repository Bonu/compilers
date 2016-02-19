// Main: Test complicated array expressions.
class Main {

  int la[50];       int ia1[50];    int ia2[50];
  float fa1[50];    float fa2[50];

  int i = la[10];
  int j = ia2[la[10]] * 3;
  float a = ia2[la[10]] * 3;
  float b = ia1[3] + fa1[i%j];
  bool p = fa1[ia1[la[ia2[3]]]] != fa2[ia1[2]];
  bool q = la[i+j*45] > 0;
  

  void main(){
  }
}
