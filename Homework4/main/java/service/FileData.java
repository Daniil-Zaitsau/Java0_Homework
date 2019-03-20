package service;

import java.util.ArrayList;

import dao.ReadFile;
import entity.Confection;

class FileData {
     void read(ArrayList<Confection> candyBox){

            ReadFile readFile = new ReadFile();
            FileParsing fileParsing = new FileParsing();
            readFile.read();
            String s;
            Confection parse;
            while ((s = readFile.read()) != null){
                parse = fileParsing.parse(s);
                for (int i = 0; i < parse.getQuantity(); i++) {
                    candyBox.add(parse);
                }
            }
            readFile.close();
     }
}
