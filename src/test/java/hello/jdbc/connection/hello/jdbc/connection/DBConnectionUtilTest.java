package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class DBConnectionUtilTest {

    // 연결이 완료되었는지 테스트 한다.
    @Test
    public void connection(){
        Connection connection = DBConnectionUtil.getConnection();
        assertThat(connection).isNotNull();

    }
}

