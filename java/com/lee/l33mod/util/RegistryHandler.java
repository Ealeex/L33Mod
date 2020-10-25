package com.lee.l33mod.util;

import com.lee.l33mod.L33Mod;
import com.lee.l33mod.armor.ModArmorMaterials;
import com.lee.l33mod.blocks.BlockItemBase;
import com.lee.l33mod.blocks.BlockBase;
import com.lee.l33mod.blocks.OreBase;
import com.lee.l33mod.items.ItemBase;
import com.lee.l33mod.items.Soup;
import com.lee.l33mod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, L33Mod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, L33Mod.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", ItemBase::new);
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", ItemBase::new);
    public static final RegistryObject<Item> EMERALD = ITEMS.register("emerald", ItemBase::new);
    public static final RegistryObject<Item> INFINIUM = ITEMS.register("infinium", ItemBase::new);
    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget", ItemBase::new);
    public static final RegistryObject<Item> RUBY_NUGGET = ITEMS.register("ruby_nugget", ItemBase::new);
    public static final RegistryObject<Item> TOPAZ_NUGGET = ITEMS.register("topaz_nugget", ItemBase::new);
    public static final RegistryObject<Item> SAPPHIRE_NUGGET = ITEMS.register("sapphire_nugget", ItemBase::new);
    public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget", ItemBase::new);
    public static final RegistryObject<Item> INFINIUM_NUGGET = ITEMS.register("infinium_nugget", ItemBase::new);
    public static final RegistryObject<Soup> DIAMOND_SOUP = ITEMS.register("diamond_soup", () -> new Soup(Effects.HASTE));
    public static final RegistryObject<Soup> RUBY_SOUP = ITEMS.register("ruby_soup", () -> new Soup(Effects.FIRE_RESISTANCE));
    public static final RegistryObject<Soup> TOPAZ_SOUP = ITEMS.register("topaz_soup", () -> new Soup(Effects.SPEED));
    public static final RegistryObject<Soup> SAPPHIRE_SOUP = ITEMS.register("sapphire_soup", () -> new Soup(Effects.NIGHT_VISION));
    public static final RegistryObject<Soup> EMERALD_SOUP = ITEMS.register("emerald_soup", () -> new Soup(Effects.JUMP_BOOST));
    public static final RegistryObject<Soup> INFINIUM_SOUP = ITEMS.register("infinium_soup", () -> new Soup(Effects.ABSORPTION));

    // Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", BlockBase::new);
    public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", BlockBase::new);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", BlockBase::new);
    public static final RegistryObject<Block> EMERALD_BLOCK = BLOCKS.register("emerald_block", BlockBase::new);
    public static final RegistryObject<Block> INFINIUM_BLOCK = BLOCKS.register("infinium_block", BlockBase::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", OreBase::new);
    public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", OreBase::new);
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", OreBase::new);
    public static final RegistryObject<Block> EMERALD_ORE = BLOCKS.register("emerald_ore", OreBase::new);

    // Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> TOPAZ_BLOCK_ITEM = ITEMS.register("topaz_block", () -> new BlockItemBase(TOPAZ_BLOCK.get()));
    public static final RegistryObject<Item> SAPPHIRE_BLOCK_ITEM = ITEMS.register("sapphire_block", () -> new BlockItemBase(SAPPHIRE_BLOCK.get()));
    public static final RegistryObject<Item> EMERALD_BLOCK_ITEM = ITEMS.register("emerald_block", () -> new BlockItemBase(EMERALD_BLOCK.get()));
    public static final RegistryObject<Item> INFINIUM_BLOCK_ITEM = ITEMS.register("infinium_block", () -> new BlockItemBase(INFINIUM_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
    public static final RegistryObject<Item> TOPAZ_ORE_ITEM = ITEMS.register("topaz_ore", () -> new BlockItemBase(TOPAZ_ORE.get()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_ITEM = ITEMS.register("sapphire_ore", () -> new BlockItemBase(SAPPHIRE_ORE.get()));
    public static final RegistryObject<Item> EMERALD_ORE_ITEM = ITEMS.register("emerald_ore", () -> new BlockItemBase(EMERALD_ORE.get()));

    // Swords
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 2, -2.4F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<SwordItem> TOPAZ_SWORD = ITEMS.register("topaz_sword", () ->
            new SwordItem(ModItemTier.TOPAZ, 2, -2.4F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () ->
            new SwordItem(ModItemTier.SAPPHIRE, 2, -2.4F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
            new SwordItem(ModItemTier.EMERALD, 2, -2.4F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<SwordItem> INFINIUM_SWORD = ITEMS.register("infinium_sword", () ->
            new SwordItem(ModItemTier.INFINIUM, 2, -2.0F, new Item.Properties().group(L33Mod.TAB)));

    // Pickaxes
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 0, -2.8F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<PickaxeItem> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () ->
            new PickaxeItem(ModItemTier.TOPAZ, 0, -2.8F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () ->
            new PickaxeItem(ModItemTier.SAPPHIRE, 0, -2.8F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
            new PickaxeItem(ModItemTier.EMERALD, 0, -2.8F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<PickaxeItem> INFINIUM_PICKAXE = ITEMS.register("infinium_pickaxe", () ->
            new PickaxeItem(ModItemTier.INFINIUM, 0, -1.5F, new Item.Properties().group(L33Mod.TAB)));

    // Shovels
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ModItemTier.RUBY, 0.5F, -3.0F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ShovelItem> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () ->
            new ShovelItem(ModItemTier.TOPAZ, 0.5F, -3.0F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () ->
            new ShovelItem(ModItemTier.SAPPHIRE, 0.5F, -3.0F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () ->
            new ShovelItem(ModItemTier.EMERALD, 0.5F, -3.0F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ShovelItem> INFINIUM_SHOVEL = ITEMS.register("infinium_shovel", () ->
            new ShovelItem(ModItemTier.INFINIUM, 0.5F, -2.5F, new Item.Properties().group(L33Mod.TAB)));

    // Axes
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ModItemTier.RUBY, 5, -3.1F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<AxeItem> TOPAZ_AXE = ITEMS.register("topaz_axe", () ->
            new AxeItem(ModItemTier.TOPAZ, 5, -3.1F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () ->
            new AxeItem(ModItemTier.SAPPHIRE, 5, -3.1F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () ->
            new AxeItem(ModItemTier.EMERALD, 5, -3.1F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<AxeItem> INFINIUM_AXE = ITEMS.register("infinium_axe", () ->
            new AxeItem(ModItemTier.INFINIUM, 5, -2.6F, new Item.Properties().group(L33Mod.TAB)));

    // Hoes
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(ModItemTier.RUBY, 0, -1.0F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<HoeItem> TOPAZ_HOE = ITEMS.register("topaz_hoe", () ->
            new HoeItem(ModItemTier.TOPAZ, 0, -1.0F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () ->
            new HoeItem(ModItemTier.SAPPHIRE, 0, -1.0F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe", () ->
            new HoeItem(ModItemTier.EMERALD, 0, -1.0F, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<HoeItem> INFINIUM_HOE = ITEMS.register("infinium_hoe", () ->
            new HoeItem(ModItemTier.INFINIUM, 0, -0.5F, new Item.Properties().group(L33Mod.TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () ->
            new ArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlotType.HEAD, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () ->
            new ArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlotType.CHEST, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () ->
            new ArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlotType.LEGS, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () ->
            new ArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlotType.FEET, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () ->
            new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () ->
            new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () ->
            new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () ->
            new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () ->
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () ->
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () ->
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots", () ->
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlotType.FEET, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> INFINIUM_HELMET = ITEMS.register("infinium_helmet", () ->
            new ArmorItem(ModArmorMaterials.INFINIUM, EquipmentSlotType.HEAD, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> INFINIUM_CHESTPLATE = ITEMS.register("infinium_chestplate", () ->
            new ArmorItem(ModArmorMaterials.INFINIUM, EquipmentSlotType.CHEST, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> INFINIUM_LEGGINGS = ITEMS.register("infinium_leggings", () ->
            new ArmorItem(ModArmorMaterials.INFINIUM, EquipmentSlotType.LEGS, new Item.Properties().group(L33Mod.TAB)));
    public static final RegistryObject<ArmorItem> INFINIUM_BOOTS = ITEMS.register("infinium_boots", () ->
            new ArmorItem(ModArmorMaterials.INFINIUM, EquipmentSlotType.FEET, new Item.Properties().group(L33Mod.TAB)));
}
