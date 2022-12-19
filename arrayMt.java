/*
Given an array a, your task is to apply the following mutation to it:

Array a mutates into a new array b of the same length
For each i from 0 to a.length - 1 inclusive, b[i] = a[i - 1] + a[i] + a[i + 1]
If some element in the sum a[i - 1] + a[i] + a[i + 1] does not exist, it is considered to be 0
For example, b[0] equals 0 + a[0] + a[1]
*/


int[] solution(int[] a) {
    
    int n = a.length; 
    int[] b = new int[n]; 
    
    if ( n < 2 ) {
        return a; 
    }
    for ( int i=0; i<a.length; i++ ) {
        if ( i==0 ) {
            b[i] = a[i] + a[i+1]; 
        }
        else if ( i==a.length-1 ) {
            b[i] = a[i-1] + a[i]; 
        }
        else {
            b[i] = a[i-1] + a[i] + a[i+1]; 
        }
    }
    
    return b; 

}
