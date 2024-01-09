import java.util.Date;

public class Block{
    public String hash;
    public String previousHash;
    public String data;
    private long timestamp;

    public Block(String data,String previousHash){
        this.data=data;
        this.previousHash=previousHash;
        this.timestamp=new Date().getTime();
    }

    public static void main(String[] args){
        Block block = new Block("123", "6x7900");
        System.out.println(block.data);
        System.out.println(block.previousHash);
    }


}





