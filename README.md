# Intersection of Two Arrays
<br/>
The intersection of two sets is a subset which contains the elements which are members
of both of the given sets. The idea of using a HashMap is to improve effeciency as HashMaps
can perform insertions and lookups in O(1) time (given the proper circumstances).
<br/><br/>
int[] array1 = {1, 2, 3, 4, 5}
int[] array2 = {0, 2, 4, 6, 8}
<br/><br/>
The intersection of array1 and array2 would be: {2, 4}
<br/><br/>
A solution involving nested loops to compare each element in array1 to each element in array2 
would have a time complexity of O(N²) while this solution using a HashMap reduces the 
time complexity to O(N) where N is the sum of the lengths of the arrays to be compared
(total number of elements). 

