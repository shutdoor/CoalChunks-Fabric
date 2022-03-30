package com.shutdoor.coalchunks.chunkitem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class ChunkItem extends Item {

    private final TranslatableText TextLocation;

    public ChunkItem(TranslatableText loc) {
        super(new FabricItemSettings().group(ItemGroup.MISC));
        TextLocation = loc;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(this.TextLocation);
    }
}
