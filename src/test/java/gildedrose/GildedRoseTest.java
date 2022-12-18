package gildedrose;

import org.junit.jupiter.api.Test;

import gildedrose.items.AgedItem;
import gildedrose.items.ConjuredItem;
import gildedrose.items.LegendaryItem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

class GildedRoseTest {
    @Test
    void should_build() {
    	List<Item> itemsList = new ArrayList<Item>();
        Shop shop = new Shop(itemsList);
        assertEquals(shop.getClass(), Shop.class);
    }
    
    @Test
    void agingItemMustUpgradeQuality() {
    	Item agedBrie = new AgedItem("Aged Brie", 10, 10);
    	Item secondAgedBrie = new AgedItem("Aged Brie", 10, 10);
    	
    	secondAgedBrie.updateItem();
    	assertNotEquals(agedBrie, secondAgedBrie);
    }
    
    @Test
    void conjuredItemMustUpgradeQuality() {
    	Item conjuredItem = new ConjuredItem("Conjured Brie", 10, 10);
    	Item secondConjuredItem = new ConjuredItem("Conjured Brie", 10, 10);
    	
    	secondConjuredItem.updateItem();
    	assertNotEquals(conjuredItem, secondConjuredItem);
    }
    
    @Test
    void LegendaryItemMustNotChange() {
    	Item legendaryItem = new LegendaryItem("Legendary Brie", 10, 10);
    	
    	legendaryItem.updateItem();
    	assertEquals(legendaryItem, legendaryItem);
    }
}
