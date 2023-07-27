package me.nokko.nixnarrator.mixin;

import com.mojang.text2speech.Narrator;
import com.mojang.text2speech.NarratorDummy;
import org.spongepowered.asm.mixin.Interface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = Narrator.class)
public interface MixinNarrator extends Narrator {

    /**
     * @author nokko
     * @reason Fixes horrid startup stuff in the M1 GTCEu buildscript.
     *         Please don’t use outside of dev environments.
     */
    @Overwrite(remap = false)
    static public Narrator getNarrator() {
        return new NarratorDummy();
    }
}
