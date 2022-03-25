import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class read_write {
	public static void main(String[] args)
	{
		try {
			FileReader fr = new FileReader("Samplefol.java");
			FileWriter fw = new FileWriter("file.txt");
			String str = "";
			int i;
			while ((i = fr.read()) != -1) {
				str += (char)i;
			}
			fw.write(str);
			fr.close();
			fw.close();
			System.out.println("Successful");
		}
		catch (IOException e) {
			System.out.println("Files not found");
		}
	}
}
re
