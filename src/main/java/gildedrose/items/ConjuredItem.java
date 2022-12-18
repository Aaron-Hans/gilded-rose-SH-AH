package gildedrose.items;

import gildedrose.Item;

public class ConjuredItem extends Item{

	public ConjuredItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}
	
	protected void updateItem() {
		this.quality = this.quality - 2;
		this.updateIfQualitySuperior50(this);
		this.updateIfQualityUnderZero(this);
		if (this.sellIn != 0) {
			this.sellIn--;
		}
	}
}


