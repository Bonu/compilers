// MethodCallsE: Test arguments to methods (tuple types).
class Main {
  void m1(int i) {}
  void m2(float k) {}
  void m3(bool p) {}
  void m4(int i, bool p) {}
  void m5(bool p, float k, int i) {}
  void m6(bool p, bool q, int i, bool r) {}

  void main() {
	int i;        int j;
	float a;    float b;
	bool p;  bool q;

	m1(5.1);
	m1(i%2*a);
	m2(p, 5);
	m2(i*2);
	m2(p);
	m3(i);
	m3(a);
	m3("cc");
	m4(3.0, p);
	m4(p, 3);
	m4(i*a, a, 6);
	m5(p, 3, a);
	m5("cc", i%j, 5.0);
	m6(i+j, q, a, p);
	m6(i+j, q, a);
	m6(i, a, i+j*a, p, 66);
  }
}
