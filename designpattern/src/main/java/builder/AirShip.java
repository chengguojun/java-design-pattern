package builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName AirShip
 * @Description 建造者模式
 * @Author ChengGuojun
 * @Date 2018-10-18 21:53
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirShip {

    //    引擎舱
    private ObModule obModule;
    // 发动机
    private Eingeer eingeer;
    // 仓库
    private Esacpse esacpse;


}
@Data
@AllArgsConstructor
class ObModule {
    private String name="仓库";
    public ObModule(){

    }
}
@Data
@AllArgsConstructor
class Eingeer {
    private String name="vvt";
    public Eingeer(){

    }
}
@Data
@AllArgsConstructor
class Esacpse {
    private String name="run";
    public Esacpse(){

    }
}