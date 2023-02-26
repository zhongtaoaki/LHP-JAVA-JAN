package random;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {

    public void reset() throws IOException {

        File file = new File("object.txt");
        if (file.exists()) {
            file.delete();
            System.out.println("object.txt has been deleted");
        }
        file.createNewFile();
        System.out.println("object.txt has been created");
        FileOutputStream outFile = new FileOutputStream("object.txt");
        ObjectOutputStream outObject = new ObjectOutputStream(outFile);

        List<Bean> list = new ArrayList<>();
        list.add(new Bean("沢田さん", 1));
        list.add(new Bean("郑玥", 1));
        list.add(new Bean("韩昊洋", 1));
        list.add(new Bean("李家煜", 1));
        list.add(new Bean("欧贝佳", 1));
        list.add(new Bean("肖宇希", 1));
        list.add(new Bean("高浩瀚", 1));
        list.add(new Bean("蔡烨妮", 1));
        list.add(new Bean("金莹", 1));
        list.add(new Bean("李墨含", 1));
        list.add(new Bean("王俞茜", 1));
        list.add(new Bean("纪开元", 1));
        list.add(new Bean("張 同心", 1));

        outObject.writeObject(list);
        outObject.close();
        outFile.close();
    }

}