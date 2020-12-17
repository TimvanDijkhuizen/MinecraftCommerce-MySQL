package nl.timvandijkhuizen.commerce.mysql;

import nl.timvandijkhuizen.commerce.CommerceApi;
import nl.timvandijkhuizen.spigotutils.PluginBase;

public class CommerceMySQL extends PluginBase {

    @Override
    public void setup() {
        CommerceApi.registerStorageType(new StorageMysql());
    }

}
