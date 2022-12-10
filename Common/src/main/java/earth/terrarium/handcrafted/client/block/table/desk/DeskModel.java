package earth.terrarium.handcrafted.client.block.table.desk;

import earth.terrarium.handcrafted.Handcrafted;
import earth.terrarium.handcrafted.client.BaseModel;
import earth.terrarium.handcrafted.client.HandcraftedClient;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

@SuppressWarnings("unused")
@Environment(EnvType.CLIENT)
public class DeskModel extends BaseModel {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Handcrafted.MOD_ID, "desk"), "main");

    public DeskModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition tableLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(0, 32).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 9.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-7.0F, -12.0F, 4.0F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-7.0F, -12.0F, -7.0F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(4.0F, -12.0F, -7.0F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(4.0F, -12.0F, 4.0F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition overlay = main.addOrReplaceChild("overlay", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition overlay_side_north = overlay.addOrReplaceChild("overlay_side_north", CubeListBuilder.create().texOffs(0, 32).addBox(-8.0F, -16.0F, -8.01F, 16.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition overlay_top = overlay.addOrReplaceChild("overlay_top", CubeListBuilder.create().texOffs(0, 40).addBox(-8.0F, -16.01F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition overlay_side_south = overlay.addOrReplaceChild("overlay_side_south", CubeListBuilder.create().texOffs(0, 32).addBox(-8.0F, -16.0F, 8.01F, 16.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition overlay_side_west = overlay.addOrReplaceChild("overlay_side_west", CubeListBuilder.create().texOffs(16, 16).addBox(8.005F, -16.0F, -7.99F, 0.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition overlay_side_east = overlay.addOrReplaceChild("overlay_side_east", CubeListBuilder.create().texOffs(32, 16).addBox(-8.001F, -16.0F, -7.99F, 0.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    public static void register(HandcraftedClient.LayerDefinitionRegistry registry) {
        registry.register(LAYER_LOCATION, DeskModel::tableLayer);
    }
}