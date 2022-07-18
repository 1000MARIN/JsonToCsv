import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class JsonToCsv {
    public static void main(String[] args) {

        String filePath = "C:/lcj/test1.csv";

        File file = null;
        BufferedWriter bw = null;
        String newLine = System.lineSeparator();    // 줄바꿈 (\n)

        try {
            file = new File(filePath);
            
            // csv 파일 읽어오기 한글깨짐 방지 인코딩
            bw = new BufferedWriter(new FileWriter(file, Charset.forName("EUC-KR")));

            bw.write("번호,이름,지역");
            bw.write(newLine);

            bw.write("1,김철수,서울");
            bw.write("\n");

            bw.write("2,김영희,경기");
            bw.write("\r\n");

            bw.write("3,이철희,경북");

            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}