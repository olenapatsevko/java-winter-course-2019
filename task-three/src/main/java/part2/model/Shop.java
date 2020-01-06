package part2.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private String name;
    private List<Department> department = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Shop() {
    }

    public Shop(String name, Department department) {
        this.name = name;
        this.department.add(department);
    }

    public void addDepartment(Department department) {
        if (findDepartment(department.getName(), department.getLocation()) == -1) {
            this.department.add(department);
        }
    }

    public void removeDepartment(Department department) {
        this.department.remove(department);
    }

    public void sortDepartment() {
        this.department.sort((o1, o2) -> o1.getServices().size() - o2.getServices().size());
    }

    public int findDepartment(String name, String location) {
        for (int i = 0; i < this.department.size(); i++) {
            if (this.department.get(i).getLocation().toLowerCase().compareTo(location.toLowerCase()) == 0
                    && this.department.get(i).getName().toLowerCase().compareTo(name.toLowerCase()) == 0) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }

    public class Department {
        private String name;
        private String location;
        private List<String> services = new ArrayList<>();
        private List<Product> products = new ArrayList<>();

        public Department(String name, String location, String service, Product product) {
            this.name = name;
            this.location = location;
            this.services.add(service);
            this.products.add(product);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public List<String> getServices() {
            return services;
        }

        public void setServices(String service) {
            this.services.add(service);
        }

        public List<Product> getProducts() {
            return products;
        }

        public void setProducts(Product product) {
            this.products.add(product);
        }


        @Override
        public String toString() {
            return "Department{" +
                    "name='" + name + '\'' +
                    ", location='" + location + '\'' +
                    ", services=" + services +
                    ", products=" + products +
                    '}';
        }
    }
}
