
package net.mcreator.derenium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.derenium.itemgroup.DereniumItemGroup;
import net.mcreator.derenium.DereniumModElements;

@DereniumModElements.ModElement.Tag
public class CookedRiceItem extends DereniumModElements.ModElement {
	@ObjectHolder("derenium:cooked_rice")
	public static final Item block = null;
	public CookedRiceItem(DereniumModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(DereniumItemGroup.tab).maxStackSize(64).food((new Food.Builder()).hunger(4).saturation(1.2f).build()));
			setRegistryName("cooked_rice");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
