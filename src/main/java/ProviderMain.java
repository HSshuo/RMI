import service.Impl.SayServiceImpl;
import service.SayService;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author SHshuo
 * @data 2022/7/22--9:45
 */
public class ProviderMain {
    public static void main(String[] args) {
        SayService impl = new SayServiceImpl();

        try {

//            暴露服务
            SayService sayService = (SayService)UnicastRemoteObject.exportObject(impl, 6666);

//            创建注册中心
            Registry registry = LocateRegistry.createRegistry(9999);

//            注册服务
            registry.rebind("sayService", sayService);

        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
