package chapter14SampleCode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class NIOUtil
{
	public static void dump(ReadableByteChannel src,WritableByteChannel input)  throws IOException
	{
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		NIOUtil.printInformation(buffer);
		try(ReadableByteChannel srcChannel = src;WritableByteChannel inputChannel = input)
		{
			while(srcChannel.read(buffer)!=-1)
			{
				System.out.println("�NReadableByteChannel�������Ū�ibuffer");
				NIOUtil.printInformation(buffer);
				buffer.flip();
				System.out.println("buffer���槹flip");
				NIOUtil.printInformation(buffer);
				inputChannel.write(buffer);
				System.out.println("�Nbuffer������ƨ��X�g�JWritableByteChannel");
				NIOUtil.printInformation(buffer);
				buffer.clear();
				System.out.println("buffer���槹clear");
				NIOUtil.printInformation(buffer);
			}
		}
	}
	
	public static void printInformation(ByteBuffer buffer)
	{
		System.out.println("buffer�A" + "capacity:" + buffer.capacity() + "\t" +
			       						   "position:" + buffer.position() + "\t" +
			       						   "limit:" + buffer.limit());
	}
	
	public static void main(String[] args) throws Exception
	{
		URL url = new URL("http://openhome.cc");
		ReadableByteChannel readChannel = Channels.newChannel(url.openStream());
		WritableByteChannel writeChannel = new FileOutputStream("index.html").getChannel();
		NIOUtil.dump(readChannel, writeChannel);
	}
}
