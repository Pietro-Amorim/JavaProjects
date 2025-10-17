package edu.senai.pietro.simuladorrpg.classes;

import edu.senai.pietro.simuladorrpg.model.Equipamento;

public class Jogador {
    private String nome;
    private int nivel;
    private int vida;
    private Equipamento arma;       // ← separado
    private Equipamento armadura;   // ← separado

    // Construtor usado pela GUI
    public Jogador(String nome, int nivel, Equipamento arma, Equipamento armadura) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = nivel * 10;
        this.arma = arma;
        this.armadura = armadura;
    }

    public int getForcaTotal() {
        int forca = nivel;
        if (arma != null) forca += arma.getBonus();
        if (armadura != null) forca += armadura.getBonus();
        return forca;
    }

    // Getters
    public String getNome() { return nome; }
    public int getNivel() { return nivel; }
    public int getVida() { return vida; }
    public Equipamento getArma() { return arma; }
    public Equipamento getArmadura() { return armadura; }
}