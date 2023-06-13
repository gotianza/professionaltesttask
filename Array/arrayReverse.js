/*Here we have a test task about automation in Testing. Please provide your recruiter with the results via GitHub.

[Programming](https://www.notion.so/Programming-ENG-NEW-b0c9c9532d5d41eca2e430a9295356cc?pvs=21)

**Needed skills:** 
SQL, Command line, Bash, Test automation in Python/JS/Java
*/


function reverseArray(array) {
    var reversedArr = [];
    for (var i = array.length - 1; i >= 0; i--) {
      reversedArr.push(array[i]);
    }
    return reversedArr;
}
var array = [1, 2, 3, 4, 5];
var reversedArray = reverseArray(array);
console.log(reversedArray);