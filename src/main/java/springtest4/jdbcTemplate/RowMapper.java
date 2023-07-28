package springtest4.jdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: git125
 * @description:
 * @author: zy
 * @create: 2023-07-26 20:20
 */
public interface RowMapper<T>{
    /**
     * 对第i行的ResultSet 转换成  T对象，  这个具体的实现由用户完成
     * @param rs
     * @param i
     * @return
     * @throws SQLException
     */
    public T mapper(ResultSet rs, int i  ) throws SQLException;
}
