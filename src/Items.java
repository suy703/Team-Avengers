
public class Items {
	public String itemID;
	public String name;
	public String description;
	public int price;
	boolean canEquip = false;
	boolean canUse = false;
	
	public Items(String id, String name, String description, int price) {
		itemID = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public String getItemID() {
		return itemID;
	}
	
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String displayItemOptions(Player p){
		String invDisplay = name +"------------------\n0. Back";
		if(canEquip) {
			if(equals(p.equippedWeap))
				invDisplay += "\n1. Unequip";
			else
				invDisplay += "\n1. Equip";
			invDisplay += "\n2. Drop";
		}else if(canUse) {
			invDisplay += "\n1. Use\n2. Drop";
		}else {
			invDisplay += "\n1. Drop";
		}
		return invDisplay;
	}


}
