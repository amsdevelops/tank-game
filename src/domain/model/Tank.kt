package domain.model

import domain.UObject
import java.lang.IllegalArgumentException

class Tank : UObject {
    private val moveVelocity = TANK_MOVE_VELOCITY
    private val rotationVelocity = TANK_ROTATION_VELOCITY
    private var position: Position = Position(DEFAULT_COORDINATE, DEFAULT_COORDINATE)
    private var angle: Int = DEFAULT_ANGLE

    override fun getProperty(key: String): Any = when (key) {
        MovableAdapter.KEY_MOVE_VELOCITY -> moveVelocity
        MovableAdapter.KEY_POSITION -> position
        RotatableAdapter.KEY_ROTATION_VELOCITY -> rotationVelocity
        RotatableAdapter.KEY_ANGLE -> angle
        else -> throw IllegalArgumentException("No such key $key for ${this.javaClass.name}")
    }

    override fun setProperty(key: String, value: Any) {
        when (key) {
            MovableAdapter.KEY_POSITION -> position = value as Position
            RotatableAdapter.KEY_ANGLE -> angle = value as Int
            else -> throw IllegalArgumentException("No such key $key for ${this.javaClass.name}")
        }
    }

    companion object {
        private const val TANK_MOVE_VELOCITY = 1
        private const val TANK_ROTATION_VELOCITY = 1
        private const val DEFAULT_COORDINATE = 0
        private const val DEFAULT_ANGLE = 0
    }
}