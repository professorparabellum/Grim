package ac.grim.grimac.utils.nmsImplementations;

import ac.grim.grimac.utils.data.packetentity.PacketEntity;
import org.bukkit.entity.Entity;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Slime;

public class BoundingBoxSize {
    public static double getWidth(PacketEntity packetEntity) {
        Entity entity = packetEntity.entity;
        switch (packetEntity.type) {
            case AXOLOTL:
            case PANDA:
                return 1.3;
            case BAT:
            case PARROT:
            case COD:
                return 0.5;
            case BEE:
            case PUFFERFISH:
            case SALMON:
            case SNOWMAN:
            case WITHER_SKELETON:
            case CAVE_SPIDER:
                return 0.7;
            case BLAZE:
            case OCELOT:
            case STRAY:
            case VINDICATOR:
            case VILLAGER:
            case WITCH:
            case WOLF:
            case ZOMBIE:
            case ZOMBIE_VILLAGER:
            case ZOMBIFIED_PIGLIN:
            case SKELETON:
            case CAT:
            case CREEPER:
            case DROWNED:
            case ENDERMAN:
            case EVOKER:
            case FOX:
            case HUSK:
            case ILLUSIONER:
                return 0.6;
            case BOAT:
                return 1.375;
            case CHICKEN:
            case ENDERMITE:
            case RABBIT:
            case SILVERFISH:
            case VEX:
                return 0.4;
            case COW:
            case SHEEP:
            case MUSHROOM_COW:
            case PHANTOM:
            case PIG:
            case LLAMA:
            case DOLPHIN:
            case WITHER:
                return 0.9;
            case DONKEY:
                return 1.5;
            case ELDER_GUARDIAN:
                return 1.9975;
            case ENDER_CRYSTAL:
                return 2.0;
            case ENDER_DRAGON:
                return 16.0;
            case FIREBALL:
                return 1;
            case GHAST:
                return 4.0;
            case GIANT:
                return 3.6;
            case GUARDIAN:
                return 0.85;
            case HORSE:
                return 1.39648;
            case IRON_GOLEM:
                return 1.4;
            case MAGMA_CUBE:
                if (entity instanceof MagmaCube) {
                    return 0.51000005 * ((MagmaCube) entity).getSize();
                }
            case MINECART:
            case MINECART_CHEST:
            case MINECART_COMMAND:
            case MINECART_FURNACE:
            case MINECART_HOPPER:
            case MINECART_MOB_SPAWNER:
            case MINECART_TNT:
                return 0.98;
            case MULE:
                return 1.39648;
            case PLAYER:
                return packetEntity.pose.width;
            case POLAR_BEAR:
                return 1.4;
            case RAVAGER:
                return 1.95;
            case SHULKER:
                return 1.0;
            case SKELETON_HORSE:
                return 1.39648;
            case SLIME:
                if (entity instanceof Slime) {
                    return 0.51000005 * ((Slime) entity).getSize();
                }
            case SMALL_FIREBALL:
                return 0.3125;
            case SPIDER:
                return 1.4;
            case SQUID:
                return 0.8;
            case ZOMBIE_HORSE:
                return 1.39648;
            default:
                return entity.getWidth();
        }
    }

    public static double getHeight(PacketEntity packetEntity) {
        Entity entity = packetEntity.entity;
        switch (packetEntity.type) {
            case AXOLOTL:
            case BEE:
            case DOLPHIN:
                return 0.6;
            case BAT:
            case PARROT:
            case PIG:
            case SPIDER:
                return 0.9;
            case BLAZE:
                return 1.8;
            case BOAT:
                return 0.5625;
            case CAT:
                return 0.7;
            case CAVE_SPIDER:
                return 0.5;
            case CHICKEN:
                return 0.7;
            case COD:
                return 1.4;
            case COW:
                return 1.7;
            case CREEPER:
                return 1.7;
            case DONKEY:
                return 1.39648;
            case DROWNED:
                return 1.95;
            case ELDER_GUARDIAN:
                return 1.9975;
            case ENDERMAN:
                return 2.9;
            case ENDERMITE:
                return 0.3;
            case ENDER_CRYSTAL:
                return 2.0;
            case ENDER_DRAGON:
                return 8.0;
            case EVOKER:
                return 1.95;
            case FIREBALL:
                return 1;
            case FOX:
                return 0.7;
            case GHAST:
                return 4.0;
            case GIANT:
                return 12.0;
            case GUARDIAN:
                return 0.85;
            case HORSE:
                return 1.6;
            case HUSK:
                return 1.95;
            case ILLUSIONER:
                return 1.95;
            case IRON_GOLEM:
                return 2.7;
            case LLAMA:
                return 1.87;
            case MAGMA_CUBE:
                if (entity instanceof MagmaCube) {
                    return 0.51000005 * ((MagmaCube) entity).getSize();
                }
            case MINECART:
            case MINECART_CHEST:
            case MINECART_COMMAND:
            case MINECART_FURNACE:
            case MINECART_HOPPER:
            case MINECART_MOB_SPAWNER:
            case MINECART_TNT:
                return 0.7;
            case MULE:
                return 1.6;
            case MUSHROOM_COW:
                return 1.4;
            case OCELOT:
                return 0.7;
            case PANDA:
                return 1.25;
            case PHANTOM:
                return 0.5;
            case PLAYER:
                return packetEntity.pose.height;
            case POLAR_BEAR:
                return 1.4;
            case PUFFERFISH:
                return 0.7;
            case RABBIT:
                return 0.5;
            case RAVAGER:
                return 2.2;
            case SALMON:
                return 0.4;
            case SHEEP:
                return 1.3;
            case SHULKER: // TODO: Guess peek size
                return 1.0;
            case SILVERFISH:
                return 0.3;
            case SKELETON:
                return 1.99;
            case SKELETON_HORSE:
                return 1.6;
            case SLIME:
                if (entity instanceof Slime) {
                    return 0.51000005 * ((Slime) entity).getSize();
                }
            case SMALL_FIREBALL:
                return 0.3125;
            case SNOWMAN:
                return 1.9;
            case SQUID:
                return 0.8;
            case STRAY:
                return 1.99;
            case VEX:
                return 0.8;
            case VILLAGER:
                return 1.95;
            case VINDICATOR:
                return 1.95;
            case WITCH:
                return 1.95;
            case WITHER:
                return 3.5;
            case WITHER_SKELETON:
                return 2.4;
            case WOLF:
                return 0.85;
            case ZOMBIE:
                return 1.95;
            case ZOMBIE_HORSE:
                return 1.6;
            case ZOMBIE_VILLAGER:
                return 1.95;
            case ZOMBIFIED_PIGLIN:
                return 1.95;
            default:
                return entity.getHeight();
        }
    }
}
