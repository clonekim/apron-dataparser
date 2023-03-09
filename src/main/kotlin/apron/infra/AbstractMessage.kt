package apron.infra

abstract class AbstractMessage(override var buffer: String) : IMessage {

    override val byte: Int
        get() = buffer.length

}
