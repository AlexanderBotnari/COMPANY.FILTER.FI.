import java.util.LinkedList;
import java.util.List;
import com.github.javafaker.Faker;

public class Company {
	
	private static List<Employee> employees = new LinkedList<>();
	  
    public static void generate() {
    	Faker faker = new Faker();
        while (employees.size() < 10) {
            employees.add(
                new Employee(faker.name().fullName(),
                faker.number().numberBetween(10000, 20000),
                faker.number().numberBetween(3, 15))
            );
        }
    }

    public static void printAllCompact() {
        System.out.println("Compact result :");
        System.out.println("-----------------");
    	employees.forEach(e -> System.out.println(e.getFullName()));
    }

    public static void printAllDetailed() {
       System.out.println("Detailed result :");
       System.out.println("------------------");
       employees.forEach(e -> System.out.println(e));
    }
    
}
