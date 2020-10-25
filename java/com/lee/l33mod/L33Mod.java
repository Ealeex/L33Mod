package com.lee.l33mod;
import com.lee.l33mod.util.RegistryHandler;
import com.lee.l33mod.world.FeatureGen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("l33mod")
public class L33Mod
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "l33mod";

    public L33Mod()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        RegistryHandler.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLClientSetupEvent event)
    {
        event.enqueueWork {
            FeatureGen.registerConfiguredFeatures(event);
        }
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {

    }

    public static final ItemGroup TAB = new ItemGroup("l33tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.INFINIUM.get());
        }
    };

}