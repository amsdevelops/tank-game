package engine

import domain.Command
import domain.IRotatable

class Rotate(private val iRotatable: IRotatable, private val angle: Int) : Command {
    override fun execute() {
        iRotatable.setAngle(angle)
    }
}