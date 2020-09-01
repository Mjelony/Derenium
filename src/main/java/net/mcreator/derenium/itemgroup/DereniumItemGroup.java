
package net.mcreator.derenium.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.derenium.block.PortalFlowerBlock;
import net.mcreator.derenium.DereniumModElements;

@DereniumModElements.ModElement.Tag
public class DereniumItemGroup extends DereniumModElements.ModElement {
	public DereniumItemGroup(DereniumModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabderenium") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PortalFlowerBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
