package br.facet.sudoku.controller;

import br.facet.sudoku.model.IControlModel;
import br.facet.sudoku.view.*;

public class MainController implements IViewControl
{
    private static IControlModel controlToModel;
    private static IControlView controlToView;
    
    public static void main(String[] args)
    {
        controlToView = new MainWindow();
        
        controlToView.carregarJanela();
    }
}