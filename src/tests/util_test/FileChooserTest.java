package tests.util_test;

import com.yurets_y.document_parser.util.FileChooseDialog;

import java.io.File;

/**
 * Created by Admin on 22.05.2017.
 */
public class FileChooserTest {
    public static void main(String[] args){
        File file = FileChooseDialog.getXLSFileToSave(null);
        System.out.println(file);
    }
}
