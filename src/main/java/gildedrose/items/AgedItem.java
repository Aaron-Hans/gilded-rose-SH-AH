package gildedrose.items;

import gildedrose.Item;

public class AgedItem extends Item{

	public AgedItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}
	
	protected void updateItem() {
		if (this.sellIn >= 0) {
			this.quality += 3;
		} else if (this.sellIn > 5) {
			this.quality += 2;
		} else if (this.sellIn > 10) {
			this.quality += 1;
		}
		this.updateIfQualitySuperior50(this);
		this.updateIfQualityUnderZero(this);
		if (this.sellIn != 0) {
			this.sellIn--;
		}
	}
}


