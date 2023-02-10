import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class BookTableModel extends AbstractTableModel {

    private int columnCount = 5;
    private ArrayList <String []> arrayList;

    public BookTableModel(){
        arrayList = new ArrayList<String []>();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.add(new String[getColumnCount()]);
        }
    }

    @Override
    public int getRowCount() {
        return arrayList.size();
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] mas = arrayList.get(rowIndex);
        return mas[columnIndex];
    }

    @Override
    public String getColumnName(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> "id";
            case 1 -> "title";
            case 2 -> "is bn";
            case 3 -> "description";
            case 4 -> "testField";
            default -> "";
        };
    }

    public void addDate(String[] row){
        String[] rowTable;
        rowTable = row;
        arrayList.add(rowTable);
    }
}
