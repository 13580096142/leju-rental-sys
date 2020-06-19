package cn.poison.leju;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;
import java.util.*;

/**
 * 请求响应处理工具类
 *
 * @Tools Created by IntelliJ IDEA.
 * @author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/11 13:48
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class LejuApplicationTests {

    private static final Logger logger= LoggerFactory.getLogger(LejuApplicationTests.class);

    @Test
    public void contextLoads() {

    }

    @Test
    public synchronized void testMap() {
        Map<String, Object> map = new HashMap<>();
        Set<String> strings = map.keySet();
        for (String string : strings) {
            Object o = map.get(string);
        }
        Set<Map.Entry<String, Object>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Object>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> next = iterator.next();
            String key = next.getKey();
            Object value = next.getValue();
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {

        }
    }

    /**
     * 测试数组越界异常
     */
    @Test
    public void testOutOfIndex() {
        //int[] arr={1,2,3};
        //for (int i = 0; i <= arr.length; i++) {
        //    System.out.println(arr[i]);
        //}

        int value = getValue(2);
        System.out.println(value);

    }

    private int getValue(int a) {
        int result = 0;
        switch (a) {
            case 1:
                result = result + a;
            case 2:
                result = result + a * 2;
            case 3:
                result = result + a * 3;
        }

        return result;
    }


    /**
     * 九九乘法表
     */
    @Test
    public void testMultiple() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 二分查找法
     */
    @Test
    public void testBinarySearch() {

        int[] sourceArr={1,8,6,7,3,2,5,6,9};
        int target=88;

        //开始索引
        int low = 0;
        //结束索引
        int high = sourceArr.length - 1;

        while(low<=high){
            //获取中间索引
            int mid = (low+high) / 2;
            if(sourceArr[mid]==target){
                logger.info(mid+"");
            }
            else if (sourceArr[mid]<target){
                low=mid+1;   //将数组长度中值+1作为接下来查找的数组的开始索引
            }
            else{
                high=mid-1;  //将数组长度中值-1作为接下来查找的数组的结束索引
            }
        }
    }

    /**
     * 冒泡排序
     */
    @Test
    public void testBubleSort(){
        int[] arr={5,6,8,9,1,4,0,3,7,2,11,10,14,19,12};

        int temp=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }

    }

    @Test
    public void testJava8(){
        List<? extends Serializable> list = Arrays.asList("1", 1, 2, true);
        list.forEach(System.out::println);
    }

}
