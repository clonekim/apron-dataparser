package apron

import mu.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory
import org.springframework.boot.web.server.ErrorPage
import org.springframework.boot.web.server.WebServerFactoryCustomizer
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component


@SpringBootApplication
class ApronApplication

val logger = KotlinLogging.logger { }

fun main(args: Array<String>) {
    runApplication<ApronApplication>(*args)
}


@Component
class ServletCustomizer : WebServerFactoryCustomizer<UndertowServletWebServerFactory> {
    override fun customize(factory: UndertowServletWebServerFactory) {
        val error404Page = ErrorPage(HttpStatus.NOT_FOUND, "/index.html")
        factory.addErrorPages(error404Page)
    }
}