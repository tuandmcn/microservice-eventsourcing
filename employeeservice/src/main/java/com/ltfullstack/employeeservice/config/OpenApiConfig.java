package com.ltfullstack.employeeservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(
        title = "Employee Api Specification - LT Fullstack",
        description = "Api document for Employee Service",
        version ="1.0",
        contact = @Contact (
            name = "Tuan Do",
            email = "tuandmcn@hotmail.com",
            url = "https://viettel.vn"
        ),
        license = @License (
            name = "MIT License",
            url = "https://viettel.vn/license"

        ),
        termsOfService = "https://viettel.vn/terms"
    ),
    servers = {
            @Server (
                description = "Local EVN",
                url = "http://localhost:9002"
            ),
            @Server (
                    description = "Dev EVN",
                    url = "http://localhost.dev:9002"
            ),
            @Server (
                    description = "Prod EVN",
                    url = "http://localhost.prod:9002"
            )
    }
)
public class OpenApiConfig {
}
