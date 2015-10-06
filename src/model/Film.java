package model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Film implements Serializable {

	private String titleName;
	private String filmName;
	private String releaseTime;
	private String downloadUrl;
	private String filmImage;
	private Timestamp updateTime;

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public String getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(String releaseTime) {
		this.releaseTime = releaseTime;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getFilmImage() {
		return filmImage;
	}

	public void setFilmImage(String filmImage) {
		this.filmImage = filmImage;
	}

	@Override
	public String toString() {
		return "Film [titleName=" + titleName + ", filmName=" + filmName
				+ ", releaseTime=" + releaseTime + ", downloadUrl="
				+ downloadUrl + ", filmImage=" + filmImage + ", updateTime="
				+ updateTime + "]";
	}

}
