import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    public String data; // stores a single message
    private long timestamp; // number of milliseconds since 1970/1/1


    // f(current data,previous data)=current hash

    // Block Constructor
    public Block(String data,String previousHash){
        this.data=data;
        this.previousHash=previousHash;
        this.timestamp=new Date().getTime();
        // add : current hash = f(current data,previous data)
        // 明天再写
    }

    public static void main(String[] args) {
        Block block = new Block("Hyouka", "6x7900");
        System.out.println(block.data);
        System.out.println(block.previousHash);
        System.out.println(block.timestamp);
    }
}

