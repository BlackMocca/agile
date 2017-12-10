/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestMaven;

import com.signature.agile.models.HelloMaven;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 *
 * @author huag1
 */
public class TestMaven extends TestCase {
    HelloMaven tmv = new HelloMaven();
    
    public TestMaven(String testName) {
        super(testName);
    }
    
    public void testMessageFollowingIdOne(){
        int id = 1;
        String msg = HelloMaven.getMessageById(1);
        Assert.assertEquals("สวัสดีชาวโลก", msg);
    }
    
    public void testMessageFollowingIdTwo(){
        int id = 2;
        String msg = HelloMaven.getMessageById(id);
        Assert.assertEquals("hello world", msg);
    }
    

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
