package TicTacToeGame;
import java.util.*;

public class adi {
	
	public static int search(int arr[], int x)
	{
		int n= arr.length;
		int l=0, h=n-1;
		
		while(l<h) {
			int mid= (l+h)/2;
			if(x==arr[mid]) {
				return mid;
			}
			else if(arr[mid]>x) {
				h=mid-1;
			}
			else {
				l=mid;
			}
		}
		
		
		return -1;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> e1= new HashSet<>();
		Employee a= new Employee("Aditya",21);
		Employee b= new Employee("Aditya",21);
		
		e1.add(a);
		e1.add(b);
		
		System.out.println(e1.size());
//		
//		int arr[]= {1,2,3,4,5,6};
//		System.out.println(adi.search(arr,10));
		

	}

}


class Employee{
	String name;
	int age;
	public Employee(String name,int age){
		this.name= name;
		this.age= age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	
	
	
	
}