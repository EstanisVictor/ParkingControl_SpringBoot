package com.api.parkingcontrol.configs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.format.DateTimeFormatter;

@Configuration
public class DateConfig {
    //configurando a data para UTC
    public static String DATETIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    //setando o padrão definido em LocalDateTimeSerializer
    public static LocalDateTimeSerializer LOCAL_DATETIME_SERIALIZER =
            new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(DATETIME_FORMAT));
    //sempre que for feito serializações, por default o spring utiliza o ObjectMapper.
    //Nesse caso está sendo alterado para mostrar datas no padrão criado acima "DATETIME_FORMAT"
    @Bean
    @Primary
    public ObjectMapper objectMapper(){
        JavaTimeModule mod = new JavaTimeModule();
        mod.addSerializer(LOCAL_DATETIME_SERIALIZER);
        return new ObjectMapper().registerModule(mod);
    }
}
