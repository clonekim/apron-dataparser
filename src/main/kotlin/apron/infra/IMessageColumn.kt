package apron.infra

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class IMessageColumn(val length: Int, val order: Int, val descritpion: String = "")