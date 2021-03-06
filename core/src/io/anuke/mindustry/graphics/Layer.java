package io.anuke.mindustry.graphics;

public enum Layer{
    /** Base block layer. */
    block,
    /** for placement */
    placement,
    /** First overlay. Stuff like conveyor items. */
    overlay,
    /** "High" blocks, like turrets. */
    turret,
    /** Power lasers. */
    power,
    /** Extra layer that's always on top.*/
    lights,
    /** Debug layer with directional arrows and other informative indicators. */
    debug,
}
