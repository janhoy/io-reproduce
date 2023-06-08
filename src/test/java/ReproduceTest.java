import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReproduceTest {

  @org.junit.jupiter.api.Test
  void reproduce() {
    assertThrows(IOException.class, Reproduce::reproduce);
  }
}