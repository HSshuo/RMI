package service.Impl;

import service.SayService;

/**
 * @author SHshuo
 * @data 2022/7/22--9:44
 */
public class SayServiceImpl implements SayService {
    @Override
    public String say(String name) {
        System.out.println(name + " : say hello");
        return name + "say hello";
    }
}
