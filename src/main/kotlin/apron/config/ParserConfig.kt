package apron.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@ConfigurationProperties(prefix = "apron.parser")
@Component
data class ParserConfig(var debug: Boolean? = false)

