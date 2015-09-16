package reindeerjob.xlab.wonders.com.reindeerjob.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.widget.RelativeLayout;

import java.net.URL;

/**
 * Created by lixuanwu on 15/8/20.
 */
public class ProgressBarAsyncTask extends AsyncTask<String, Void, Bitmap> {

    private RelativeLayout relativeLayout;
    private Context context;

    public ProgressBarAsyncTask(RelativeLayout relativeLayout,Context context) {
        this.relativeLayout = relativeLayout;
        this.context = context;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onPostExecute(Bitmap bitmap) {
        Drawable bd = new BitmapDrawable(context.getResources(),bitmap);
        relativeLayout.setBackground(bd);
    }

    @Override
    protected Bitmap doInBackground(String... url) {

        Bitmap bitmap = null;
        try {
            URL imageUrl = new URL(url[0]);
            bitmap = BitmapFactory.decodeStream(imageUrl.openStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }
}
