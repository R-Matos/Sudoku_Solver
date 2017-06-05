package mvc;

import java.util.stream.IntStream;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import logic.Board;

public class Controller {

	//https://stackoverflow.com/questions/44354198/javafx-reusable-collections-using-fxml
	
	//private ListProperty<String> choiceBoxItems = new SimpleListProperty(FXCollections.observableArrayList("", "1", "2"));
	 
	
	@FXML
	public GridPane gridPane;
	
	@FXML
	private TextField textField;
	
	@FXML
	private ChoiceBox cb00, cb01, cb02, cb03, cb04, cb05, cb06, cb07, cb08,
						cb10, cb11, cb12, cb13, cb14, cb15, cb16, cb17, cb18,
						cb20, cb21, cb22, cb23, cb24, cb25, cb26, cb27, cb28,
						cb30, cb31, cb32, cb33, cb34, cb35, cb36, cb37, cb38,
						cb40, cb41, cb42, cb43, cb44, cb45, cb46, cb47, cb48,
						cb50, cb51, cb52, cb53, cb54, cb55, cb56, cb57, cb58,
						cb60, cb61, cb62, cb63, cb64, cb65, cb66, cb67, cb68,
						cb70, cb71, cb72, cb73, cb74, cb75, cb76, cb77, cb78,
						cb80, cb81, cb82, cb83, cb84, cb85, cb86, cb87, cb88;
	
	private int cb00Int, cb01Int, cb02Int, cb03Int, cb04Int, cb05Int, cb06Int, cb07Int, cb08Int,
						cb10Int, cb11Int, cb12Int, cb13Int, cb14Int, cb15Int, cb16Int, cb17Int, cb18Int,
						cb20Int, cb21Int, cb22Int, cb23Int, cb24Int, cb25Int, cb26Int, cb27Int, cb28Int,
						cb30Int, cb31Int, cb32Int, cb33Int, cb34Int, cb35Int, cb36Int, cb37Int, cb38Int,
						cb40Int, cb41Int, cb42Int, cb43Int, cb44Int, cb45Int, cb46Int, cb47Int, cb48Int,
						cb50Int, cb51Int, cb52Int, cb53Int, cb54Int, cb55Int, cb56Int, cb57Int, cb58Int,	
						cb60Int, cb61Int, cb62Int, cb63Int, cb64Int, cb65Int, cb66Int, cb67Int, cb68Int,
						cb70Int, cb71Int, cb72Int, cb73Int, cb74Int, cb75Int, cb76Int, cb77Int, cb78Int,
						cb80Int, cb81Int, cb82Int, cb83Int, cb84Int, cb85Int, cb86Int, cb87Int, cb88Int;
	
	private Model model;
	
	
	
	public Controller(Model model) {
		this.model = model;
		
		//IntStream.range(1,1).mapToObj(i -> Integer.toString(i)).forEach(choiceBoxItems::add);
		
		
	}
	
/*	public ListProperty<String> choiceBoxItemsProperty() {
        return choiceBoxItems ;
    }

    public ObservableList<String> getChoiceBoxItems() {
        return choiceBoxItemsProperty().get() ;
    }

    public void setComboBoxItems(ObservableList<String> choiceBoxItems) {
        choiceBoxItemsProperty().set(choiceBoxItems) ;
    }*/
	
	
	
