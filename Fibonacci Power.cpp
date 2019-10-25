#include <bits/stdc++.h> 
#define mod 1000000007 
using namespace std; 

// Iterative function to compute modular power 
long long modularexpo(long long x, long long y, long long p) 
{ 
	// Initialize result 
	long long res = 1; 
	// Update x if it is more than or 
	// equal to p 
	x = x % p; 

	while (y > 0) { 
		// If y is odd, multiply x with result 
		if (y & 1) 
			res = (res * x) % p; 

		// y must be even now 
		y = y >> 1; 
		x = (x * x) % p; 
	} 
	return res; 
} 

// Helper function that multiplies 2 matrices 
// F and M of size 2*2, and puts the 
// multiplication result back to F[][] 
void multiply(long long F[2][2], long long M[2][2], long long m) 
{ 
	long long x = ((F[0][0] * M[0][0]) % m + 
				(F[0][1] * M[1][0]) % m) % m; 

	long long y = ((F[0][0] * M[0][1]) % m + 
				(F[0][1] * M[1][1]) % m) % m; 

	long long z = ((F[1][0] * M[0][0]) % m + 
				(F[1][1] * M[1][0]) % m) % m; 

	long long w = ((F[1][0] * M[0][1]) % m + 
				(F[1][1] * M[1][1]) % m) % m; 

	F[0][0] = x; 
	F[0][1] = y; 
	F[1][0] = z; 
	F[1][1] = w; 
} 

// Helper function that calculates F[][] raise to 
// the power n and puts the result in F[][] 
// Note that this function is designed only for fib() 
// and won't work as general power function 
void power(long long F[2][2], long long n, long long m) 
{ 
	if (n == 0 || n == 1) 
		return; 
	long long M[2][2] = { { 1, 1 }, { 1, 0 } }; 

	power(F, n / 2, m); 
	multiply(F, F, m); 

	if (n % 2 != 0) 
		multiply(F, M, m); 
} 

// Function that returns nth Fibonacci number 
long long fib(long long n, long long m) 
{ 
	long long F[2][2] = { { 1, 1 }, { 1, 0 } }; 
	if (n == 0) 
		return 0; 
	power(F, n - 1, m); 
	return F[0][0]; 
} 

// Driver Code 
int main() 
{ 
	long long n = 4; 
	long long base = fib(n, mod) % mod; 
	long long expo = fib(n, mod - 1) % (mod - 1); 
	long long result = modularexpo(base, expo, mod) % mod; 
	cout << result << endl; 
} 
