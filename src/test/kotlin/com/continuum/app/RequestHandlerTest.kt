package com.continuum.app

import kotlin.test.Test
import kotlin.test.assertEquals

class RequestHandlerTest {
    @Test
    fun handles a health check() {
        val handler = RequestHandler(ProcessingService("continuum-payment-return-inbound"))

        assertEquals("continuum-payment-return-inbound processed: health-check", handler.handle("health-check"))
    }
}