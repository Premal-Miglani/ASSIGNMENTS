package junit5;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssignmentQ1test {

private MinMaxFinder minMaxFinder;
private int[] expected;
private int[] actual;

@BeforeEach
public void init(){
minMaxFinder = new MinMaxFinder();
expected = new int[]{3, 56};
    }

@Test
public void TestminMaxFinder(){
actual = minMaxFinder.findMinMax(new int[]{56, 34, 7,3, 54, 3, 34, 34, 53});
Assertions.assertArrayEquals(expected,actual);
    }

@AfterEach
public void Clean(){
minMaxFinder = null;
expected = actual = null;
    }
}
