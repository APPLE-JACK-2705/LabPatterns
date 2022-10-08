package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Employee{
    private List<Employee> components = new ArrayList<>();

    public void addComponent(Employee component){
        components.add(component);
    }

    public void removeComponent(Employee component){
        components.remove(component);
    }

    public void showEmployee() {
        System.out.println();
        for(Employee component : components){
            component.showEmployee();
        }
    }
}
