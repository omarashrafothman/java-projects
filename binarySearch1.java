import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class binarySearch1 {
	
public static void main(String[] args){

int arr[]={10,25,36,40,66,78,90,100};
int key;
int beg = 0;
int end = arr.length;
int mid= (beg+end)/2;
System.out.println("guess a number");
Scanner scanner = new Scanner(System.in); 
key = scanner.nextInt(); 
while(beg<=end){

if(key==arr[mid]){
	System.out.println("item fond in index"+mid);
	break;}
	if(key<arr[mid]){

end=mid-1;}
else{
	beg=mid+1;
mid=(beg+end)/2;
}
if(beg>end){

	System.out.println("item not fond");


}




	}








}








}
















