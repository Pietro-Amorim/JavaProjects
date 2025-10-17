package edu.senai.pietro.simuladorrpg.service;

import edu.senai.pietro.simuladorrpg.model.Equipamento;
import java.util.ArrayList;
import java.util.List;

public class EquipamentoService {

    public List<Equipamento> listarTodosEquipamentos() {
        List<Equipamento> lista = new ArrayList<>();
        for (Equipamento eq : Equipamento.values()) {
            lista.add(eq);
        }
        return lista;
    }
}