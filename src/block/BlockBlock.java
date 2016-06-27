package block;

import java.util.ArrayList;

public class BlockBlock extends Block {

	protected ArrayList<Block> blocks;

	public BlockBlock() {
		this.blocks = new ArrayList<Block>();
	}

	public String string() {
		return this.recursive(this, "");
	}

	@Override
	public String recursive(Block block, String text) {
		for (int i = 0; i < blocks.size(); i++) {
			text += block.recursive(blocks.get(i), text);
		}
		return text;
	}
	
	public void addBlock(Block b) {
		this.blocks.add(b);
	}
	
	public ArrayList<Block> getBlocks() {
		return this.blocks;
	}

	public void setBlocks(ArrayList<Block> blocks) {
		this.blocks = blocks;
	}

}
