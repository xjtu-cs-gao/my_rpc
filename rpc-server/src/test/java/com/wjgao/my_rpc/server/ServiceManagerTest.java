package com.wjgao.my_rpc.server;

import com.wjgao.my_rpc.Request;
import com.wjgao.my_rpc.ServiceDescriptor;
import com.wjgao.my_rpc.common.utils.ReflectionUtils;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class ServiceManagerTest {
    ServiceManager wjgao;

    @Before
    public void init() {
        wjgao = new ServiceManager();

        TestInterface bean = new TestClass();
        wjgao.register(TestInterface.class, bean);
    }
    @Test
    public void register() {
        TestInterface bean = new TestClass();

        wjgao.register(TestInterface.class, bean);
    }

    @Test
    public void lookup() {
        Method method = ReflectionUtils.getPublicMethods(TestInterface.class)[0];
        ServiceDescriptor sdp = ServiceDescriptor.from(TestInterface.class, method);

        Request request = new Request();
        request.setService(sdp);

        ServiceInstance sis = wjgao.lookup(request);
        assertNotNull(sis);
    }
}