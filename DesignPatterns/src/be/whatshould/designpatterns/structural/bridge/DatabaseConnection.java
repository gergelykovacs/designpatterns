/**
 * The concrete CRUD implementation where all the jobs are bridged to the 
 * specialized implementations.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.structural.bridge;

import be.whatshould.designpatterns.etc.enums.DBTypes;
import be.whatshould.designpatterns.etc.bridge.*;

public class DatabaseConnection implements DatabaseInterface {
	
	private DBImplementorInterface implementor = null;
	
	private static class DBFactory {
		
		private DBFactory() {
		}
		
		public static DBImplementorInterface getInstance(DBTypes DB) {
			if(DB == DBTypes.HER_SQL) {
				return new HerSqlImplementation(new HerSqlStorage());
			} else if(DB == DBTypes.HIS_SQL) {
				return new HisSqlImplementation(new HisSqlStorage());
			}
			return null;
		}
	}
	
	public DatabaseConnection() {
	}
	
	public DatabaseConnection(DBTypes DB) {	
		implementor = DBFactory.getInstance(DB);
	}

	@Override
	public void insert(String key, String value) {
		implementor.insertImpl(key, value);
	}

	@Override
	public String query(String key) {
		return implementor.queryImpl(key);
	}

	@Override
	public void update(String key, String newValue) {
		implementor.updateImpl(key, newValue);
	}

	@Override
	public void delete(String key) {
		implementor.deleteImpl(key);
	}
}