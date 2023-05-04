package task55;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/biblioteke_task5";
		String username = "root";
		String pass = "";

		System.out.println("Konekcija...");
		try (Connection conn = DriverManager.getConnection(url, username, pass)) {
			System.out.println("Konekcija je uspesna!");

			String sqlUpdate = "UPDATE decijeod SET uzrast = ? where decijeID = ?";

			PreparedStatement ps = conn.prepareStatement(sqlUpdate);

			

			ps.setInt(1, 13);
			ps.setInt(2, 3);
			

			int apdejtPodatka = ps.executeUpdate();

			if (apdejtPodatka > 0) {
				System.out.println("Uspesno obavljena izmena!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}