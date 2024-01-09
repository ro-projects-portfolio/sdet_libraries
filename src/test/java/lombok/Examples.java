package lombok;

public class Examples {

    public static void main(String[] args) {
        Employee employee = Employee.builder()// We need to follow this structure
                .setFirstName("First")
                .setLastName("Last")
                // We can set any parameter whatever we need and create an objects with different parameter combinations
                .build();

        System.out.println(employee.getFirstName());

    }
}
