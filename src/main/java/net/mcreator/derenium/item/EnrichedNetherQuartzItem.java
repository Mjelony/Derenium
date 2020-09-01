
package net.mcreator.derenium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.derenium.itemgroup.DereniumItemGroup;
import net.mcreator.derenium.DereniumModElements;

@DereniumModElements.ModElement.Tag
public class EnrichedNetherQuartzItem extends DereniumModElements.ModElement {
	@ObjectHolder("derenium:enriched_nether_quartz")
	public static final Item block = null;
	public EnrichedNetherQuartzItem(DereniumModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(DereniumItemGroup.tab).maxStackSize(64));
			setRegistryName("enriched_nether_quartz");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
