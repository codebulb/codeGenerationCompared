package ch.codebulb.codegenerationcompared.groovy

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import static org.junit.Assert.*

class GroovyTranslatorTest {
    private static final String INPUT = """
myCustomer.name = remoteCustomer.name
notNull(remoteCustomer.address) {
	myCustomer.address = remoteCustomer.address
	myCustomer.address.street = remoteCustomer.address.street
	myCustomer.address.city = remoteCustomer.address.city
}
"""
    
    private static final String EXPECTED_OUTPUT = """
myCustomer.setName(remoteCustomer.getName());
if (remoteCustomer.getAddress() != null) {
	myCustomer.setAddress(remoteCustomer.getAddress());
	myCustomer.getAddress().setStreet(remoteCustomer.getAddress().getStreet());
	myCustomer.getAddress().setCity(remoteCustomer.getAddress().getCity());
}
""".split("\n").findAll{it != ""}.join("\n")
    
    @Test
    public void testTranslate() {
        assert EXPECTED_OUTPUT == GroovyTranslator.translate(INPUT)
    }
}
