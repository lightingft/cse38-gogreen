package frontend.controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import tools.Requests;

import java.net.URL;
import java.util.ResourceBundle;

public class FriendRequestController implements Initializable {
    @FXML
    private Label lblUsername;
    @FXML
    private JFXButton btnAccept;
    @FXML
    private JFXButton btnDecline;

    private static String thisUsername;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnAccept.setOnAction(e -> {
            Requests.instance.acceptFriendRequest(thisUsername, lblUsername.getText());
        });

        btnDecline.setOnAction(e -> {
            Requests.instance.rejectFriendRequest(thisUsername, lblUsername.getText());

        });

    }

    /**.
     * Sets the username for the friend request
     * @param username - user String to set label text to
     */
    public void setUsername(String username) {
        lblUsername.setText(username);
    }

    public static void setThisUsername(String username) {
        thisUsername = username;
    }

}
