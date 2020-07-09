
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
//@ToString
public class Employee {

    private String fullName;
    private int salary;
    private int experience;
    
	@Override
	public String toString() {
		return fullName+"  "+ salary + "$"+"  "+ experience + " years";
	}

}
