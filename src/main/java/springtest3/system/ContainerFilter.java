package springtest3.system;

/**
 * @program: git125
 * @description: 容器过滤接口
 * @author: zy
 * @create: 2023-07-26 08:40
 */
public interface ContainerFilter {
    /**
     * 判断此对象是否为有效对象.
     * @param obj
     * @return
     */
    public boolean doFilter(   Object obj);
}
