package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSeller;

	@FXML
	private MenuItem menuItemDepartmet;

	@FXML
	private MenuItem menuItemAbout;

	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("onMenuItemSellerAction");
	}

	@FXML
	public void onMenuItemDepartmetAction() {
		System.out.println("onMenuItemDepartmetAction");
	}

	@FXML
	public void onMenuItemAbourAction() {
		System.out.println("onMenuItemAbourAction");
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
	}

}
