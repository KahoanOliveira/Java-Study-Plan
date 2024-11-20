package FixingExercises.Exercise3.entities;

public class Pessoa {
    private String name;
    private int idade;
    private double altura;

    public Pessoa(String name, int idade, double altura ) {
        this.altura = altura;
        this.idade = idade;
        this.name = name;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
