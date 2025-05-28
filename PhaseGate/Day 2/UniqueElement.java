public class UniqueElement {
	public static int uniqueSum(int[] number) {
	
	int sum = 0;
	int count = 0;	

for (int i = 0; i < number.length; i++) {
for (int j = i ; j < number.length; j++) {

 if (number[i] == number[j]) {
	count++;
if (count == 1) {
	sum += sum[i]; 

       }

     } 
   }
}

return sum;
 
	}
}

