Question No. 1

Create a Class Medicine with the below attributes:

medicineName - String

batchNo-String

disease - String

price-int

Write getters, setters and parameterized constructor as required.

Public class Solution is already created with main method. Code inside main method should not be altered else your

solution might be scored as zero. You may copy the code from main method in eclipse to verify your implementation.

implement static method - medicinePriceForGivenDisease in Solution class.

This method will take a String parameter named disease along with the other parameter as array of Medicine objects.

The method will return an array of Integer containing the price of the medicines in ascending order, if the given input(disease) matches the disease attribute of the medicine objects in the Array.
Note: 1) Same disease can have more than one medicine. 2) disease search should be case insensitive.

This method should be called from the main method and display the prices.

Main method mentioned above already has Scanner code to read values, create objects and test above methods. Hence do not modify it.

Consider below sample input and output:
Input

Hyadry

FHW0602

EyeDryness

140

Dolo

FHW0603

Fever

10

OpsionHA

P5011

EyeDryness

435

Mucinex

C0011

Cold

15

EyeDryness

Output:

140

435