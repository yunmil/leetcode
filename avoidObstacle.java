/*
You are given an array of integers representing coordinates of obstacles situated on a straight line.

Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.

Find the minimal length of the jump enough to avoid all the obstacles.
*/

int solution(int[] inputArray) {
    
    int minJump = 2; //create int to store minjump it is greater than 1 because + 1 will always get an obstacle
    Arrays.sort(inputArray); //sort an inputarray for the binary search 
    
    while (validJump(inputArray, minJump)) {
        minJump++;
    }
    
    return minJump; 

}

boolean validJump(int[] inputArray, int jump) {
    
    int successJump = jump;
    
    //while target is not found in binarysearch(-1) && only count till max of the obstacle
    while (Arrays.binarySearch(inputArray, successJump) < 0 && successJump<=inputArray[inputArray.length-1]) {
        successJump += jump; 
    }
    
    return successJump<=inputArray[inputArray.length-1]; 
    
}
