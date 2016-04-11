package JMcPhail_Sudoku;
import java.util.Set;

public interface HintPossible {
	public Set<Integer> rowPossibilities( int rowIndex);
    public Set<Integer> columnPossibilities( int columnIndex);
    public Set<Integer> squarePossibilities( int squareIndex);
}
