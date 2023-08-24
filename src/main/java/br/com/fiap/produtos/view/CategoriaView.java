package br.com.fiap.produtos.view;

import br.com.fiap.produtos.model.Categoria;
import br.com.fiap.produtos.repository.CategoriaCollectionRepository;

import javax.swing.*;

public class CategoriaView {

    static CategoriaCollectionRepository repository;

    public static Categoria select(Categoria categoria){
        Categoria ret = (Categoria) JOptionPane.showInputDialog(
                null, //componente pai. Como não tem será null
                "Selecione uma Categoria",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                repository.findAll().toArray(), // Número de opção
                categoria == null ? 1 : categoria);
        return ret;
    }

    public void sucesso(){
        JOptionPane.showMessageDialog(null, "Categoria foi salva com sucesso!");
    }

    public void sucesso(Categoria categoria){
        JOptionPane.showMessageDialog(null, "Categoria" + categoria.getNome() + "foi salva com sucesso!");
    }

    public static Categoria form(){
        String nome = JOptionPane.showInputDialog(null, "Informe o nome da categoria");
        return new Categoria(nome);
    }

}
