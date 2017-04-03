package io.github.ensyb.phone.application.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface DataInputMapper<Type> {
	public Type mapper(ResultSet resultSet) throws SQLException;
}
