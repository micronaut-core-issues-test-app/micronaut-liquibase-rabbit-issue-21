package micronaut.liquibase.rabbit;

import com.rabbitmq.client.Channel;
import io.micronaut.configuration.rabbitmq.connect.ChannelInitializer;

import javax.inject.Singleton;
import java.io.IOException;

@Singleton
class MyClass extends ChannelInitializer {

//    private final DataSource dataSource;
//
//    MyClass(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    @Override
    public void initialize(Channel channel) throws IOException {
        System.out.println("Rabbit channel initializer");
    }
}
