package xyz.pagliares.adapter;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author Rodrigo Martins Pagliares
 */
public class CDAdapter extends AbstractTableModel {
    private List<CD> cds;

    private String[] columns = {"Artist", "Album", "Label", "Year"};

    public CDAdapter() {
        cds = new ArrayList<CD>();
    }

    public void addCD(CD cd){
        cds.add(cd);
    }

    public int getRowCount() {
        return cds.size();
    }

    public int getColumnCount() {
        return columns.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        CD temp = cds.get(rowIndex);
        Object returned = null;
        switch(columnIndex) {
            case 0:
                returned = temp.getName();
                break;
            case 1:
                returned = temp.getAlbum();
                break;
            case 2:
                returned = temp.getLabel();
                break;
             case 3:
                returned = temp.getYear();
                break;
        }
        return returned;

    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0 :
                return "Band";
            case 1 :
                return "Album";
            case 2 :
                return "Label";
            case 3 :
                return "Year";
        }
        return super.getColumnName(column);
    }
}
