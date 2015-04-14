package main;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WebPageGetting {

	public static void main(String[] args) {
		final int HTTP_PORT = 80;
		Socket s = null;
		InputStream instream = null;
		OutputStream outstream = null;
		try 
		{
			s = new Socket("horstmann.com", HTTP_PORT);
			instream = s.getInputStream();
			outstream = s.getOutputStream();
		} 
		catch (Exception ex) 
		{
			
		}
		Scanner in = new Scanner(instream);
		PrintWriter out = new PrintWriter(outstream);
		
		String host = "horstmann.com";
		String resource = "/";
		String command = "GET " + resource + " HTTP/1.1\n" +
		                 "Host: " + host + "\n\n";
		
		out.print(command);
		out.flush();
		
		while (in.hasNextLine())
		{
			String input = in.nextLine();
			System.out.println(input);
		}
		try
		{
			s.close();
		}
		catch (Exception ex)
		{
			
		}
		
	}

}
