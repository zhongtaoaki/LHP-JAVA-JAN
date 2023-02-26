package random;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Random;

public class WeightRandom {

    public String getName() throws IOException, ClassNotFoundException {

        String result = "";

        try {

            FileInputStream inFile = new FileInputStream("object.txt");
            ObjectInputStream inObject = new ObjectInputStream(inFile);
            @SuppressWarnings("unchecked")
			List<Bean> list = (List<Bean>) inObject.readObject();

            inObject.close();
            inFile.close();

            // 求value的和
            double sum = 0;
            for (Bean b : list) {
                sum += b.count;
            }

            double weightSum = 0;
            for (Bean b : list) {
                weightSum = weightSum + sum / b.count;
                b.weight = weightSum;
            }
            double r = new Random().nextDouble() * weightSum;
            for (Bean b : list) {
                if (b.weight > r) {
                    result = "这为幸运同学是：" + b.name + "同学,这是ta的第" + b.count + "次。";
                    b.count++;
                    break;
                }
            }

            FileOutputStream outFile = new FileOutputStream("object.txt");
            ObjectOutputStream outObject = new ObjectOutputStream(outFile);
            outObject.writeObject(list);
            outObject.close();
            outFile.close();

        } catch (Exception e) {
        }
        return result;
    }
}

class Bean implements Serializable {
	private static final long serialVersionUID = 1L;
	Bean(String name, int count) {
        this.name = name;
        this.count = count;
    }

    String name;
    int count;
    double weight;
}