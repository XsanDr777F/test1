import java.util.Objects;

public class Employee {
    private final int id;
    private String fullName;
    private int sallary;
    private int depId;

    private static int idCounter = 1;

    public Employee(String fullName, int sallary, int depId) {

        this.fullName = fullName;
        this.sallary = sallary;
        this.depId = depId;
        this.id = idCounter++;
    }

    public Integer getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public Integer getSallary() {
        return sallary;
    }
    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }
    public void setSallary(Integer sallary) {
        this.sallary = sallary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(fullName, employee.fullName) && Objects.equals(sallary, employee.sallary) && Objects.equals(depId, employee.depId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, sallary, depId);
    }

    @Override
    public String toString() {
        return "Сотрудник {" +
                "Номер = " + id +
                ", ФИО " + fullName + '\'' +
                ", зарплата = " + sallary +
                ", номер отдела = " + depId +
                '}';
    }
}