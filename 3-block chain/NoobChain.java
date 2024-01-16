import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class NoobChain {
    // 数组
    public static ArrayList<Block> blockchain = new ArrayList<Block>(); 
    

    public static void main(String[] args) {

		blockchain.add(new Block("Hi im the first block", "0"));		
		blockchain.add(new Block("Yo im the second block",blockchain.get(blockchain.size()-1).hash)); 
		blockchain.add(new Block("Hey im the third block",blockchain.get(blockchain.size()-1).hash));


        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);		
		System.out.println(blockchainJson);
        // 检查是否合法
        System.out.println("Blockchain is valid" + isChainValid());


    }

    public static Boolean isChainValid() {
	Block currentBlock; 
	Block previousBlock;
	
	//loop through blockchain to check hashes:
	for(int i=1; i < blockchain.size(); i++) {
		currentBlock = blockchain.get(i);
		previousBlock = blockchain.get(i-1);
		//compare registered hash and calculated hash:
		if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
			System.out.println("Current Hashes not equal");			
			return false;
		}
		//compare previous hash and registered previous hash
		if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
			System.out.println("Previous Hashes not equal");
			return false;
		}
	}
	return true;
}
    
    public static void mainFirst(String[] args) {

        // block 1
        Block gensisBlock = new Block("睡觉", "0");
        System.out.println("Hash for block 1 :" + gensisBlock.hash);
        // block 2
        Block secondBlock = new Block("吃饭", gensisBlock.hash);
        System.out.println("Hash for block 1 :" + secondBlock.hash);
        // block 3
        Block thirdBlock = new Block("洗澡", secondBlock.hash);
        System.out.println("Hash for block 1 :" + thirdBlock.hash);

    }
}


