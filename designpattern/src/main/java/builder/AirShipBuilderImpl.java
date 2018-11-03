package builder;

/**
 * @ClassName AirShipBuilderImpl
 * @Description 实现类
 * @Author ChengGuojun
 * @Date 2018-10-18 22:46
 * @Version 1.0
 */
public class AirShipBuilderImpl implements AirShipBuilder {
    @Override
    public ObModule getObModule() {
        System.out.println("ObModule");
        return new ObModule();
    }

    @Override
    public Eingeer getEingeer() {
        System.out.println("ObModule");
        return new Eingeer();
    }

    @Override
    public Esacpse getEsacpse() {
        System.out.println("ObModule");
        return new Esacpse();
    }
}
