package management.client.function;

import javax.annotation.Generated;

/**
 * @author Albert Cabral
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}