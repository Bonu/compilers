// Main: Test complicated array expressions.
class Main {

  int i;
  int j;
  int la[50];
  int ia1[50];
  int ia2[50];
  string sa1[50];
  string sa2[50];
  string a;
  string b;
  bool p;
  bool q;

  int k(int z) {
    return (i+j+la[z]);
  }
  
  void main(){
	i = la[10];
	i = la[i+j*45];

	b = sa2[3] + sa1[i%j];
	i = ia2[la[10]] * 3;
	j = ia2[la[10]] * 3;

	p = sa1[ia1[la[ia2[3]]]] != sa2[ia1[2]];
	
    la[0] = i;
    la[ia1[ia2[22]]] = i*3;
  }
}
