package dao;

import org.apache.log4j.Logger;

import java.io.*;

public class ReadFile implements AutoCloseable, FileInterface{
    private static final String FILE_PATH = "D:\\Java\\mavenProject\\src\\main\\resources\\file.txt";
    private static final Logger LOGGER = Logger.getLogger(ReadFile.class);
    private static BufferedReader reader;

    static {
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_PATH)));
        } catch (FileNotFoundException e){
            LOGGER.error(e);
        }
    }

    @Override
    public void close() {
        try{
            reader.close();
        } catch (IOException e){
            LOGGER.error(e);
        }
    }

    @Override
    public String read() {
        try {
            return reader.readLine();
        } catch (IOException e){
            LOGGER.error(e);
        }
        return null;
    }
}
