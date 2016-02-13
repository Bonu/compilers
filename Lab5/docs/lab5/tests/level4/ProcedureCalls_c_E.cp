// MethodCallsE: Test arguments to methods (tuple types).
class Main {
  void m1(char i) {}
  void m2(int k) {}
  void m3(int p) {}
  void m4(char i, bool p) {}
  void m5(bool p, int k, char i) {}
  void m6(bool p, bool q, char i, bool r) {}

  void main() {
	char i;       char j;
	int a;        int b;
	bool p;       bool q;

	m1(5+1);
	m1(i%2*a);
	m2(p, 5);
	m2(i*2);
	m2();
	m3(i);
	m3(p);
	m3("cc");
	m4(3, p);
	m4(p, '3');
	m4(i*a, a, '6');
	m5(p, 3, a);
	m5("cc", i%j, 5);
	m6(i+j, q, a, p);
	m6(i+j, q, a);
	m6(i, a, i+j*a, p, '6' + '6');
  }
}
