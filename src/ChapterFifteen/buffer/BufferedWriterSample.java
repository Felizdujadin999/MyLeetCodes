package ChapterFifteen.buffer;

import utils.AppUtils;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterSample {
    public static void main(String[] args) {
        String[] words = {"I am", "going", "to", "be", "a great", "programmer", "some day."};
        try{OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(AppUtils.APP_ASSET_LOCATION+"\\output.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(words[0]+" "+words[1]+" ");
            bufferedWriter.flush();
            bufferedWriter.write(words[2]+" "+words[3]);
            bufferedWriter.flush();
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
