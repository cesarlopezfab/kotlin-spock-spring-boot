import spock.lang.Specification

class HelloWorldSpec extends Specification {

    def "hello world"() {
        expect:
        "hello world" == "patata"
    }
}
