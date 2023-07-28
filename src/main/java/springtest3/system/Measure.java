package springtest3.system;

/**
 * @program: git125
 * @description: 测量 接口
 * @author: zy
 * @create: 2023-07-26 08:39
 */
public interface Measure {
    /**
     *
     * @param obj:待测量的对象
     * @return : 测量 的值
     */
    public double doMeasure(  Object obj);
}
