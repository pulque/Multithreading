package com.lizheblogs.android.multithreading.main;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.lizheblogs.android.multithreading.R;

import java.util.ArrayList;
import java.util.List;

import static com.lizheblogs.android.multithreading.util.BaseUtils.checkNotNull;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter presenter;
    private TextView title;
    private TextView description;
    private ListView list;
    private ListAdapter mListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        if (fab != null) {
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    presenter.updateData();
                }
            });
        }

        title = (TextView) findViewById(R.id.title);
        description = (TextView) findViewById(R.id.description);
        list = (ListView) findViewById(R.id.list);
        mListAdapter = new ListAdapter(new ArrayList<String>());
        list.setAdapter(mListAdapter);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void notifyList(List<String> images) {
        mListAdapter.replaceData(images);
    }

    @Override
    public void hideTitle() {
        this.title.setVisibility(View.GONE);
    }

    @Override
    public void showTitle(String title) {
        this.title.setText(title);
        this.title.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideDescription() {
        this.description.setVisibility(View.GONE);
    }

    @Override
    public void showDescription(String description) {
        this.description.setText(description);
        this.description.setVisibility(View.VISIBLE);
    }

    @Override
    public void setPresenter(@NonNull MainContract.Presenter presenter) {
        this.presenter = checkNotNull(presenter);
    }
}
