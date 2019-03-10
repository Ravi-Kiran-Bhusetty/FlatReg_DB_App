package com.cg.frs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.utility.FlatDatabase;

public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO {

	FlatDatabase flatDatabase = new FlatDatabase();
	Connection connection = flatDatabase.database();
	ArrayList<Integer> ownerId = new ArrayList<Integer>();
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into flat_registration (owner_id, flat_type, flat_area, rent_amount, deposit_amount) values (?,?,?,?,?)");
			preparedStatement.setInt(1, flat.getOwnerId());
			preparedStatement.setInt(2, flat.getFlatType());
			preparedStatement.setInt(3, flat.getFlatArea());
			preparedStatement.setDouble(4, flat.getRentAmout());
			preparedStatement.setDouble(5, flat.getDepositAmount());
			preparedStatement.executeUpdate();
			PreparedStatement preparedStatement1 = connection.prepareStatement("Select flat_reg_no from flat_registration where owner_id = ?");
			preparedStatement1.setInt(1, flat.getOwnerId());
			ResultSet resultSet = preparedStatement1.executeQuery();
			while(resultSet.next())
				flat.setFlatRegId(resultSet.getLong(1));
		} catch (SQLException e) {
			e.printStackTrace();	}
		return flat;
	}

	public ArrayList<Integer> getAllOwnerIds() {
		try {
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery("Select owner_id from flat_owners");
			while (resultSet.next()) {
				ownerId.add(resultSet.getInt(1));
			}
		} catch (SQLException e) {
		}
		return ownerId;
	}

}
