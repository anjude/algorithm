package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Anjude
 * Date: 2021/4/19 22:18
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("服务端启动 , 等待连接 .... ");
//        // 1.创建 ServerSocket对象，绑定端口，开始等待连接
//        ServerSocket ss = new ServerSocket(6666);
//        // 2.接收连接 accept 方法, 返回 socket 对象.
//        Socket server = ss.accept();
//        // 3.通过socket 获取输入流
//        InputStream is = server.getInputStream();
//        // 4.一次性读取数据
//        // 4.1 创建字节数组
//        byte[] b = new byte[1024];
//        // 4.2 据读取到字节数组中.
//        int len = is.read(b);
//        // 4.3 解析数组,打印字符串信息
//        String msg = new String(b, 0, len);
//        System.out.println(msg);
//        //5.关闭资源.
//        is.close();
//        server.close();

        System.out.println("客户端 发送数据");
        // 1.创建 Socket ( ip , port ) , 确定连接到哪里.
        Socket client = new Socket("localhost", 6666);
        // 2.获取流对象 . 输出流
        OutputStream os = client.getOutputStream();
        // 3.写出数据.
        os.write("你好么? tcp ,我来了".getBytes());
        // 4. 关闭资源 .
        os.close();
        client.close();
    }
}
