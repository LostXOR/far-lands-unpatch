package net.fabricmc.far_lands_unpatch.mixin;

import net.minecraft.util.math.noise.OctavePerlinNoiseSampler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(OctavePerlinNoiseSampler.class)
public class FarLandsMixin {
	@Inject(method = "maintainPrecision", at = @At("HEAD"), cancellable = true)
	private static void maintainPrecision(double value, CallbackInfoReturnable<Double> cir) {
		cir.setReturnValue(value);
	}
}