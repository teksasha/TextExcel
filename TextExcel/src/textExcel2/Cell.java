package textExcel2;

public abstract class Cell
{
	private String value;
	
	public Cell(){
		value = "";
	}
	
	public Cell (String initValue){
		value = initValue;
	}
	
	public String getValue(){
		return value;
	}
	
	public abstract boolean isString();
	
	public abstract String getSheetValue();
}
