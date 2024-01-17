import java.util.ArrayList;
import com.google.gson.GsonBuilder;


public class NoobChain {
    // 数组: blockchain
    public static ArrayList<Block> blockchain = new ArrayList<Block>();

    public static int difficulty = 6;

    // 三块block: 放到数组里面
    public static void main(String[] args) {
        // add our blocks to the blockchain ArrayList:

        blockchain.add(new Block("Hi im the first block", "0"));
        System.out.println("Trying to Mine block 1... ");
        blockchain.get(0).mineBlock(difficulty);

        blockchain.add(new Block("Yo im the second block", blockchain.get(blockchain.size() - 1).hash));
        System.out.println("Trying to Mine block 2... ");
        blockchain.get(1).mineBlock(difficulty);

        blockchain.add(new Block("Hey im the third block", blockchain.get(blockchain.size() - 1).hash));
        System.out.println("Trying to Mine block 3... ");
        blockchain.get(2).mineBlock(difficulty);

        System.out.println("\nBlockchain is Valid: " + isChainValid());

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println("\nThe block chain: ");
        System.out.println(blockchainJson);

    }

    public static void mainDay1(){
        // add our blocks to the blockchain ArrayList:
        blockchain.add(new Block("Hyouka", "0"));
        blockchain.add(new Block("Sakura", blockchain.get(blockchain.size() - 1).hash ));
        blockchain.add(new Block("Amphibian YangMing", blockchain.get(blockchain.size() - 1).hash));

        // String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        // System.out.println(blockchainJson);

        System.out.println("Blockchain is valid: " + isChainValid());

        blockchain.get(0).data = "Hyouka";
        System.out.println("Blockchain is valid: " + isChainValid());

    }

    public static void mainFirst(){
        // first block
        Block genesisBlock = new Block("日本語を勉強する", "0");
        System.out.println("Hash for block 1 :" + genesisBlock.hash);

        // second block
        Block secondBlock = new Block("sa si su se so",genesisBlock.hash);
        System.out.println("Hash for block 2 :" + secondBlock.hash);

        // third block
        Block thirdBlock = new Block("氷菓は增の一番すきのアニメ",secondBlock.hash);
        System.out.println("Hash for block 3 :" + thirdBlock.hash);
    }

    public static Boolean isChainValid() {
        Block currentBlock;
        Block previousBlock;
        String hashTarget = new String(new char[difficulty]).replace('\0', '0');

        currentBlock=blockchain.get(0);
        if (!currentBlock.hash.equals(currentBlock.calculateHash())) {
                System.out.println("Current Hashes not equal");
                return false;
        }

        // loop through blockchain to check hashes:
        for (int i = 1; i < blockchain.size(); i++) {
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i - 1);
            // compare registered hash and calculated hash:
            if (!currentBlock.hash.equals(currentBlock.calculateHash())) {
                System.out.println("Current Hashes not equal");
                return false;
            }
            // compare previous hash and registered previous hash
            if (!previousBlock.hash.equals(currentBlock.previousHash)) {
                System.out.println("Previous Hashes not equal");
                return false;
            }
            // check if hash is solved
            if (!currentBlock.hash.substring(0, difficulty).equals(hashTarget)) {
                System.out.println("This block hasn't been mined");
                return false;
            }
        }
        return true;
    }
}
