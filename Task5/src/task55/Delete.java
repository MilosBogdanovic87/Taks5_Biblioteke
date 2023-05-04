package task55;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/biblioteke_task5";
		String username = "root";
		String pass = "";

		System.out.println("Konekcija...");
		try (Connection conn = DriverManager.getConnection(url, username, pass)) {
			System.out.println("Konekcija uspesna!");

			String sqlDelete = "DELETE from decijeod WHERE decijeID = ?";

			PreparedStatement ps = conn.prepareStatement(sqlDelete);

			ps.setInt(1, 5); // Nije pokrenuto za ove vrednosti

			int deletePodatka = ps.executeUpdate();

			if (deletePodatka > 0) {
				System.out.println("Brisanje uspesno!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
