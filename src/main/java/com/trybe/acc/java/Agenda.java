package com.trybe.acc.java;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
  private List<String> contatos = new ArrayList<>();

  public void incluirContato(String nome) {
    contatos.add(nome);
  }

  public void excluirContato(String nome) {
    contatos.remove(nome);
  }

  public Boolean verificaContato(String nome) {
    return contatos.contains(nome);
  }

  public int tamanhoAgenda() {
    return contatos.size();
  }
}
