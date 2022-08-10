package textExcel2;

public class NumberCell extends Cell
{
	private double number;
	
	public NumberCell(String value){
		super(value);
		number = Double.parseDouble(value);
	}
	
	public String getSheetValue(){
		return Double.toString(number);
	}
	
	public boolean isString(){
		return false;
	}
}
