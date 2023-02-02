package prepCall;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeObject {
	
	public static void main(String[] args) {
		
		List<Employe> list =new ArrayList<>();
		
		list.add(new Employe(1,"yogesh",80000));
		list.add(new Employe(2,"Raaj",9000));
		list.add(new Employe(3,"Shubham",12000));
		
		Map<Integer, String> result=list.stream().collect(Collectors.toMap(Employe::getId,Employe::getName));
		
		System.out.println(result);
		
	}

}


/*
 * List of employee object, Convert into map using Java 8, key should be
 * employee ID and value should be employee Object.
 */