import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Manager man = null;
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        ArrayList<Manager> managerList = new ArrayList<Manager>();

        //Зчитування всіх Manager
        BufferedReader reader = new BufferedReader(new FileReader("InputManager.txt"));
        try {
            String s;
            ArrayList<String> input = new ArrayList<String>();
            while ((s = reader.readLine()) != null) {
                input.add(s);
            }
            for (int i = 0; i < input.size(); i++) {
                String name = input.get(i);
                i++;
                String surname = input.get(i);
                i++;
                double sal = Double.parseDouble(input.get(i));
                i++;
                double bonus = Double.parseDouble(input.get(i));
                i++;
                man = new Manager(name, surname, sal, null, bonus);
                boolean add = managerList.add(man);
            }
        } finally {
            if (reader != null)
                reader.close();
        }

        //Серіалізація менеджерів
        serialization("Manager.txt", null, managerList);

        //Десеріалізація менеджерів
        deserialization("Manager.txt", null, managerList);


        //Зчитування всіх Employee
        BufferedReader readers = new BufferedReader(new FileReader("InputEmployee.txt"));
        try {
            String s;
            ArrayList<String> input = new ArrayList<String>();
            while ((s = readers.readLine()) != null) {
                input.add(s);
            }
            for (int i = 0; i < input.size(); i++) {
                String name = input.get(i);
                i++;
                String surname = input.get(i);
                i++;
                double sal = Double.parseDouble(input.get(i));
                i++;
                String mas = input.get(i);
                Manager m = null;
                if (mas != null) {
                    m = managerList.get(Integer.parseInt(mas));
                }
                i++;
                double bonus = Double.parseDouble(input.get(i));
                i++;
                man = new Manager(name, surname, sal, m, bonus);
                boolean add = employeeList.add(man);
            }
        } finally {
            if (readers != null)
                readers.close();
        }

        //Серіалізація працівників
        serialization("Employee.txt", employeeList, null);

        //Десеріалізація працівників
        deserialization("Employee.txt", employeeList, null);

    }

    //Serialization Manager and Employee
    public static void serialization(String fileNameSerialization, ArrayList<Employee> employeeList, ArrayList<Manager> managerList) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileNameSerialization);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        if (employeeList == null) {
            for (Manager manager : managerList) {
                oos.writeObject(manager);
                System.out.println(manager.toString());
                oos.flush();
            }
        } else {
            for (Employee employee : employeeList) {
                oos.writeObject(employee);
                System.out.println(employee.toString());
                oos.flush();
            }
        }
        oos.close();
    }

    //Deserialization Manager and Employee
    public static void deserialization(String fileNameDeserialization, ArrayList<Employee> employeeList, ArrayList<Manager> manageList) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileNameDeserialization);
        ObjectInputStream ois = new ObjectInputStream(fis);
        if (employeeList == null) {
            for (int i = 0; i < manageList.size(); i++) {
                Manager manager = (Manager) ois.readObject();
                System.out.println(manager.toString());
            }
        } else {
            for (int i = 0; i < employeeList.size(); i++) {
                Employee employee = (Employee) ois.readObject();
                System.out.println(employee.toString());
            }
        }
    }
}