public class TheClass implements Filter{


    @Override
    public Object apply(Object o) {
        return o.getClass();
    }
}
