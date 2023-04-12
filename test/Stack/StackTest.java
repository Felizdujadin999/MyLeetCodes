package Stack;

import List.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack(5);
    }

    @Test
    public void newStackCanBeCreatedTest() {
        assertNotNull(stack);
    }

    @Test
    public void newStack_IsEmptyTest() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void PushXInNewStack_StackIsNotEmpty() {
        stack.push(34);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void PushX_PushY_PopY_StackIsNotEmpty() {
        stack.push(45);
        stack.push(56);
        int X = 45;
        int Y = 56;
        stack.pop();
    }

    @Test
    public void PushMoreThanTheLengthOfTheStackAndThrowExceptionTest() {
        stack.push(55);
        stack.push(51);
        stack.push(52);
        stack.push(53);
        stack.push(54);
        assertTrue(stack.isFull());
        assertThrows(StackOverflowError.class, () -> stack.push(77));
    }

    @Test
    public void PushY_PopYAndStackIsEmptyTest() {
        stack.push(5);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void PeekTest() {
        stack.push(7);
        stack.peek();
        assertEquals(7, stack.peek());
    }

    @Test
    public void PopMethodThrowsStackOverflowErrorTest(){
        assertThrows(StackOverflowError.class, () -> stack.pop());
    }
}

