package youtubeclass;
/*
 * Database - a simple example of a database connection
 * @author Donald Witcombe
 */
public class Database{
	private static int databaseConnectionStatic;

	public static int getDatabaseConnectionStatic() {
		return databaseConnectionStatic;
	}

	public static void setDatabaseConnectionStatic(int databaseConnection) {
		Database.databaseConnectionStatic = databaseConnection;
	}
	
	protected void closeDatabase() {
		databaseConnectionStatic = 0;
	}
}

