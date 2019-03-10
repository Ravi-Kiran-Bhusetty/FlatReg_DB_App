package com.cg.frs.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.frs.dto.FlatRegistrationDTO;

class FlatRegistrationDAOImplTest {

	static FlatRegistrationDAOImpl flatRegistrationDAOImpl;
	@BeforeAll
	public static void init() {
		flatRegistrationDAOImpl = new FlatRegistrationDAOImpl();
	}
	//@Test
	void testRegisterFlat() {
		FlatRegistrationDTO flat = new FlatRegistrationDTO();
		FlatRegistrationDTO flat1 = new FlatRegistrationDTO();
		flat.setOwnerId(2);
		flat.setFlatType(1);
		flat.setFlatArea(20);
		flat.setRentAmout(200);
		flat.setDepositAmount(2000);
		flat1 = flatRegistrationDAOImpl.registerFlat(flat);
		assertEquals(1003,flat1.getFlatRegId());
	}

	@Test
	void testGetAllOwnerIds() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		assertEquals(al, flatRegistrationDAOImpl.getAllOwnerIds());
	}

}
