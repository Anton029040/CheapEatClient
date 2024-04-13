package controller;

import model.User;
import view.ClientConnection;


public class ClientController {

    private ClientConnection clientConnection;
    private RecipeController recipeController;
    private User connectedUser;
    public ClientController() {
        new GUIController();
        new RecipeController();
    }
    public void login() {

    }
    public void register() {

    }
}
