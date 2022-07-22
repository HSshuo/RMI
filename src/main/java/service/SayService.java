package service;

import java.rmi.Remote;

/**
 * @author SHshuo
 * @data 2022/7/22--9:43
 */
public interface SayService extends Remote {
    String say(String name) throws Exception;
}
