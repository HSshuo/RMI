import service.SayService;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author SHshuo
 * @data 2022/7/22--9:54
 */
public class ConsumerMain {
    public static void main(String[] args) {
        try {
//            获取注册中心
            Registry registry = LocateRegistry.getRegistry(9999);

//            服务发现
            SayService sayService = (SayService) registry.lookup("sayService");

//            调用服务
            sayService.say("hshuo");

        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
