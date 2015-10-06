package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Film;

public class Parser {

	/**
	 * 解析html得到film对象
	 * 
	 * @param html
	 * @return
	 */
	public static Film parseFilmFromHtml(String html) {
		if (html == null) {
			return null;
		}
		Film film = new Film();
		Matcher m = Pattern.compile(Regex.title).matcher(html);
		if (m.find()) {
			film.setTitleName(m.group(1));
			film.setFilmName(m.group(2));
		}
		m = Pattern.compile(Regex.release_time).matcher(html);
		if (m.find()) {
			film.setReleaseTime(m.group(1));
		}
		m = Pattern.compile(Regex.download_url).matcher(html);
		if (m.find()) {
			film.setDownloadUrl(m.group(1));
		}
		m = Pattern.compile(Regex.film_image).matcher(html);
		if (m.find()) {
			film.setFilmImage(m.group(1));
		}
		return film;
	}

	/**
	 * 从电影列表页 取得每个
	 * 
	 * @param html
	 * @return
	 */
	public static List<String> parseUrlListFromHtml(String html) {
		List<String> list = new ArrayList<String>();
		Matcher m = Pattern.compile(Regex.film_html).matcher(html);
		while (m.find()) {
			list.add(m.group(1));
		}
		return list;
	}
}
