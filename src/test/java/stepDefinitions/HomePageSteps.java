package stepDefinitions;

import core.Base;
import io.cucumber.java.en.*;
import pageObjects.HomePagePageObj;

public class HomePageSteps extends Base{

	HomePagePageObj homepageobj = new HomePagePageObj ();
	
	@Then("I validate Desktops {string} on the UI")
	public void i_validate_desktops_on_the_ui(String desktops) {
		homepageobj.compareTextDesktopLink(desktops);
		logger.info("Text for " +desktops +"varifeid successfully");
	}

	@Then("I validate Laptops & Notebooks {string} on the UI")
	public void i_validate_laptops_notebooks_on_the_ui(String laptopsAndNotebooks) {
		homepageobj.compareTextlaptopAndNotBookLink(laptopsAndNotebooks);
		logger.info("Text for " +laptopsAndNotebooks +"varifeid successfully");
	}

	@Then("I validate Tablets {string} on the UI")
	public void i_validate_tablets_on_the_ui(String tablets) {
		homepageobj.compareTextTabletsLink(tablets);
		logger.info("Text for " +tablets +"varifeid successfully");
	}

	@Then("I validate Software {string} on the UI")
	public void i_validate_software_on_the_ui(String software) {
		homepageobj.compareTextSoftwareLink(software);
		logger.info("Text for " +software +"varifeid successfully");
	}

	@Then("I validate Phones & PDAs {string} on the UI")
	public void i_validate_phones_pd_as_on_the_ui(String phonesAndPDAs) {
		homepageobj.compareTextPhonesAndPDAsLink(phonesAndPDAs);
		logger.info("Text for " +phonesAndPDAs +"varifeid successfully");
	}

	@Then("I validate Cameras {string} on the UI")
	public void i_validate_cameras_on_the_ui(String cameras) {
		homepageobj.compareTextCamerasLink(cameras);
		logger.info("Text for " +cameras +"varifeid successfully");
	}

	@Then("I validate MP3 Players {string} on the UI")
	public void i_validate_mp3_players_on_the_ui(String mP3Players) {
		homepageobj.compareTextMP3PlayersLink(mP3Players);
		logger.info("Text for " +mP3Players +"varifeid successfully");
	}
}
