package main;

import java.util.List;

import dao.FilmDao;
import regex.Parser;
import model.Film;
import utils.HttpUtil;

public class GetFilm {

	static int i = 100;

	public static void main(String[] args) {

		FilmDao dao = new FilmDao();

		Runnable r = new Runnable() {
			@Override
			public void run() {
				while (true) {
					String listUrl = Constants.film_list_url + i + ".html";
					String listHtml = HttpUtil.Get(listUrl);
					List<String> urlList = Parser
							.parseUrlListFromHtml(listHtml);
					for (String url : urlList) {
						url = Constants.site_base_url + url;
						String html = HttpUtil.Get(url);
						Film film = Parser.parseFilmFromHtml(html);
						dao.save(film);
						System.out.println(film);
					}
					i++;
				}
			}
		};

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		Thread t4 = new Thread(r);
		Thread t5 = new Thread(r);
		Thread t6 = new Thread(r);
		Thread t7 = new Thread(r);
		Thread t8 = new Thread(r);
		Thread t9 = new Thread(r);
		Thread t10 = new Thread(r);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();

	}
}
