package com.hanhanxiaochong.zhongxiangchuanmei.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/1/12/0012.
 */

public class ImagePathUtil {

    private static ImagePathUtil mInstance;

    public static ImagePathUtil getInstance() {
        if (mInstance == null) {
            mInstance = new ImagePathUtil();
        }
        return mInstance;
    }

    public String getPath(String imagePath) throws Exception {
        String imgpaths = "";
        if (imagePath != null && !imagePath.equals("")
                && !imagePath.equals("null")) {
            int point = imagePath.indexOf("upload");
            imagePath = imagePath.substring(point, imagePath.length())
                    .replace("\\", "/");
            imgpaths = "http://47.92.97.45:8030/EmployeeWelfare/" + imagePath;
        }
        return imgpaths;
    }

    public String getNewPath(String imagePath) throws Exception {
        String imgpaths = "";
        if (imagePath != null && !imagePath.equals("")
                && !imagePath.equals("null")) {
            int point = imagePath.indexOf("fileupload");
            imagePath = imagePath.substring(point, imagePath.length())
                    .replace("\\", "/");
            imgpaths = "http://47.92.97.45:8030/EmployeeWelfare/" + imagePath;
        }
        return imgpaths;
    }

    public void setNetImage(Context context, final ImageView view, String url, Transformation transformation){
        try {
//            Glide.with(context.getApplicationContext())
//                    .load(ImagePathUtil.getInstance().getNewPath(url))
//                    .error(R.mipmap.ic_launcher_round)
//                    .placeholder(R.mipmap.jiazaiz_lz)
//                    .bitmapTransform(transformation)
//                    .dontAnimate()
//                    .into(view);
        } catch (Exception e) {
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void setImageUrl(Context context, final ImageView view, String url, Transformation transformation) {
        try {
//            Glide.with(context.getApplicationContext())
//                    .load(Ihttp.BASEFILE+url)
//                    .error(R.mipmap.ic_launcher_round)
//                    .placeholder(R.mipmap.jiazaiz_lz)
//                    .bitmapTransform(transformation)
//                    .dontAnimate()
//                    .into(view);
        } catch (Exception e) {
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void setYsImageUrl(Context context, final ImageView view, String url, Transformation transformation) {
//        try {
//            Glide.with(context.getApplicationContext())
//                    .load(ImagePathUtil.getInstance().getPath(url))
//                    .asBitmap()
//                    .error(R.mipmap.jiazaiz_lz)
//                    .placeholder(R.mipmap.pic_touxiang)
//                    .dontAnimate()
//                    .into(new SimpleTarget<Bitmap>() {
//                        @Override
//                        public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
//                            view.setImageBitmap(ImagePathUtil.getInstance().gerZoomRotateBitmap(resource));
//                        }
//                    });
//        } catch (Exception e) {
//            Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
//        }
    }
    public Bitmap gerZoomRotateBitmap(
            Bitmap bmpOrg) {
            // 获取图片的原始的大小

        int width = bmpOrg.getWidth();

        int height = bmpOrg.getHeight();

        int newWidth = width/5;

        int newheight = height/5;

        // 定义缩放的高和宽的比例

        float sw = ((float) newWidth) / width;

        float sh = ((float) newheight) / height;

        // 创建操作图片的用的Matrix对象

        android.graphics.Matrix matrix = new android.graphics.Matrix();

        // 缩放翻转图片的动作

        // sw sh的绝对值为绽放宽高的比例，sw为负数表示X方向翻转，sh为负数表示Y方向翻转

        matrix.postScale(sw, sh);

        //创建一个新的图片

        Bitmap resizeBitmap = Bitmap

                .createBitmap(bmpOrg, 0, 0, width, height, matrix, true);

        return getRoundedCornerBitmap(resizeBitmap);

    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap) {

        Bitmap output = Bitmap.createBitmap(bitmap.getWidth(),

                bitmap.getHeight(), Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(output);

        final int color = 0xff424242;

        final Paint paint = new Paint();

        final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());

        final RectF rectF = new RectF(rect);

        final float roundPx = 12;

        paint.setAntiAlias(true);

        canvas.drawARGB(0, 0, 0, 0);

        paint.setColor(color);

        canvas.drawRoundRect(rectF, roundPx, roundPx, paint);

        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));

        canvas.drawBitmap(bitmap, rect, rect, paint);

        return output;

    }

}
