package moze_intel.projecte.gameObjs.registries;

import java.util.function.Consumer;
import moze_intel.projecte.PECore;
import moze_intel.projecte.gameObjs.registration.impl.CreativeTabDeferredRegister;
import moze_intel.projecte.gameObjs.registration.impl.CreativeTabRegistryObject;
import moze_intel.projecte.utils.Constants;
import moze_intel.projecte.utils.text.PELang;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

public class PECreativeTabs {

	public static final CreativeTabDeferredRegister CREATIVE_TABS = new CreativeTabDeferredRegister(PECore.MODID, PECreativeTabs::addToExistingTabs);

	public static final CreativeTabRegistryObject PROJECTE = CREATIVE_TABS.registerMain(PELang.PROJECTE, PEItems.PHILOSOPHERS_STONE, builder ->
			builder.displayItems((displayParameters, output) -> {
				safeAccept(output, PEItems.PHILOSOPHERS_STONE);
				safeAccept(output, PEItems.REPAIR_TALISMAN);
				safeAccept(output, PEItems.TOME_OF_KNOWLEDGE);
				safeAccept(output, PEItems.TRANSMUTATION_TABLET);
				safeAccept(output, PEBlocks.TRANSMUTATION_TABLE);

				safeAccept(output, PEItems.LOW_COVALENCE_DUST);
				safeAccept(output, PEItems.MEDIUM_COVALENCE_DUST);
				safeAccept(output, PEItems.HIGH_COVALENCE_DUST);

				safeAccept(output, PEItems.ALCHEMICAL_COAL);
				safeAccept(output, PEItems.MOBIUS_FUEL);
				safeAccept(output, PEItems.AETERNALIS_FUEL);
				safeAccept(output, PEItems.DARK_MATTER);
				safeAccept(output, PEItems.RED_MATTER);
				safeAccept(output, PEBlocks.ALCHEMICAL_COAL);
				safeAccept(output, PEBlocks.MOBIUS_FUEL);
				safeAccept(output, PEBlocks.AETERNALIS_FUEL);
				safeAccept(output, PEBlocks.DARK_MATTER);
				safeAccept(output, PEBlocks.RED_MATTER);

				safeAccept(output, PEItems.KLEIN_STAR_EIN);
				safeAccept(output, PEItems.KLEIN_STAR_ZWEI);
				safeAccept(output, PEItems.KLEIN_STAR_DREI);
				safeAccept(output, PEItems.KLEIN_STAR_VIER);
				safeAccept(output, PEItems.KLEIN_STAR_SPHERE);
				safeAccept(output, PEItems.KLEIN_STAR_OMEGA);

				safeAccept(output, PEItems.DARK_MATTER_PICKAXE);
				safeAccept(output, PEItems.DARK_MATTER_AXE);
				safeAccept(output, PEItems.DARK_MATTER_SHOVEL);
				safeAccept(output, PEItems.DARK_MATTER_HOE);
				safeAccept(output, PEItems.DARK_MATTER_SHEARS);
				safeAccept(output, PEItems.DARK_MATTER_HAMMER);
				safeAccept(output, PEItems.DARK_MATTER_SWORD);

				safeAccept(output, PEItems.RED_MATTER_PICKAXE);
				safeAccept(output, PEItems.RED_MATTER_AXE);
				safeAccept(output, PEItems.RED_MATTER_SHOVEL);
				safeAccept(output, PEItems.RED_MATTER_HOE);
				safeAccept(output, PEItems.RED_MATTER_SHEARS);
				safeAccept(output, PEItems.RED_MATTER_HAMMER);
				safeAccept(output, PEItems.RED_MATTER_MORNING_STAR);
				safeAccept(output, PEItems.RED_MATTER_SWORD);
				safeAccept(output, PEItems.RED_MATTER_KATAR);

				addArmor(output::accept);

				safeAccept(output, PEItems.DESTRUCTION_CATALYST);
				safeAccept(output, PEItems.HYPERKINETIC_LENS);
				safeAccept(output, PEItems.CATALYTIC_LENS);

				safeAccept(output, PEItems.IRON_BAND);
				safeAccept(output, PEItems.BLACK_HOLE_BAND);
				safeAccept(output, PEItems.ARCHANGEL_SMITE);
				safeAccept(output, PEItems.HARVEST_GODDESS_BAND);
				safeAccept(output, PEItems.IGNITION_RING);
				safeAccept(output, PEItems.ZERO_RING);
				safeAccept(output, PEItems.SWIFTWOLF_RENDING_GALE);
				safeAccept(output, PEItems.WATCH_OF_FLOWING_TIME);
				safeAccept(output, PEItems.EVERTIDE_AMULET);
				safeAccept(output, PEItems.VOLCANITE_AMULET);
				safeAccept(output, PEItems.GEM_OF_ETERNAL_DENSITY);
				safeAccept(output, PEItems.MERCURIAL_EYE);
				safeAccept(output, PEItems.VOID_RING);

				if (PEItems.ARCANA_RING != null) {
					for (byte i = 0; i < PEItems.ARCANA_RING.asItem().getModeCount(); ++i) {
						ItemStack stack = new ItemStack(PEItems.ARCANA_RING);
						stack.getOrCreateTag().putByte(Constants.NBT_KEY_MODE, i);
						output.accept(stack);
					}
				}

				safeAccept(output, PEItems.BODY_STONE);
				safeAccept(output, PEItems.SOUL_STONE);
				safeAccept(output, PEItems.MIND_STONE);
				safeAccept(output, PEItems.LIFE_STONE);

				safeAccept(output, PEItems.LOW_DIVINING_ROD);
				safeAccept(output, PEItems.MEDIUM_DIVINING_ROD);
				safeAccept(output, PEItems.HIGH_DIVINING_ROD);

				safeAccept(output, PEItems.WHITE_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.ORANGE_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.MAGENTA_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.LIGHT_BLUE_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.YELLOW_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.LIME_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.PINK_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.GRAY_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.LIGHT_GRAY_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.CYAN_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.PURPLE_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.BLUE_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.BROWN_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.GREEN_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.RED_ALCHEMICAL_BAG);
				safeAccept(output, PEItems.BLACK_ALCHEMICAL_BAG);

				safeAccept(output, PEBlocks.ALCHEMICAL_CHEST);
				safeAccept(output, PEBlocks.CONDENSER);
				safeAccept(output, PEBlocks.CONDENSER_MK2);

				safeAccept(output, PEBlocks.COLLECTOR);
				safeAccept(output, PEBlocks.COLLECTOR_MK2);
				safeAccept(output, PEBlocks.COLLECTOR_MK3);
				safeAccept(output, PEBlocks.RELAY);
				safeAccept(output, PEBlocks.RELAY_MK2);
				safeAccept(output, PEBlocks.RELAY_MK3);

				safeAccept(output, PEBlocks.DARK_MATTER_PEDESTAL);
				safeAccept(output, PEBlocks.DARK_MATTER_FURNACE);
				safeAccept(output, PEBlocks.RED_MATTER_FURNACE);
				safeAccept(output, PEBlocks.INTERDICTION_TORCH);
				safeAccept(output, PEBlocks.NOVA_CATALYST);
				safeAccept(output, PEBlocks.NOVA_CATACLYSM);
			})
	);

