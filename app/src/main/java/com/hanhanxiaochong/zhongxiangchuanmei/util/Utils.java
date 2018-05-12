package com.hanhanxiaochong.zhongxiangchuanmei.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Utils {

	/**
	 * Save image to the SD card
	 *  @param photoBitmap
	 * @param path
	 * @param photoName
	 */
	public static String savePhoto(Bitmap photoBitmap, String path,
								 String photoName) {
		String localPath = null;
		if (android.os.Environment.getExternalStorageState().equals(
				android.os.Environment.MEDIA_MOUNTED)) {
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdirs();
			}

			File photoFile = new File(path, photoName + ".png");
			FileOutputStream fileOutputStream = null;
			try {
				fileOutputStream = new FileOutputStream(photoFile);
				if (photoBitmap != null) {
					if (photoBitmap.compress(Bitmap.CompressFormat.PNG, 100,
							fileOutputStream)) { // ת�����
						localPath = photoFile.getPath();
						fileOutputStream.flush();
					}
				}
			} catch (FileNotFoundException e) {
				photoFile.delete();
				localPath = null;
				e.printStackTrace();
			} catch (IOException e) {
				photoFile.delete();
				localPath = null;
				e.printStackTrace();
			} finally {
				try {
					if (fileOutputStream != null) {
						fileOutputStream.close();
						fileOutputStream = null;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return localPath;
	}

	/**
	 * ת��ͼƬ��Բ��
	 * 
	 * @param bitmap
	 *            ����Bitmap����
	 * @param tempUri
	 * @return
	 */
	public static Bitmap toRoundBitmap(Bitmap bitmap, Uri tempUri) {
		int width = bitmap.getWidth();
		int height = bitmap.getHeight();
		float roundPx;
		float left, top, right, bottom, dst_left, dst_top, dst_right, dst_bottom;
		if (width <= height) {
			roundPx = width / 2;
			left = 0;
			top = 0;
			right = width;
			bottom = width;
			height = width;
			dst_left = 0;
			dst_top = 0;
			dst_right = width;
			dst_bottom = width;
		} else {
			roundPx = height / 2;
			float clip = (width - height) / 2;
			left = clip;
			right = width - clip;
			top = 0;
			bottom = height;
			width = height;
			dst_left = 0;
			dst_top = 0;
			dst_right = height;
			dst_bottom = height;
		}

		Bitmap output = Bitmap.createBitmap(width, height, Config.ARGB_8888);
		Canvas canvas = new Canvas(output);

		final int color = 0xff424242;
		final Paint paint = new Paint();
		final Rect src = new Rect((int) left, (int) top, (int) right,
				(int) bottom);
		final Rect dst = new Rect((int) dst_left, (int) dst_top,
				(int) dst_right, (int) dst_bottom);
		final RectF rectF = new RectF(dst);

		paint.setAntiAlias(true);// ���û����޾��

		canvas.drawARGB(0, 0, 0, 0); // �������Canvas
		paint.setColor(color);

		// ���������ַ�����Բ,drawRounRect��drawCircle
		// canvas.drawRoundRect(rectF, roundPx, roundPx, paint);//
		// ��Բ�Ǿ��Σ���һ������Ϊͼ����ʾ���򣬵ڶ��������͵����������ֱ���ˮƽԲ�ǰ뾶�ʹ�ֱԲ�ǰ뾶��
		canvas.drawCircle(roundPx, roundPx, roundPx, paint);

		paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));// ��������ͼƬ�ཻʱ��ģʽ,�ο�http://trylovecatch.iteye.com/blog/1189452
		canvas.drawBitmap(bitmap, src, dst, paint); // ��Mode.SRC_INģʽ�ϲ�bitmap���Ѿ�draw�˵�Circle

		return output;
	}

//	public static void setIndicator(TabLayout tabs, int leftDip, int rightDip) {
//		Class<?> tabLayout = tabs.getClass();
//		Field tabStrip = null;
//		try {
//			tabStrip = tabLayout.getDeclaredField("mTabStrip");
//		} catch (NoSuchFieldException e) {
//			e.printStackTrace();
//		}
//
//		tabStrip.setAccessible(true);
//		LinearLayout llTab = null;
//		try {
//			llTab = (LinearLayout) tabStrip.get(tabs);
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		}
//
//		int left = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX, leftDip, Resources.getSystem().getDisplayMetrics());
//		int right = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX, rightDip, Resources.getSystem().getDisplayMetrics());
//
//		for (int i = 0; i < llTab.getChildCount(); i++) {
//			View child = llTab.getChildAt(i);
//			child.setPadding(0, 0, 0, 0);
//			LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, 1);
//			params.leftMargin = left;
//			params.rightMargin = right;
//			child.setLayoutParams(params);
//			child.invalidate();
//		}
//	}

	public static int[] calculatePopWindowPos(final View anchorView, final View contentView) {
		final int windowPos[] = new int[2];
		final int anchorLoc[] = new int[2];
		 // 获取锚点View在屏幕上的左上角坐标位置
		anchorView.getLocationOnScreen(anchorLoc);
		final int anchorHeight = anchorView.getHeight();
		// 获取屏幕的高宽
		final int screenHeight = getScreenHeight(anchorView.getContext());
		final int screenWidth = getScreenWidth(anchorView.getContext());
		contentView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
		// 计算contentView的高宽
		final int windowHeight = contentView.getMeasuredHeight();
		final int windowWidth = contentView.getMeasuredWidth();
		// 判断需要向上弹出还是向下弹出显示
		final boolean isNeedShowUp = (screenHeight - anchorLoc[1] - anchorHeight < windowHeight);
		if (isNeedShowUp) {
			windowPos[0] = screenWidth - windowWidth;
			windowPos[1] = anchorLoc[1] - windowHeight;
		} else {
			windowPos[0] = screenWidth - windowWidth;
			windowPos[1] = anchorLoc[1] + anchorHeight;
		}
		return windowPos;
	}

	/**
	 * 获取屏幕高度(px)
	 */
	public static int getScreenHeight(Context context) {
		return context.getResources().getDisplayMetrics().heightPixels;
	}
	/**
	 * 获取屏幕宽度(px)
	 */
	public static int getScreenWidth(Context context) {
		return context.getResources().getDisplayMetrics().widthPixels;
	}
}
