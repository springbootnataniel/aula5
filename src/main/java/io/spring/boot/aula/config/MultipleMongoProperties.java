package io.spring.boot.aula.config;



import lombok.Data;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
@Data
@ConfigurationProperties(prefix = "mongodb")
public class MultipleMongoProperties {

	private MongoProperties primary = new MongoProperties();
	private MongoProperties secondary = new MongoProperties();
}

