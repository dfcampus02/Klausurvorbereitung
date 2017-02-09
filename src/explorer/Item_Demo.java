package explorer;

public class Item_Demo {

	public static void main(String[] args) {
		Folder f1 = new Folder("f1");
		f1.add(new File("test.txt", 222));
		f1.add(new File("movie.mov", 3334232));
		
		Folder f2 = new Folder("f2");
		f2.add(new File("datei.dat", 400));
		f1.add(f2);
		
		Folder f3 = new Folder("f3");
		f3.add(new File("datei3.text", 300));
		f3.add(new File("datei4.text", 400));
		
		Folder root = new Folder("root");
		root.add(f1);
		root.add(f3);
		
		System.out.println(root.getSize(0));

}

	}


