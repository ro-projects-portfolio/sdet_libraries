package lombok;

// Instead of using Getters , Setters will use Lombok annotations
@Getter @Setter
@Builder (setterPrefix = "set") // Since this example based on object creation (will need this annotation)
// Read docs to checj all available annotations and features
public class Employee {

    // Lombok library is good choice to use with pojo classes or with Builder DP
    // Pojo class instances
    private String firstName;
    private String lastName;
    private int age;
    private String department;
    private String position;

    // Since we use special annotations we don't need any getters or setters.
    // Moreover, we're going to use this class to create and employee object with builder pattern we can avoid using static inner class or external builder class
}
