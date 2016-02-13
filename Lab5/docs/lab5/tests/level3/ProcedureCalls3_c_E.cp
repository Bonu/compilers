// MethodCallsE: Test arguments to methods (tuple types).
class Main {
  int m1(char i) {}
  int m2(int k) {}
  int m3(int p) {}
  int m4(char i, bool p) {}
  int m5(bool p, int k, char i) {}
  int m6(bool p, bool q, char i, bool r) {}


	char i;       char j;
	int a;        int b;
	bool p;    bool q;

  int x = m1(5+1);
  int y = m1(i%2*a);
  int z = m2(p, 5);
  int r = m2(i*2);
  int r1 = m2();
  int s = m3(i);
  int t1 = m3(p);
  int t = m3("cc");
  int u = m4(3, p);
  int u1 = m4(p, '3');
  int v = m4(i+a, a, '6');
  int w = m5(p, 3, a);
  int w1 = m5("cc", i%j, 5);
  int e = m6(i+j, q, a, p);
  int f = m6(i+j, q, a);
  int g = m6(i, a, i+j*a, p, '6' + '6');

  void main() {
  }
}
