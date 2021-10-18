package domain.model

import domain.IMovable
import domain.UObject

class MovableAdapter(private val uObject: UObject) : IMovable {
    override fun getPosition(): Position = uObject.getProperty(KEY_POSITION) as Position

    override fun setPosition(position: Position) = uObject.setProperty(KEY_POSITION, position)

    override fun getVelocity(): Int = uObject.getProperty(KEY_MOVE_VELOCITY) as Int

    companion object {
        const val KEY_POSITION = "position"
        const val KEY_MOVE_VELOCITY = "move velocity"
    }
}