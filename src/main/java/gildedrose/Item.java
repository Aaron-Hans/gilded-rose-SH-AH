package gildedrose;

public class Item {
    public String nameType;
    public int sellIn;
    public int quality;

    public Item(String nameType, int sellIn, int quality) {
        this.nameType = nameType;
        this.sellIn = sellIn;
        this.quality = quality;
    }
    
    protected void updateItem() {}
    
    public String getNameType() {
        return nameType;
    }

    public int getQuality() {
        return quality;
    }
    
    public void setQuality(int quality) {
        this.quality = quality;
    }
    
    protected void updateIfQualityUnderZero(Item item) {
    	if (item.quality < 0) {
    		item.setQuality(0);
    	}
    }
    
    protected void updateIfQualitySuperior50(Item item) {
    	if (item.quality > 50) {
    		item.setQuality(50);
    	}
    }


}