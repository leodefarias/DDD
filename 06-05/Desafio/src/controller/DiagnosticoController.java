package controller;

import model.Animal;
import model.Diagnostico;

import java.util.ArrayList;
import java.util.List;

public class DiagnosticoController {
    private List<Animal> animais = new ArrayList<>();
    private List<Diagnostico> diagnosticos = new ArrayList<>();

    public void cadastrarAnimal(String nome, String especie, int idade) {
        animais.add(new Animal(nome, especie, idade));
    }

    public void registrarDiagnostico(String nomeAnimal, String descricao) {
        Animal a = encontrarAnimalPorNome(nomeAnimal);
        if (a == null) {
            throw new IllegalArgumentException("Animal não cadastrado: " + nomeAnimal);
        }
        diagnosticos.add(new Diagnostico(a, descricao));
    }

    public List<Diagnostico> listarDiagnosticos() {
        return new ArrayList<>(diagnosticos);
    }

    private Animal encontrarAnimalPorNome(String nome) {
        for (Animal a : animais) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }
}
