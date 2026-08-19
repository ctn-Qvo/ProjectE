package moze_intel.projecte.common.tag;

import java.util.concurrent.CompletableFuture;
import moze_intel.projecte.PECore;
import moze_intel.projecte.gameObjs.PETags;
import moze_intel.projecte.gameObjs.registration.impl.BlockRegistryObject;
import moze_intel.projecte.gameObjs.registries.PEBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PEBlockTagsProvider extends BlockTagsProvider {

	public PEBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, PECore.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(@NotNull HolderLookup.Provider provider) {
		tag(PETags.Blocks.FARMING_OVERRIDE).add(Blocks.PINK_PETALS);
		tag(PETags.Blocks.BLACKLIST_HARVEST).add(
				Blocks.GRASS_BLOCK,
				Blocks.CRIMSON_NYLIUM,
				Blocks.NETHERRACK,
				Blocks.MELON_STEM,
				Blocks.PUMPKIN_STEM,
				Blocks.WARPED_NYLIUM,
				Blocks.SMALL_DRIPLEAF,
				Blocks.MOSS_BLOCK,
				Blocks.ROOTED_DIRT
		);
		tag(PETags.Blocks.BLACKLIST_TIME_WATCH);
		//Vanilla/Forge Tags
		addBlocks(Tags.Blocks.CHESTS, PEBlocks.ALCHEMICAL_CHEST);
		addBlocks(BlockTags.BEACON_BASE_BLOCKS, PEBlocks.DARK_MATTER, PEBlocks.RED_MATTER);
		addBlocks(BlockTags.GUARDED_BY_PIGLINS, PEBlocks.ALCHEMICAL_CHEST, PEBlocks.CONDENSER, PEBlocks.CONDENSER_MK2);
		addBlocks(BlockTags.INFINIBURN_OVERWORLD, PEBlocks.ALCHEMICAL_COAL, PEBlocks.MOBIUS_FUEL, PEBlocks.AETERNALIS_FUEL);
		addImmuneBlocks(BlockTags.DRAGON_IMMUNE);
		addImmuneBlocks(BlockTags.WITHER_IMMUNE);

		tag(PETags.Blocks.MINEABLE_WITH_HAMMER);
		tag(PETags.Blocks.MINEABLE_WITH_KATAR);
		tag(PETags.Blocks.MINEABLE_WITH_MORNING_STAR);

		addBlocks(PETags.Blocks.NEEDS_DARK_MATTER_TOOL, PEBlocks.DARK_MATTER, PEBlocks.DARK_MATTER_FURNACE, PEBlocks.DARK_MATTER_PEDESTAL);
		addBlocks(PETags.Blocks.NEEDS_RED_MATTER_TOOL, PEBlocks.RED_MATTER, PEBlocks.RED_MATTER_FURNACE);

		addBlocks(BlockTags.MINEABLE_WITH_PICKAXE,
				PEBlocks.ALCHEMICAL_CHEST,
				PEBlocks.ALCHEMICAL_COAL,
				PEBlocks.MOBIUS_FUEL,
				PEBlocks.AETERNALIS_FUEL,
				PEBlocks.COLLECTOR,
				PEBlocks.COLLECTOR_MK2,
				PEBlocks.COLLECTOR_MK3,
				PEBlocks.CONDENSER,
				PEBlocks.CONDENSER_MK2,
				PEBlocks.DARK_MATTER_PEDESTAL,
				PEBlocks.DARK_MATTER_FURNACE,
				PEBlocks.RED_MATTER_FURNACE,
				PEBlocks.DARK_MATTER,
				PEBlocks.RED_MATTER,
				PEBlocks.TRANSMUTATION_TABLE,
				PEBlocks.RELAY,
				PEBlocks.RELAY_MK2,
				PEBlocks.RELAY_MK3
		);

		//MINEABLE_WITH_PE_SHEARS
		tag(PETags.Blocks.MINEABLE_WITH_PE_HAMMER).addTags(
				PETags.Blocks.MINEABLE_WITH_HAMMER,
				BlockTags.MINEABLE_WITH_PICKAXE
		);
		tag(PETags.Blocks.MINEABLE_WITH_PE_SHEARS).add(
				//Blocks supported by vanilla shears
				Blocks.COBWEB,
				Blocks.REDSTONE_WIRE,
				Blocks.TRIPWIRE
		);
		tag(PETags.Blocks.MINEABLE_WITH_PE_SWORD).add(
				//Blocks supported by vanilla swords
				Blocks.COBWEB
		);
		tag(PETags.Blocks.MINEABLE_WITH_PE_KATAR).addTags(
				PETags.Blocks.MINEABLE_WITH_KATAR,
				BlockTags.MINEABLE_WITH_AXE,
				BlockTags.MINEABLE_WITH_HOE,
				PETags.Blocks.MINEABLE_WITH_PE_SHEARS,
				PETags.Blocks.MINEABLE_WITH_PE_SWORD
		).add(Blocks.COBWEB);//Sword items
		tag(PETags.Blocks.MINEABLE_WITH_PE_MORNING_STAR).addTags(
				PETags.Blocks.MINEABLE_WITH_MORNING_STAR,
				PETags.Blocks.MINEABLE_WITH_PE_HAMMER,//Note: Pickaxe is inherited from hammer
				BlockTags.MINEABLE_WITH_SHOVEL
		);

		addBlocks(BlockTags.WALL_POST_OVERRIDE, PEBlocks.INTERDICTION_TORCH);
	}

	private void addBlocks(TagKey<Block> tagKey, BlockRegistryObject<?, ?>... blockRegs) {
		for (BlockRegistryObject<?, ?> blockReg : blockRegs) {
			if (blockReg != null) {
				tag(tagKey).add(blockReg.getBlock());
			}
		}
	}

	private void addImmuneBlocks(TagKey<Block> tagKey) {
		addBlocks(tagKey,
				PEBlocks.DARK_MATTER,
				PEBlocks.DARK_MATTER_FURNACE,
				PEBlocks.DARK_MATTER_PEDESTAL,
				PEBlocks.RED_MATTER,
				PEBlocks.RED_MATTER_FURNACE,
				PEBlocks.CONDENSER_MK2
		);
	}
}