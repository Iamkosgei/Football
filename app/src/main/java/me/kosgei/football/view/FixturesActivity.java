package me.kosgei.football.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.kosgei.football.R;
import me.kosgei.football.adapters.FixtureAdapter;
import me.kosgei.football.models.Fixture;
import me.kosgei.football.services.FootballService;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class FixturesActivity extends AppCompatActivity {

    @BindView(R.id.fixtures_recycler)
    RecyclerView fixturesRecyclerView;

    private FixtureAdapter fixtureAdapter;

    private ArrayList<Fixture> mFixture = new ArrayList<>();

    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixtures);

        setTitle("Fixtures");

        ButterKnife.bind(this);

        createProgressDialog();
        initRecyclerView(getIntent().getStringExtra("league_id"));
    }

    public void initRecyclerView(String leagueId)
    {
        progressDialog.show();
        FootballService footballService = new FootballService();

        footballService.getFixtures(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                FixturesActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressDialog.hide();

                    }
                });

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                mFixture = footballService.processGetFixturesResults(response);

                FixturesActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressDialog.hide();


                        fixtureAdapter = new FixtureAdapter(mFixture,FixturesActivity.this);
                        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(FixturesActivity.this);
                        fixturesRecyclerView.setLayoutManager(layoutManager);
                        fixturesRecyclerView.setAdapter(fixtureAdapter);
                    }
                });
            }
        },leagueId);
    }

    private void createProgressDialog() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Loading...");
        progressDialog.setMessage("Fetching Fixtures...");
        progressDialog.setCancelable(false);
    }
}
