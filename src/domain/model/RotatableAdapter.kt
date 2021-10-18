package domain.model

import domain.IRotatable
import domain.UObject

class RotatableAdapter(private val uObject: UObject) : IRotatable {
    override fun getAngle(): Int = uObject.getProperty(KEY_ANGLE) as Int

    override fun setAngle(angle: Int) = uObject.setProperty(KEY_ANGLE, angle)

    override fun getVelocity(): Int = uObject.getProperty(KEY_ROTATION_VELOCITY) as Int

    companion object {
        const val KEY_ANGLE = "angle"
        const val KEY_ROTATION_VELOCITY = "rotate velocity"
    }
}