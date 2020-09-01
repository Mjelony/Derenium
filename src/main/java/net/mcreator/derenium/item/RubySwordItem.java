
package net.mcreator.derenium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.derenium.itemgroup.DereniumItemGroup;
import net.mcreator.derenium.DereniumModElements;

@DereniumModElements.ModElement.Tag
public class RubySwordItem extends DereniumModElements.ModElement {
	@ObjectHolder("derenium:ruby_sword")
	public static final Item block = null;
	public RubySwordItem(DereniumModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3f, new Item.Properties().group(DereniumItemGroup.tab)) {
		}.setRegistryName("ruby_sword"));
	}
}
