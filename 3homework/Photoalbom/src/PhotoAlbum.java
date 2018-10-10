
public class PhotoAlbum extends Page {
	public void newPage() {
		System.out.println("Новая страница");
	}
	public static void main (String args[]) {
		Photo ph = new Photo();
		Page pg = new Page();
		PhotoAlbum pa = new PhotoAlbum();
		
		ph.photoName();
		
		pg.countPhoto();
		pg.photoName();
		
		pa.countPhoto();
		pa.newPage();
		pa.photoName();
	}

}
