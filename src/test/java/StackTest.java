import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.*;

import java.util.Stack;

class StackTest {

    Stack<Object> stack;

    @Nested
    class stackPop
    {
        @BeforeEach
        void initializeStack()
        {
            stack=new Stack<>();
        }

        @Test
        void checkForPop()
        {
          assertThrows(Exception.class,()->stack.pop());
        }

        @Nested
        class StackPush
        {
            @BeforeEach
            void intialize()
            {
                stack=new Stack<>();
                stack.push("Nishu");
            }

            @Test
            void getAnItemFromStack()
            {
                assumeTrue(!stack.isEmpty());
                assertEquals("Nishu",stack.pop());
            }
        }
    }
}
