package com.tyz.csframework.useraction;

import com.tyz.csframework.core.ServerConversation;

/**
 * 本类是 {@link IServerAction} 接口的适配器，用户可选择性覆盖本类
 * 中的方法，配置所需的功能。
 *
 * @author tyz
 */
public class ServerActionAdapter implements IServerAction {

    @Override
    public void dealClientAbnormalDisconnected(ServerConversation client) {
    }

    @Override
    public void clientOffline(String id) {
    }
}
