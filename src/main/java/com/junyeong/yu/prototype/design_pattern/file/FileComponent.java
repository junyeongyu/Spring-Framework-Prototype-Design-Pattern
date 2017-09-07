package com.junyeong.yu.prototype.design_pattern.file;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class FileComponent {
	//public int methodCallCount = 0;
	
	public static String getName() {
		//methodCallCount++;
		return "yu";
	}
	
	/*public String getContent(String path) {
		return getContent(path, new FileReadStatement() {
			@Override
			public void appendText(StringBuffer sb, int i) {
				sb.append((char)i);
			}
		});
	}*/
	
	public String getContent(String path/*, FileReadStatement frs*/) {
		//methodCallCount++;
		File f = new File(path);
		//StringBuffer sb = null;
		InputStream is = null;
		BufferedInputStream bis = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			is = new FileInputStream(f);
			bis = new BufferedInputStream(is);
			//sb = new StringBuffer();
			byte[] buffer = new byte[1024];
			for (int i = -1; (i = bis.read(buffer)) != -1;) {
				baos.write(buffer, 0, i);
			}
			/*for (int i = -1; (i = bis.read()) != -1;) {
				frs.appendText(sb, i);
			}*/
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			return new String(baos.toByteArray(), "UTF-8"); //sb.toString();
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/*public void setContent(String path, String content) {
		File f = new File(path);
		OutputStream os = null;
		BufferedOutputStream bos = null;
		try {
			os = new FileOutputStream(f);
			bos =  new BufferedOutputStream(os);
			int contentLength = content.length();
			for (int i = 0; i < contentLength; i++ ) {
				bos.write(content.charAt(i));
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}*/
	
}
