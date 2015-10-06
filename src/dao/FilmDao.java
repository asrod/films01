package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.apache.commons.lang.StringUtils;

import utils.DBUtil;
import model.Film;

public class FilmDao {

	Connection conn;

	/**
	 * 保存电影
	 * 
	 * @param film
	 */
	public void save(Film film) {
		if (film == null || film.getTitleName() == null) {
			return;
		}
		conn = DBUtil.open();
		try {
			PreparedStatement pstmt = conn
					.prepareStatement("insert into films_dytt values(?,?,?,?,?,?)");
			pstmt.setString(1, film.getTitleName());
			pstmt.setString(2, StringUtils.trimToEmpty(film.getFilmName()));
			pstmt.setString(3, StringUtils.trimToEmpty(film.getReleaseTime()));
			pstmt.setString(4, StringUtils.trimToEmpty(film.getDownloadUrl()));
			pstmt.setString(5, StringUtils.trimToEmpty(film.getFilmImage()));
			pstmt.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}

	}

}
