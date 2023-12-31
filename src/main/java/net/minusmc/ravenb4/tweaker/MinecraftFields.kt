package net.minusmc.ravenb4.tweaker

import net.minecraft.client.Minecraft
import net.minecraftforge.client.event.MouseEvent
import net.minecraft.client.entity.EntityPlayerSP
import net.minecraft.network.play.server.S12PacketEntityVelocity
import net.minecraft.entity.projectile.EntityArrow
import net.minecraft.client.renderer.EntityRenderer
import net.minecraft.client.multiplayer.PlayerControllerMP
import net.minecraft.entity.EntityLivingBase
import java.lang.reflect.Field
import org.lwjgl.input.Mouse

enum class MinecraftFields(val methodName: String, val method: String, val clazz: Class<*>) {
	leftClickCounter("leftClickCounter", "field_71429_W", Minecraft::class.java),
	button("button", "", MouseEvent::class.java),
	lastReportedYaw("lastReportedYaw", "field_175164_bL", EntityPlayerSP::class.java),
	motionZ("motionZ", "field_149414_d", S12PacketEntityVelocity::class.java),
	lastReportedPosX("lastReportedPosX", "field_175172_bI", EntityPlayerSP::class.java),
	lastReportedPosY("lastReportedPosY", "field_175166_bJ", EntityPlayerSP::class.java),
	motionY("motionY", "field_149416_c", S12PacketEntityVelocity::class.java),
	rightClickDelayTimer("rightClickDelayTimer", "field_71467_ac", Minecraft::class.java),
	jumpTicks("jumpTicks", "field_70773_bE", EntityLivingBase::class.java),
	shaderIndex("shaderIndex", "field_147713_ae", EntityRenderer::class.java),
	serverSprintState("serverSprintState", "field_175171_bO", EntityPlayerSP::class.java),
	blockHitDelay("blockHitDelay", "field_78781_i", PlayerControllerMP::class.java),
	buttons("buttons", "", Mouse::class.java),
	inGround("inGround", "field_70254_i", EntityArrow::class.java),
	lastReportedPosZ("lastReportedPosZ", "field_175167_bK", EntityPlayerSP::class.java),
	motionX("motionX", "field_149415_b", S12PacketEntityVelocity::class.java),
	serverSneakState("serverSneakState", "field_175170_bN", EntityPlayerSP::class.java),
	lastReportedPitch("lastReportedPitch", "field_175165_bM", EntityPlayerSP::class.java),
	shaderResourceLocations("shaderResourceLocations", "field_147712_ad", EntityRenderer::class.java),
	positionUpdateTicks("positionUpdateTicks", "field_175168_bP", EntityPlayerSP::class.java),
	timer("timer", "field_71428_T", Minecraft::class.java),
	useShader("useShader", "field_175083_ad", EntityRenderer::class.java),
	buttonstate("buttonstate", "", MouseEvent::class.java),
	running("running", "field_71425_J", Minecraft::class.java),
	curBlockDamageMP("curBlockDamageMP", "field_78770_f", PlayerControllerMP::class.java);

	lateinit var field: Field

	fun isInited() = ::field.isInitialized	
}