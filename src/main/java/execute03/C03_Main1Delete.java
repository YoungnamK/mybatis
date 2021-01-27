package execute03;

import dao.AlbumDao;

public class C03_Main1Delete {

	public static void main(String[] args) {
		AlbumDao dao = new AlbumDao();
		System.out.println("앨범 삭제하기");
		int id = 8;
		int result = -1;
		result = dao.DeleteData(id);

		if (result == 0) {
			System.out.println(id + "번 앨범이 존재하지 않습니다.");
		} else if (result == -1) {
			System.out.println(id + "번 앨범이 삭제실패!");
		} else {
			System.out.println(id + "번 앨범이 삭제됐습니다.");
		}
	}

}
