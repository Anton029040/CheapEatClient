package controller;

import controller.ClientController;
import controller.RecipeController;
import view.NorthPanel;
import view.SouthPanel;


public class GUIController {

    private ClientController clientController;
    private RecipeController recipeController;
    private SouthPanel southPanel;

    public GUIController() {
        southPanel = new SouthPanel(this);
        new NorthPanel();
    }
}