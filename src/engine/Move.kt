package engine

import domain.Command
import domain.IMovable
import domain.model.Position

class Move(private val iMovable: IMovable, private val position: Position) : Command {
    override fun execute() {
        iMovable.setPosition(position)
    }
}