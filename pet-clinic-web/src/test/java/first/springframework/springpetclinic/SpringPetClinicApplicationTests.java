package first.springframework.springpetclinic;

import first.springframework.springpetclinic.SpringPetClinicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SpringPetClinicApplication.class)
class SpringPetClinicApplicationTests {

    @Test
    void contextLoads() {
    }

}
