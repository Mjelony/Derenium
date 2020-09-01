
package net.mcreator.derenium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.derenium.itemgroup.DereniumItemGroup;
import net.mcreator.derenium.DereniumModElements;

@DereniumModElements.ModElement.Tag
public class RubyHoeItem extends DereniumModElements.ModElement {
	@ObjectHolder("derenium:ruby_hoe")
	public static final Item block = null;
	public RubyHoeItem(DereniumModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(DereniumItemGroup.tab)) {
		}.setRegistryName("ruby_hoe"));
	}
}
