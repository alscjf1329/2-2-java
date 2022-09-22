import java.io.File;

public class HW2 {

	public static void main(String[] args) {
		print(args);

	}

	static void printError(String errorCase, String N1, String directoryPath) {
		switch (errorCase) {
		case "not found N1": {
			System.out.println(N1 + "를 검색할 수 없음");
			break;
		}
		case "not found directory":
			System.out.println(directoryPath + "의 디렉토리를 찾을 수 없음 !!!");
			break;
		}
	}

	static void print(String[] inputArr) {
		String directoryPath = inputArr[0];
		String N1 = inputArr[1], N2 = inputArr[2];
		File path = new File(directoryPath);
		if (!path.exists()) {
			printError("not found directory", N1, directoryPath);
			return;
		}
		boolean foundN1Flag = printR(path, N1, N2, false);
		if (!foundN1Flag) {
			printError("not found N1", N1, directoryPath);
		}
	}

	static void printType(File f) {
		if (f.isFile()) {
			System.out.printf(" [파일]\n");
		}
		if (f.isDirectory()) {
			System.out.printf(" [디렉토리]\n");
		}
	}

	static boolean printR(File path, String N1, String N2, boolean foundN1Flag) {
		File afterFile = new File(path + "/" + N2);
		File[] pathArray = path.listFiles();
		if (path.isDirectory()) {
			for (File f : pathArray) {
				if (f.getName().equals(N1)) {
					System.out.printf("%s를 %s로 변경 함.", f, afterFile);
					f.renameTo(afterFile);
					f = afterFile;
					printType(f);
					foundN1Flag = true;
				}
				foundN1Flag = printR(f, N1, N2, foundN1Flag);
			}
		}
		return foundN1Flag;
	}

}
