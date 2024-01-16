import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    public String data; // stores a single message
    private Long timestamp; // number of milliseconds since 1970/1/1

    // f(current data,previous data)=current hash

    // Block Constructor
    public Block(String data,String previousHash){
        this.data=data;
        this.previousHash=previousHash;
        this.timestamp=new Date().getTime();
        // add : current hash = f(current data,previous hash)
        // 当前的hash值为当前数据和前一个hash值的函数得到的结果
        this.hash=calculateHash();
    }

    public String calculateHash(){
        // calcualtedhash=current hash
        	String calculatedhash = StringUtil.applySha256( 
			previousHash +
			Long.toString(this.timestamp) +
			data 
			);
	        return calculatedhash;
    }

    public static void main(String[] args) {
        
    }

    public static void mainDay1(){
        Block block = new Block("Hyouka", "6x7900");
        System.out.println(block.data);
        System.out.println(block.previousHash);
        System.out.println(block.timestamp);

    }
}

