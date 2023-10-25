package net.minusmc.ravenb4.utils

import kotlin.random.Random

object RandomUtils {
	fun nextString(length: Int): String {
		val chars = ('a'..'z') + ('0'..'9')
		return (1..length).map{chars.random()}.joinToString("")
	}

	// fun b
	fun nextInt(minimum: Int, maximum: Int) = Random.nextInt(maximum - minimum + 1) + minimum
}