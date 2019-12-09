package TesterBase.UnitTest;

import static org.powermock.api.mockito.PowerMockito.spy;

public interface SingleClassUnitTest<T> {

    public void clearInstance(T instance);

    public T createRealInstance();

    public default T createInstance() {
        T instance = this.createRealInstance();
        this.clearInstance(instance);
        return instance;
    }

    public default T createSpyInstance() {
        return spy(this.createInstance());
    }
}
