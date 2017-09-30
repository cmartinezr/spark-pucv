import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SparkConf conf = new SparkConf().setAppName("TestSpark");
				
		JavaSparkContext ctx = new JavaSparkContext(conf);
		
		JavaRDD<String> textLoadRDD = ctx.textFile("hdfs://104.156.245.205:8020/user/clmartinez/t8.shakespeare.txt");
		
		System.out.println(textLoadRDD.count());
		ctx.close();

	}

}
