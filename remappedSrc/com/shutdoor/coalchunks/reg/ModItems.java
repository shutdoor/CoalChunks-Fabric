package com.shutdoor.coalchunks.reg;

import com.shutdoor.coalchunks.CoalChunks;
import com.shutdoor.coalchunks.chunkitem.ChunkItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems{

    public static final Item SMALL_COAL_CHUNK = registerItem("small_coal_chunk",
           "small_chunk");
    public static final Item SMALL_CHARCOAL_CHUNK = registerItem("small_charcoal_chunk",
            "small_chunk");
    public static final Item MEDIUM_COAL_CHUNK = registerItem("medium_coal_chunk",
            "medium_chunk");
    public static final Item MEDIUM_CHARCOAL_CHUNK = registerItem("medium_charcoal_chunk",
            "medium_chunk");
    public static final Item LARGE_COAL_CHUNK = registerItem("large_coal_chunk",
            "large_chunk");
    public static final Item LARGE_CHARCOAL_CHUNK = registerItem("large_charcoal_chunk",
            "large_chunk");

    private static ChunkItem registerItem(String name, String text){
        return Registry.register(Registry.ITEM, new Identifier(CoalChunks.MODID, name), new ChunkItem(text));
    }

    public static void registerModItems(){

    }

}
