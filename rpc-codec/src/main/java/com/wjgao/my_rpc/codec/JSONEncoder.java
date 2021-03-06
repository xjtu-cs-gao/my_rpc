package com.wjgao.my_rpc.codec;

import com.alibaba.fastjson.JSON;
/**
 * 基于json的序列化实现
 *
 */
public class JSONEncoder implements Encoder {
    @Override
    public byte[] encode(Object obj) {
        return JSON.toJSONBytes(obj);
    }
}
