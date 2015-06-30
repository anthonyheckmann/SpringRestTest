package hello;


import org.apache.spark.api.java.JavaSparkContext;
//import org.apache.spark.api.java.JavaRDD;
//import org.apache.spark.SparkConf;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
    public String getSparkContent()
    {
    	//SparkConf conf = new SparkConf().setAppName(appName).setMaster("spark://192.168.20.112:7070");
    	//JavaSparkContext sc = new JavaSparkContext(conf);
    	return "hello";
    
    }
}