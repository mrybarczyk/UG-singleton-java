package wzorce01;

final class TLSingleton {

    private static TLSingleton INSTANCE;

    private TLSingleton() {
    }

    private static ThreadLocal<TLSingleton> _threadLocal =
            new ThreadLocal<TLSingleton>() {
                @Override
                protected TLSingleton initialValue() {
                    return new TLSingleton();
                }
            };

    public static TLSingleton getInstance() {
        return _threadLocal.get();
    }
}