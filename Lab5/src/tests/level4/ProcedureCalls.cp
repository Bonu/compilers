// MethodCalls: Test arguments to methods (tuple types).
class Main {
  void m1(int i) {}
  void m2(float k) {}
  void m3(bool p) {}
  void m4(int i, bool p) {}
  void m5(bool p, float k, int i) {}
  void m6(bool p, bool q, int i, bool r) {}

  void main() {
	int i;       int j;
	float a;     float b;
	bool p;      bool q;

	m1(5);
	m1(i%2*j);
	m2(a);
	m2(i*0.2);
	m3(i>b);
	m3(p);
	m4(3, p);
	m4(i+j, a > b);
	m5(p, 3.3, 4);
	m5(i+j>a, a*a, i%j);
	m6(p, q, i, p);
	m6(i == j, a != b, i+j*i, p==q);
  }
}