	@FXML
	public void onSolve() {
		
		getInputData();
	
		int[][] inputData = {
				{ cb00Int, cb10Int, cb20Int, cb30Int, cb40Int, cb50Int, cb60Int, cb70Int, cb80Int },
				{ cb01Int, cb11Int, cb21Int, cb31Int, cb41Int, cb51Int, cb61Int, cb71Int, cb81Int },
				{ cb02Int, cb12Int, cb22Int, cb32Int, cb42Int, cb52Int, cb62Int, cb72Int, cb82Int },
				{ cb03Int, cb13Int, cb23Int, cb33Int, cb43Int, cb53Int, cb63Int, cb73Int, cb83Int },
				{ cb04Int, cb14Int, cb24Int, cb34Int, cb44Int, cb54Int, cb64Int, cb74Int, cb84Int },
				{ cb05Int, cb15Int, cb25Int, cb35Int, cb45Int, cb55Int, cb65Int, cb75Int, cb85Int },
				{ cb06Int, cb16Int, cb26Int, cb36Int, cb46Int, cb56Int, cb66Int, cb76Int, cb86Int },
				{ cb07Int, cb17Int, cb27Int, cb37Int, cb47Int, cb57Int, cb67Int, cb77Int, cb87Int },
				{ cb08Int, cb18Int, cb28Int, cb38Int, cb48Int, cb58Int, cb68Int, cb78Int, cb88Int } };
		
		
		Board board = new Board(inputData);
		
		model.solve(board, this);
	}
	
	
	private void getInputData() {
		
		String cb00Str = ((String) cb00.getSelectionModel().getSelectedItem()).trim();
		if (!cb00Str.equals("")) {																			//Empty option selected check 
			cb00Int = Integer.parseInt(((String) cb00.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb00Int = 0;
		}

		String cb01Str = ((String) cb01.getSelectionModel().getSelectedItem()).trim();
		if (!cb01Str.equals("")) {																			//Empty option selected check 
			cb01Int = Integer.parseInt(((String) cb01.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb01Int = 0;
		}

		String cb02Str = ((String) cb02.getSelectionModel().getSelectedItem()).trim();
		if (!cb02Str.equals("")) {																			//Empty option selected check 
			cb02Int = Integer.parseInt(((String) cb02.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb02Int = 0;
		}

		String cb03Str = ((String) cb03.getSelectionModel().getSelectedItem()).trim();
		if (!cb03Str.equals("")) {																			//Empty option selected check 
			cb03Int = Integer.parseInt(((String) cb03.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb03Int = 0;
		}

		String cb04Str = ((String) cb04.getSelectionModel().getSelectedItem()).trim();
		if (!cb04Str.equals("")) {																			//Empty option selected check 
			cb04Int = Integer.parseInt(((String) cb04.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb04Int = 0;
		}

		String cb05Str = ((String) cb05.getSelectionModel().getSelectedItem()).trim();
		if (!cb05Str.equals("")) {																			//Empty option selected check 
			cb05Int = Integer.parseInt(((String) cb05.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb05Int = 0;
		}

		String cb06Str = ((String) cb06.getSelectionModel().getSelectedItem()).trim();
		if (!cb06Str.equals("")) {																			//Empty option selected check 
			cb06Int = Integer.parseInt(((String) cb06.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb06Int = 0;
		}

		String cb07Str = ((String) cb07.getSelectionModel().getSelectedItem()).trim();
		if (!cb07Str.equals("")) {																			//Empty option selected check 
			cb07Int = Integer.parseInt(((String) cb07.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb07Int = 0;
		}

		String cb08Str = ((String) cb08.getSelectionModel().getSelectedItem()).trim();
		if (!cb08Str.equals("")) {																			//Empty option selected check 
			cb08Int = Integer.parseInt(((String) cb08.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb08Int = 0;
		}
		
		//--
		
		String cb10Str = ((String) cb10.getSelectionModel().getSelectedItem()).trim();
		if (!cb10Str.equals("")) {																			//Empty option selected check 
			cb10Int = Integer.parseInt(((String) cb10.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb10Int = 0;
		}

		String cb11Str = ((String) cb11.getSelectionModel().getSelectedItem()).trim();
		if (!cb11Str.equals("")) {																			//Empty option selected check 
			cb11Int = Integer.parseInt(((String) cb11.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb11Int = 0;
		}

		String cb12Str = ((String) cb12.getSelectionModel().getSelectedItem()).trim();
		if (!cb12Str.equals("")) {																			//Empty option selected check 
			cb12Int = Integer.parseInt(((String) cb12.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb12Int = 0;
		}

		String cb13Str = ((String) cb13.getSelectionModel().getSelectedItem()).trim();
		if (!cb13Str.equals("")) {																			//Empty option selected check 
			cb13Int = Integer.parseInt(((String) cb13.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb13Int = 0;
		}

		String cb14Str = ((String) cb14.getSelectionModel().getSelectedItem()).trim();
		if (!cb14Str.equals("")) {																			//Empty option selected check 
			cb14Int = Integer.parseInt(((String) cb14.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb14Int = 0;
		}

		String cb15Str = ((String) cb15.getSelectionModel().getSelectedItem()).trim();
		if (!cb15Str.equals("")) {																			//Empty option selected check 
			cb15Int = Integer.parseInt(((String) cb15.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb15Int = 0;
		}

		String cb16Str = ((String) cb16.getSelectionModel().getSelectedItem()).trim();
		if (!cb16Str.equals("")) {																			//Empty option selected check 
			cb16Int = Integer.parseInt(((String) cb16.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb16Int = 0;
		}

		String cb17Str = ((String) cb17.getSelectionModel().getSelectedItem()).trim();
		if (!cb17Str.equals("")) {																			//Empty option selected check 
			cb17Int = Integer.parseInt(((String) cb17.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb17Int = 0;
		}

		String cb18Str = ((String) cb18.getSelectionModel().getSelectedItem()).trim();
		if (!cb18Str.equals("")) {																			//Empty option selected check 
			cb18Int = Integer.parseInt(((String) cb18.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb18Int = 0;
		}
		
		//--
		
		String cb20Str = ((String) cb20.getSelectionModel().getSelectedItem()).trim();
		if (!cb20Str.equals("")) {																			//Empty option selected check 
			cb20Int = Integer.parseInt(((String) cb20.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb20Int = 0;
		}

		String cb21Str = ((String) cb21.getSelectionModel().getSelectedItem()).trim();
		if (!cb21Str.equals("")) {																			//Empty option selected check 
			cb21Int = Integer.parseInt(((String) cb21.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb21Int = 0;
		}

		String cb22Str = ((String) cb22.getSelectionModel().getSelectedItem()).trim();
		if (!cb22Str.equals("")) {																			//Empty option selected check 
			cb22Int = Integer.parseInt(((String) cb22.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb22Int = 0;
		}

		String cb23Str = ((String) cb23.getSelectionModel().getSelectedItem()).trim();
		if (!cb23Str.equals("")) {																			//Empty option selected check 
			cb23Int = Integer.parseInt(((String) cb23.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb23Int = 0;
		}

		String cb24Str = ((String) cb24.getSelectionModel().getSelectedItem()).trim();
		if (!cb24Str.equals("")) {																			//Empty option selected check 
			cb24Int = Integer.parseInt(((String) cb24.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb24Int = 0;
		}

		String cb25Str = ((String) cb25.getSelectionModel().getSelectedItem()).trim();
		if (!cb25Str.equals("")) {																			//Empty option selected check 
			cb25Int = Integer.parseInt(((String) cb25.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb25Int = 0;
		}

		String cb26Str = ((String) cb26.getSelectionModel().getSelectedItem()).trim();
		if (!cb26Str.equals("")) {																			//Empty option selected check 
			cb26Int = Integer.parseInt(((String) cb26.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb26Int = 0;
		}

		String cb27Str = ((String) cb27.getSelectionModel().getSelectedItem()).trim();
		if (!cb27Str.equals("")) {																			//Empty option selected check 
			cb27Int = Integer.parseInt(((String) cb27.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb27Int = 0;
		}

		String cb28Str = ((String) cb28.getSelectionModel().getSelectedItem()).trim();
		if (!cb28Str.equals("")) {																			//Empty option selected check 
			cb28Int = Integer.parseInt(((String) cb28.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb28Int = 0;
		}
		
		//--
		
		String cb30Str = ((String) cb30.getSelectionModel().getSelectedItem()).trim();
		if (!cb30Str.equals("")) {																			//Empty option selected check 
			cb30Int = Integer.parseInt(((String) cb30.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb30Int = 0;
		}

		String cb31Str = ((String) cb31.getSelectionModel().getSelectedItem()).trim();
		if (!cb31Str.equals("")) {																			//Empty option selected check 
			cb31Int = Integer.parseInt(((String) cb31.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb31Int = 0;
		}

		String cb32Str = ((String) cb32.getSelectionModel().getSelectedItem()).trim();
		if (!cb32Str.equals("")) {																			//Empty option selected check 
			cb32Int = Integer.parseInt(((String) cb32.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb32Int = 0;
		}

		String cb33Str = ((String) cb33.getSelectionModel().getSelectedItem()).trim();
		if (!cb33Str.equals("")) {																			//Empty option selected check 
			cb33Int = Integer.parseInt(((String) cb33.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb33Int = 0;
		}

		String cb34Str = ((String) cb34.getSelectionModel().getSelectedItem()).trim();
		if (!cb34Str.equals("")) {																			//Empty option selected check 
			cb34Int = Integer.parseInt(((String) cb34.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb34Int = 0;
		}

		String cb35Str = ((String) cb35.getSelectionModel().getSelectedItem()).trim();
		if (!cb35Str.equals("")) {																			//Empty option selected check 
			cb35Int = Integer.parseInt(((String) cb35.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb35Int = 0;
		}

		String cb36Str = ((String) cb36.getSelectionModel().getSelectedItem()).trim();
		if (!cb36Str.equals("")) {																			//Empty option selected check 
			cb36Int = Integer.parseInt(((String) cb36.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb36Int = 0;
		}

		String cb37Str = ((String) cb37.getSelectionModel().getSelectedItem()).trim();
		if (!cb37Str.equals("")) {																			//Empty option selected check 
			cb37Int = Integer.parseInt(((String) cb37.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb37Int = 0;
		}

		String cb38Str = ((String) cb38.getSelectionModel().getSelectedItem()).trim();
		if (!cb38Str.equals("")) {																			//Empty option selected check 
			cb38Int = Integer.parseInt(((String) cb38.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb38Int = 0;
		}
		
		//--
		
		String cb40Str = ((String) cb40.getSelectionModel().getSelectedItem()).trim();
		if (!cb40Str.equals("")) {																			//Empty option selected check 
			cb40Int = Integer.parseInt(((String) cb40.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb40Int = 0;
		}

		String cb41Str = ((String) cb41.getSelectionModel().getSelectedItem()).trim();
		if (!cb41Str.equals("")) {																			//Empty option selected check 
			cb41Int = Integer.parseInt(((String) cb41.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb41Int = 0;
		}

		String cb42Str = ((String) cb42.getSelectionModel().getSelectedItem()).trim();
		if (!cb42Str.equals("")) {																			//Empty option selected check 
			cb42Int = Integer.parseInt(((String) cb42.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb42Int = 0;
		}

		String cb43Str = ((String) cb43.getSelectionModel().getSelectedItem()).trim();
		if (!cb43Str.equals("")) {																			//Empty option selected check 
			cb43Int = Integer.parseInt(((String) cb43.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb43Int = 0;
		}

		String cb44Str = ((String) cb44.getSelectionModel().getSelectedItem()).trim();
		if (!cb44Str.equals("")) {																			//Empty option selected check 
			cb44Int = Integer.parseInt(((String) cb44.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb44Int = 0;
		}

		String cb45Str = ((String) cb45.getSelectionModel().getSelectedItem()).trim();
		if (!cb45Str.equals("")) {																			//Empty option selected check 
			cb45Int = Integer.parseInt(((String) cb45.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb45Int = 0;
		}

		String cb46Str = ((String) cb46.getSelectionModel().getSelectedItem()).trim();
		if (!cb46Str.equals("")) {																			//Empty option selected check 
			cb46Int = Integer.parseInt(((String) cb46.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb46Int = 0;
		}

		String cb47Str = ((String) cb47.getSelectionModel().getSelectedItem()).trim();
		if (!cb47Str.equals("")) {																			//Empty option selected check 
			cb47Int = Integer.parseInt(((String) cb47.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb47Int = 0;
		}

		String cb48Str = ((String) cb48.getSelectionModel().getSelectedItem()).trim();
		if (!cb48Str.equals("")) {																			//Empty option selected check 
			cb48Int = Integer.parseInt(((String) cb48.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb48Int = 0;
		}
		
		//--
		
		String cb50Str = ((String) cb50.getSelectionModel().getSelectedItem()).trim();
		if (!cb50Str.equals("")) {																			//Empty option selected check 
			cb50Int = Integer.parseInt(((String) cb50.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb50Int = 0;
		}

		String cb51Str = ((String) cb51.getSelectionModel().getSelectedItem()).trim();
		if (!cb51Str.equals("")) {																			//Empty option selected check 
			cb51Int = Integer.parseInt(((String) cb51.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb51Int = 0;
		}

		String cb52Str = ((String) cb52.getSelectionModel().getSelectedItem()).trim();
		if (!cb52Str.equals("")) {																			//Empty option selected check 
			cb52Int = Integer.parseInt(((String) cb52.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb52Int = 0;
		}

		String cb53Str = ((String) cb53.getSelectionModel().getSelectedItem()).trim();
		if (!cb53Str.equals("")) {																			//Empty option selected check 
			cb53Int = Integer.parseInt(((String) cb53.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb53Int = 0;
		}

		String cb54Str = ((String) cb54.getSelectionModel().getSelectedItem()).trim();
		if (!cb54Str.equals("")) {																			//Empty option selected check 
			cb54Int = Integer.parseInt(((String) cb54.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb54Int = 0;
		}

		String cb55Str = ((String) cb55.getSelectionModel().getSelectedItem()).trim();
		if (!cb55Str.equals("")) {																			//Empty option selected check 
			cb55Int = Integer.parseInt(((String) cb55.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb55Int = 0;
		}

		String cb56Str = ((String) cb56.getSelectionModel().getSelectedItem()).trim();
		if (!cb56Str.equals("")) {																			//Empty option selected check 
			cb56Int = Integer.parseInt(((String) cb56.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb56Int = 0;
		}

		String cb57Str = ((String) cb57.getSelectionModel().getSelectedItem()).trim();
		if (!cb57Str.equals("")) {																			//Empty option selected check 
			cb57Int = Integer.parseInt(((String) cb57.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb57Int = 0;
		}

		String cb58Str = ((String) cb58.getSelectionModel().getSelectedItem()).trim();
		if (!cb58Str.equals("")) {																			//Empty option selected check 
			cb58Int = Integer.parseInt(((String) cb58.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb58Int = 0;
		}
		
		//--
		
		String cb60Str = ((String) cb60.getSelectionModel().getSelectedItem()).trim();
		if (!cb60Str.equals("")) {																			//Empty option selected check 
			cb60Int = Integer.parseInt(((String) cb60.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb60Int = 0;
		}

		String cb61Str = ((String) cb61.getSelectionModel().getSelectedItem()).trim();
		if (!cb61Str.equals("")) {																			//Empty option selected check 
			cb61Int = Integer.parseInt(((String) cb61.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb61Int = 0;
		}

		String cb62Str = ((String) cb62.getSelectionModel().getSelectedItem()).trim();
		if (!cb62Str.equals("")) {																			//Empty option selected check 
			cb62Int = Integer.parseInt(((String) cb62.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb62Int = 0;
		}

		String cb63Str = ((String) cb63.getSelectionModel().getSelectedItem()).trim();
		if (!cb63Str.equals("")) {																			//Empty option selected check 
			cb63Int = Integer.parseInt(((String) cb63.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb63Int = 0;
		}

		String cb64Str = ((String) cb64.getSelectionModel().getSelectedItem()).trim();
		if (!cb64Str.equals("")) {																			//Empty option selected check 
			cb64Int = Integer.parseInt(((String) cb64.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb64Int = 0;
		}

		String cb65Str = ((String) cb65.getSelectionModel().getSelectedItem()).trim();
		if (!cb65Str.equals("")) {																			//Empty option selected check 
			cb65Int = Integer.parseInt(((String) cb65.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb65Int = 0;
		}

		String cb66Str = ((String) cb66.getSelectionModel().getSelectedItem()).trim();
		if (!cb66Str.equals("")) {																			//Empty option selected check 
			cb66Int = Integer.parseInt(((String) cb66.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb66Int = 0;
		}

		String cb67Str = ((String) cb67.getSelectionModel().getSelectedItem()).trim();
		if (!cb67Str.equals("")) {																			//Empty option selected check 
			cb67Int = Integer.parseInt(((String) cb67.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb67Int = 0;
		}

		String cb68Str = ((String) cb68.getSelectionModel().getSelectedItem()).trim();
		if (!cb68Str.equals("")) {																			//Empty option selected check 
			cb68Int = Integer.parseInt(((String) cb68.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb68Int = 0;
		}
		
		//--
		
		String cb70Str = ((String) cb70.getSelectionModel().getSelectedItem()).trim();
		if (!cb70Str.equals("")) {																			//Empty option selected check 
			cb70Int = Integer.parseInt(((String) cb70.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb70Int = 0;
		}

		String cb71Str = ((String) cb71.getSelectionModel().getSelectedItem()).trim();
		if (!cb71Str.equals("")) {																			//Empty option selected check 
			cb71Int = Integer.parseInt(((String) cb71.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb71Int = 0;
		}

		String cb72Str = ((String) cb72.getSelectionModel().getSelectedItem()).trim();
		if (!cb72Str.equals("")) {																			//Empty option selected check 
			cb72Int = Integer.parseInt(((String) cb72.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb72Int = 0;
		}

		String cb73Str = ((String) cb73.getSelectionModel().getSelectedItem()).trim();
		if (!cb73Str.equals("")) {																			//Empty option selected check 
			cb73Int = Integer.parseInt(((String) cb73.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb73Int = 0;
		}

		String cb74Str = ((String) cb74.getSelectionModel().getSelectedItem()).trim();
		if (!cb74Str.equals("")) {																			//Empty option selected check 
			cb74Int = Integer.parseInt(((String) cb74.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb74Int = 0;
		}

		String cb75Str = ((String) cb75.getSelectionModel().getSelectedItem()).trim();
		if (!cb75Str.equals("")) {																			//Empty option selected check 
			cb75Int = Integer.parseInt(((String) cb75.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb75Int = 0;
		}

		String cb76Str = ((String) cb76.getSelectionModel().getSelectedItem()).trim();
		if (!cb76Str.equals("")) {																			//Empty option selected check 
			cb76Int = Integer.parseInt(((String) cb76.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb76Int = 0;
		}

		String cb77Str = ((String) cb77.getSelectionModel().getSelectedItem()).trim();
		if (!cb77Str.equals("")) {																			//Empty option selected check 
			cb77Int = Integer.parseInt(((String) cb77.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb77Int = 0;
		}

		String cb78Str = ((String) cb78.getSelectionModel().getSelectedItem()).trim();
		if (!cb78Str.equals("")) {																			//Empty option selected check 
			cb78Int = Integer.parseInt(((String) cb78.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb78Int = 0;
		}
		
		//--
		
		String cb80Str = ((String) cb80.getSelectionModel().getSelectedItem()).trim();
		if (!cb80Str.equals("")) {																			//Empty option selected check 
			cb80Int = Integer.parseInt(((String) cb80.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb80Int = 0;
		}

		String cb81Str = ((String) cb81.getSelectionModel().getSelectedItem()).trim();
		if (!cb81Str.equals("")) {																			//Empty option selected check 
			cb81Int = Integer.parseInt(((String) cb81.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb81Int = 0;
		}

		String cb82Str = ((String) cb82.getSelectionModel().getSelectedItem()).trim();
		if (!cb82Str.equals("")) {																			//Empty option selected check 
			cb82Int = Integer.parseInt(((String) cb82.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb82Int = 0;
		}

		String cb83Str = ((String) cb83.getSelectionModel().getSelectedItem()).trim();
		if (!cb83Str.equals("")) {																			//Empty option selected check 
			cb83Int = Integer.parseInt(((String) cb83.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb83Int = 0;
		}

		String cb84Str = ((String) cb84.getSelectionModel().getSelectedItem()).trim();
		if (!cb84Str.equals("")) {																			//Empty option selected check 
			cb84Int = Integer.parseInt(((String) cb84.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb84Int = 0;
		}

		String cb85Str = ((String) cb85.getSelectionModel().getSelectedItem()).trim();
		if (!cb85Str.equals("")) {																			//Empty option selected check 
			cb85Int = Integer.parseInt(((String) cb85.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb85Int = 0;
		}

		String cb86Str = ((String) cb86.getSelectionModel().getSelectedItem()).trim();
		if (!cb86Str.equals("")) {																			//Empty option selected check 
			cb86Int = Integer.parseInt(((String) cb86.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb86Int = 0;
		}

		String cb87Str = ((String) cb87.getSelectionModel().getSelectedItem()).trim();
		if (!cb87Str.equals("")) {																			//Empty option selected check 
			cb87Int = Integer.parseInt(((String) cb87.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb87Int = 0;
		}

		String cb88Str = ((String) cb88.getSelectionModel().getSelectedItem()).trim();
		if (!cb88Str.equals("")) {																			//Empty option selected check 
			cb88Int = Integer.parseInt(((String) cb88.getSelectionModel().getSelectedItem()).trim());
		} else {
			cb88Int = 0;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

