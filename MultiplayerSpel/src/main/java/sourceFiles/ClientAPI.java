package sourceFiles;

//Java implementation for multithreaded chat client
//Save file as Client.java

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientAPI
{
	final static int ServerPort = 1234;
	
	final DataOutputStream dos;
	final DataInputStream dis;
	InetAddress ip;
	final Scanner scn;
	

	public ClientAPI() throws IOException
	{
		scn = new Scanner(System.in);
		
		// getting localhost ip
		ip = InetAddress.getByName("192.168.17.51");
		
		// establish the connection
		Socket s = new Socket(ip, ServerPort);
		
		dis = new DataInputStream(s.getInputStream());
		dos = new DataOutputStream(s.getOutputStream());
		
		// obtaining input and out streams
		

		// sendMessage thread
		Thread sendMessage = new Thread(new Runnable()
		{
			@Override
			public void run() {
				while (true) {

					// read the message to deliver.
					String msg = scn.nextLine();
					
					try {
						// write on the output stream
						dos.writeUTF(msg);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		// readMessage thread
		Thread readMessage = new Thread(new Runnable()
		{
			@Override
			public void run() {

				while (true) {
					try {
						// read the message sent to this client
						String msg = dis.readUTF();
						System.out.println(msg);
					} catch (IOException e) {

						e.printStackTrace();
					}
				}
			}
		});

		sendMessage.start();
		readMessage.start();

	}
	
	public void write(String text) throws IOException {
		this.dos.writeUTF(text);
	}

	public static void main(String[] args) throws IOException {
		ClientAPI client = new ClientAPI();
		client.write("test");
		client.write("another test");
	}
	
}
