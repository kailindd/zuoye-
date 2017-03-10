package lk.servlet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dwservlet
 */
@WebServlet("/dwservlet")
public class dwservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dwservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	URL url=null;
		HttpURLConnection conn=null;
		
		url=new URL("http://p4.so.qhimgs1.com/sdr/1365_768_/t012dadfa6936b9918a.jpg");
		conn=(HttpURLConnection) url.openConnection();
		InputStream in= conn.getInputStream();
		//InputStream in= conn.getInputStream();
		
		//BufferedInputStream bis=new BufferedInputStream(in);
		
		FileOutputStream fo=new FileOutputStream("d:/photo/a.jpg");
		
		//BufferedOutputStream bos=new BufferedOutputStream(fo);
		int i=0;
		byte[] input=new byte[1024];
		while((i=in.read(input))!=-1){
			fo.write(input,0,i);
		}
		
		System.out.println("Õº∆¨œ¬‘ÿ≥…π¶");
		//bos.close();
		fo.close();
		//bis.close();
		in.close();
		
		request.getRequestDispatcher("01/download.jsp").forward(request,response);
		
		
	}

}
