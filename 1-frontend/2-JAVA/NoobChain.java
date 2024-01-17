import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class NoobChain {

    public static ArrayList<Block> blockchain = new ArrayList<Block>(); 
    public static int difficulty = 5;

    public static void main(String[] args) {	
		//add our blocks to the blockchain ArrayList:
		
		blockchain.add(new Block("Mahler", "0"));
		System.out.println("Trying to Mine block 1... ");
		blockchain.get(0).mineBlock(difficulty);
		
		blockchain.add(new Block("Wagner",blockchain.get(blockchain.size()-1).hash));
		System.out.println("Trying to Mine block 2... ");
		blockchain.get(1).mineBlock(difficulty);
		
		blockchain.add(new Block("Bruckner",blockchain.get(blockchain.size()-1).hash));
		System.out.println("Trying to Mine block 3... ");
		blockchain.get(2).mineBlock(difficulty);	
		
		System.out.println("\nBlockchain is Valid: " + isChainValid());
		
		String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
		System.out.println("\nThe block chain: ");
		System.out.println(blockchainJson);
	}

	public static void mainDay1(String[] args) {	
		//add our blocks to the blockchain ArrayList:
		blockchain.add(new Block("Shostakovich", "0"));		
		blockchain.add(new Block("Prokofiev", blockchain.get(blockchain.size()-1).hash)); 
		blockchain.add(new Block("Stravinsky", blockchain.get(blockchain.size()-1).hash));
		
		String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);		
		System.out.println(blockchainJson);

        System.out.println(isChainValid());
	}

    public static void mainFirst(String[] args) {
        Block genesisBlock = new Block("Bach", "0");
        System.out.println("Hash for block 1 : " + genesisBlock.hash);

        Block secondBlock = new Block("Beethoven", genesisBlock.hash);
        System.out.println("Hash for block 2 : " + secondBlock.hash);

        Block thirdBlock = new Block("Brahms", secondBlock.hash);
        System.out.println("Hash for block 3 : " + thirdBlock.hash);
        // ... and so on for additional blocks
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
}
