# CS.12.01-Tutorial.1.2.12

This question involves reasoning about a two-dimensional (2D) array of integers. You will write two static methods, both of which are in a single enclosing class named Successors (not shown). These methods process a 2D integer array that contains consecutive values. Each of these integers may be in any position in the 2D integer array. For example, the following 2D integer array with 3 rows and 4 columns contains the integers 5 through 16, inclusive.

<img width="732" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.12/assets/57818506/00aa721e-6ba1-4ae2-acef-77cadce7a4f3">


The following Position class is used to represent positions in the integer array. The notation (r, c) will be used to refer to a Position object with row r and column c.

public class Position
{

public Position(int r, int c)
{

	// To be implemented.

}	

}

a) Write a static method findPosition that takes an integer value and a 2D integer array and returns the position of the integer in the given 2D integer array. If the integer is not an element of the 2D integer array, the method returns null.

For example, assume that array arr is the 2D integer array shown at the beginning of the question.

The call findPosition(8, arr) would return the Position object (2, 1) because the value 8 appears in arr at row 2 and column 1.
The call findPosition(17, arr) would return null because the value 17 does not appear in arr. 

b) Write a static method getSuccessorArray that returns a 2D successor array of positions created from a given 2D integer array.

The successor of an integer value is the integer that is one greater than that value. For example, the successor of 8 is 9. A 2D successor array shows the position of the successor of each element in a given 2D integer array. The 2D successor array has the same dimensions as the given 2D integer array. Each element in the 2D successor array is the position (row, column) of the corresponding 2D integer array element’s successor. The largest element in the 2D integer array does not have a successor in the 2D integer array, so its corresponding position in the 2D successor array is null.

The following diagram shows a 2D integer array and its corresponding 2D successor array. To illustrate the successor relationship, the values 8 and 9 in the 2D integer array are shaded. In the 2D successor array, the shaded element shows that the position of the successor of 8 is (0, 2) in the 2D integer array. The largest value in the 2D integer array is 16, so its corresponding element in the 2D successor array is null.

<img width="734" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.12/assets/57818506/3e5cc258-c8a3-4e52-b5eb-c4d04a1a5639">

