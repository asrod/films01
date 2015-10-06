package regex;

public class Regex {

	/**
	 * 标题（主键）和标题中电影名 group(1),group(2)
	 */
	public static final String title = "<h1><font color=#07519a>(.*《(.*)》.*)</font></h1></div>";
	/**
	 * 发布时间 group(1)
	 */
	public static final String release_time = "发布时间：(.{10})";
	/**
	 * 下载地址 group(1)
	 */
	public static final String download_url = "<td style=\"WORD-WRAP: break-word\" bgcolor=\"#fdfddf\"><a href=\"(.*)\">.*</a></td>";
	/**
	 * 电影图片 group(1)
	 */
	public static final String film_image = "src=\"(.+?jpg)\"";

	/**
	 * 电影列表页 匹配每个电影的html链接
	 */
	public static final String film_html = "<a href=\"(.*)\" class=\"ulink\">";
}
