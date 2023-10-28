package net.xavier.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xavier.tutorialmod.TutorialMod;

public class ModItemGroups {
    public static final ItemGroup NEW_GEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "gems"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.gems"))
                    .icon(() -> new ItemStack(ModItems.CITRINE)).entries((displayContext, entries) -> {
                      entries.add(ModItems.SAPPHIRE);
                      entries.add(ModItems.CITRINE);
                    }).build());
    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering item groups for " + TutorialMod.MOD_ID);
    }
}
