package com.cg.frs.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.frs.exceptions.InvalidDepositException;
import com.cg.frs.exceptions.InvalidFlatAreaException;
import com.cg.frs.exceptions.InvalidFlatTypeException;
import com.cg.frs.exceptions.InvalidOwnerIdException;
import com.cg.frs.exceptions.InvalidRentException;
import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.service.FlatRegistrationServiceImpl;
import com.cg.frs.service.IFlatRegistrationService;

public class Client {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FlatRegistrationDTO flatRegistrationDTO = new FlatRegistrationDTO();
		IFlatRegistrationService flatRegistration = new FlatRegistrationServiceImpl();
		ArrayList<Integer> ownerId = new ArrayList<Integer>();
		System.out.println("Menu\n1. Register Flat\n2. Exit");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			ownerId = flatRegistration.getAllOwnerIds();
			System.out.println("Existing Owner IDS Are:-" + ownerId);
			System.out.println("Please enter your owner id from above list: ");
			int yourOwnerId = sc.nextInt();
			if (ownerId.contains(yourOwnerId)) {
				System.out.println("Select flat type [1 - 1BHK, 2 - 2BHK]:");
				int flatType = sc.nextInt();
				if (flatType == 1 || flatType == 2) {
					System.out.println("Enter flat area in sq. ft.: ");
					int flatArea = sc.nextInt();
					if (flatArea > 0) {
						System.out.println("Enter desired rent amount Rs.: ");
						double rent = sc.nextDouble();
						if (rent > 0) {
							System.out.println("Enter desired deposit amount Rs.: ");
							double deposit = sc.nextDouble();
							if (deposit > rent) {
								flatRegistrationDTO.setOwnerId(yourOwnerId);
								flatRegistrationDTO.setFlatType(flatType);
								flatRegistrationDTO.setFlatArea(flatArea);
								flatRegistrationDTO.setRentAmout(rent);
								flatRegistrationDTO.setDepositAmount(deposit);
								flatRegistrationDTO = flatRegistration.registerFlat(flatRegistrationDTO);
								if (flatRegistrationDTO != null) {
									System.out.println("Flat Successfully Registered. Registration id:<"
											+ flatRegistrationDTO.getFlatRegId() + ">");
								} else
									System.out.println("Registration Failed");
							} else {
								try {
									throw new InvalidDepositException();
								} catch (InvalidDepositException e) {
								}
							}
						} else {
							try {
								throw new InvalidRentException();
							} catch (InvalidRentException e) {
							}
						}
					} else {
						try {
							throw new InvalidFlatAreaException();
						} catch (InvalidFlatAreaException e) {
						}
					}
				} else {
					try {
						throw new InvalidFlatTypeException();
					} catch (InvalidFlatTypeException e) {
					}
				}
			} else {
				try {
					throw new InvalidOwnerIdException();
				} catch (InvalidOwnerIdException e) {
				}
			}
			break;
		case 2:
			System.exit(0);
			break;
		default:
			System.err.println("Input can be only 1 or 2");
			break;
		}
	}

}
