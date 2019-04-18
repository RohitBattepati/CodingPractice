/* Write a javaScritt Program to print following formats 

1       1           *       54321
12      22          **      5432
123     333         ***     543
1234    4444        ****    54
12345   55555       *****   5

55555   54321   1       1       1
4444    4321    21      21      2 3
333     321     321     321     4 5 6
22      21      4321    4321    7 8 9 10
1       1       54321   54321   11 12 13 14 15

*/

function pattern1(){
    for ( let i =1 ;i < 6; i++){
        
        for ( let j = 1; j<i+1; j++){
            console.log(j);
            
        }
        console.log("\n");
    }
    

    
}

pattern1();