package Zebra.MyBlog;

import Zebra.MyBlog.util.DBUtil;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/16
 * Time: 11:42
 * Description: No Description
 */
public class DBUtilTest {
    @Test
    public void testConnection() {
        Connection connection = DBUtil.getConnection();
        Assert.assertNotNull(connection);
    }
}

