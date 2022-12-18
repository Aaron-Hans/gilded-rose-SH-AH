package gildedrose;

import java.util.*;

public class GildedRose {
	
	int balance = 0;
	static List<Item> itemsList = new ArrayList<Item>();
	
	public static void main(String[] args) {
		itemsList.add(new Item("+5 Dexterity Vest", 10, 20));
		itemsList.add(new Item("Aged Brie", 2, 0));
		itemsList.add(new Item("Elixir of the Mongoose", 5, 7));
		itemsList.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		itemsList.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		itemsList.add(new Item("Conjured Mana Cake", 3, 6));
	}

	void updateInventory() {}
	
	void sellItem(String nameType, int quality) {
		Item item = itemsList.stream()
				  .filter(elem -> nameType.equals(elem.getNameType()))
				  .findAny()
				  .orElse(null);
		
		int itemQuality = item.getQuality();
		this.balance += itemQuality;
		GildedRose.itemsList.remove(item);
		
	}
}