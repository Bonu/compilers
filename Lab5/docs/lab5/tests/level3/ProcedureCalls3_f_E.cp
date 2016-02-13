// MethodCallsE: Test arguments to methods (tuple types).
class Main {
  int m1(int i) {}
  int m2(float k) {}
  int m3(bool p) {}
  int m4(int i, bool p) {}
  int m5(bool p, float k, int i) {}
  int m6(bool p, bool q, int i, bool r) {}


	int i;        int j;
	float a;    float b;
	bool p;  bool q;

  int x = m1(5.1);
  int y = m1(i%2*a);
  int z = m2(p, 5);
  int r = m2(i*2);
  int r1 = m2(p);
  int s = m3(i);
  int t1 = m3(a);
  int t = m3("cc");
  int u = m4(3.0, p);
  int u1 = m4(p, 3);
  int v = m4(i*a, a, 6);
  int w = m5(p, 3, a);
  int w1 = m5("cc", i%j, 5.0);
  int e = m6(i+j, q, a, p);
  int f = m6(i+j, q, a);
  int g = m6(i, a, i+j*a, p, 66);

  void main() {
  }
}
