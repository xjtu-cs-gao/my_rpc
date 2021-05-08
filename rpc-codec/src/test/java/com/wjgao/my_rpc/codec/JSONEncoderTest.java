package com.wjgao.my_rpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONEncoderTest {

    @Test
    public void encoder() {
        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setName("wjgao");
        bean.setAge(18);

        byte[] bytes = encoder.encode(bean);
        assertNotNull(bytes);
    }
}