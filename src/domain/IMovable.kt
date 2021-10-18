package domain

import domain.model.Position

interface IMovable {
    fun getPosition(): Position
    fun setPosition(position: Position)
    fun getVelocity(): Int
}