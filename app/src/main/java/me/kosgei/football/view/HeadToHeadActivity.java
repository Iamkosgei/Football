package me.kosgei.football.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.kosgei.football.R;
import me.kosgei.football.models.Fixture;

public class HeadToHeadActivity extends AppCompatActivity {

    @BindView(R.id.home_team_image)
    ImageView homeTeamImage;
    @BindView(R.id.home_team_name)
    TextView homeTeamName;
    @BindView(R.id.away_team_image)
    ImageView awayTeamImage;
    @BindView(R.id.away_team_name)
    TextView awayTeamName;
    @BindView(R.id.event_date)
    TextView eventDate;
    @BindView(R.id.first_half_start)
    TextView firstHalfStart;
    @BindView(R.id.second_half_start)
    TextView secondHalfStart;
    @BindView(R.id.status)
    TextView status;
    @BindView(R.id.venue)
    TextView venue;
    @BindView(R.id.referee)
    TextView referee;
    @BindView(R.id.home_team_goal)
    TextView homeTeamGoal;
    @BindView(R.id.away_team_goal)
    TextView awayTeamGoal;
    @BindView(R.id.half_time)
    TextView halfTime;
    @BindView(R.id.full_time)
    TextView fullTime;

    Fixture fixture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_to_head);

        setTitle("H2H");
        ButterKnife.bind(this);

        fixture = Parcels.unwrap(getIntent().getParcelableExtra("fixture"));
        setHeadToHead();
    }
    private void setHeadToHead() {
        Picasso.with(this).load(fixture.getHomeTeamLogo()).into(homeTeamImage);
        homeTeamName.setText(fixture.getHomeTeamName());
        Picasso.with(this).load(fixture.getAwayTeamLogo()).into(awayTeamImage);
        awayTeamName.setText(fixture.getAwayTeamName());
        eventDate.setText(fixture.getEventDate());
        firstHalfStart.setText(new Date(fixture.getFirstHalfStart()).toString());
        secondHalfStart.setText(new Date(fixture.getSecondHalfStart()).toString());
        status.setText(fixture.getStatus());
        venue.setText(fixture.getVenue());

        if (fixture.getReferee() == null)
        {
            referee.setText("Not Provided");
        }
        else {
            referee.setText(fixture.getReferee());

        }

        homeTeamGoal.setText(String.valueOf(fixture.getGoalsHomeTeam()));
        awayTeamGoal.setText(String.valueOf(fixture.getGoalsAwayTeam()));
        fullTime.setText(fixture.getFullTime());
        halfTime.setText(fixture.getHalfTime());
    }
}
