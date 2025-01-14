package section5_1;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
	public static void main(String[] args) {
		Path[] paths = new Path[5];
		paths[0] = Paths.get("C:\\JavaProgramming\\NIO2\\demoFile.txt");
		paths[1] = Paths.get("C:/JavaProgramming/NIO2/demoFile.txt");
		paths[2] = Paths.get("C:", "JavaProgramming", "NIO2", "demoFile.txt");
		paths[3] = Paths.get("demoFile.txt");
		paths[4] = Paths.get(URI.create("file:///C:/JavaProgramming/~/demoFile.txt"));

		for (int i = 0; i < paths.length; i++) {System.out.println("Caminho do path[" + i + "]:" + paths[i]);}
		
		System.out.println(paths[0].getFileName());
		System.out.println(paths[0].getParent());
		System.out.println(paths[0].getNameCount());
		System.out.println(paths[0].isAbsolute());
		System.out.println(paths[1].isAbsolute());
		System.out.println(paths[2].isAbsolute());
		System.out.println(paths[3].isAbsolute());
		System.out.println(paths[4].isAbsolute());
		System.out.println(paths[0].toAbsolutePath());
		System.out.println(paths[1].toAbsolutePath());
		System.out.println(paths[2].toAbsolutePath());
		System.out.println(paths[3].toAbsolutePath());
		System.out.println(paths[4].toAbsolutePath());
		System.out.println(paths[0].toFile());
		System.out.println(paths[0].toUri());
		
		Path relativepath = Paths.get("C:/JavaProgramming/IO/../NIO2//demoFile.txt");
		System.out.println("rp.normalize() [" + relativepath.normalize() + "]");
		
		Path sp = Paths.get("C:/JavaProgramming/IO/../NIO2/demoFile.txt");
		System.out.println((sp.normalize()).subpath(0, 3));
	}
}
