// : Check statement types: new array and class, 
//       for-header assignments, array use.
class Main {

  void main() {

    int A[5];     int B[5];
    int i;        int j;
    bool p;       bool q;

    i = 0;
    while (i < 10) {
      A[i] = B[i];
	  {
	     int k;
	     float f;
	 j = 0;
         while ( j < 10) {
            A[j] = 0;
	    j = j + 1;
	 }
         f = k%(k*2);
      }
	  if (i > j) p = q;
	  if (i+j >= A[j])
	     i = j+10;
	  else {
		 p = p&&q;
	     i = i%i;
      }
      i = i + 1;
    }

	while ((i > 0) && p) {
		p = (i>0) || (j>0);
	}
  }
}
