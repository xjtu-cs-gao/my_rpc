package com.wjgao.my_rpc.server;

import com.wjgao.my_rpc.codec.Decoder;
import com.wjgao.my_rpc.codec.Encoder;
import com.wjgao.my_rpc.common.utils.ReflectionUtils;
import com.wjgao.my_rpc.transport.TransportServer;

public class RpcServer {
    private RpcServerConfig config;
    private TransportServer net;
    private Encoder encoder;
    private Decoder decoder;
    private ServiceManager serviceManager;
    private ServiceInvoker serviceInvoker;

    public RpcServer(RpcServerConfig config) {
        this.config = config;

        //net
        this.net  = ReflectionUtils.newInstance(config.gettransportClass());
    }
}
