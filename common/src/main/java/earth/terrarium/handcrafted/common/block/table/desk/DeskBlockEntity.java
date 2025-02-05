package earth.terrarium.handcrafted.common.block.table.desk;

import earth.terrarium.handcrafted.common.block.ItemHoldingBlockEntity;
import earth.terrarium.handcrafted.common.registry.ModBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class DeskBlockEntity extends ItemHoldingBlockEntity {
    public DeskBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntityTypes.DESK.get(), blockPos, blockState);
    }
}
