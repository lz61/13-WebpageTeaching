import java.util.Date;

public class Block{
    public String hash;
    public String previousHash;
    public String data;
    private long timestamp;
    private int nonce;

    public Block(String data,String previousHash){
        this.data=data;
        this.previousHash=previousHash;
        this.timestamp=new Date().getTime();
        // 当前的hash值是当前的数据和前一个hash值的结果
        this.hash=calculateHash();
    }


    public String calculateHash() {
        String calculatedhash = StringUtil.applySha256( 
                previousHash +
                Long.toString(timestamp) +
                Integer.toString(nonce) +
                data 
                );
        return calculatedhash;
    }



    public static void main(String[] args){
        Block block = new Block("123", "6x7900");
        System.out.println(block.data);
        System.out.println(block.previousHash);
    }

    public void mineBlock(int difficulty) {
		String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0" 
		while(!hash.substring( 0, difficulty).equals(target)) {
			nonce ++;
			hash = calculateHash();
		}
		System.out.println("Block Mined!!! : " + hash);
	}




}





