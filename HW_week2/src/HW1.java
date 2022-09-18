import java.io.File;
import java.text.SimpleDateFormat;

public class HW1 {
	static private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("[수정일:yyyy-MM-dd hh:mm:ss (a)]");

	public static void main(String[] args) {
		print(args[0]);

	}

	static void print(String directoryPath) {
		File file = new File(directoryPath);
		if (!file.exists()) {
			System.out.println(directoryPath + "의 디렉토리는 존재하지 않음!!");
			return;
		}
		printR(directoryPath, 0);
	}

	static File[] subDirectoriesArray(String path) {
		File file = new File(path);
		return file.listFiles();
	}

	static void printFileName(int count, File f) {
		for (int i = 0; i < count; i++) {
			System.out.print("     ");
		}
		System.out.printf("\u27A5 %s", f.getName());
	}

	// Assistant.class<1161 bytes> (파일) [수정일:2022-09-13 09:34:32 (오후)]
	// BackUp (디렉토리) [수정일:2022-09-13 09:34:32 (오후)]
	static void printFileInfo(File f) {
		System.out.printf("<%d bytes> (파일) %s", f.length(), simpleDateFormat.format(f.lastModified()));
	}

	static void printDirectoryInfo(File f) {
		System.out.printf(" (디렉토리) %s", simpleDateFormat.format(f.lastModified()));
	}

	static void printSubDirectories(File[] subDirectoriesArray, int count) {
		for (File f : subDirectoriesArray) {
			printFileName(count, f);
			if (f.isFile()) {
				printFileInfo(f);
			} else if (f.isDirectory()) {
				printDirectoryInfo(f);
			}
			System.out.println();
			printR(f.toString(), count + 1);
		}
	}

	static void printR(String path, int count) {
		File currentFile, subDirectories[];
		subDirectories = subDirectoriesArray(path);
		if (subDirectories != null) {
			printSubDirectories(subDirectories, count);
		}

	}

}
