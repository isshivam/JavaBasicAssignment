package Ques18.Partb;

@FunctionalInterface
public interface EmployeeFactory {
        public abstract Employee getEmployee(String name, Integer age, String city);
    }
