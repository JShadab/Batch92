package org.shad;

import org.shad.dao.TrainDAO;

public class Main {

	public static void main(String[] args) {
		
		TrainDAO trainDAO= new TrainDAO();
		
		trainDAO.save(null);

	}

}
