// Main: Test complicated array expressions.
class Main {

  int i;            int j;
  int la[50];       int ia1[50];    int ia2[50];
  float fa1[50];    float fa2[50];
  float a;          float b;
  bool p;           bool q;
  
  void main(){
	i = la[10];
	i = la[i+j*45];

	b = ia1[3] + fa1[i%j];
	i = ia2[la[10]] * 3;
	a = ia2[la[10]] * 3;

	p = fa1[ia1[la[ia2[3]]]] != fa2[ia1[2]];
	
    la[0] = i;
    la[ia1[ia2[22]]] = i*3;
  }
}
