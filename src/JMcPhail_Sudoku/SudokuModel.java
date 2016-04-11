package JMcPhail_Sudoku;

public class SudokuModel implements Game, IntGets, IntSets{
	
	private int[] totalGrid;
	private int squareWidth;
	private int squareHeight;
	private int maxValue;
	private Filer myFiler;
	private Hinter myHinter;
	private Validator myValidator;
	private History myHistory;
	
	public SudokuModel(Controller theController) {
		this.myFiler = new Filer();
		this.myHinter = new Hinter();
		this.myValidator = new Validator();
		this.myHistory = new History();
	}
	
	@Override
	public void setByColumn(int value, int columnIndex, int rowIndex) {
		this.totalGrid[this.xyToIndex(columnIndex, rowIndex)] = value;
	}

	@Override
	public void setByRow(int value, int rowIndex, int columnIndex) {
		this.totalGrid[this.xyToIndex(columnIndex, rowIndex)] = value;
	}

	@Override
	public void setBySquare(int value, int squareIndex, int positionIndex) {
		
	}

	@Override
	public int getByColumn(int columnIndex, int rowIndex) {
        return this.totalGrid[xyToIndex(columnIndex, rowIndex)];
	}

	@Override
	public int getByRow(int rowIndex, int columnIndex) {
        return this.totalGrid[xyToIndex(columnIndex, rowIndex)];
	}

	@Override
	public int getBySquare(int squareIndex, int positionIndex) {
		return this.totalGrid[squareToIndex(squareIndex, positionIndex)];
	}

	@Override
	public void setMaxValue(int maximum) {
		this.maxValue = maximum;
	}

	@Override
	public int getMaxValue() {
        return this.maxValue;
	}

	@Override
	public int[] toArray() {
		return null;
	}

	@Override
	public void set(int[] cellValues) {
		this.totalGrid = cellValues;
		setMaxValue((int)Math.sqrt(this.totalGrid.length));
	}
	
	@Override
	public void setSquareWidth(int squareWidth) {
        this.squareWidth = squareWidth;
	}

	@Override
	public void setSquareHeight(int squareHeight) {
        this.squareHeight = squareHeight;
	}

	@Override
	public void restart() {
		
	}
	
	//Author: Zach
	int squareToIndex(int squareNum, int squareIndex) {
        int y = squareIndex / squareWidth;
        return squareIndex % squareWidth + (maxValue * y)+(squareNum*squareWidth)+ maxValue * (squareNum / 2);
    }
	
	//Author: Zach
    int xyToIndex(int y, int x) {
        return (y * maxValue) + x;
    }
}
