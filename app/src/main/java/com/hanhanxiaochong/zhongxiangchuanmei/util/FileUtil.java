package com.hanhanxiaochong.zhongxiangchuanmei.util;

import android.os.Environment;
import android.text.TextUtils;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileUtil {

	public static File updateDir = null;
	public static File updateFile = null;
	public final static String FILE_EXTENSION_SEPARATOR = ".";

	public static void createFile(String name) {

		if (Environment.MEDIA_MOUNTED.equals(Environment
				.getExternalStorageState())) {
			updateDir = new File(Environment.getExternalStorageDirectory()
					+ "/welfare");
			updateFile = new File(updateDir + "/" + name + ".apk");

			if (!updateDir.exists()) {
				updateDir.mkdirs();
			}
			if (!updateFile.exists()) {
				try {
					updateFile.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
	public static boolean hasSdcard() {
		String status = Environment.getExternalStorageState();
		return Environment.MEDIA_MOUNTED.equals(status);
	}
	public static void delete(String dir, FilenameFilter filter) {
		if (TextUtils.isEmpty(dir))
			return;
		File file = new File(dir);
		if (!file.exists())
			return;
		if (file.isFile())
			file.delete();
		if (!file.isDirectory())
			return;

		File[] lists = null;
		if (filter != null)
			lists = file.listFiles(filter);
		else
			lists = file.listFiles();

		if (lists == null)
			return;
		for (File f : lists) {
			if (f.isFile()) {
				f.delete();
			}
		}
	}
	public static String getFileNameWithoutExtension(String filePath) {
		if (TextUtils.isEmpty(filePath)) {
			return filePath;
		}
		int extenPosi = filePath.lastIndexOf(FILE_EXTENSION_SEPARATOR);
		int filePosi = filePath.lastIndexOf(File.separator);
		if (filePosi == -1) {
			return (extenPosi == -1 ? filePath : filePath.substring(0,
					extenPosi));
		}
		if (extenPosi == -1) {
			return filePath.substring(filePosi + 1);
		}
		return (filePosi < extenPosi ? filePath.substring(filePosi + 1,
				extenPosi) : filePath.substring(filePosi + 1));
	}
}
