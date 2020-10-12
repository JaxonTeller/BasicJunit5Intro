import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;


class MathUtilsTest {

    MathUtils mathUtils=null;

    @BeforeAll
    static void beforeInstantiationOfTestClass()
    {
        System.out.println("This is running before creation of each class");
    }

    @BeforeEach
    void instantiationOfTestClass()
    {
        System.out.println("This is running before creation of each method");
        mathUtils =new MathUtils();
    }


    @Nested
    @Tag("Math")
    class AddClasTest
    {

        @Test
        @DisplayName("ADDTEST FOR NEGETIVE NUMBER")
        public void testAddMethod()
        {
            int add = mathUtils.add(-1, -2);
            assertEquals(-3,add,"Add method should add two numbers");

        }

        @Test
        @DisplayName("ADDTEST FOR ZERO NUMBER")
        public void testAddMethodWithZero()
        {
            int add = mathUtils.add(0, -2);
            assertEquals(-2,add,"Add method should add two numbers");

        }
    }



    @Test
    @Tag("Circle")
    @DisplayName("AREAOFCIRCLETEST")
    public void testForComputingAreaOfCircle()
    {
        double radious=4;
        assertEquals(50.26548245743669,mathUtils.computeCircleArea(radious),"Computing circle redius");
    }

    @Test
    @Tag("Math")
    @DisplayName("DIVIDEMETHODTEST")
    @Disabled
    public void testDivideMethodWhichThrowsException()  {
        boolean isServerUp=false;
        assumeTrue(isServerUp);
        assertThrows(Exception.class, ()->mathUtils.divide(1,0),"Divide method may throws exception");
    }

    @Test
    @Tag("Math")
    @DisplayName("MULTIPLY METHOD TEST")
    void testMultiply()
    {
        assertAll("Bunch of Assert Equals",Stream.of(()->assertEquals(0,mathUtils.multiply(2,0)),
                ()->assertEquals(2,mathUtils.multiply(2,1))));

    }


    @Test
    @DisplayName("SKIPTEST FOR TDD")
    @Disabled
    void test()
    {
        fail("TDD FOR FAIL");
    }

}