package mrfix1033;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class createItems {

    public static ItemStack createItem(Material material, String name) {
        return createItem(material, name, null);
    }

    public static ItemStack createItem(Material material, String name, List<String> lore) {
        return createItem(new ItemStack(material), name, lore);
    }

    public static ItemStack createItem(ItemStack item, String name) {
        return createItem(item, name, null);
    }

    public static ItemStack createItem(ItemStack item, String name, List<String> lore) {
        item = new ItemStack(item);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }
}
