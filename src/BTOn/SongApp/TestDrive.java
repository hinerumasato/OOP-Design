package BTOn.SongApp;

import java.util.List;

public class TestDrive {
	public static void main(String[] args) {
		Song s1 = new Song("Anh da on hon", "u thi anh da on hon", "Hoang", "Pop");
		Song s7 = new Song("Anh da on hon", "u thi anh da on hon", "Anh", "Pop");
		Song s2 = new Song("Vuong", "va neu nang gio co cuon em di", "Trung Tran", "Ballab");
		Song s3 = new Song("Neu luc do", "neu luc do em khong buong tay", "TLinh", "Pop");
		Song s4 = new Song("Vai cau noi co khien nguoi thay doi", "co khien bo moi am em", "GrayD", "Ballab");
		Song s5 = new Song("Limo", "That's more my tempo", "Keshi", "Pop");
		Song s6 = new Song("Dung yeu nguoi noi tieng", "em khen anh dep trai...", "7Uppercut", "funk rock");

		MusicFile m1 = new MusicFile(s1, "MCK", "https://www.youtube.com/watch?v=dz6xe0xXqYE", 324255);
		MusicFile m2 = new MusicFile(s2, "MCK", "https://www.youtube.com/watch?v=dz6xe0xXqYE", 14433555);
		MusicFile m3 = new MusicFile(s3, "TLinh", "https://www.youtube.com/watch?v=dz6xe0xXqYE", 100937);
		MusicFile m4 = new MusicFile(s4, "GrayD", "https://www.youtube.com/watch?v=dz6xe0xXqYE", 8888433);
		MusicFile m5 = new MusicFile(s5, "Keshi", "https://www.youtube.com/watch?v=dz6xe0xXqYE", 10200);
		MusicFile m6 = new MusicFile(s6, "7Uppercut", "https://www.youtube.com/watch?v=dz6xe0xXqYE", 110002);
		MusicFile m7 = new MusicFile(s7, "7Uppercut", "https://www.youtube.com/watch?v=dz6xe0xXqYE", 110002);

		Album album1 = new Album("Hot", "04/11/2023", "RADWIMPS");
		album1.addMusicFile(m1);
		album1.addMusicFile(m2);
		album1.addMusicFile(m3);

		Album album2 = new Album("Hit", "09/11/2023", "RADWIMPS");
		album2.addMusicFile(m4);
		album2.addMusicFile(m5);
		album2.addMusicFile(m6);
		album2.addMusicFile(m7);

		Website website = new Website();
		website.addAlbum(album1);
		website.addAlbum(album2);

		List<MusicFile> resultSearch = website.searchBy(new SearchByName("a"), new SearchByAuthor("Hoang"),
				new SearchByPerformer("MCK"), new SearchByCategory("Pop"));

		List<MusicFile> resultSorted = website.sortBy(new SortByName(false), new SortByAuthor(false));
		for (MusicFile musicFile : resultSorted)
			System.out.println(musicFile);
	}
}
