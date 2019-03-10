package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dao.FlatRegistrationDAOImpl;
import com.cg.frs.dao.IFlatRegistrationDAO;
import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService {

	IFlatRegistrationDAO flatDAO = new FlatRegistrationDAOImpl();
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		return flatDAO.registerFlat(flat);
	}

	public ArrayList<Integer> getAllOwnerIds() {
		return flatDAO.getAllOwnerIds();
	}

}
