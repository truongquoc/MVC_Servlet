package Model.Bo;

import java.util.ArrayList;

import Model.Bean.Student;
import Model.Dao.CheckLoginDAO;

public class CheckLoginBO {
CheckLoginDAO checkLoginDAO;
public CheckLoginBO() {
	checkLoginDAO = new CheckLoginDAO();
}
public boolean isValidUser(String username, String password) {
	return checkLoginDAO.isExistUser(username, password);
}

public ArrayList<Student> getList(String username) {
	return checkLoginDAO.getArrList();
}
}
