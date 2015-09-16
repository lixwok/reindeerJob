package reindeerjob.xlab.wonders.com.reindeerjob.activity;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import reindeerjob.xlab.wonders.com.reindeerjob.R;
import reindeerjob.xlab.wonders.com.reindeerjob.utils.ProgressBarAsyncTask;


public class MainActivity extends Activity {

    private RelativeLayout relativeLayout;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout = (RelativeLayout) findViewById(R.id.first_relativeLayout);
        ProgressBarAsyncTask asyncTask = new ProgressBarAsyncTask(relativeLayout,MainActivity.this);
        String url = "http://7xj64q.com2.z0.glb.qiniucdn.com/bg-banner.png";
        asyncTask.execute(url);

        recyclerView = (RecyclerView) LayoutInflater.from(this).inflate(R.layout.recycler_view,null);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
//        recyclerView.setAdapter();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings0) {
            return true;
        }
        if (id == R.id.action_settings0) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
