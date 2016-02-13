// MethodCalls: Test arguments to methods (tuple types).
class Main {
  int m1(int i) {}
  int m2(float k) {}
  int m3(bool p) {}
  int m4(int i, bool p) {}
  int m5(bool p, float k, int i) {}
  int m6(bool p, bool q, int i, bool r) {}

	int i;       int j;
	float a;     float b;
	bool p;   bool q;

  int x = m1(5);
  int y = m1(i%2*j);
  int z = m2(a);
  int r = m2(i*0.2);
  int s = m3(i>b);
  int t = m3(p);
  int u = m4(3, p);
  int v = m4(i+j, a > b);
  int w = m5(p, 3.3, 4);
  int e = m5(i+j>a, a*a, i%j);
  int f = m6(p, q, i, p);
  int g = m6(i == j, a != b, i+j*i, p==q);
  void main() {
  }
}
