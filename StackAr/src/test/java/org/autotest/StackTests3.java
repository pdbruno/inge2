package org.autotest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StackTests3 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() {
        return false;
    }

    public void testSizeIncreasesByOne() throws Exception {
        Stack stack = createStack();
        assertEquals(0, stack.size());
        stack.push(42);
        assertEquals(1, stack.size());
    }

    public void testDefaultConstructor() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
    }

    public void testConstructorWithSpecifiedCapacity() throws Exception {
        Stack stack = createStack(5);
    }

    public void testConstructorWithNegativeCapacity() {
        assertThrows(IllegalArgumentException.class, () -> {
            Stack stack = createStack(-1);
        });
    }

    public void testIsEmptyMethod() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
        stack.push(42);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    public void testIsFullMethod() throws Exception {
        Stack stack = createStack(1);
        assertFalse(stack.isFull());
        stack.push(42);
        assertTrue(stack.isFull());
        stack.pop();
        assertFalse(stack.isFull());
    }

    public void testToStringMethod() throws Exception {
        Stack stack = createStack(2);
        assertEquals("[]", stack.toString());
        stack.push(42);
        assertEquals("[42]", stack.toString());
        stack.push(43);
        assertEquals("[42,43]", stack.toString());
    }

    public void testEqualsNull() throws Exception {
        Stack stack = createStack();
        assertFalse(stack.equals(null));
    }

    public void testSameStackIsEqual() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.equals(stack));
    }

    public void testEmptyStackAreEqual() throws Exception {
        assertTrue(createStack().equals(createStack()));
    }

    public void testEqualsDifferentReadIndexes() throws Exception {
        Stack stack1 = createStack();
        Stack stack2 = createStack();
        stack1.push(2);
        stack1.push(2);
        stack2.push(2);
        stack2.push(2);

        stack1.pop();
        assertFalse(stack1.equals(stack2));
    }

    public void testEqualsDifferentElems() throws Exception {
        Stack stack1 = createStack();
        Stack stack2 = createStack();
        stack1.push(2);
        stack1.push(2);
        stack2.push(1);
        stack2.push(2);

        assertFalse(stack1.equals(stack2));
    }

    public void testCapacity0IsValid() throws Exception {
        Stack stack = createStack(0);
        assertTrue(stack.isEmpty());
    }

    public void testDifferentTypesOfObjectsAreNotEqual() throws Exception {
        Stack stack = createStack();
        assertFalse(stack.equals(new Object()));
    }
    public void testHashCodeDifferentStacks() throws Exception {
        Stack stack1 = createStack();
        Stack stack2 = createStack();
        stack1.push(2);
        stack1.push(2);
        stack2.push(1);
        stack2.push(2);

        assertFalse(stack1.hashCode() == stack2.hashCode());
    }

    public void testCallTopOnEmptyStackThrowsIllegalStateException() throws Exception {
        assertThrows(IllegalStateException.class, () -> {
            createStack().top();
        });
    }

    public void testPushToFullStackThrows() {
        assertThrows(IllegalStateException.class, () -> {
            Stack stack = createStack(0);
            stack.push(0);
        });
    }
    public void testEqualsPopAndPushed() throws Exception {
        Stack stack1 = createStack();
        stack1.push(2);

        assertEquals(2, stack1.pop());
    }
}