package earth.terrarium.handcrafted.common.block.counter;

import earth.terrarium.handcrafted.common.block.ItemHoldingBlockEntity;
import earth.terrarium.handcrafted.common.registry.ModBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.state.BlockState;

public class CounterBlockEntity extends ItemHoldingBlockEntity {
    public CounterBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntityTypes.COUNTER.get(), blockPos, blockState);
        this.setStack(Items.CALCITE.getDefaultInstance());
    }
}
