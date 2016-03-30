
import dao.NoteBookDao;
import entities.NoteBook;

import java.util.List;

public class DaoTest {
    public static void main(String[] args) {
        NoteBookDao dao = new NoteBookDao();
        List<NoteBook> list = dao.getAll();
        for (NoteBook noteBook : list){
            System.out.println(noteBook);
        }
        NoteBook noteBook = dao.getEntityById(17);
        System.out.println(noteBook.getManufacture());
    }
}
