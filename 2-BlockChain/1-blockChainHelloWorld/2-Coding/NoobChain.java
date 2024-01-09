import java.util.ArrayList;

import com.google.gson.GsonBuilder;

public class NoobChain {
	public static int difficulty = 3;

	public static ArrayList<Block> blockchain = new ArrayList<Block>();

	public static void main(String[] args) {
		// add our blocks to the blockchain ArrayList:
		blockchain.add(new Block("Sa si su se so", "0"));
		System.out.println("Trying to mine sa si su se so... ");
		blockchain.get(0).mineBlock(difficulty);

		blockchain.add(new Block("日本語を勉強する", blockchain.get(blockchain.size() - 1).hash));
		System.out.println("Trying to mine 日本語を勉強する... ");
		blockchain.get(1).mineBlock(difficulty);

		blockchain.add(new Block("氷菓はぜんの一番すきの番組です", blockchain.get(blockchain.size() - 1).hash));
		System.out.println("Trying to mine 氷菓はぜんの一番すきの番組です... ");
		blockchain.get(2).mineBlock(difficulty);

		System.out.println("\nBlockchain is Valid: " + isChainValid());

		String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
		System.out.println(blockchainJson);
	}

	public static Boolean isChainValid() {
		Block currentBlock;
		Block previousBlock;
		String hashTarget = new String(new char[difficulty]).replace('\0', '0');

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
