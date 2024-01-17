import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    public String data;
    public long timeStamp;

    public Block(String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        String calculatedhash = StringUtil.applySha256( 
                previousHash +
                Long.toString(timeStamp) +
                data 
                );
        return calculatedhash;
    }

    public static void main(String[] args) {
        Block block = new Block("Glazunov", "6x7900");
        System.out.println(block.data);
        System.out.println(block.previousHash);
    }

}
