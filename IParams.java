package Park;

import java.util.ArrayList;

/**
 * @author xiu
 * @create 2021-10-31 19:50
 */
public interface IParams {
    // 获取大车位
    public int getBig();
    // 获取中车位
    public int getMedium();
    // 获取小车位
    public int getSmall();
    // 获取停车序列，例如 [1 2 2 3] 表示 依次停一辆大车，中车，中车，小车
    public ArrayList<Integer> getPlanParking();
    //解析输入字符串（格式见示例）,返回字符串数组
    String[] parse(String input);
    //输出结果 [null, true, true, false, false]
    public void print();


}
