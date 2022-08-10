package textExcel3;

/* FormulaCell represents a cell that contains a formula, anything
 * the user entered by typing something with parentheses around it
 */
public class FormulaCell extends Cell 
{
	// create a new FormulaCell. If value doesn't have parentheses, this will
	// throw an exception and no FormulaCell will be created.
	public FormulaCell(String value)
	{
		super(value);
		
		if (!value.startsWith("(") || !value.endsWith(")"))
			throw new IllegalArgumentException("Formula values need to start and end with parentheses. '" + value + "' did not.");
	}
	
	// return a formula suitable for display in the grid
	@Override
	public String getDisplayValue() 
	{
		// since we know the constructor validated that this starts and ends with
		// parentheses, we need to  trim off the first and last characters of whatever
		// the user entered, then simplify the value. The original value is stored in the parent class.
		String formula = getOriginalValue().substring(1, getOriginalValue().length() - 1);
		double doubleFormula = ExpressionSimplifier.simplify(formula);
		String simpleFormula = Double.toString(doubleFormula);
		return simpleFormula;
	}

}
