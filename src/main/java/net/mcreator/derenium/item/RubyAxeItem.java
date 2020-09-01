
package net.mcreator.derenium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.derenium.itemgroup.DereniumItemGroup;
import net.mcreator.derenium.DereniumModElements;

@DereniumModElements.ModElement.Tag
public class RubyAxeItem extends DereniumModElements.ModElement {
	@ObjectHolder("derenium:ruby_axe")
	public static final Item block = null;
	public RubyAxeItem(DereniumModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 16f;
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
		}, 1, -3f, new Item.Properties().group(DereniumItemGroup.tab)) {
		}.setRegistryName("ruby_axe"));
	}
}
