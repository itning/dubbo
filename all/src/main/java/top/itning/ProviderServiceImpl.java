package top.itning;

/**
 * @author itning
 * @since 2021/11/18 18:28
 */
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
