/*
Q1. Make a text file 'abc.txt' and write multiple paths in it(say C:/Users/Test/video.mp4).Read the contents of the file and try to print the path from the file.
*/

import java.io.*;

class q1
{
	public static void main(String[] x)
	{
		File f = new File("H:/AcadView - JAVA/2018-09-11/Assignment9/abc.txt");
		System.out.println();
		try
		{
			FileInputStream fi = new FileInputStream(f);
			
			int i = fi.read();
			int lineCount=1;
			System.out.print("Path " + lineCount + ": ");
			while(i != -1)
			{
				if((char)i == '\n')
				{
					System.out.println();
					lineCount++;
					System.out.print("Path " + lineCount + ": ");
				}
				else
					System.out.print((char)i);
				i = fi.read();
			}
			fi.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.println("\n");
	}
}