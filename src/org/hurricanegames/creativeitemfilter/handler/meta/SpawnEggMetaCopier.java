package org.hurricanegames.creativeitemfilter.handler.meta;

import org.bukkit.inventory.meta.SpawnEggMeta;
import org.hurricanegames.creativeitemfilter.CreativeItemFilterConfiguration;

public class SpawnEggMetaCopier implements MetaCopier<SpawnEggMeta> {

    public static final SpawnEggMetaCopier INSTANCE = new SpawnEggMetaCopier();

    protected SpawnEggMetaCopier() {
    }

    @Override
    public void copyValidMeta(CreativeItemFilterConfiguration configuration, SpawnEggMeta oldMeta, SpawnEggMeta newMeta) {
        newMeta.setSpawnedType(oldMeta.getSpawnedType());
    }
}
