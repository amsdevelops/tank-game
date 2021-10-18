import domain.model.MovableAdapter
import domain.model.Position
import domain.model.Tank
import engine.Move

fun main() {
    val tank1 = Tank().apply {
        setProperty(MovableAdapter.KEY_POSITION, Position(1, 1))
    }.also { println(it.getProperty(MovableAdapter.KEY_POSITION)) }

    val move = Move(MovableAdapter(tank1), Position(2, 2))
    move.execute()
    println(tank1.getProperty(MovableAdapter.KEY_POSITION))

}