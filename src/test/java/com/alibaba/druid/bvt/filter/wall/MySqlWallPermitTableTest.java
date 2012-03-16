package com.alibaba.druid.bvt.filter.wall;

import org.junit.Assert;

import com.alibaba.druid.filter.wall.WallUtils;

import junit.framework.TestCase;

/**
 * 这个场景测试访问MySql系统函数
 * 
 * @author admin
 */
public class MySqlWallPermitTableTest extends TestCase {

    public void test_permitTable() throws Exception {
        Assert.assertFalse(WallUtils.isValidateMySql("select benchmark( 500000, sha1( 'test' ) )"));
    }
    
}
