package ListExercise.entities;

public class Employee {
    private int Id;
    private String Nome;
    private Double Salario;

    public Employee() {
    }

    public Employee(int id, String nome, Double salario) {
        Id = id;
        Nome = nome;
        Salario = salario;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public void increaseSalary(double percentage) {
        Salario += Salario * percentage / 100.0;
    }

    public String toString() {
        return Id + ", " + Nome + ", " + String.format("%.2f", Salario);
    }
}
