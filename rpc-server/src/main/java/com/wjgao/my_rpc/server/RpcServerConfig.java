package com.wjgao.my_rpc.server;

import com.wjgao.my_rpc.codec.Decoder;
import com.wjgao.my_rpc.codec.Encoder;
import com.wjgao.my_rpc.codec.JSONDecoder;
import com.wjgao.my_rpc.codec.JSONEncoder;
import com.wjgao.my_rpc.transport.HTTPTransportServer;
import com.wjgao.my_rpc.transport.TransportServer;
import org.eclipse.jetty.server.HttpTransport;

/**
 * server配置
 */
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HTTPTransportServer.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3000;
}
