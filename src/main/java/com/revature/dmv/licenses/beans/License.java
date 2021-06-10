package com.revature.dmv.licenses.beans;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("license")
public class License {
		@PrimaryKeyColumn(name = "uuid", ordinal =0, type=PrimaryKeyType.PARTITIONED)
		private UUID uuid;
		
	private Date expirationDate;
	private UUID userID;
	

}
