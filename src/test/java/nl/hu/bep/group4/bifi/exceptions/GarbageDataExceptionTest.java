package nl.hu.bep.group4.bifi.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class GarbageDataExceptionTest {
	@Test
	public void testEmptyConstructor() {
		GarbageDataException exception = new GarbageDataException();
		assertNull(exception.getMessage());
	}
	@Test
	public void testMessageConstructor() {
		GarbageDataException exception = new GarbageDataException("test-message");
		assertEquals("test-message", exception.getMessage());
	}
	@Test
	public void testThrowableConstructor() {
		Exception throwable = new Exception("test");
		GarbageDataException exception = new GarbageDataException(throwable);
		assertEquals(throwable, exception.getCause());
	}
	@Test
	public void testMessageThrowableConstructor() {
		Exception throwable = new Exception("test");
		GarbageDataException exception = new GarbageDataException("test-message", throwable);
		assertEquals("test-message", exception.getMessage());
		assertEquals(throwable, exception.getCause());
	}
	@Test
	public void testLongConstructor() {
		Exception throwable = new Exception("test");
		GarbageDataException exception = new GarbageDataException("test-message", throwable, false, false);
		assertEquals("test-message", exception.getMessage());
		assertEquals(throwable, exception.getCause());
	}
}