	private static void addArmor(Consumer<ItemLike> output) {
		Consumer<ItemLike> safe = item -> { if (item != null) output.accept(item); };
		safe.accept(PEItems.DARK_MATTER_HELMET);
		safe.accept(PEItems.DARK_MATTER_CHESTPLATE);
		safe.accept(PEItems.DARK_MATTER_LEGGINGS);
		safe.accept(PEItems.DARK_MATTER_BOOTS);

		safe.accept(PEItems.RED_MATTER_HELMET);
		safe.accept(PEItems.RED_MATTER_CHESTPLATE);
		safe.accept(PEItems.RED_MATTER_LEGGINGS);
		safe.accept(PEItems.RED_MATTER_BOOTS);

		safe.accept(PEItems.GEM_HELMET);
		safe.accept(PEItems.GEM_CHESTPLATE);
		safe.accept(PEItems.GEM_LEGGINGS);
		safe.accept(PEItems.GEM_BOOTS);
	}

	private static void addToExistingTabs(BuildCreativeModeTabContentsEvent event) {
		ResourceKey<CreativeModeTab> tabKey = event.getTabKey();
		if (tabKey == CreativeModeTabs.BUILDING_BLOCKS) {
			addToExistingTab(event,
					PEBlocks.ALCHEMICAL_COAL,
					PEBlocks.MOBIUS_FUEL,
					PEBlocks.AETERNALIS_FUEL,
					PEBlocks.DARK_MATTER,
					PEBlocks.RED_MATTER
			);
		} else if (tabKey == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			addToExistingTab(event,
					PEBlocks.INTERDICTION_TORCH,
					PEBlocks.TRANSMUTATION_TABLE,

					PEBlocks.ALCHEMICAL_CHEST,
					PEBlocks.CONDENSER,
					PEBlocks.CONDENSER_MK2,

					PEBlocks.COLLECTOR,
					PEBlocks.COLLECTOR_MK2,
					PEBlocks.COLLECTOR_MK3,
					PEBlocks.RELAY,
					PEBlocks.RELAY_MK2,
					PEBlocks.RELAY_MK3,

					PEBlocks.DARK_MATTER_PEDESTAL,

					PEBlocks.DARK_MATTER_FURNACE,
					PEBlocks.RED_MATTER_FURNACE
			);
		} else if (tabKey == CreativeModeTabs.REDSTONE_BLOCKS) {
			addToExistingTab(event,
					//Comparator supporting blocks
					PEBlocks.ALCHEMICAL_CHEST,
					PEBlocks.CONDENSER,
					PEBlocks.CONDENSER_MK2,

					PEBlocks.COLLECTOR,
					PEBlocks.COLLECTOR_MK2,
					PEBlocks.COLLECTOR_MK3,
					PEBlocks.RELAY,
					PEBlocks.RELAY_MK2,
					PEBlocks.RELAY_MK3,

					PEBlocks.DARK_MATTER_PEDESTAL,

					PEBlocks.DARK_MATTER_FURNACE,
					PEBlocks.RED_MATTER_FURNACE,
					//TNT like blocks
					PEBlocks.NOVA_CATALYST,
					PEBlocks.NOVA_CATACLYSM
			);
		} else if (tabKey == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			addToExistingTab(event,
					PEItems.DARK_MATTER_PICKAXE,
					PEItems.DARK_MATTER_AXE,
					PEItems.DARK_MATTER_SHOVEL,
					PEItems.DARK_MATTER_HOE,
					PEItems.DARK_MATTER_SHEARS,
					PEItems.DARK_MATTER_HAMMER,

					PEItems.RED_MATTER_PICKAXE,
					PEItems.RED_MATTER_AXE,
					PEItems.RED_MATTER_SHOVEL,
					PEItems.RED_MATTER_HOE,
					PEItems.RED_MATTER_SHEARS,
					PEItems.RED_MATTER_HAMMER,
					PEItems.RED_MATTER_MORNING_STAR
			);

			addToExistingTab(event,
					PEItems.PHILOSOPHERS_STONE,
					PEItems.REPAIR_TALISMAN,
					PEItems.TOME_OF_KNOWLEDGE,
					PEItems.TRANSMUTATION_TABLET,

					PEItems.DESTRUCTION_CATALYST,

					PEItems.BLACK_HOLE_BAND,
					PEItems.HARVEST_GODDESS_BAND,
					PEItems.IGNITION_RING,
					PEItems.ZERO_RING,
					PEItems.SWIFTWOLF_RENDING_GALE,
					PEItems.WATCH_OF_FLOWING_TIME,
					PEItems.EVERTIDE_AMULET,
					PEItems.VOLCANITE_AMULET,
					PEItems.GEM_OF_ETERNAL_DENSITY,
					PEItems.MERCURIAL_EYE,
					PEItems.VOID_RING
			);

			if (PEItems.ARCANA_RING != null) {
				for (byte i = 0; i < PEItems.ARCANA_RING.asItem().getModeCount(); ++i) {
					ItemStack stack = new ItemStack(PEItems.ARCANA_RING);
					stack.getOrCreateTag().putByte(Constants.NBT_KEY_MODE, i);
					event.accept(stack);
				}
			}

			addToExistingTab(event,
					PEItems.BODY_STONE,
					PEItems.SOUL_STONE,
					PEItems.MIND_STONE,
					PEItems.LIFE_STONE,

					PEItems.LOW_DIVINING_ROD,
					PEItems.MEDIUM_DIVINING_ROD,
					PEItems.HIGH_DIVINING_ROD
			);

			addToExistingTab(event,
					PEItems.KLEIN_STAR_EIN,
					PEItems.KLEIN_STAR_ZWEI,
					PEItems.KLEIN_STAR_DREI,
					PEItems.KLEIN_STAR_VIER,
					PEItems.KLEIN_STAR_SPHERE,
					PEItems.KLEIN_STAR_OMEGA
			);

			addToExistingTab(event,
					PEItems.WHITE_ALCHEMICAL_BAG,
					PEItems.ORANGE_ALCHEMICAL_BAG,
					PEItems.MAGENTA_ALCHEMICAL_BAG,
					PEItems.LIGHT_BLUE_ALCHEMICAL_BAG,
					PEItems.YELLOW_ALCHEMICAL_BAG,
					PEItems.LIME_ALCHEMICAL_BAG,
					PEItems.PINK_ALCHEMICAL_BAG,
					PEItems.GRAY_ALCHEMICAL_BAG,
					PEItems.LIGHT_GRAY_ALCHEMICAL_BAG,
					PEItems.CYAN_ALCHEMICAL_BAG,
					PEItems.PURPLE_ALCHEMICAL_BAG,
					PEItems.BLUE_ALCHEMICAL_BAG,
					PEItems.BROWN_ALCHEMICAL_BAG,
					PEItems.GREEN_ALCHEMICAL_BAG,
					PEItems.RED_ALCHEMICAL_BAG,
					PEItems.BLACK_ALCHEMICAL_BAG
			);
		} else if (tabKey == CreativeModeTabs.COMBAT) {
			addToExistingTab(event,
					PEItems.DARK_MATTER_SWORD,
					PEItems.RED_MATTER_SWORD,
					PEItems.RED_MATTER_KATAR
			);

			addArmor(event::accept);

			addToExistingTab(event,
					PEItems.ARCHANGEL_SMITE,

					//These are not necessarily combat only, but it makes more sense to put them here than in tools
					PEItems.HYPERKINETIC_LENS,
					PEItems.CATALYTIC_LENS
			);
		} else if (tabKey == CreativeModeTabs.INGREDIENTS) {
			addToExistingTab(event,
					PEItems.LOW_COVALENCE_DUST,
					PEItems.MEDIUM_COVALENCE_DUST,
					PEItems.HIGH_COVALENCE_DUST,

					PEItems.ALCHEMICAL_COAL,
					PEItems.MOBIUS_FUEL,
					PEItems.AETERNALIS_FUEL,
					PEItems.DARK_MATTER,
					PEItems.RED_MATTER,

					PEItems.IRON_BAND
			);
		}
	}

	// 安全添加单个 ItemLike 到 CreativeModeTab.Output
	private static void safeAccept(CreativeModeTab.Output output, ItemLike item) {
		if (item != null) {
			output.accept(item);
		}
	}

	// 安全添加多个 ItemLike 到 BuildCreativeModeTabContentsEvent
	private static void addToExistingTab(BuildCreativeModeTabContentsEvent event, ItemLike... items) {
		for (ItemLike item : items) {
			if (item != null) {
				event.accept(item);
			}
		}
	}
}