package edu.senai.pietro.simuladorpg;

public enum Equipamento {
    MOTOSSERRA_DA_EVISCERACAO_SANGRENTA("Motosserra da Evisceração Sangrenta", 7),
    ARMADURA_DE_COURO_FALSO("Armadura de Couro Falso", 2);

    private final String nome;
    private final int bonus;

    Equipamento(String nome, int bonus) {
        this.nome = nome;
        this.bonus = bonus;
    }

    public String getNome() {
        return nome;
    }

    public int getBonus() {
        return bonus;
    }
}