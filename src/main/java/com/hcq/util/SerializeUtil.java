package com.hcq.util;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * fileName:SerializeUtil
 * description:
 * author:zz
 * createTime:2019/3/2 17:51
 */
@Component
public class SerializeUtil {
    public static byte[] serializable(Object obj)  {
       //创建缓冲区
       ByteArrayOutputStream buffer=new ByteArrayOutputStream();
       ObjectOutputStream objStream= null;
        try {
            //创建输出流,指定输出位置为 buffer缓冲区
            objStream = new ObjectOutputStream(buffer);
            //将输入流进行输出
            objStream.writeObject(obj);
            //将缓冲区数据转换为byte数组
            return buffer.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
      return null;
    }
    public static Object unserializable(byte[] bytes)  {
        //将byte数组加载进缓冲区
        ByteArrayInputStream buffer=new ByteArrayInputStream(bytes);
        ObjectInputStream obj= null;
        try {
            //将缓冲区加载进输入流
            obj = new ObjectInputStream(buffer);
            //将流中的内容读
            return  obj.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
